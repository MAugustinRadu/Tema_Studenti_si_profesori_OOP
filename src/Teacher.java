public class Teacher extends Person{


    public Teacher(String nume, long id) {
        super(nume, id);
    }


    @Override
    public String toString() {
        return " Name: " +
                getName() +
                " Id: " + getId() + '}';
    }
}
