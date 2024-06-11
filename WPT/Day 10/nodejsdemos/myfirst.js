function f1(){
    console.log("in function f1")
}
function f2(){
    console.log("in f2")
}
function f3(){
    console.log("in f3")
}

console.log("begin the file")
setTimeout(f1,1000)
setTimeout(f2,0)
setImmediate(f3)
console.log("after set timeout f1")

