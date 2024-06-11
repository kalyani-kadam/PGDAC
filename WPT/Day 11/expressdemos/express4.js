const express=require("express");
const app=express();
const bodyParser = require("body-parser");
const m1=require("../formmodule2")

app.use(bodyParser.urlencoded({extended:false}))

app.get("/home",function(req,resp){
    resp.sendFile("public/form1.html",{root:__dirname})

})

app.get("/submit_data",function(req,resp){
    if(req.query.btn==="factorial"){
       var ans=m1.factorial(parseInt(req.query.num1));
       resp.send(`Number : ${req.query.num1} Factorial :${ans} `)
    }else{
        var ans=m1.printtable(parseInt(req.query.num1));
        resp.send(`Number : ${req.query.num1} table :${ans} `)
    }
    
})

app.listen(3002,function(req,resp){
    console.log("server running at port 3002")
})