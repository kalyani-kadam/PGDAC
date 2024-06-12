import {useState,useEffect} from 'react';
const CounterFunctionalComponent=()=>{
    //useState function return 2 values and accepts inital value of count as a parameter
   const [cnt,setcnt]=useState(0);

   //this function will get executed every time cnt value changes by using setcnt function
    useEffect(()=>{
        console.log("change count", cnt) 
    },[cnt])
    const increment=()=>{
        
        setcnt(cnt+1);
        console.log("in increament function", cnt)
    } 
    const decreament=()=>{
        setcnt(cnt>0?cnt-1:0);
    }
    const resetcnt=()=>{
        setcnt(0);
    }
    return(
        <div>
        <h3>You clicked {cnt} times</h3>
            <button type="button" name="inc" id="inc" value="inc" onClick={increment}>Increament counter</button>

            <button type="button" name="decr" id="decr" value="decr" onClick={decreament}>Decreament counter</button>

            <button type="button" name="reset" id="reset" value="reset" onClick={resetcnt}>Reset counter</button>
        </div>
    )
}
export default CounterFunctionalComponent;