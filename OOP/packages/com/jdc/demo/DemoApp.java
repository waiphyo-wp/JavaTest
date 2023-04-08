package com.jdc.demo;

import com.jdc.demo.operations.*;
import com.jdc.demo.utils.UserInputs;

public class DemoApp {

	public static void main(String[] args) {
		new DemoApp().doBusiness();
	}

	private AbstractOperation [] operations;

	public DemoApp() {
		operations = new AbstractOperation[] {
			new OperationForAddStudent(),
			new OperationForShowAllStudent(),
			new OperationForFindStudentById(),
			new OperationForDelete()
		};
	}

	public void doBusiness() {
		// Show Start Message
		System.out.println("=========================================");
		System.out.println("Welcome to Student Registration App");
		System.out.println("=========================================");
		System.out.println();

		while(true) {
			// Show Operations with id
			showOperations();

			// Get User Selected Operation Id
			var operation = getUserSelectedOperation();

			// Operate according to user selected id
			operation.doOperate();
			System.out.println();

			// Ask user to finish
			if(doYouWantToFinsih()) {
				break;
			}			
		}

		// if finish -> show final message
		System.out.println();
		System.out.println("=========================================");
		System.out.println("Thanks! See you again");
		System.out.println("=========================================");
	}

	private int getUserSelectedOperationId() {
		return UserInputs.readInt("Operation ID");
	}

	private boolean doYouWantToFinsih() {
		String result = UserInputs.readString("Do you want to exit? (y / Others)");
		return "y".equals(result);
	}


	private AbstractOperation getUserSelectedOperation() {
		var id = getUserSelectedOperationId();

		for(var op : operations) {
			if(id == op.getId()) {
				return op;
			}
		}

		return null;
	}

	private void showOperations() {
		System.out.println("Select operation id.");
		for(var ope : operations) {
			System.out.printf("%d : %s%n", ope.getId(), ope.getName());
		}
	}
}