using Microsoft.EntityFrameworkCore;
using MyWebAppMVC.Data;

namespace MyWebAppMVC.Repository;

public class GenericRepository<T> : IGenericRepository<T> where T : class 
{
    private readonly ApplicationDbContext _dbContext;

    public GenericRepository(ApplicationDbContext dbContext)
    {
        _dbContext = dbContext;
    }
    public IEnumerable<T> GetAll()
    {
        return _dbContext.Set<T>().ToList();
    }
}