package com.jdc.demo.operations;

public abstract class AbstractOperation {

	private int id;
	private String name;

	private static int ID = 0;

	public AbstractOperation(String name) {
		id = ++ ID;
		this.name = name;
	}

	public void doOperate() {
		showOperationTitle();

		doJob();
	}

	protected abstract void doJob();

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	private void showOperationTitle() {
		System.out.println("---------------------------");
		System.out.printf("%d. %s%n", id, name);
		System.out.println("---------------------------");
	}
}