namespace WebApplication1.ViewModels.Products
{
    public record ProductCreateDto(
    string Name,
    decimal Price,
    int CategoryId,
    int SupplierId
);
}
