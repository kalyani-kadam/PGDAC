using WebApplication1.Entities;

namespace WebApplication1.Services
{
    public interface IProductService
    {
        List<Product> GetProducts();
        bool insert(Product product);
        bool update(Product product);
        bool delete(int id);
    }
}
