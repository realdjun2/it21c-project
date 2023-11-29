
package Abstract;

public class Cat extends Pets {
  
  
       public Cat(String name){
           super(name);
           this.name = name;
       }
       public String Color(){
           return "white";
       }
}