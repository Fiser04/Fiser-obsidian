namespace WebApplication1.ViewModels.Products
{
    public record ProductUpdateDto(
         string Name,
         decimal Price,
         bool IsActive,
         int CategoryId,
         int SupplierId
     );
}
