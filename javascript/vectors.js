"use strict";

chapter("Vector and matrix operations");

section("Scalar operations");
function addS(a, b) { return a + b; }
function subtractS(a, b) { return a - b; }
function multiplyS(a, b) { return a * b; }
example("addS(2, 3)");
example("subtractS(2, 3)");
example("multiplyS(2, 3)");

section("Vector operations");
function transpose(matrix) {
    var result = [];
    for (var i = 0; i < matrix[0].length; i++) {
        var row = [];
        for (var j = 0; j < matrix.length; j++) {
            row.push(matrix[j][i]);
        }
        result.push(row);
    }
    return result;
}
function apply(f) {
    return function (args) { return f.apply(null, args)}
}
function zipWith(f) {
    return function(a, b) {
        return apply(map(apply(f)))(transpose(arguments));
    }
}
var addV = zipWith(addS);
var subtractV = zipWith(subtractS);
var multiplyV = zipWith(multiplyS);
var scalar = compose(sum, multiplyV);
example("addV([1, 2, 3], [4, 5, 6])");
example("subtractV([1, 2, 3], [4, 5, 6])");
example("multiplyV([1, 2, 3], [4, 5, 6])");
example("scalar([1, 2, 3], [4, 5, 6])");

section("Matrix operations");
function multiplyM(a, b) {
    return apply(map(function row(ar) {
        return apply(map(curry(scalar)(ar)))(transpose(b))
    }))(a);
}
var addM = zipWith(addV);
var subtractM = zipWith(subtractV);
example("addM([[1, 2], [3, 4]], [[5, 6], [7, 8]])[0]");
example("addM([[1, 2], [3, 4]], [[5, 6], [7, 8]])[1]");
example("subtractM([[1, 2], [3, 4]], [[5, 6], [7, 8]])[0]");
example("subtractM([[1, 2], [3, 4]], [[5, 6], [7, 8]])[1]");
example("transpose([[1, 2], [3, 4]])[0]");
example("transpose([[1, 2], [3, 4]])[1]");
example("multiplyM([[1, 2], [3, 4]], [[5, 6], [7, 8]])[0]");
example("multiplyM([[1, 2], [3, 4]], [[5, 6], [7, 8]])[1]");
