using Microsoft.AspNetCore.Mvc;
using WebApplication1.Data;
using WebApplication1.Models;
using System.Linq;
using WebApplication1.Services;

namespace WebApplication1.Controllers
{
    public class ProductXController : Controller
    {
        private readonly ApplicationDbContext _context;
        private readonly IProductService productsX;

        public ProductXController(ApplicationDbContext context, IProductService productService )
        {
            _context = context;
            productsX = productService;
        }

        // GET: Product
        public async Task<IActionResult> Index()
        {
            //var applicationDbContext = _context.Products.Include(p => p.Category).Include(p => p.Supplier);
            
            // List<Product> products = _context.Products.Where(x => x.Name == "Iphone 1" ).ToList();
            
            // var productsX = from p in products where p.Name == "Iphone 1" select p;

            // var productsX = from p in _context.Products select new ViewModels.Products.PruductListDTOOClass()
            //     {
            //         Id = p.Id,
            //         Name = p.Name,
            //         CategoryName = p.Category.Name,
            //         SupplierName = p.Supplier.Name
            //     };
            
               
            return View(productsX.GetAll());
        }
    }
}
