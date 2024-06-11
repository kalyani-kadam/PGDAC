const fs=require('fs');
fs.copyFile("test.txt","targettest.txt",function(err){
    if(err){
        console.log(err);
    }else{
        console.log("copy done");
        fs.readFile("targettest.txt",function(err,data){
            if(err){
                console.log(err);
            }else{
                console.log("in read target file")
                console.log(data.toString());
                fs.writeFile("test1.txt",data,function(err){
                    if(err){
                        console.log(err)
                    }
                    else{
                        console.log("writing file is done")
                    }
                });
            }

        })
    }

})