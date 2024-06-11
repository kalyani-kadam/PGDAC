const express=require("express")
const app=express();
const bodyparser=require("body-parser")
//these are middlewares, gets executed for every url
app.use(function(req,resp,next){
    console.log("in middleware 1",req.url+"----"+req.method)
    next();
})
app.use(function(req,resp,next){
    console.log("in middleware 2",req.url+"----"+req.method)
    next();
})

//this is url specific middleware
app.get("/hello",function(req,resp){
    resp.send("<h1>Hello World!</h1>")
})

app.get("/welcome",function(req,resp){
    resp.send("<h1>Welcome to nodejs application!</h1>")
})

app.listen(3002,function(){
    console.log("server started at port 3002")
})
