function addition(ev){
    //alert("in addition");
    //console.log(ev);
    var n1=parseInt(document.getElementById("num1").value);
    var n2=parseInt(document.getElementById("num2").value);
    var addition=n1+n2;
    document.getElementById("mydiv").innerHTML="Addition: "+addition;
   }
   function subtract(){
      // alert("in subtract ")
      var n1=parseInt(document.getElementById("num1").value);
      var n2=parseInt(document.getElementById("num2").value)
      document.getElementById("mydiv").innerHTML="Subtraction: "+(n1-n2);
   }
   function factorial(){
       var n1=parseInt(document.getElementById("num1").value);
       var fact=1;
       for(var i=1;i<=n1;i++){
           fact=fact*i;
       }
       document.getElementById("mydiv").innerHTML="Factorial : "+fact;
   }