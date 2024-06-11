var arr=[{name:"blog1",contents:"blog1 contents"},
{name:"blog2",contents:"blog2 contents"},
{name:"blog3",contents:"blog3 contents"}
]


//convert the array into unordered list
function getblogs(){
    setTimeout(()=>{
        console.log("in getblog function");
        var str="<ul>"
        for(var p of arr){
            str+=`<li>${p.name}-----${p.contents}</li>`
        }
        str+="</ul>" 
        document.getElementById("mydiv").innerHTML=str;
    },1000)
    
}

//adding data into arr
/*var createblogs=function(newblog){
setTimeout(()=>{
    console.log("in createblog function")
    arr.push(newblog); 
    console.log(arr);

},2000)

    

}*/
var createblogs=function(newblog,f1){
    setTimeout(()=>{
        console.log("in createblog function")
        arr.push(newblog); 
        console.log(arr);
        f1()
    
    },2000)
    
        
    
    }



//createblogs({name:"blog4",ciontents:"blog4 contents"})
//getblogs(f1)
createblogs({name:"blog4",ciontents:"blog4 contents"},getblogs)

