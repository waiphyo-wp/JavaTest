package LambdaExpression;

public class MethodReference {
    public static void main(String[] args) {
        // we can use lambda expression by overwriting abstract method, instance method, static method, constructor method
        // simple lambda expression
        Hello hello = (name) -> System.out.println(name);
        hello.sayHello("mgmg"); // mgmg

        // abstract mehtod referece => OwnerObjOrClass :: methodName
        Hello hello2 = System.out::println;
        hello2.sayHello("kyaw kyaw"); // kyaw kyaw
        System.out.println(hello2); // LambdaExpression.MethodReference$$Lambda$2/0x0000000800c01800@8bcc55f

        // instance method reference
        InstanceMethod instanceMethod = new InstanceMethod();
        Hello instanceHello = instanceMethod :: instanceDemo;
        instanceHello.sayHello("mgmg"); // Instance Demo : mgmg
        System.out.println(instanceHello); // LambdaExpression.MethodReference$$Lambda$3/0x0000000800c01c38@18b4aac2

        // static method reference
        Hello staticHello = StaticMethod::staticDemo;
        staticHello.sayHello("static say hello"); // Static Demo : static say hello
        System.out.println(staticHello); // LambdaExpression.MethodReference$$Lambda$4/0x0000000800c02208@659e0bfd
        
        // constructor method reference
        DataProducer dataProducer = ConstructorData::new; // create obeject
        dataProducer.produce("hello"); // hello
        System.out.println(dataProducer); // LambdaExpression.MethodReference$$Lambda$5/0x0000000800c02838@7852e922
    }
}

interface Hello {
    public void sayHello(String name);
}

class InstanceMethod {
    public void instanceDemo(String name) {
        System.out.println("Instance Demo : " + name );
    }
}

class StaticMethod {
    public static void staticDemo(String name) {
        System.out.println("Static Demo : " + name );
    }
}

class ConstructorData {
    String name;
    public ConstructorData(String name) {
        this.name = name;
        System.out.println(this.name);
    }
}

interface DataProducer {
    ConstructorData produce(String name);
}