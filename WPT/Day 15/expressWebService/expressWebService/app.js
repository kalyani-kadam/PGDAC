//import all libraries
const express=require('express')
const app=express()
const routes=require("./routes/router")
const bodyParser=require("body-parser")
//add midlewares
app.use(bodyParser.urlencoded({extended:false}))
app.use(bodyParser.json())

//CORS settings
app.use(function(req, res, next) {
    res.setHeader('Access-Control-Allow-Origin', '*');
    res.setHeader('Access-Control-Allow-Methods', 'GET, POST, PUT, DELETE');
    res.setHeader('Access-Control-Allow-Headers', 'Content-Type');
    res.setHeader('Access-Control-Allow-Credentials', true);
    next();
});
//send control to router.js
app.use("/",routes)

app.listen(3002,function(){
    console.log("server has started at port 3002")
})
module.exports=app;

