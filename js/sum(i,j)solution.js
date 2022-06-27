
function a(i,j){
    if(i === 1 || j  === 1)
      return true;
    if((i+j) === 1)
       return true;
    else
       return false;
}

console.log(a(1,1));
console.log(a(2,1));
console.log(a(1,3));
console.log(a(-4,5));
console.log(a(34,0));
console.log(a(-4,15));