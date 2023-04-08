package com.jdc.demo.operations;

import com.jdc.demo.utils.UserInputs;
import com.jdc.demo.service.StudentRegistry;

public class OperationForFindStudentById extends AbstractOperation {

	public OperationForFindStudentById() {
		super("Find Student By Id");
	}

	@Override
	protected void doJob() {
		// Get Student ID
		var id = UserInputs.readInt("Student ID");

		// Find Student from Registration
		var student = StudentRegistry.getInstance().findById(id);

		// Show Result
		System.out.printf("%-14s : %s%n", "Name", student.getName());
		System.out.printf("%-14s : %s%n", "Phone", student.getPhone());
		System.out.printf("%-14s : %s%n", "Email", student.getEmail());
	}

}