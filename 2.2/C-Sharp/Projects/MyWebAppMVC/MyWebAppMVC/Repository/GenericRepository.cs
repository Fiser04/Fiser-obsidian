using Microsoft.EntityFrameworkCore;
using MyWebAppMVC.Data;

namespace MyWebAppMVC.Repository;

public class GenericRepository<T> : IGenericRepository<T> where T : class 
{
    private readonly ApplicationDbContext _dbContext;
    private readonly DbSet<T> _dbSet;

    public GenericRepository(ApplicationDbContext dbContext)
    {
        _dbContext = dbContext;
        _dbSet = _dbContext.Set<T>();
    }
    public IEnumerable<T> GetAll()
    {
        return _dbContext.Set<T>().ToList();
    }

    public T? GetById(int id)
    {
        return _dbSet.Find(id);
    }

    public T Add(T entity)
    {
        _dbSet.Add(entity);
        _dbContext.SaveChanges();
        return entity;
    }

    public void Update(T entity)
    {
        _dbSet.Update(entity);
        _dbContext.SaveChanges();
    }

    public void Delete(int id)
    {
        var entity = _dbSet.Find(id);
        if (entity == null) return;
        _dbSet.Remove(entity);
        _dbContext.SaveChanges();
    }

    public bool Exists(int id)
    {
        return _dbSet.Find(id) != null;
    }
}