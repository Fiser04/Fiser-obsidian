using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace predmets.Models;

[Table("Category")]
public partial class Category
{
   [Key] 
   public long Id { get; set; }
   
   [Required]
   [StringLength(255)]
   public string Name { get; set; }
   
   [InverseProperty("Category")]
   public virtual ICollection<Product> Predmets { get; set; } = new List<Product>();
}