using MyWebAppMVC.Data;
using MyWebAppMVC.Repository;
namespace MyWebAppMVC.Service;

public class GenericService<T> : IGenericService<T> where T: class
{
    private readonly IGenericRepository<T> _repository;
    public GenericService(IGenericRepository<T> repository)
    {
        _repository = repository;
    }
    public IEnumerable<T> GetAll()
    {
        return _repository.GetAll();
    }

    public T? GetById(int id){
        return _repository.GetById(id);
    }

    public T Create(T entity)
    {
        return _repository.Add(entity);
    }

    public void Update(T entity)
    {
        _repository.Update(entity);
    }

    public void Delete(int id)
    {
        _repository.Delete(id);
    }

    public bool Exists(int id)
    {
        return _repository.Exists(id);
    }
}