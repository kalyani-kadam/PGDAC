const express=require("express");
const app=express();
var cookieparser=require("cookie-parser")

app.use(cookieparser())

app.get("/setcookies",function(req,resp){
    resp.cookie("name","Kishori");
    resp.cookie("addr","baner");
    var str=`cookies set<br><a href='getcookies'>Get cookies</a>`
    resp.status(200).send(str)

})

app.get("/getcookies",function(req,resp){
    console.log(req.cookies);
    resp.send(req.cookies.name+"------"+req.cookies.addr)

})

app.listen(3002,function(){
    console.log("server running at port 3002")
})