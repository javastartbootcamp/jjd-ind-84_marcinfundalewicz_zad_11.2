package pl.javastart.task;

public class Person {
    private String name;
    private String surname;
    private int age;
    private String pesel;

    public Person(String name, String surname, int age, String pesel) {
        try {
            checkPerson(name, surname);
            checkPersonAge(age);
        } catch (NameUndefinedException e) {
            System.out.println(e.getMessage());
        }
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.pesel = pesel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        try {
            checkNameSetter(name);
        } catch (NameUndefinedException e) {
            System.out.println(e.getMessage());
        }
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        try {
            checkSurnmeSetter(surname);
        } catch (NameUndefinedException e) {
            System.out.println(e.getMessage());
        }
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        try {
            checkAgeSetter(age);
        } catch (NameUndefinedException e) {
            System.out.println(e.getMessage());
        }
        this.age = age;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    void checkAgeSetter(int age) {
        if (age < 1) {
            throw new NameUndefinedException("Wiek nie moze byc mniejszy niz 1");
        }
    }

    void checkSurnmeSetter(String surname) {
        if (surname == null || surname.length() < 2) {
            throw new NameUndefinedException("Blad w nazwisku");
        }
    }

    void checkNameSetter(String name) {
        if (name == null || name.length() < 2) {
            throw new NameUndefinedException("Blad w imieniu");
        }
    }

    void checkPerson(String name, String surname) {
        if (name == null || surname == null || name.length() < 2 || surname.length() < 2) {
            throw new NameUndefinedException("Blad w imieniu lub nazwisku");
        }
    }

    void checkPersonAge(int age) {
        if (age < 1) {
            throw new NameUndefinedException("Wiek nie moze byc mniejszy niz 1");
        }
    }
}