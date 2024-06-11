const http=require("http");
const fs=require("fs");
const url=require("url");
const m1=require("./formmodule1");

const server=http.createServer(function(req,resp){
       console.log(req.url+"------"+req.method)
       //url.parse will break the url into pathname and query object
       //the second parameter true, will convert query string into a object
       var q=url.parse(req.url,true)
       console.log(q)  //{pathname:"/home", query:{num1:12,num2:13}}
       switch(q.pathname){
          case "/home":
                var rs=fs.createReadStream("./public/calculatedemo.html");
                rs.pipe(resp);
                break;
          case "/submit_data":
                if(q.query.btn==="add"){
                    var ans=m1.addition(parseInt(q.query.num1),parseInt(q.query.num2))
                    resp.write(`num1 : ${q.query.num1} num2: ${q.query.num2} Addition: ${ans}`);
                    resp.end();
                }else{
                    if(q.query.btn==="sub"){
                        var ans=m1.subtract(parseInt(q.query.num1),parseInt(q.query.num2))
                    resp.write(`num1 : ${q.query.num1} num2: ${q.query.num2} Subtraction: ${ans}`);
                    resp.end();
                    }

                }
                break;
          default:
               resp.write("<h1>tIn default page</h1>")
               break;

            
       }
})
server.listen(3002,function(){
    console.log("server started at port 3002")
})