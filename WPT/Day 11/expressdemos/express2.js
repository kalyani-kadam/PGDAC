const express=require("express")
//create a object of express
const app=express()

const bodyparser=require("body-parser");

app.use(function(req,resp,next){
    console.log("in middleware 1")
    next()
})
app.use(function(req,resp,next){
    console.log("in middleware 2")
    next()
})
app.get("/home",function(req,resp){
    var str="<h1>Hello world!!";
    str+="<h2>Welcome to expressJs programming</h2>"
    resp.send(str);

})
app.get("/aboutus",function(req,resp){
    var str="<h1>Aboutus page";
    str+="<h2>Welcome to expressJs programming</h2>"
    resp.send(str);

})
app.get("/hello",function(req,resp){
   resp.sendFile("public/helloworld.html",{root:__dirname})

})

app.listen(3002,function(){
    console.log("server running at port 3002");
})