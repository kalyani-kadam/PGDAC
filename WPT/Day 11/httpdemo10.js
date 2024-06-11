const http=require("http")
var server=http.createServer(function(req,resp){
    console.log(req.url+"---->"+req.method)
    resp.write("<h1>Hello world!!</h1>");
    resp.end("<h2>Welcome to nodejs http module</h2>");
})
server.listen(3002,function(){
    console.log("the server is running at port 3002")
})