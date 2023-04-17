package com.jdc.demo.operations;

public abstract class AbstractionOperations {
    private int id;
    private String name;

    private static int ID = 0;

    // constructor 
    public AbstractionOperations(String name) {
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
        System.out.println();
        System.out.println("==========================================");
        System.out.print("%d : %s%n".formatted(id, name));
        System.out.println("==========================================");

    }
}
