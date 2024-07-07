using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using WebApplication1.Services;
using WebApplication1.Entities;

namespace WebApplication1.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class ProductController : ControllerBase
    {
        private IProductService _productService;

        public ProductController(IProductService productService)
        {
            _productService = productService;
        }

        [HttpGet]
        public IActionResult GetAll() 
        { 
            return Ok(_productService.GetProducts());
        }
        
        [HttpDelete("delete")]
        public IActionResult delete(int id)
        {
            return Ok(_productService.delete(id));
        }

        [HttpPost("insert")]
        public IActionResult insert(Product product)
        {
            return Ok(_productService.insert(product));
                
        }

        [HttpPut("update")]
        public IActionResult update(Product product)
        {
            return Ok(_productService.update(product));
        }

    }
}
