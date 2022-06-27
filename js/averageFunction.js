const arr = [1, 2, 3, 4, 5];
const arr1 = [];
function f(arr = []){
    var average = 0
    if(!arr.length == 0){
        var sum = 0;
        for (var number of arr) {
            sum += number;
        }
        average = sum / arr.length;
        
    }
    console.log(average);
}
f(arr);
f(arr1);