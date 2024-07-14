using Microsoft.EntityFrameworkCore;
using MySql.EntityFrameworkCore;
using MovieWebApp.Models;
namespace MovieWebApp.Repository
{
    public class CollectionContext :DbContext
    {
        public DbSet<Movie> movies { get; set; }
        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            string conn = @"server=localhost;user=root;password=root;database=student;port=3306;";
            optionsBuilder.UseMySQL(conn);
        }

        protected override void OnModelCreating(ModelBuilder modelBuilder)
        {
            base.OnModelCreating(modelBuilder);
            modelBuilder.Entity<Movie>(entity =>{
                entity.HasKey(e => e.Id);
                entity.Property(e => e.Title).IsRequired();
                entity.Property(e => e.Description).IsRequired();
            }
            );
            modelBuilder.Entity<Movie>().ToTable("movie");
        }

    }
}
