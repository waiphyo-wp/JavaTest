import java.util.Arrays;
import java.util.Scanner;

public class LF_10_SearchWord_BranchingLabel {
    public static void main(String[] args) {
        
        callSearchWord();
    }

    static void callSearchWord() {
        String paragraph = """
            Examples of annoying habits people have on the Skytrain.
            Positive habits that you admire in other people
            Endangered animals in Asia,
            Ways in which technology has strengthened/weakened family life
            Ways in which you succeeded through your most challenging high school course
            Suggestions for getting a good grade in English I
            Worthwhile freshman activities at Chula,
            Best places to shop for x
            Favorite Ways childhood toys.
            """;


        Scanner sc = new Scanner(System.in);
        
        String status = null;
        do {
            System.out.print("Plz Type Search Key : ");
            String searchKey = sc.nextLine();
            
            String[] result = searchWord(paragraph, searchKey);
            
            for (String string : result) {
                System.out.println(string);
            }

            System.out.print("Want to exit : enter 'Y' ");
            status = sc.nextLine(); // over status value

        }while(!"Y".equalsIgnoreCase(status));

    }

    // word search method
    static String[] searchWord(String paragraph, String keword) {

        // get lines array by split method
        String [] lines = paragraph.split("\n");

        String[] result = {};

        // loop of lines from a paragraph
        outer:for (int i = 0; i < lines.length; i++) {
            // System.out.println(lines[i]);
            // System.out.println(i);
            String [] words = lines[i].split(" ");

            // loop of word from a line
            for (int j = 0; j < words.length; j++) {
                // System.out.println(words[j]);

                String escapseWord = words[j].replaceAll("\\.", "").replaceAll(",", "");

                //check found keyword
                if (escapseWord.equals(keword)) {
                    result = Arrays.copyOf(result, result.length + 1);
                    result[result.length -1] = "Found At line " + (i+1) + ", word " + (j+1) + " Search word : " + escapseWord;
                    continue outer;
                }
            }
        }

        return result;
    }
}