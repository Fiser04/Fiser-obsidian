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
}