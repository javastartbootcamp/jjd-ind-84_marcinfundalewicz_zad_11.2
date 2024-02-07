package pl.javastart.task;

public class Person {
    private String name;
    private String surname;
    private int age;
    private String pesel;

    public Person(String name, String surname, int age, String pesel) {
        setName(name);
        setSurname(surname);
        setAge(age);
        setPesel(pesel);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.length() < 2) {
            throw new NameUndefinedException("Blad w imieniu");
        }
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname == null || surname.length() < 2) {
            throw new NameUndefinedException("Blad w nazwisku");
        }
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 1) {
            throw new NameUndefinedException("Wiek nie moze byc mniejszy niz 1");
        }
        this.age = age;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }
}