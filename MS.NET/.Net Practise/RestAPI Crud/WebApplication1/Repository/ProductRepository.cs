using WebApplication1.Entities;
using System.Linq;
namespace WebApplication1.Repository
{
    public class ProductRepository : IProductRepository
    {
        public bool delete(int Id)
        {
            using (var context = new CollectionContext())
            {
                context.product.Remove(context.product.Find(Id));
                context.SaveChanges();
                return true;
            }
        }

        public List<Product> GetProducts()
        {
            using (var context = new CollectionContext())
            {
                var products = from product in context.product select product;
                return products.ToList<Product>();
            }
        }
       public bool insert(Product product)
        {
                using (var context = new CollectionContext()) {
                    context.product.Add(product);
                    context.SaveChanges();
                }
                return true;
        }
        

       public bool update(Product product)
        {
            using (var context = new CollectionContext())
            {
                var prod = context.product.Find(product.id);

                prod.id = product.id;
                prod.name = product.name;
                prod.price = product.price;
                prod.description = product.description;
                context.SaveChanges();
            }
            return true;
        }
    }
}