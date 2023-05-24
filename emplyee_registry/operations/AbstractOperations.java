package emplyee_registry.operations;

public abstract class  AbstractOperations {
    
    private int id;
    private String name;

    private static int ID = 0;

    // constructor
    public AbstractOperations(String name) {
        id = ++ID;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void doOperate() {
        showOperationTitle();
        doJob();
    }

    public abstract void doJob();

    private void showOperationTitle() {
        System.out.println();
        System.out.println("====================================================");
        System.out.print("%d : %s%n".formatted(id, name));
        System.out.println("====================================================");

    }

}
