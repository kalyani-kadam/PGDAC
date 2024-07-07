using ProductsWebApi.Entities;
using ProductsWebApi.Repositories;

namespace ProductsWebApi.Services
{
    public class ProductService : IProductService
    {
        public List<Product> GetProducts()
        {
             IProductRepository repository = new ProductRepository();
            return repository.GetProducts();
        }
    }
}
