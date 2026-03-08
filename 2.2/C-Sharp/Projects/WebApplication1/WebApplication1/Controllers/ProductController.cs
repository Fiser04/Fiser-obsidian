using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.Rendering;
using Microsoft.EntityFrameworkCore;
using WebApplication1.Data;
using WebApplication1.Models;

namespace WebApplication1.Controllers
{
    public class ProductController(ApplicationDbContext context) : Controller
    {
        // GET: Product
        public async Task<IActionResult> Index()
        {
            var applicationDbContext = context.Products.Include(p => p.Category).Include(p => p.Supplier);
            return View(await applicationDbContext.ToListAsync());
        }

        // GET: Product/Details/5
        public async Task<IActionResult> Details(int? id)
        {
            if (id == null)
            {
                return NotFound();
            }

            var product = await context.Products
                .Include(p => p.Category)
                .Include(p => p.Supplier)
                .FirstOrDefaultAsync(m => m.Id == id);
            if (product == null)
            {
                return NotFound();
            }

            return View(product);
        }

        // GET: Product/Create
        public IActionResult Create()
        {
            ViewData["CategoryId"] = new SelectList(context.Categories, "Id", "Name");
            ViewData["SupplierId"] = new SelectList(context.Suppliers, "Id", "Name");
            return View();
        }

        // POST: Product/Create
        // To protect from overposting attacks, enable the specific properties you want to bind to.
        // For more details, see http://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public async Task<IActionResult> Create([Bind("Id,Name,CategoryId,SupplierId")] Product product)
        {
            ModelState.Clear(); // Clear the ModelState to ensure that validation is performed on the updated model
            if (ModelState.IsValid)
            {
                context.Add(product);
                await context.SaveChangesAsync();
                return RedirectToAction(nameof(Index));
            }
            ViewData["CategoryId"] = new SelectList(context.Categories, "Id", "Name", product.CategoryId);
            ViewData["SupplierId"] = new SelectList(context.Suppliers, "Id", "Name", product.SupplierId);
            return View(product);
        }

        // GET: Product/Edit/5
        public async Task<IActionResult> Edit(int? id)
        {
            if (id == null)
            {
                return NotFound();
            }

            var product = await context.Products.FindAsync(id);
            if (product == null)
            {
                return NotFound();
            }
            ViewData["CategoryId"] = new SelectList(context.Categories, "Id", "Name", product.CategoryId);
            ViewData["SupplierId"] = new SelectList(context.Suppliers, "Id", "Name", product.SupplierId);
            return View(product);
        }

        // POST: Product/Edit/5
        // To protect from overposting attacks, enable the specific properties you want to bind to.
        // For more details, see http://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public async Task<IActionResult> Edit(int id, [Bind("Id,Name,CategoryId,SupplierId")] Product product)
        {
            if (id != product.Id)
            {
                return NotFound();
            }
            ModelState.Clear();
            if (ModelState.IsValid)
            {
                try
                {
                    context.Update(product);
                    await context.SaveChangesAsync();
                }
                catch (DbUpdateConcurrencyException)
                {
                    if (!ProductExists(product.Id))
                    {
                        return NotFound();
                    }
                    else
                    {
                        throw;
                    }
                }
                return RedirectToAction(nameof(Index));
            }
            ViewData["CategoryId"] = new SelectList(context.Categories, "Id", "Name", product.CategoryId);
            ViewData["SupplierId"] = new SelectList(context.Suppliers, "Id", "Name", product.SupplierId);
            return View(product);
        }

        // GET: Product/Delete/5
        public async Task<IActionResult> Delete(int? id)
        {
            if (id == null)
            {
                return NotFound();
            }

            var product = await context.Products
                .Include(p => p.Category)
                .Include(p => p.Supplier)
                .FirstOrDefaultAsync(m => m.Id == id);
            if (product == null)
            {
                return NotFound();
            }

            return View(product);
        }

        // POST: Product/Delete/5
        [HttpPost, ActionName("Delete")]
        [ValidateAntiForgeryToken]
        public async Task<IActionResult> DeleteConfirmed(int id)
        {
            var product = await context.Products.FindAsync(id);
            if (product != null)
            {
                context.Products.Remove(product);
            }

            await context.SaveChangesAsync();
            return RedirectToAction(nameof(Index));
        }

        private bool ProductExists(int id)
        {
            return context.Products.Any(e => e.Id == id);
        }
    }
}
