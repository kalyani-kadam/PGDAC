using ProductsWebApi.Entities;

namespace ProductsWebApi.Services
{
    public interface IProductService
    {
        List<Product> GetProducts();

    }
}
