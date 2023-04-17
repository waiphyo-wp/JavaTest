package com.jdc.demo;

import com.jdc.demo.operations.OperationForAddStudent;
import com.jdc.demo.operations.OperationForDeleteStudent;
import com.jdc.demo.operations.OperationForShowAllStudent;
import com.jdc.demo.utils.UserInput;
import com.jdc.demo.operations.AbstractionOperations;
import com.jdc.demo.operations.OperationForFindStudentById;

public class DemoApp {
    public static void main(String[] args) {
        new DemoApp().doBusiness();
    }

    private AbstractionOperations [] operations;

    public DemoApp() {
        operations = new AbstractionOperations[] {
            new OperationForAddStudent(),
            new OperationForShowAllStudent(),
            new OperationForFindStudentById(),
            new OperationForDeleteStudent()
        };
    }

    public void doBusiness() {
        // show start message
        System.out.println("==========================================");
        System.out.println("Welcome to Student Registration App");
        System.out.println("==========================================");
        System.out.println();

        while (true) {
            // show operations with id
            showOperations();
            
            System.out.println();

            // get user selected operation id
            var operation = getUserSelectedOperation();

            // Operate according to user selected id 
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

        // if no finish - > do operations again
    }

    private AbstractionOperations getUserSelectedOperation() {
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
