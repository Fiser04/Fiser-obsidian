using WebApplication1.ViewModels.Category;
using WebApplication1.ViewModels.Supplier;

namespace WebApplication1.ViewModels.Products
{
    public record ProductDetailDto(
        int Id,
        string Name,
        decimal Price,
        bool IsActive,
        CategoryDto Category,
        SupplierDto Supplier
    );
}
