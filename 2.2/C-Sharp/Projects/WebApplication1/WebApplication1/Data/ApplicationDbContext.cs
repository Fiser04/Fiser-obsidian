using Microsoft.AspNetCore.Identity.EntityFrameworkCore;
using Microsoft.EntityFrameworkCore;

namespace WebApplication1.Data;

public class ApplicationDbContext(DbContextOptions<ApplicationDbContext> options) : IdentityDbContext(options)
{
        public virtual DbSet<Models.Product> Products { get; set; }
        public virtual DbSet<Models.Supplier> Suppliers { get; set; }
        public virtual DbSet<Models.Category> Categories { get; set; }

        protected override void OnModelCreating(ModelBuilder modelBuilder)
        {
            base.OnModelCreating(modelBuilder);

            modelBuilder.Entity<Models.Product>(entity =>
            {
                entity.HasKey(e => e.Id).HasName("PK__Products__3214EC07F63AAA2E");

                entity.HasOne(d => d.Category).WithMany(p => p.Products)
                    .OnDelete(DeleteBehavior.ClientSetNull)
                    .HasConstraintName("FK_Products_Category");

                entity.HasOne(d => d.Supplier).WithMany(p => p.Products)
                    .OnDelete(DeleteBehavior.ClientSetNull)
                    .HasConstraintName("FK_Products_Suppliers");
            });
        }
       
}