using KiddohubMvc.Models;
using KiddohubMvc.Services;
using System.Linq;

namespace KiddohubMvc.Repository
{
    public class ProductRepository
    {
            public static bool delete(int id)
            {
                using (var context = new CollectionContext())
                {
                    context.product.Remove(context.product.Find(id));
                    context.SaveChanges();
                    return true;
                }
            }

            public static List<Product> getAllProducts()
            {
                using (var context = new CollectionContext())
                {
                    var products = from product in context.product select product;
                    return products.ToList<Product>();
                }

            }

            public static Product GetProduct(int id)
            {
                throw new NotImplementedException();
            }

            public static bool insert(Product product)
            {
                using (var context = new CollectionContext())
                {
                    context.product.Add(product);
                    context.SaveChanges();

                }
                return true;
            }

            public static bool update(Product product)
            {

                using (var context = new CollectionContext())
                {
                    var prod = context.product.Find(product.id);
                    //Console.WriteLine(prod.id+" "+prod.name+" "+prod.description);
                    prod.name = product.name;
                    prod.description = product.description;
                    prod.price = product.price;
                context.SaveChanges();

            }
                return true;
            }
        }
 }



