using KiddohubMvc.Models;
using KiddohubMvc.Repository;

namespace KiddohubMvc.Services
{
    public class ProductService : IProductService
    {
        public bool delete(int id)
        {
            return ProductRepository.delete(id);
        }

        public List<Product> getAllProducts()
        {
            return ProductRepository.getAllProducts();

        }

        public Product GetProduct(int id)
        {
            throw new NotImplementedException();
        }

        public bool insert(Product product)
        {
            return ProductRepository.insert(product);   
        }

        public bool update(Product product)
        {

            return ProductRepository.update(product);
        }
    }
}
