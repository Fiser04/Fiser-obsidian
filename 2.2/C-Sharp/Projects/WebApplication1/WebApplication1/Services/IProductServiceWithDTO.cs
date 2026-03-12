using WebApplication1.ViewModels.Products;

namespace WebApplication1.Services;

public interface IProductServiceWithDTO
{
    IEnumerable<ProductListDTO> GetAllWithDetails();
    ProductDetailDto? GetByIdWithDetails(int id);
    IEnumerable<ProductListDTO> GetByCategory(int categoryId);
    IEnumerable<ProductListDTO> GetBySupplier(int supplierId);
    ProductDetailDto Create(ProductCreateDto dto);
    void Update(int id, ProductUpdateDto dto);
    void Delete(int id);
    bool Exists(int id);
}