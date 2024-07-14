using Microsoft.EntityFrameworkCore;
using pracApp.Models;

namespace pracApp.Repository
{
    public class DBConncs : DbContext
    {
        public DbSet<Student> students { get; set; }
        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            string conn = @"server=localhost;user=root;password=root;port=3306;database=student;";
            optionsBuilder.UseMySQL(conn);
        }

        protected override void OnModelCreating(ModelBuilder modelBuilder)
        {
            base.OnModelCreating(modelBuilder);
            modelBuilder.Entity<Student>(entity =>
            {
                entity.HasKey(e => e.student_Id);
                entity.Property(e => e.student_name);
                entity.Property(e => e.student_address);
                entity.Property(e => e.admission_date);
                entity.Property(e => e.fees);
                entity.Property(e => e.status);
                entity.Property(e => e.mobile_no);
                entity.Property(e => e.student_email_id);
            });
            modelBuilder.Entity<Student>().ToTable("student");
        }
    }
}
