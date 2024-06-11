const fs=require('fs')
fs.exists("test.txt",function(exists){
    if(exists){
        fs.stat("test.txt",function(err,status){
            if(err){
                console.log(err)
            }else{
                console.log(status)
            }
        })
    }
})