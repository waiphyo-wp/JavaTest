public class LF_10_Branch_Statement {
    
    public static void main(String[] args) {
        if (args.length == 2) {
            
            // first num total
            int total = Integer.parseInt(args[0]);

            // second num show
            int show = Integer.parseInt(args[1]);

            // using return = > return not work below code
            if (total <= show) {
                System.out.println("Total must greater than show.");
                return;
            }

            // using continue and break
            for (int i = 1; i <= total; i++) {
                
                System.out.println("Loop again" + i);
                // using continue => stop current loop , loop again
                if (i % 2 == 1) {
                    continue;
                }

                System.out.println(i);

                if (i<=show) {
                    break;
                }
            }

        } else {
            System.out.println("Please Enter Two Number : Total and Show Number.");
        }
    }

}
