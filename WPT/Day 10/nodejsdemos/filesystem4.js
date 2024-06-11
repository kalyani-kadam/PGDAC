const fs=require("fs");
console.log("before async read file")
fs.readFile("test.txt",function(err,data){
    if(err){
        console.log(err)
    }else{
        console.log(data.toString())
    }
})
console.log("after async read file")
console.log("before sync read file")
var f2=fs.readFileSync("myfile.txt")
console.log(f2.toString());
console.log("after sync read file")

