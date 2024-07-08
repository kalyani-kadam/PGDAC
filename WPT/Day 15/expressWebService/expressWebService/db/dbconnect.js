const mysql=require("mysql");

//databse connection details

var mysqlConnection=mysql.createConnection({
    host:'127.0.0.1',
    user:'root',
    password:'root',
    database:'productmanage',
    port:3306
    //multipleStatements:true
})

mysqlConnection.connect((err)=>{
    if(!err){
        console.log("connection done")
    }
    else{
        console.log(err);
    }

})

module.exports=mysqlConnection;