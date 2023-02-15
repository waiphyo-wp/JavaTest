public class LF_10_Looping {

    
    public static void main(String[] args) {
        String [] carBrand = {"Toyota", "Suzuki", "Lanbogini"};
        resultArray(carBrand);
    }

    static void resultArray(String [] arg) {
        //for loop 
        /*
         * 1. initialize
         * 2. decision
         * 3. increament
         */
        // for (int i = 0; i < arg.length; i++) {
        //     System.out.println(arg[i]);
        // }

        // for each loop
        for (String str : arg) {
            System.out.println(str);
        }
            
    }
}
