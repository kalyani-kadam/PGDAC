using Microsoft.AspNetCore.Mvc;

namespace FlipKart.Controllers
{
    public class ProductsController : Controller
    {
        public ProductsController() { }

        public IActionResult Index()
        {
            List<string> products = new List<string>();
            products.Add("IPhone");
            products.Add("ThinkPad");
            products.Add("SmartWatch");
            products.Add("ITab");
            products.Add("Samsung Galaxy");
            products.Add("Xbox");

            ViewData["catalog"]=products;
            return Json(products);
            //return View();
        }
    }
}
