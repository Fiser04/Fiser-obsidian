using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace WebApplication1.Models;

[Table("Products")]
public partial class Product
{
    [Key]
    public int Id { get; set; }
    
    [Required]
    [StringLength(100)]
    public string Name { get; set; }
    
    [Column("Category_id")]
    public int CategoryId { get; set; }
    
    [Column("Supplier_id")]
    public int SupplierId { get; set; }
    
    [ForeignKey("CategoryId")]
    [InverseProperty("Products")]
    public virtual Category Category { get; set; }
    
    [ForeignKey("SupplierId")]
    [InverseProperty("Products")]
    public virtual Supplier Supplier { get; set; }
}