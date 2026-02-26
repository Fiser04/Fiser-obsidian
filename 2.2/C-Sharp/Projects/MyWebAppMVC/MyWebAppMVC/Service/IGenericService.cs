namespace MyWebAppMVC.Service;

public interface IGenericService<T> where T : class { IEnumerable<T> GetAll(); }