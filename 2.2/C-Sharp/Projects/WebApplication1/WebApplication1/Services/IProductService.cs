using WebApplication1.ViewModels.Products;

namespace WebApplication1.Services;

public interface IProductService
{
    IEnumerable<ProductListDTO> GetAll();
}