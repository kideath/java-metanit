/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ierarhy;

public class Program{
      
    public static void main(String[] args) {
             
//        Person tom = new Person("Tom");
//        tom.display();
//        Person sam = new Employee("Sam", "Oracle");
//        sam.display();
//        Person bob = new Client("Bob", "DeutscheBank", 3000);
//        bob.display();

            Object tom = new Person("Tom");
            Object sam = new Employee("Sam", "Oracle");
            Object kate = new Client("Kate", "DeutscheBank", 2000);
            Person bob = new Client("Bob", "DeutscheBank", 3000);
            Person alice = new Employee("Alice", "Google");

            bob.display();
            

            // Object sam = new Employee("Sam", "Oracle");

            // нисходящее преобразование от Object к типу Employee
            Employee emp = (Employee)sam;
            emp.display();
            System.out.println(emp.getCompany());     
            
            
            // Object kate = new Client("Kate", "DeutscheBank", 2000);
            //Employee emp2 = (Employee) kate;  // ERROR
            //emp2.display();

            // или так
            //((Employee)kate).display();            // ERROR
            
            // Object kate = new Client("Kate", "DeutscheBank", 2000);
            if(kate instanceof Employee){

                Employee employeeKate = (Employee) kate;
                employeeKate.display();
            }
            else if(kate instanceof Object){

                Person pKate = (Person) kate;
                pKate.display();
            }
            else{

                System.out.println("Conversion is invalid");
            }      
            
            
        // Следует отметить, что начиная с версии Java 16 мы можем упростить преобразование типов следующим образом:
        //Object kate = new Client("Kate", "DeutscheBank", 2000);
//        if(kate instanceof Client clientKate){
//            System.out.println("Here!");
//            clientKate.display();
//        }
//        else{
//
//            System.out.println("Conversion is invalid");
//        }            
    }
}
// класс человека
class Person {
     
    private String name;
     
    public String getName() { return name; }
    
    public Person(String name){
     
        this.name=name;
    }
  
    public void display(){
         
        System.out.printf("Person %s \n", name);
    }
}
// служащий некоторой компании 
class Employee extends Person{
 
    private String company;
     
    public Employee(String name, String company) {
     
        super(name);
        this.company = company;
    }
    public String getCompany(){ return company; }
     
    public void display(){
         
        System.out.printf("Employee %s works in %s \n", super.getName(), company);
    }
}
// класс клиента банка
class Client extends Person{
       
    private int sum; // Переменная для хранения суммы на счете
    private String bank;
       
    public Client(String name, String bank, int sum) {
       
        super(name);
        this.bank=bank;
        this.sum=sum;
    }
       
    public void display(){
           
        System.out.printf("Client %s has account in %s \n", super.getName(), bank);
    }
       
    public String getBank(){ return bank; }
    public int getSum(){ return sum; }
}