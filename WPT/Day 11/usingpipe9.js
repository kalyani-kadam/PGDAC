const fs=require("fs");
var rs=fs.createReadStream("test.txt")
var ws=fs.createWriteStream("test333.txt")
rs.pipe(ws)