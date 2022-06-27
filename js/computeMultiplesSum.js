//3; 5; 7;
function computeMultiplesSum(n){
    let sum = 0;
    for(let i = 1; i <=n; i++){
        if(i%3 === 0)
            sum +=i;
        if(i%5 === 0)
           sum +=i;
        if(i%7 === 0)
           sum +=i;

    }
    console.log(sum);
}

computeMultiplesSum(11);
console.log("End of the program!");