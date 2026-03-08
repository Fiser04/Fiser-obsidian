using WebApplication1.Models;
using WebApplication1.Repository;
using WebApplication1.ViewModels.Products;
using System.Linq;
namespace WebApplication1.Services;

public class ProductService(IProductRepository productRepository) : IProductService
{
    public IEnumerable<ProductListDTO> GetAll()
    {
        var products = productRepository.GetAll().Select(x => x.ToProductListDTO());
        return products;
    }
}

public static class  ProductMapping
    {
        public static ProductListDTO ToProductListDTO(this Product product)
        {
            return new ProductListDTO(
                product.Id,
                product.Name,
                product.Category.Name,
                product.Supplier.Name
            );
        }
    }



