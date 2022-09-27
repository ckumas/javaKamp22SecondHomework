public class Main {
    public static void main(String[] args) {
        Customer customer=new Customer();
        Employee employee=new Employee();
        customer.email="cumhurkumas@cumhurkumas.com";
        employee.firstName="Cumhur";

        EmployeeManager employeeManager=new EmployeeManager();
        CustomerManager customerManager=new CustomerManager();

        employeeManager.BestEmployee();
        customerManager.List();
    }
}