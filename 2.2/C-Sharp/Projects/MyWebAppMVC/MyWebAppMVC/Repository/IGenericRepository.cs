namespace MyWebAppMVC.Repository;

public interface IGenericRepository<T>  where T : class
{
    IEnumerable<T> GetAll();
    T? GetById(int id);
    T Add(T entity);
    void Update(T entity);
    void Delete(int id);
    bool Exists(int id); 
}