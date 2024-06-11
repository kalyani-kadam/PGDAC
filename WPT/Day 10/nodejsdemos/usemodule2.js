const m2=require("./module2")
console.log("addition : ",m2.addtion(2,3,4,1))
console.log("factorial: ",m2.factorial(4))
var ans=m2.checkprime(9)
if(ans)
    console.log("The number is prime")
else
    console.log("the number is not prime")