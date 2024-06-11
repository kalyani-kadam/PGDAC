const fs=require('fs')
fs.exists("test.txt",function(exists){
    if(exists){
        fs.stat("test.txt",function(err,status){
            if(err){
                console.log(err)
            }else{
                console.log(status)
                fs.open("test.txt","r",function(err,fd){
                    if(err)
                        console.log(err)
                    else{
                        var buf=Buffer.alloc(20);
                        fs.read(fd,buf,0,10,null,function(err,bytesread,buffer){
                            if(err)
                                console.log(err)
                            else{
                                console.log(buffer.toString())
                            }
                        })
                    }

                })//end of open
            }
        })//end of stat
    }
})