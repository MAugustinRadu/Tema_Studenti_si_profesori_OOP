abstract public class Person {
    private long id = 00000000;
    private String name = "Lorem Ipsum";

    public Person(String nume,long id) {
        this.name = nume;
        this.id = id;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nume=" + name +
                ", id='" + id + '\'' +
                '}';
    }


}
