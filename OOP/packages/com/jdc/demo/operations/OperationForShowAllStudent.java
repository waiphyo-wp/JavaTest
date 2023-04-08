package com.jdc.demo.operations;

import com.jdc.demo.service.StudentRegistry;

public class OperationForShowAllStudent extends AbstractOperation {

	private static final String ROW = "%2s %-18s %-13s %-20s%n";

	public OperationForShowAllStudent() {
		super("Show All Student");
	}

	@Override
	protected void doJob() {

		var students = StudentRegistry.getInstance().getAll();

		System.out.println("----------------------------------------------------");
		System.out.printf(ROW, "ID", "NAME", "PHONE", "EMAIL");
		System.out.println("----------------------------------------------------");
		for(var student : students) {
			System.out.printf(ROW, student.getId(), student.getName(),
				student.getPhone(), student.getEmail());
		}
		System.out.println("----------------------------------------------------");
	}

}