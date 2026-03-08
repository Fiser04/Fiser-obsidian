using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace predmets.Models;

[Table("Supplier")]
public partial class Supplier
{
    [Key]
    public long Id { get; set; }
    
    [Required]
    [StringLength(255)]
    public string Name { get; set; }
    
    [InverseProperty("Supplier")]
    public virtual ICollection<Product> Predmets { get; set; } = new List<Product>();
}