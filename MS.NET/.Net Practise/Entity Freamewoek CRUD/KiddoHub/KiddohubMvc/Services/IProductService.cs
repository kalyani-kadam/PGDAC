
using KiddohubMvc.Models;
namespace KiddohubMvc.Services

{
    public interface IProductService
    {
        List<Product> getAllProducts();
        Product GetProduct(int id);

        bool insert(Product product);

        bool update(Product product);

        bool delete(int id);

    }
}
