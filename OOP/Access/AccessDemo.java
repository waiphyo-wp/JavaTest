// package OOP.Access;

import Rooms.JavaBasicRoom;
import Rooms.SimpleRoom;

public class AccessDemo extends JavaBasicRoom {
    public static void main(String[] args) {

        JavaBasicRoom jbr = new JavaBasicRoom("hellojavabasicroom");

        SimpleRoom sr = new SimpleRoom();
        sr.showName(jbr);
        AccessDemo acd = new AccessDemo();
        System.out.println(acd.name);
    }
}
