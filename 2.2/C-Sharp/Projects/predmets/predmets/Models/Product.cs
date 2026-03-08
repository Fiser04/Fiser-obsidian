using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace predmets.Models;

[Table("Predmet")]
public partial class Product
{
    [Key]
    public long Id { get; set; }
    
    [Required]
    [StringLength(255)]
    public string Nazev { get; set; }
    
    [Column("Supplier_id")]
    public long SupplierId { get; set; }
    
    [ForeignKey("SupplierId")]
    [InverseProperty("Predmets")]
    public virtual Supplier Supplier { get; set; }
    
    [Column("Category_id")]
    public long CategoryId { get; set; }
    
    [ForeignKey("CategoryId")]
    [InverseProperty("Predmets")]
    public virtual Category Category { get; set; }
    
}