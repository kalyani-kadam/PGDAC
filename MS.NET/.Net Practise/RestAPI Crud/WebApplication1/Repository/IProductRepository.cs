using WebApplication1.Entities;
namespace WebApplication1.Repository
{
    public interface IProductRepository
    {
        List<Product> GetProducts();
        bool insert(Product product);
        bool update(Product product);
        bool delete(int Id);

    }
}
