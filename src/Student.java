public class Student extends Person{
    private boolean paidScholarship =false;
    public Student(String nume, long id) {
        super(nume, id);
    }

    public boolean isPaidScholarship() {
        return paidScholarship;
    }

    public void setPaidScholarship(boolean paidScholarship) {
        this.paidScholarship = paidScholarship;
    }

    @Override
    public String toString() {
        return " Name: "  +
                getName() +
                " Id: " + getId() +
                " paidScholarship= " + paidScholarship +
                '}';
    }
}
