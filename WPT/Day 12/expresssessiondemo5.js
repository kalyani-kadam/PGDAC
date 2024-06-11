const express=require("express");
const session=require("express-session")
const app=express();
const bodyparser=require("body-parser")

app.use(bodyparser.urlencoded({extended:false}))
//session setup
app.use(session({
    //it holds the secret key of the session
    secret:"test",
    //forces the session tobe saved  back to the session store
    resave:true,
    //forces a session that is uninitialized to be saved in the store
    saveUninitialized:true
}))


app.get("/home",function(req,resp){
    resp.sendFile("public/express_session.html",{root:__dirname})
})

app.get("/checksession",function(req,resp){
     req.session.name=req.query.nm;
     console.log("name :" +req.session.name);
     resp.send("<form action='getsession'><button type='submit' name='btn' id='btn'>clickme</button></form>")

})

app.get("/getsession",function(req,resp){
    if(req.session.count===undefined){
        req.session.count=1;
    }else{
        req.session.count=req.session.count+1;
    }
    var str=`<h2> welcome ${req.session.name}</h2><br>`
    str+=`you clicked ${req.session.count} times<br>`
    str+=`<a href='getsession'>click me to get count</a>`
    str+=`<a href='destroysession'>click me to exit</a>`
    resp.send(str);

})

app.get("/destroysession",function(req,resp){
    //to destroy the session
    req.session.destroy(function(err){
          console.log("session destroyed");
          
    })
    resp.send("<h3>Thank you for visiting... do visit again</h3>")
    

})

app.listen(3002,function(){
    console.log("server running on port 3002")
})