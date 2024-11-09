package Practicals;
class PP {
    String name;
    int age;

  
    PP() {
        this("Unknown", 0); 
    }

   
    PP(String name) {
        this(name, 0); 
    }

    // Constructor 3
    PP(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
    	PP p1 = new PP();          
    	PP p2 = new PP("A");   
        PP p3 = new PP("B", 25); 

        p1.display(); 
        p2.display(); 
        p3.display();
    }
}
