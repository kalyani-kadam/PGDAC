using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using EStoreWebApp.Models;
using BLL;
using BOL;
namespace EStoreWebApp.Controllers;
public class ProductsController : Controller
{
    private readonly ILogger<ProductsController> _logger;

    public ProductsController(ILogger<ProductsController> logger)
    {
        _logger = logger;
    }

    // Get All products from BLL
    // bind all products to ViewData
    // send viewData to View
    public IActionResult Index(){  

        CatalogManager catalogManager = new CatalogManager();
        List<BOL.Product> products = catalogManager.GetAllProducts();

        //ViewData["catalog"]=products;
        // ViewBag.catalog=products;
       // TempData["catalog"] = products;

        return View(products);
    }
 
    public IActionResult Insert(){
        BOL.Product product=new BOL.Product();
        //product.Title="Gerbera";
        //product.Description= "Wedding flower";
        return View(product);
    }

    [HttpPost]
    public IActionResult Insert( BOL.Product productToCreate){
        Console.WriteLine("Post method invoked....");
        if(!ModelState.IsValid){

          return View();
        }
      /*  Console.WriteLine(productToCreate.Title + 
                           " " +
                           productToCreate.Description + " "+ 
                           productToCreate.UnitPrice + " "+
                           productToCreate.Quantity + " "+
                           productToCreate.ExpiryDate);

        */

        //insert product data into mysql using database connectivity
        return RedirectToAction("Index");     
    }
}