package com.jdc.demo.operations;

public class OperationForDelete extends AbstractOperation {

	public OperationForDelete() {
		super("Delete Student");
	}

	@Override
	protected void doJob() {
		System.out.println("Doing Delete Student Operation");
	}
}