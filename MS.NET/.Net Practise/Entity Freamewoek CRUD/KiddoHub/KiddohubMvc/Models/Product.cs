namespace KiddohubMvc.Models
{
    public class Product
    {
        public int id { get; set; }
        public string? name { get; set; }
        public string description { get; set; }
        public int price { get; set; }

        public Product()
        {

        }
        public Product(int id, string? name, string description,int price)
        {
            this.id = id;
            this.name = name;
            this.description = description;
            this.price = price;
        }
    }
}
