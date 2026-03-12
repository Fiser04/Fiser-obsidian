using Microsoft.AspNetCore.Mvc;
using WebApplication1.Data;
using WebApplication1.Models;
using System.Linq;
using Microsoft.AspNetCore.Mvc.Rendering;
using WebApplication1.Services;
using WebApplication1.ViewModels.Products;

namespace WebApplication1.Controllers
{
    public class ProductXController : Controller
    {
        private readonly ApplicationDbContext _context;
        private readonly IProductService productsX;
        private readonly IProductServiceWithDTO productsXService;

        public ProductXController(ApplicationDbContext context, IProductService productService, IProductServiceWithDTO productsXService)
        {
            _context = context;
            productsX = productService;
            this.productsXService = productsXService;
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

        //products create
        [HttpGet]
        public IActionResult Create()
        {
            ViewData["CategoryId"] = new SelectList(_context.Categories, "Id", "Name");
            ViewData["SupplierId"] = new SelectList(_context.Suppliers, "Id", "Name");
            return View();
        }

        [HttpPost]
        [ValidateAntiForgeryToken]
        public async Task<IActionResult> Create([Bind("Id,Name,CategoryId,SupplierId")] Product product)
        {
            if (ModelState.IsValid)
            {
                _context.Add(product);
                // await _context.SaveChangesAsync();
                return RedirectToAction(nameof(Index));
            }
            ViewData["CategoryId"] = new SelectList(_context.Categories, "Id", "Name");
            ViewData["SupplierId"] = new SelectList(_context.Suppliers, "Id", "Name"); 
            return View(product);
        }
    }
}
