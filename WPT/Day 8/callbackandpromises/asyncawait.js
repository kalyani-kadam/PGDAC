function displaytable(arr){
    var str=`<table border='2'><tr><th>userId</th><th>Id</th><th>Title</th><th>Body</th></tr>`;
    for(var ob of arr){
        str+=`<tr><td>${ob.userId}</td><td>${ob.id}</td><td>${ob.title}</td><td>${ob.body}</td></tr>`
    }
    str+="</table>";
    console.log(str);
    document.getElementById("mydiv").innerHTML=str;

}

async function fetchdata(){
     var result= await fetch("https://jsonplaceholder.typicode.com/posts")
     if(result.status===200 && result.ok){
        var data=await result.json();
        displaytable(data);
     }
      
}