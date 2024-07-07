namespace ProductsWebApi.Entities
{
    public class Product
    {
        public int Id { get; set; }
        public string Title { get; set; }
        public string Description { get; set; }
        public int Quanity { get; set; }
        public double UnitPrice { get; set; }
    }
}
