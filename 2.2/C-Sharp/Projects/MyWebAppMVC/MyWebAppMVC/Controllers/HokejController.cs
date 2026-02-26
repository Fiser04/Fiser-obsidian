using Microsoft.AspNetCore.Mvc;

namespace MyWebAppMVC.Controllers
{
    public class HokejController : Controller
    {
        public IActionResult Vyhra()
        {
            return View();
        }
    }
}
