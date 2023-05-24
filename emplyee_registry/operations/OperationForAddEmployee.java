package emplyee_registry.operations;



// import com.jdc.demo.utils.UserInput;

import emplyee_registry.dto.Employee;
import emplyee_registry.service.EmployeeRegistry;
import emplyee_registry.utils.UserInput;

public class OperationForAddEmployee extends AbstractOperations {

    public OperationForAddEmployee() {
        super("Add New Employee Operation");
    }

    @Override
    public void doJob() {
        // get employee name 
        var name = emplyee_registry.utils.UserInput.readString("Enter Name : ");

        // get employee email
        var email = UserInput.readString("Enter Email : ");

        // get employee phone
        var phone = UserInput.readString("Enter Phone");

        // create employee
        var employee = new Employee(name, email, phone);

        // add employee to registry
        employee = EmployeeRegistry.getEmployeeRegistry().addNew(employee);


        // Show Result
        System.out.printf("%s has been register with id %d. %n",
            employee.getName(), employee.getId()
        );

    }

}
