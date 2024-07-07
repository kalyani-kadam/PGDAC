using ProductsWebApi.Entities;

namespace ProductsWebApi.Repositories
{
    public interface IProductRepository
    {
        List<Product> GetProducts();
    }
}
