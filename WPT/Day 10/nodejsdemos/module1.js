//function can be called outside the file
exports.f1=function(){
    console.log("in f1")
}
//function can be called outside the file
exports.f2=function(){
    console.log("in f2")
}

//this function cannot be called in external file
const f3=function(){
    console.log("in f3")
}