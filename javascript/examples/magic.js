"use strict";

// Magic helper functions
function example(s, description) {
    if (description) {
        println(description + ":", s, "->", eval(s));
    } else {
        println(s, "->", eval(s));
    }
}

function section(name) {
    println();
    println("---", name, "---");
}

function chapter(name) {
    println();
    println("==========", name, "==========");
}

// Helper function
function dumpObject(name, o) {
    println(name);
    for (var attribute in o) {
        if (typeof(o[attribute]) == "function") {
            println("    " + attribute + "() = " + o[attribute]());
        } else {
            println("    " + attribute + " = " + o[attribute]);
        }
    }
}
