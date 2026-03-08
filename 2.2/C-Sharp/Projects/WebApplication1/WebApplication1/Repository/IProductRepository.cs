using WebApplication1.Models;

namespace WebApplication1.Repository;

public interface IProductRepository
{
    IEnumerable<Product> GetAll();
}