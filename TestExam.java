import java.util.List;

public class TestExam {
    

    public static void main(String[] args) {
        final var javaVer = List.of(9,10,11);

        var exams = List.of("aa", "bb");

        V: for (var e1 : javaVer) {
            E: for (String e2 : exams) 
            System.out.println(e1 + "_" + e2);
            break;
        }

    }
}