function displaytable(arr){
    var str=`<table border='2'><tr><th>userId</th><th>Id</th><th>Title</th><th>Body</th></tr>`;
    for(var ob of arr){
        str+=`<tr><td>${ob.userId}</td><td>${ob.id}</td><td>${ob.title}</td><td>${ob.body}</td></tr>`
    }
    str+="</table>";
    console.log(str);
    document.getElementById("mydiv").innerHTML=str;

}
function  displayDropdown(data){
    var str="<select name='uid' id='uid'>"
    for(var ob of data){
        str+=`<option value='${ob.id}'>${ob.id}</option>`
    }
    str+="</select>"
    document.getElementById("mydropdown").innerHTML=str;
}
function getUserdata(){
   fetch("https://jsonplaceholder.typicode.com/posts")
    .then((result)=>{
        console.log(result)
        if(result.status===200 && result.ok){
            return result.json();
        }
    }).then((data)=>{
       console.log(data)
       displaytable(data);
       displayDropdown(data);
    })
    .catch((err)=>{
        console.log(err);
    })
}
function displayemptable(arr){
    var str="<table border='2'><tr><th>Id</th><th>Name</th><th>Salary</th><th>Age</th></tr>"
    for(var ob of arr){
        str+=`<tr><td>${ob.id}</td><td>${ob.employee_name}</td><td>${ob.employee_salary}</td><td>${ob.employee_age}</td></tr>`
    }
    str+="</table>"
    document.getElementById("mydiv").innerHTML=str;
}

function getemployeedata(){
    alert("in getemployee")
    fetch("https://dummy.restapiexample.com/api/v1/employees")
    .then((result)=>{
        if(result.status===200 && result.ok){
            return result.json();
        }
    })
    .then((result)=>{
        console.log("in second then")
        displayemptable(result.data)
    })
    .catch(()=>{})
}
