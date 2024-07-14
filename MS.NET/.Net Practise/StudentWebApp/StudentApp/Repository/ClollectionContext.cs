using Microsoft.EntityFrameworkCore;
using StudentApp.Models;

namespace StudentApp.Repository
{
    public class ClollectionContext : DbContext
    {
        public DbSet<Student> stud { get; set;}

        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            string connstring = @"server=localhost;port=3306;user=root;password=root;database=student;";
            optionsBuilder.UseMySQL(connstring);

        }
        protected override void OnModelCreating(ModelBuilder modelBuilder)
        {
            base.OnModelCreating(modelBuilder);
            modelBuilder.Entity<Student>(entity =>
            {
                entity.HasKey(e => e.student_id);
                entity.Property(e => e.student_name).IsRequired();
                entity.Property(e => e.student_email_id).IsRequired();
                entity.Property(e => e.mobile_no).IsRequired();
                entity.Property(e => e.admission_date).IsRequired();
                entity.Property(e => e.student_address).IsRequired();
                entity.Property(e => e.status).IsRequired();
                entity.Property(e => e.fees).IsRequired();
            });
            modelBuilder.Entity<Student>().ToTable("student");
        }
        
    }
}
