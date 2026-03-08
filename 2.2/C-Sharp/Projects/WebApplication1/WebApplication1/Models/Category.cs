using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace WebApplication1.Models;

[Table("Category")]
public partial class Category
{
    [Key]
    public int Id { get; set; }
    
    [Required]
    [StringLength(100)]
    public string Name { get; set; }
    
    [InverseProperty("Category")]
    public virtual ICollection<Product> Products { get; set; } = new List<Product>();
    
    
}