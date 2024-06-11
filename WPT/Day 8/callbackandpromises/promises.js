async function f1(){
    return "hello"
}

var ans=f1()
//console.log(ans);
var promise2=ans
.then((result)=>{console.log("in first then"+result);return 10;})
.then((result)=>{console.log("in second then"+ result); return 20})
.catch(()=>{})

promise2.then((result)=>{console.log("in promise1 then"+result)})

var p1=new Promise((resolve,reject)=>{
    var num=2;
    if(num<5){
        //promise will be in rejected state
        reject("number is small")
    }else{
        //promise will be in resolved state
        resolve(10);
    }
})

p1.then((ans)=>{console.log("in p1 then"+ans)}).catch((err)=>{console.log(err)})

var promise1=new Promise((resolve,reject)=>{
    setTimeout(()=>{
        console.log("in promise1")
        resolve(10);
    },1000)
     
})

var promise2=new Promise((resolve,reject)=>{
    setTimeout(()=>{
        console.log("in promise2")
        resolve(20);
    },2000)
     
})

var promise3=new Promise((resolve,reject)=>{
    setTimeout(()=>{
        console.log("in promise3")
        resolve(30);
    },3000)
     
})

Promise.all([promise1,promise2,promise3])
.then((result)=>{
    console.log("in all function")
    console.log(result);
    var addition=result.reduce((acc,val)=>acc+val);
    console.log("addition : "+addition) 
})


