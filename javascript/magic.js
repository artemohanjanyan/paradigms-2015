"use strict";

// Magic helper functions
function example(s) {
    println(s, "->", eval(s));
}

function section(name) {
    println();
    println("---", name, "---");
}

function chapter(name) {
    println();
    println("==========", name, "==========");
}
