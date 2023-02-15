public class Person {
    private String name;
public Person(String name){
    this.name = name;
}
    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;

    }

       public void sayHello(){
           System.out.println("Hello, my name is " + name);
        }



    public static void main(String[] args) {
        Person person = new Person("Nick");
        person.sayHello();


        person.setName("Jane");
        person.sayHello();

        String name = person.getName();
        System.out.println("The person's name is " + name);

    }
    }


