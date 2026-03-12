namespace MyWebAppMVC.Contracts.ViewModel;

public record EmployeeListCTO(
    int Id,
    string FirstName,
    string LastName,
    string DepartmentName);