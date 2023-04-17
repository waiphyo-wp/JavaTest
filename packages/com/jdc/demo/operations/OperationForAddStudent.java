package com.jdc.demo.operations;

import com.jdc.demo.dto.Student;
import com.jdc.demo.service.StudentRegistry;

import com.jdc.demo.utils.UserInput;

public class OperationForAddStudent extends AbstractionOperations{
    
    public OperationForAddStudent() {
        super("Add New Student Operation");
    }

    @Override
    public void doJob() {

        // Get Student Name
        var name = UserInput.readString("Enter Name"); // get string value from user input
        
        // Get Student Phone
        var phone = UserInput.readString("Enter Phone");

        // Get Student Email
        var email = UserInput.readString("Enter Email");

        // Create Student
        var student = new Student(name, phone, email);

        // Add Student To Registry
        student = StudentRegistry.getInstance().addNew(student);

        // Show Result
        System.out.printf("%s has been register with id %d. %n",
            student.getName(), student.getId()
        );
        
    }

}
