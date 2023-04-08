package com.jdc.demo.operations;

import com.jdc.demo.utils.UserInputs;
import com.jdc.demo.dto.Student;
import com.jdc.demo.service.StudentRegistry;

public class OperationForAddStudent extends AbstractOperation {

	public OperationForAddStudent() {
		super("Add New Student");
	}

	@Override
	protected void doJob() {
		// Get Student Name
		var name = UserInputs.readString("Enter Name");

		// Get Student Phone 
		var phone = UserInputs.readString("Enter Phone");

		// Get Student Email
		var email = UserInputs.readString("Enter Email");

		// Create Student
		var student = new Student(name, phone, email);

		// Add Student to Registry
		student = StudentRegistry.getInstance().addNew(student);

		// Show Result
		System.out.printf("%s has been register with id %d.%n", 
			student.getName(), student.getId());
	}
}