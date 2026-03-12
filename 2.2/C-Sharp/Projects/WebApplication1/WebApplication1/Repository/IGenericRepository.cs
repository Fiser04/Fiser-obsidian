namespace WebApplication1.Repository;

public interface IGenericRepository<T> where T : class
{
    public IEnumerable<T> GetAll();
    public T? GetById(int id);
    public T Add(T entity);
    public void Update(T entity);
    public void Delete(int id);
    public bool Exists(int id); 
}