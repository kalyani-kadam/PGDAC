import Product from '../Product';
import axios from 'axios';
var baseUrl="http://localhost:3002/products"
class ProductService{
    constructor(){
        this.prodarr=[new Product(1,"chair",23,2345),
            new Product(2,"Table",45,3333),
            new Product(3,"shelf",50,5555)
        ]
    }
    getAllProducts(){
        return axios.get(baseUrl);
    }
    getById(pid){
        return axios.get(baseUrl+"/"+pid);
    }

    addProduct(product){
        //add product at the end of the array
        //var headers={"content-type":"application/json",Atherization:"barer+<token>"}
        var myheader={"content-type":"application/json"}
        return axios.post(baseUrl+"/"+product.pid,product,{headers:myheader})
         
    }
    updateproduct(product){
        var myheader={"content-type":"application/json"}
       return axios.put(baseUrl+"/"+product.pid,product,{headers:myheader})

    }
    deleteProduct(pid){
        return axios.delete(baseUrl+"/"+pid)
    }
}

export default new ProductService();