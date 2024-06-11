const fs=require("fs");
var rs=fs.createReadStream("test.txt")
var ws=fs.createWriteStream("test222.txt");
//when the readstream id full it will generate data event
//event handler function will be called
rs.on("data",function(details){
    console.log("in data event",details.toString())
    ws.write(details);
})
//when the file is ending end event will be generated
rs.on("end",function(details){
    console.log("in end event")
    ws.end(details);
})
rs.on("error",function(err){
    console.log("error occured",err)
})
