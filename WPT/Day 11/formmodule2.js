exports.factorial=(num)=>{
     fact=1;
     for(var i=1;i<=num;i++){
        fact=fact*i;
     }
     return fact;
}

exports.printtable=(num)=>{
    var str="<br>";
     for(var i=1;i<=10;i++){
         str=str+`${num} * ${i} = ${num*i}<br>`;
     }
     return str;
}