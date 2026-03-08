namespace WebApplication1.ViewModels.Products;

public record ProductListDTO(
    int Id,
    string Name,
    string CategoryName,
    string SupplierName);
    

// Alternative class-based DTO, if you prefer using classes over records
    public class PruductListDTOOClass
    {
        public int Id { get; set; }
        public string Name { get; set; }
        public string CategoryName { get; set; }
        public string SupplierName { get; set; }
    }