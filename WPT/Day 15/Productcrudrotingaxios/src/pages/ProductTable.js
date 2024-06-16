import React from 'react'
import ProductService from '../service/ProductService';
import {useState,useEffect} from 'react'
import {Link,useNavigate} from 'react-router-dom'
export default function ProductTable() {
const [prodarr,setprodarr]=useState([]);
//initialize the prodarr in useEffect
//equivalent to componentdidMount 
useEffect(()=>{
    fetchdata();
},[]);
const navigate=useNavigate()

const fetchdata=()=>{
    console.log("in fetchdata")
    ProductService.getAllProducts()
    .then((result)=>{
        console.log(result.data);
        setprodarr(result.data);
    })
    .catch((err)=>{
        console.log(err);
        navigate("/home")

    });
    
}
const deleteproduct=(pid)=>{
    console.log("in delete")
    ProductService.deleteProduct(parseInt(pid))
    .then((result)=>{
        console.log(result);
        fetchdata();
    })
    .catch((err)=>{
        console.log(err);
        navigate("/home")
    })    


}
  return (
    <div>
    {/* change the url to form once click on the button */}
    <Link to="/form">
        <button type="button" name="btn" id="btn" className="btn btn-success">Add new product</button>
    </Link>
        <br></br><br></br>
        <table border='2'>
            <thead>
                <tr>
                    <th>Product Id</th>
                    <th>Product Name</th>
                    <th>Quantity</th>
                    <th>Price</th>
                    <th>actions</th>
                </tr>
            </thead>
            <tbody>
                {prodarr.map(prod=><tr key={prod.pid}>
                    <td>{prod.pid}</td>
                    <td>{prod.pname}</td>
                    <td>{prod.qty}</td>
                    <td>{prod.price}</td>
                    <td>
                        <button type="button" name="del" id="del" className="btn btn-danger" onClick={()=>{deleteproduct(prod.pid)}} >Delete</button>

                    <Link to={`/edit/${prod.pid}`} state={{proddata:prod}}>
                        <button type="button" name="edit" id="edit"
                        className="btn btn-info">Edit</button>
                    </Link>
                    <Link to={`/view/${prod.pid}`}>
                        <button type="button" name="view" id="view" className="btn btn-warning">View</button>
                    </Link>
                    </td>
                </tr>)}
            </tbody>
        </table>
    </div>
  )
}
