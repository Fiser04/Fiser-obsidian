using Microsoft.EntityFrameworkCore;
using WebApplication1.Data;
using WebApplication1.Models;
using WebApplication1.Data;
using WebApplication1.Models;

namespace WebApplication1.Repository
{
    public class ProductRepository(ApplicationDbContext context)
        : GenericRepository<Product>(context), IProductRepository
    {
        private readonly ApplicationDbContext _ctx = context;

        // GET all products with Category and Supplier eagerly loaded
        public IEnumerable<Product> GetAllWithDetails()
            => _ctx.Products
                .Include(p => p.Category)
                .Include(p => p.Supplier)
                .ToList();

        // GET single product with navigation properties
        public Product? GetByIdWithDetails(int id)
            => _ctx.Products
                .Include(p => p.Category)
                .Include(p => p.Supplier)
                .FirstOrDefault(p => p.Id == id);

        // GET products filtered by Category
        public IEnumerable<Product> GetByCategory(int categoryId)
            => _ctx.Products
                .Include(p => p.Category)
                .Include(p => p.Supplier)
                .Where(p => p.CategoryId == categoryId)
                .ToList();

        // GET products filtered by Supplier
        public IEnumerable<Product> GetBySupplier(int supplierId)
            => _ctx.Products
                .Include(p => p.Category)
                .Include(p => p.Supplier)
                .Where(p => p.SupplierId == supplierId)
                .ToList();
        //
        //     // GET only active products
        //     public IEnumerable<Product> GetActive()
        //         => _ctx.Products
        //                .Include(p => p.Category)
        //                .Include(p => p.Supplier)
        //                .Where(p => p.IsActive)
        //                .ToList();
        // }
    }
}