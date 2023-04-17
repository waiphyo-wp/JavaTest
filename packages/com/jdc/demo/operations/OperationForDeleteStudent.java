package com.jdc.demo.operations;

import com.jdc.demo.service.StudentRegistry;
import com.jdc.demo.utils.UserInput;

public class OperationForDeleteStudent extends AbstractionOperations {
    
    public OperationForDeleteStudent() {
        super("Delete Student");
    }

    @Override
    public void doJob() {
        // Get Student ID
        var id = UserInput.readInt("Student Id");

        // Delete Student from Registry with id
        var student = StudentRegistry.getInstance().remove(id);

        // show Result
        // Message => "Student Name" has been removed Successfully!
        System.out.println("removed Successfully!"            
        );
    }

}
