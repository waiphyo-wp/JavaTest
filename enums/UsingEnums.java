package enums;

public class UsingEnums {

    public static void main(String[] args) {
        for (Day day : Day.values()) {
            day.log();
        }
    }

    // static void showDay(Day day) {
    //     System.out.println("Overwrite toString() Method" + day);// return toString
    //     System.out.println(day.getViewName());
    // }
}

interface Loggable {
    //abstract method
    void log();
}

enum Day implements Loggable {

    // for abstract method
    // SUN("Sunday"){
    //     public void log() {
    //         System.out.println("This is Sunday");
    //     }
    // }, 
    SUN("Sudnay") {
        @Override
        public void log() {
            System.out.println("Sad Sunday");
        }
    },
    MON("Monday"), 
    TUE("Tuesday"), 
    WED("Wednesday"), 
    THU("Thursday"), 
    FRI("Friday"), 
    SAT("Saturday");

    // state (instant variable)
    private String viewName;

    @Override
    public void log() {
        System.out.println("Hello Today is " + viewName );
    }

    // constructor
    Day(String viewName) {
        this.viewName = viewName;
    }

    public String getViewName () {
        return this.viewName;
    }

    public String toString() {
        return getViewName();
    }

}