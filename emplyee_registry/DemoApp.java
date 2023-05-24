package emplyee_registry;

import emplyee_registry.operations.AbstractOperations;
import emplyee_registry.operations.OperationForAddEmployee;
import emplyee_registry.operations.OperationForFindEmployeeById;
import emplyee_registry.operations.OperationForShowAllEmployee;
import emplyee_registry.utils.UserInput;

public class DemoApp {
    public static void main(String[] args) {
        new DemoApp().doBusiness();
    }

    private AbstractOperations [] operations;

    public DemoApp() {
        operations = new AbstractOperations[] {
            new OperationForAddEmployee(),
            // new OperationForFindEmployeeById(),
            // new OperationForShowAllEmployee()
        };
    }

    public void doBusiness() {
        // show start message
        System.out.println("====================================");
        System.out.println("Welcome To Student Registry App ");
        System.out.println("====================================");

        while (true) {
            // show operation with Id
            showOperations();

            System.out.println();

            // get user selected operation id
            var operation = getUserSelectedOperation();

            operation.doOperate();
            System.out.println();

            // ask user to finish
            if (doYouWantToFinish()) {
                break;
            }
        }

         // if finish -> show final message
         System.out.println();
         System.out.println("==========================================");
         System.out.println("Thanks! See you Again!");
         System.out.println("==========================================");
    }

    private AbstractOperations getUserSelectedOperation() {
        var id = getUserSelectedOperationId();

        for (var op : operations) {
            if (id == op.getId()) {
                return op;
            }
        }

        return null;
    }

    // get User Select id
    private int getUserSelectedOperationId() {
        return UserInput.readInt("Operation Id");
    }

    // exit loop code
    private boolean doYouWantToFinish() {
        String result = UserInput.readString("Do you want to exit (y / others)");
        return "y".equals(result); // true or false
    }

    private void showOperations() {
        System.out.println("Select Operation");
        for (var ope : operations) {
            System.out.printf("%d : %s%n", ope.getId(), ope.getName());
        }
    }


}
