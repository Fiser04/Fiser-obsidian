using Microsoft.AspNetCore.Identity;
using Microsoft.EntityFrameworkCore;
using MyWebAppMVC.Data;
using MyWebAppMVC.Service;
using MyWebAppMVC.Models;
using MyWebAppMVC.Repository;

var builder = WebApplication.CreateBuilder(args);

// Add services to the container.
var connectionString = builder.Configuration.GetConnectionString("DefaultConnection") ?? throw new InvalidOperationException("Connection string 'DefaultConnection' not found.");
builder.Services.AddDbContext<ApplicationDbContext>(options =>
    options.UseNpgsql(connectionString));  // Changed from UseSqlServer to UseNpgsql
builder.Services.AddDatabaseDeveloperPageExceptionFilter();

builder.Services.AddDefaultIdentity<IdentityUser>(options => options.SignIn.RequireConfirmedAccount = true)
    .AddEntityFrameworkStores<ApplicationDbContext>();
builder.Services.AddControllersWithViews();

builder.Services.AddScoped<IGenericService<Department>,  GenericService<Department>>();
builder.Services.AddScoped<IGenericRepository<Department>,  GenericRepository<Department>>();
builder.Services.AddScoped<IGenericService<Employee>,  GenericService<Employee>>();
builder.Services.AddScoped<IGenericRepository<Employee>, GenericRepository<Employee>>();

var app = builder.Build();

// Configure the HTTP request pipeline.
if (app.Environment.IsDevelopment())
{
    app.UseMigrationsEndPoint();
}
else
{
    app.UseExceptionHandler("/Home/Error");
    app.UseHsts();
}

app.UseHttpsRedirection();
app.UseRouting();

app.UseAuthorization();

app.MapStaticAssets();

app.MapControllerRoute(
        name: "default",
        pattern: "{controller=Home}/{action=Index}/{id?}")
    .WithStaticAssets();

app.MapRazorPages()
    .WithStaticAssets();

app.Run();