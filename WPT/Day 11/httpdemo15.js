const http=require('http');
const fs=require("fs");
const url=require("url")
const m1=require("./formmodule2")

const server=http.createServer(function(req,resp){
      console.log(req.url+"------"+req.method);
      var q=url.parse(req.url,true);
      switch(q.pathname){
        case "/home":
            var rs=fs.createReadStream("./public/form1.html");
            rs.pipe(resp);
            break;
        case "/submit_data":
            resp.writeHeader(200,{"content-type":"text/html"})
            if(q.query.btn==="factorial"){
            var ans=m1.factorial(parseInt(q.query.num1));
            resp.write(`Number : ${q.query.num1} Factorial : ${ans}`) 
            }else{
                var ans=m1.printtable(parseInt(q.query.num1));
            resp.write(`Number : ${q.query.num1} table : ${ans}`) 
            }
            resp.end();

            break
        default:
            resp.write("<h1>in default page</h1>")
            resp.end();
            break;


      }
})

server.listen(3002,function(){
    console.log("server started at port 3002")
})