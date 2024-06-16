import React,{useState,useEffect} from 'react'
import { useParams ,useNavigate,Link} from 'react-router-dom';
import ProductService from '../service/ProductService';
export default function ProductDetails() {
    const params=useParams();
    const navigate=useNavigate();
  const [product,setproduct]=useState({});
  useEffect(()=>{
       var pid=params.id;
       ProductService.getById(pid)
       .then((result)=>{
        console.log(result)
        setproduct({...result.data});
       })
       .catch((err)=>{
          console.log(err);
          navigate("/home")
       })
  },[]);
  return (
    <div>
        Product Id : {product.pid} <br></br>
        Product name : {product.pname} <br></br>
        Product quantity : {product.qty}<br></br>
        Product Price : {product.price}<br></br>
        <Link to="/table">
            <button type="button" name="btn" id="btn">Back to table</button>
        </Link>
    </div>
  )
}
