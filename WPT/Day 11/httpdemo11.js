const http=require("http")
const server=http.createServer(function(req,resp){
    console.log(req.url,"-----",req.method);
    switch(req.url){
        case "/home":
            resp.writeHeader(200,{"content-type":"text/html"})
            resp.write("<h1>Home page</h1>")
            resp.write("<h2>Testing multiline o/p<h2>")
            resp.end();
            break;
        case "/aboutus":
            resp.writeHeader(200,{"content-type":"text/html"})
            resp.write("<h1>aboutus page</h1>")
            resp.end("<h2>Welcome to web app in nodejs");
            break;
        default:
            resp.writeHeader(200,{"content-type":"text/html"})
            resp.write("<h1>default page</h1>")
            resp.end();
            break;

    }
})

server.listen(3002,function(){
    console.log("server started at prot 3002")

})