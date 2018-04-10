const assert = require('assert');

assert.equal(1, 1);
//Passes

// assert.equal(1, 2);
//Fails not ==

assert.equal(0, '0');
//Passes

// assert.strictEqual(0, '0');
//Fails not ===

// assert.strictEqual([1, 2, 3], [1, 2, 3]);
//Fails as there are two separate objects

const firstArray = [1, 2, 3];
const secondArray = firstArray;
assert.strictEqual(firstArray, secondArray);
//Passes as there is only one array

assert.deepStrictEqual([1, 2, 3], [1, 2, 3]);
//Passes

assert.deepEqual([1, 2, 3], ['1', '2', '3']);
//Passes
