using Microsoft.EntityFrameworkCore;
using WebApplication1.Entities;
namespace WebApplication1.Repository
{
    public class CollectionContext : DbContext
    {
        public DbSet<Product> product { get; set; }    
        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            string connstring = @"server=localhost;user=root;port=3306;password=root;database=productmanage";

            optionsBuilder.UseMySQL(connstring);

        }

        protected override void OnModelCreating(ModelBuilder modelBuilder)
        {
            base.OnModelCreating(modelBuilder);
            modelBuilder.Entity<Product> (entity =>
            {
                entity.HasKey(e => e.id);
                entity.Property(e => e.name);
                entity.Property(e => e.description);
                entity.Property(e => e.price);
            });

            modelBuilder.Entity<Product>().ToTable("products");
        }
    }
}
