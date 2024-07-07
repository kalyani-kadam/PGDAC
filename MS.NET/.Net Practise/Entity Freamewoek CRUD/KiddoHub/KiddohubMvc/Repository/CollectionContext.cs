using Microsoft.EntityFrameworkCore;

using KiddohubMvc.Models;

namespace KiddohubMvc.Repository
{
    public class CollectionContext : DbContext
    {
        public DbSet<Product> product { get; set; }

        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            string connstring = @"server=localhost;port=3306;user=root;password=root123;" +
                "database=productmanage;";
            optionsBuilder.UseMySQL(connstring);
         
        }

        protected override void OnModelCreating(ModelBuilder modelBuilder)
        {
            
            base.OnModelCreating(modelBuilder);
            modelBuilder.Entity<Product>(entity =>
            { 
            entity.HasKey(e => e.id);
            entity.Property(e => e.name).IsRequired();
            entity.Property(e => e.description).IsRequired();
            entity.Property(e => e.price).IsRequired();
        });
        modelBuilder.Entity<Product>().ToTable("products");
    }

    }
}
