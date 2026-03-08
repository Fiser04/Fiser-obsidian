using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace WebApplication1.Models;

[Table("Suppliers")]
public class Supplier
{
    [Key]
    public int Id { get; set; }
    
    [Required]
    [StringLength(100)]
    public string Name { get; set; }
    
    [InverseProperty("Supplier")]
    public virtual ICollection<Product> Products { get; set; } = new List<Product>();
}