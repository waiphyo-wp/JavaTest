package com.jdc.demo.operations;

import com.jdc.demo.service.StudentRegistry;
import com.jdc.demo.utils.UserInput;

public class OperationForFindStudentById extends AbstractionOperations {
    public OperationForFindStudentById () {
        super("Find Student By Id Operation");
    }

    @Override
    public void doJob() {
        // Get Student ID
        var id = UserInput.readInt("Student Id");
        
        // find Student from Registration
        var student = StudentRegistry.getInstance().findById(id);

        // show Result
        System.out.printf("%-16s : %s%n", "Student Name", student.getName());
        System.out.printf("%-16s : %s%n", "Student Phone", student.getPhone());
        System.out.printf("%-16s : %s%n", "Student Email", student.getEmail());


    }
}
