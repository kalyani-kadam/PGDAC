using KiddohubMvc.Models;

namespace KiddohubMvc.Repository
{
    public interface IProductRepository
    {
        List<Product> getAllProducts();
        Product GetProduct(int id);

        bool insert(Product product);

        bool update(Product product);

        bool delete(int id);
    }
}
