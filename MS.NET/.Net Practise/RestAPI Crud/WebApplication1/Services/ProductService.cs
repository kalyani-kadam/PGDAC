using WebApplication1.Entities;
using WebApplication1.Repository;

namespace WebApplication1.Services
{
    public class ProductService : IProductService
    {
        IProductRepository repository = new ProductRepository();
        public bool delete(int id)
        {
            return repository.delete(id);
        }

        public List<Product> GetProducts()
        {
            return repository.GetProducts();
        }

        public bool insert(Product product)
        {
            return repository.insert(product);
        }

        public bool update(Product product)
        {
            return repository.update(product);
        }
    }
}
