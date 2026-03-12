using MyWebAppMVC.Contracts.ViewModel;
using MyWebAppMVC.Models;
using MyWebAppMVC.Repository;
using System.Linq;

namespace MyWebAppMVC.Service;

public class EmployeeService
{
    private readonly GenericRepository<Employee> _repository;

    public EmployeeService(GenericRepository<Employee> repository)
    {
        _repository = repository;
    }

    public IEnumerable<EmployeeListCTO> GetAllEmployees()
    {
        var employees = _repository.GetAll();
        return employees.Select(e => e.PostMapping());
    }

    public EmployeeListCTO? GetEmployeeById(int id)
    {
        var employee = _repository.GetById(id);
        return employee?.PostMapping();
    }
    
    
}

public static class EmployeeToDTO
    {
        public static EmployeeListCTO PostMapping(this Employee employee)
            => new EmployeeListCTO(employee.Id, employee.FirstName, employee.LastName, employee.Department.Name);
    }