const loneOne = (myNum) => {
    if(isNaN(myNum)){
        return myNum+" Is Not a Number";
    }
    else{
        var numArr = String(myNum).split('');
        var count = 0;

        for(i = 0; i < numArr.length; i++){
            if(numArr[i] == 1){
                if(i === 0){
                    if(numArr[i] !== numArr[i+1]){
                        count++;
                    }
                }
                else if(i === numArr.length-1){
                    if(numArr[i] !== numArr[i-1]){
                        count++;
                    }
                }
                else{
                    if(numArr[i] !== numArr[i+1] && numArr[i] !== numArr[i-1]){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
                                // Output:
console.log(loneOne(101));      // 2
console.log(loneOne(1191));     // 1
console.log(loneOne(1111));     // 0
console.log(loneOne(462));      // 0
console.log(loneOne("string")); // string Is Not a Number