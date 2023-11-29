
package Abstract;

public class Main {
     public static void main(String[]args){
        Pets myDog = new Dog("My Dog Bruno");
        Cat myCat = new Cat("My Cat Vale");
        
        
        
        System.out.println(myDog.name + " is " + myDog.Color());
        System.out.println(myCat.name + " is " + myCat.Color());
    }
    
}

    

