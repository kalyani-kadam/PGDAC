const express=require("express")
const  myrouter=express.Router()
const connection=require('../db/dbconnect')
//handle all urls

//get all products
myrouter.get("/products",function(req,res){
     connection.query("select * from product",function(err,data,fields){
        if(err){
            res.status(500).send("data not found")
        }
        else{
            //will return the data in json format
            res.json(data)
        }
     })
})
//retrive single object
myrouter.get("/products/:id",function(req,res){
    connection.query("select * from product where pid=? ",[req.params.id],function(err,data,fields){
       if(err){
           res.status(500).send("data not found")
       }
       else{
           //will return the data in json format
           res.json(data[0])
       }
    })
})

//add new object in the database
myrouter.post("/products/:id",function(req,res){
    connection.query("insert into product values (?,?,?,? )",[req.body.pid,req.body.pname,req.body.qty,req.body.price],function(err,result){
       if(err){
           res.status(500).send("data not inserted")
       }
       else{
            
           //will return the data in json format
           res.status(200).send("data inserted")
       }
    })
})

//update new object in the database
myrouter.put("/products/:id",function(req,res){
    connection.query("update product set pname=?, qty=?,price=? where pid=?",[req.body.pname,req.body.qty,req.body.price,req.body.pid],function(err,result){
       if(err){
           res.status(500).send("data not found")
       }
       else{
           //will return the data in json format
           res.status(200).send("data updated successfully!!")
       }
    })
})
//delete the  object in the database
myrouter.delete("/products/:id",function(req,res){
    connection.query("delete from product where pid=?",[req.params.id],function(err,data,fields){
       if(err){
           res.status(500).send("data not deleted")
       }
       else{
           //will return the data in json format
           res.status(200).send("data deleted succesfully!!")
       }
    })
})
module.exports=myrouter
