using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.Rendering;
using Microsoft.EntityFrameworkCore;
using MyWebAppMVC.Data;
using MyWebAppMVC.Models;
using MyWebAppMVC.Service;

namespace MyWebAppMVC.Controllers
{
    public class DepartmentsController : Controller
    {
        private readonly ApplicationDbContext _context;
        private IGenericService<Department> _service;

        public DepartmentsController(IGenericService<Department> service)
        {
            _service = service;
        }

        // GET: Departments
        public IActionResult Index()
        {
            return View(_service.GetAll());
        }


        // GET: Departments/Details/5
        public IActionResult Details(int? id)
        {
            if (id == null)
                return NotFound();

            var department = _service.GetById(id.Value);
            if (department == null)
                return NotFound();

            return View(department);
        }


        // GET: Departments/Create
        public IActionResult Create()
        {
            return View();
        }

        // POST: Departments/Create
        [HttpPost]
        [ValidateAntiForgeryToken]
        public IActionResult Create([Bind("Id,Name")] Department department)
        {
            if (ModelState.IsValid)
            {
                _service.Create(department);
                return RedirectToAction(nameof(Index));
            }
            return View(department);
        }


        // GET: Departments/Edit/5
        public IActionResult Edit(int? id)
        {
            if (id == null)
                return NotFound();

            var department = _service.GetById(id.Value);
            if (department == null)
                return NotFound();

            return View(department);
        }

        // POST: Departments/Edit/5
        // To protect from overposting attacks, enable the specific properties you want to bind to.
        // For more details, see http://go.microsoft.com/fwlink/?LinkId=317598.
        [HttpPost]
        [ValidateAntiForgeryToken]
        public IActionResult Edit(int id, [Bind("Id,Name")] Department department)
        {
            if (id != department.Id)
                return NotFound();

            if (ModelState.IsValid)
            {
                try
                {
                    _service.Update(department);
                }
                catch (DbUpdateConcurrencyException)
                {
                    if (!_service.Exists(department.Id))
                        return NotFound();
                    else
                        throw;
                }
                return RedirectToAction(nameof(Index));
            }
            return View(department);
        }

        // GET: Departments/Delete/5
        public IActionResult Delete(int? id)
        {
            if (id == null)
                return NotFound();

            var department = _service.GetById(id.Value);
            if (department == null)
                return NotFound();

            return View(department);
        }

        // POST: Departments/Delete/5
        [HttpPost, ActionName("Delete")]
        [ValidateAntiForgeryToken]
        public IActionResult DeleteConfirmed(int id)
        {
            _service.Delete(id);
            return RedirectToAction(nameof(Index));
        }

    }
}
