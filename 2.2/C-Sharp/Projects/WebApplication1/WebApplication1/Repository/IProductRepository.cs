using WebApplication1.Models;

namespace WebApplication1.Repository;

public interface IProductRepository
{
    IEnumerable<Product> GetAllWithDetails();
    Product? GetByIdWithDetails(int id);
    IEnumerable<Product> GetByCategory(int categoryId);
    IEnumerable<Product> GetBySupplier(int supplierId);
    IEnumerable<Product> GetAll();
    Product? GetById(int id);
    Product Add(Product entity);
    void Update(Product entity);
    void Delete(int id);
    bool Exists(int id);
}