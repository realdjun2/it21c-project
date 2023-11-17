package Student;

public class Student {
  private String name,address,age;
   
    Student(String name,String address,String age){
       
        this.name = name;
        this.address = address;
        this.age = age;
      
    }
             
       public String getName(){
             return name;
        } 
        public String getAddress(){
              return address;
         } 
        public String getAge(){
              return age;
        } 
}

