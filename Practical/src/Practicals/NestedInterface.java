package Practicals;

interface Transport {
    void drive();

    interface Maintenance {
        void service();
    }
}

class Sedan implements Transport, Transport.Maintenance {
    public void drive() {
        System.out.println("Sedan is driving");
    }

    public void service() {
        System.out.println("Sedan is being serviced");
    }
}

public class NestedInterface {
    public static void main(String[] args) {
        Sedan mySedan = new Sedan();
        mySedan.drive();    
        mySedan.service();  
        }
}
