//import all libraries
const express=require("express")
const app=express();
const path=require("path");
const bodyParser=require("body-parser")
const routes=require("./routes/router")
//configure the application
//all views are in views folder
app.set("views",path.join(__dirname,"views")) // ./views/index.ejs
app.set("view engine","ejs");

//to add static references
app.set(express.static(path.join(__dirname,"public")))
//to use .js client side script or css file
app.use("/css",express.static(path.resolve(__dirname,"public/css")))
app.use("/js",express.static(path.resolve(__dirname,"public/js")))

//define middleware
app.use(bodyParser.urlencoded({extends:false}));
//send the routes to file router.js
app.use("/",routes);
//start the server
app.listen(3002,function(){
    console.log("server running at port 3002")
})
//export the app object
module.exports=app;