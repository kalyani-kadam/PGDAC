import React,{useState} from 'react'
import { useNavigate } from 'react-router-dom';
import ProductService from '../service/ProductService';
export default function ProductForm() {
    const [formdetails,setformdetails] =useState({pid:"",pname:"",qty:"",price:""})
    var navigate=useNavigate();
    const handlechange=(event)=>{
        //name of the text box on which change event has occured
       var name=event.target.name;
       
       setformdetails({...formdetails,[name]:event.target.value})
    }
   /* instead of writing 4 different change function we use single function handle change
   const changepid=(event)=>{
        setformdetails({...formdetails,pid:event.target.value})
    }*/
    //add product in the array
    const addproduct=()=>{
        if(formdetails.pid==="" || formdetails.pname==="" || formdetails.qty==="" || formdetails.price===""){
            alert("pls fill all the details");
            return;
        }
        ProductService.addProduct(formdetails)
        .then((result)=>{
            console.log(result);
            setformdetails({pid:"",pname:"",qty:"",price:""})
            navigate("/table")
        })
        .catch();
       
    }
  return (
    <div>
        <form>
            Product id : <input type="text" name="pid" id="pid"
            value={formdetails.pid}
            onChange={handlechange}></input><br></br>

            Product Name : <input type="text" name="pname" id="pname"
            value={formdetails.pname}
            onChange={handlechange}></input><br></br>

            Quantity : <input type="text" name="qty" id="qty"
            value={formdetails.qty}
            onChange={handlechange}></input><br></br>

            Product price : <input type="text" name="price" id="price"
            value={formdetails.price}
            onChange={handlechange}></input><br></br>

            <button type="button" name="btn" id="btn" onClick={addproduct}>Add new Product</button>
        </form>
    </div>
  )
}
