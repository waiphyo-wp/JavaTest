package emplyee_registry.service;

import emplyee_registry.dto.Employee;
import emplyee_registry.utils.IdGenerator;

public class EmployeeRegistry {
    private IdGenerator idGen;
    // to store employee info
    private Employee [] array;

    // singleton object
    private static final EmployeeRegistry EMPLOYEEREGISTRY = new EmployeeRegistry();

    public static EmployeeRegistry getEmployeeRegistry() {
        return EMPLOYEEREGISTRY;
    }

    private EmployeeRegistry() {
        idGen = new IdGenerator();
        array = new Employee[0];
    }

    // add new employee
    public Employee addNew(Employee e) {
        // id generate
        var id = idGen.generate();

        // set id
        e.setId(id);

        pushToarray(e);

        return e;

    }

    private void pushToarray(Employee e) {
        var copy = new Employee[array.length + 1];

        for (int i = 0; i < copy.length; i++) {
            copy[i] = array[i];
        }

        copy[copy.length-1] = e;
        array = copy;

    }

    // get all employee
    public Employee[] getAll() {
        return array;
    }

    // find employee by id
    public Employee findById(int id) {

        for (var employee : array) {
            if (employee.getId() == id) {
                return employee;
            }

        }

        return null;
    }

}
