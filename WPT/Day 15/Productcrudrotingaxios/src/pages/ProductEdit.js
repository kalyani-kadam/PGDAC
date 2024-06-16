import React,{useState,useEffect} from 'react'
import {useLocation,useNavigate} from 'react-router-dom'
import ProductService from '../service/ProductService';

export default function ProductEdit() {
    const location=useLocation();
    const navigate=useNavigate();
    const [formdetails,setformdetails] =useState({pid:"",pname:"",qty:"",price:""})
    useEffect(()=>{
       setformdetails({...location.state.proddata}) 
    },[]);

    const handlechange=(event)=>{
        var name=event.target.name;
        setformdetails({...formdetails,[name]:event.target.value})
    }
    const updateproduct=()=>{
        if(formdetails.pid==="" || formdetails.pname==="" || formdetails.qty==="" || formdetails.price===""){
            alert("pls fill all details ")
        }
        ProductService.updateproduct(formdetails)
        .then((result)=>{
            console.log(result)
            setformdetails({pid:"",pname:"",qty:"",price:""})
            navigate("/table");
        })
        .catch((err)=>{
            console.log(err);
            navigate("/home");
        })
        
    }
  return (
    <div>
        <form>
            Product Id : <input type="text" name="pid" id="pid"
            value={formdetails.pid}
             readOnly></input><br></br>

            Product Name : <input type="text" name="pname" id="pname"
            value={formdetails.pname}
            onChange={handlechange}></input><br></br>

            Product Quantity : <input type="text" name="qty" id="qty"
            value={formdetails.qty}
            onChange={handlechange}></input><br></br>

            Product Price : <input type="text" name="price" id="price"
            value={formdetails.price}
            onChange={handlechange}></input><br></br>

            <button type="button" name="btn" id="btn" onClick={updateproduct}>Update Product</button>
        </form>
    </div>
  )
}
