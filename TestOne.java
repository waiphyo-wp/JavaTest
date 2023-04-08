public class TestOne {
    
    String name;
    int count;

    public static void main(String[] args) {
        TestOne testOne = new TestOne("aung aung" , 3);
        TestOne testTwo = new TestOne("aung aung" , 3);
        
        // System.out.println(name + " : " + count);

        testOne.counter();
        testTwo.counter();
    }


    TestOne(String name ,int count) {
        this.name = name;
        this.count = count;
    }

    void counter() {
        int result = 0;
        for (int i = 0; i < count; i++) {
            result = --count;
            System.out.println("Count : " + count);
            System.out.println(result);
        }
        // return result;
    }

}
