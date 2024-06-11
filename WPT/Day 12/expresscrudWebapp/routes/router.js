const express=require("express");
const myrouter=express.Router()
const connection=require("../db/dbconnect")

//retrieve all products
myrouter.get("/products",function(req,resp){
     connection.query("select * from product",function(err,data,fields){
        if(err){
            resp.status(500).send("no data found")
        }else{
            //display product data in table format with the help of displayproduct.ejs
            resp.status(200).render("displayproduct",{proddata:data})
        }

     })
})

//display empty form to add product from add_product.ejs
myrouter.get("/addproductform",function(req,resp){
     resp.render("add_product")
})

//get data from form and add it in the databse
myrouter.post("/insertproduct",function(req,resp){
    connection.query("insert into product values(?,?,?,?)",[req.body.pid,req.body.pname,req.body.qty,req.body.price],function(err,result){
        if(err){
            resp.status(500).send("error occured")
        }else{
            //request will be redirected to products url, to show the table
            if(result.affectedRows>0){
                resp.redirect("/products")
            }
        }

    })
})

//data will be deleted from the database
myrouter.get("/deleteproduct/:id",function(req,resp){
    console.log("pid: ",req.params.id);
    connection.query("delete from product where pid=?",[req.params.id],function(err,result){
        if(err){
            console.log(err)
            resp.status(500).send("no data deleted")
        }
        else{
             //request will be redirected to products url, to show the table
            if(result.affectedRows>0){
                resp.redirect("/products")  
            }
        }

    })

})

//data will be displayed in the form for editing
//by using file update_prod.ejs
myrouter.get("/editproduct/:id",function(req,resp){
     connection.query("select * from product where pid=?",[req.params.id],function(err,data){
        if(err){
            resp.status(500).send("data not found")
        }else{
            if(data.length>0){
                resp.render("update_prod",{prod:data[0]})
            }
        }
     })
})

//data will get updated in the database
myrouter.post("/updateproduct",function(req,resp){
    connection.query("update product set pname=?,qty=?,price=?  where pid=?",[req.body.pname,req.body.qty,req.body.price,req.body.pid],function(err,result){
        if(err){
            console.log(err);
            resp.status(500).send("no data updated")
        }else{
             //request will be redirected to products url, to show the table
            resp.redirect("/products");
        }

    })

})

module.exports=myrouter;