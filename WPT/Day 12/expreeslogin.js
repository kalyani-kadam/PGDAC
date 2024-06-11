const express=require("express");
const app=express();
const connection=require("./db/dbconnect")
const bodyParser=require("body-parser")

//get the data in req.query or req.body
app.use(bodyParser.urlencoded({extended:false}))

//display login form
app.get("/login",function(req,resp){
    resp.sendFile("public/login.html",{root:__dirname})

})

//once receive username and password validate it
app.post("/validateuser",function(req,resp){
    //retrieve username and password from the request
    var uname=req.body.uname;
    var passwd=req.body.passwd;
    console.log(req.body)
    //validate user from mysql table
    //retrieve the data from user table
    connection.query("select uname,password,role from user where uname=? and password=?",[uname,passwd],function(err,data,fields){
        
        if(data.length>0){ //check whether the row is found or not
            console.log(data[0]);  
            if((data[0].uname===uname)&&(data[0].password===passwd)){

                resp.send("valid user"+data[0].role)
            }else{
                resp.send("Invalid user")
            }
        }else{
            resp.send("Invalid user")
        }

    })//end of query
})

app.listen(3002,function(){
    console.log("server started at port 3002")

})



    


