namespace MyWebAppMVC.Repository;

public interface IGenericRepository<T>  where T : class
{
    IEnumerable<T> GetAll();
}