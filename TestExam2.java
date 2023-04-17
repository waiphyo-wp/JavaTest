public class TestExam2 {
    public static void main(String[] args) {
        // B b= new B();
        // A a = b;

        // System.out.println(a.x +"," + a.y + " ,"+ b.x +" ," + b.y);
    }
}

class A {
    int i;
    public A(int x) {
        this.i = x;
    }
}

class B extends A {
    int j;
    public B(int x , int y) {
        super(x);
        this.j = y;
    }

    B(int z) {
        this(z, z);
    }
}




