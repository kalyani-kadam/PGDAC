//import all libraries
const express=require('express')
const app=express()
const routes=require("./routes/router")
const bodyParser=require("body-parser")
//add midlewares
app.use(bodyParser.urlencoded({extended:false}))
app.use(bodyParser.json())
//send control to router.js
app.use("/",routes)
app.listen(3002,function(){
    console.log("server has started at port 3002")
})
module.exports=app;

