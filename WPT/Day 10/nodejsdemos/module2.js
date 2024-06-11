//addition of any numbers
exports.addtion=function(a,b,...c){
    var s=a+b;
    for(var i of c){
        s=s+i
    }
    return s;

}

//factorial of a number
exports.factorial=function(n=5){
    f=1;for(var i=1;i<=n;i++){
        f=f*i
    }
    return f;
}

//check the given number is prime
exports.checkprime=function(n){
    for(var i=2;i<n;i++){
        if(n%i===0){
            return false;
        }
    }
    return true;
}