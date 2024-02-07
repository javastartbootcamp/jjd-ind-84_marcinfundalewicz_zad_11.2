package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        try {
            Person person = new Person("Jan", "Kowalski", 2, "313123131231");
            person.setName("J");
            person.setSurname(null);
            person.setAge(0);
        } catch (NameUndefinedException e) {
            System.out.println(e.getMessage());
        }
    }
}

