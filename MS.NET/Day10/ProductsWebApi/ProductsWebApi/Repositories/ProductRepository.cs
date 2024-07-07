using ProductsWebApi.Entities;
using MySql.Data.MySqlClient;
using System.Net.Mail;

namespace ProductsWebApi.Repositories
{
    public class ProductRepository:IProductRepository
    {
        public List<Product> GetProducts()
        {
            List<Product> products = new List<Product>();
            string conString = @"server=localhost;port=3306;user=root; password=password; database=ecommerce";
            MySqlConnection con = new MySqlConnection(conString);
            string Query = "SELECT * from products";
            try
            {
                con.Open();
                MySqlCommand cmd = new MySqlCommand(Query, con);
                MySqlDataReader reader = cmd.ExecuteReader();
                while (reader.Read())
                {
                    int id = int.Parse(reader["product_id"].ToString());
                    string title = reader["product_title"].ToString();
                    string description = reader["description"].ToString();
                    int quantity = int.Parse(reader["stock_available"].ToString());
                    double unitPrice = double.Parse(reader["unit_price"].ToString());

                    Product prd = new Product();
                    prd.Id = id;
                    prd.Title = title;
                    prd.Description = description;
                    prd.UnitPrice = unitPrice;
                    prd.Quanity = quantity;
                    products.Add(prd);
                }
                reader.Close();

            }
            catch (Exception ex) { 
            }
            finally
            {
                if (con.State != System.Data.ConnectionState.Closed)
                {
                    con.Close();
                }
            }
            return products;

        }
    }
}
