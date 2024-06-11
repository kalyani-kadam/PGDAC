const express=require("express");
const app=express();
const bodyParser = require("body-parser");
const m1=require("../formmodule1")

//add middlewares  submit_data?num1=100&num2=34&btn=add
//It parses data 
app.use(bodyParser.urlencoded({extended:false}))
app.use((req,resp,next)=>{
     console.log(req.url,"----",req.method)
     next()
})

app.get("/home",function(req,resp){
    resp.sendFile("public/calculatedemo.html",{root:__dirname});

})

app.get("/submit_data",function(req,resp){
    if(req.query.btn==="add"){
        var ans=m1.addition(parseInt(req.query.num1),parseInt(req.query.num2)) 
        resp.send(`Num1 : ${req.query.num1} Num2 : ${req.query.num2}
        Addition : ${ans}`)
     }else{
        var ans=m1.subtract(parseInt(req.query.num1),parseInt(req.query.num2)) 
        resp.send(`Num1 : ${req.query.num1} Num2 : ${req.query.num2}
        Subtraction : ${ans}`)
     }
    })
     

app.listen(3002,function(){
    console.log("server started at port 3002")
})