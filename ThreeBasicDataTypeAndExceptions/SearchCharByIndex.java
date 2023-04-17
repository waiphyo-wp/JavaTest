// package ThreeBasicDataTypeAndExceptions;

import java.util.Arrays;

public class SearchCharByIndex {
    

    String str = """
        Google Translate is a multilingual neural machine 
        translation service developed by Google to translate text, 
        documents and websites from one language into another. 
        It offers a website interface, a mobile app for Android and iOS, 
        and an API that helps developers 
        build browser extensions and software applications.""";

    public int[] searchChar(String str, char c) {
        int [] array = {};

        int index = -1;

        while ((index = str.indexOf(c, index + 1)) >= 0) {
            array = Arrays.copyOf(array, array.length + 1);
            array[array.length-1] = index;
        }
        return array;
    }

}
