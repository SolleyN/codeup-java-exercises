

public class ArraysExercises {

    public static void main(String[] args) {
        // Create Array of 3 new people
        Person[] people = {new Person("Janice"), new Person("Nickolas"), new Person("Kaleb")};

        // Loop through Array of people
        for (Person person : people) {
            System.out.println(person.getName());
        }

        // Add a new person to the Array
        Person newPerson = new Person("Samuel");
        ArraysExercises ex = new ArraysExercises();
        people = ex.addPerson(people, newPerson);

        // Display array with new people
        for (Person person : people) {
            System.out.println(person.getName());
        }
    }

    public Person[] addPerson(Person[] people, Person newPerson) {
        Person[] newPeople = new Person[people.length + 1];
        System.arraycopy(people, 0, newPeople, 0, people.length);
        newPeople[people.length] = newPerson;
        return newPeople;
    }
}
