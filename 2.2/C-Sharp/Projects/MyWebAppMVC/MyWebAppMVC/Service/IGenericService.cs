namespace MyWebAppMVC.Service;

public interface IGenericService<T> where T : class { IEnumerable<T> GetAll(); 
    T? GetById(int id);
    T Create(T entity);
    void Update(T entity);
    void Delete(int id);
    bool Exists(int id);
}