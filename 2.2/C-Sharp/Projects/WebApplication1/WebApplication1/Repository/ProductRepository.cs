using Microsoft.EntityFrameworkCore;
using WebApplication1.Data;
using WebApplication1.Models;

namespace WebApplication1.Repository;

public class ProductRepository : IProductRepository
{
    private readonly ApplicationDbContext _dbContext;
    
    public ProductRepository(ApplicationDbContext dbContext)
    {
        _dbContext = dbContext;
    }
    public IEnumerable<Product> GetAll() 
    {
        return _dbContext.Products.Include(x => x.Category).Include(x => x.Supplier);
    }
}