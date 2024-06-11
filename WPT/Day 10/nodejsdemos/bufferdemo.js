var buf=Buffer.alloc(256);
lengthdata=buf.write("this is data in buffer")
console.log("length : ",lengthdata)
console.log(buf)
console.log(buf.toString())
var buf1=Buffer.alloc(80);
buf1=buf.slice(2,15)
console.log(buf1.toString())
