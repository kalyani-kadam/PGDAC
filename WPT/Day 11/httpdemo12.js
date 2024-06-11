const http=require("http");
const fs=require("fs")
const server=http.createServer(function(req,resp){
    console.log(req.url+"-----"+req.method);
    switch(req.url){
        case "/home":
            var rs=fs.createReadStream("./public/homepage.html")
            rs.pipe(resp);
            break;
        case "/aboutus":
            var rs=fs.createReadStream("./public/aboutus.html")
            rs.pipe(resp);
            break;
        default:
            resp.writeHeader(200,{"content-type":"text/html"})
            resp.write("<h1>in default case</h1>");
            resp.end();

    }
})

server.listen(3002,function(){
    console.log("server started at port 3002")
})