using KiddohubMvc.Models;
using KiddohubMvc.Services;
using Microsoft.AspNetCore.Mvc;

namespace KiddohubMvc.Controllers
{
    public class CrudController : Controller
    {
        private IProductService _productService;
        public IActionResult register()
        {
            return View();
        }
        public CrudController(IProductService productService) {
            _productService = productService;
        }
        public IActionResult Index()
        {
           List<Product> products = _productService.getAllProducts();
            return View(products);
        }

        public IActionResult Login()
        {
            return View();
        }

      /*  [HttpPost]
        public IActionResult Login()
        {
            if (email == "kk@gmail.com" && password == "kk123")
            {
                return RedirectToAction("index", "Contact");
            }
            return View();

        }
      */


        public IActionResult addProduct()
        {
            return View();
        }

        [HttpPost]
        public IActionResult addProduct(int id,string name,string description, int price)
        {
            Product product = new Product();
            //Product product = new Product(id,name,description,price);
            product.id = id;
            product.name = name;
            product.description = description;  
            product.price = price;  

            return Json(_productService.insert(product));
        }
        public IActionResult deleteProduct()
        {
            return View();
        }

        [HttpPost]
        public IActionResult deleteProduct(int id)
        {
            return Json(_productService.delete(id));
        }

        public IActionResult editProduct()
        {

            return View();

        }

        [HttpPost]
        public IActionResult editProduct(Product product)
        {
            Product product1 = new Product();
            product1.id = product.id;   
            product1.name = product.name;   
            product1.description = product.description;
            product1.price = product.price;
            return Json(_productService.update(product1));
        }

    }
}
