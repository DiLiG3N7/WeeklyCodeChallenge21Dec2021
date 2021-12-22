var numArr1 = [3, 7, 3, 2, 1, 5, 1, 2, 2, -2, 2];
var numArr2 = [1, 7, 1, 7, 1, 7, 1];
var numArr3 = [9, 5, 9, 5, 1, 1, 1];
var numArr4 = [5, 6, 6, 7, 6, 3, 9];
var numArr5 = [4, 4, 4, 9, 9, 9, 9];
var numArr6 = [4, 4];

const numberOfBoomerangs = (arr) => {
    var count = 0;

    for(i = 0; i < arr.length - 2; i++){
        if(arr[i] === arr[i + 2] && arr[i] !== arr[i + 1]){
            count++;
        }
    }
    return count;

}
                                          // output:
console.log(numberOfBoomerangs(numArr1)); // 3
console.log(numberOfBoomerangs(numArr2)); // 5
console.log(numberOfBoomerangs(numArr3)); // 2
console.log(numberOfBoomerangs(numArr4)); // 1
console.log(numberOfBoomerangs(numArr5)); // 0
console.log(numberOfBoomerangs(numArr6)); // 0