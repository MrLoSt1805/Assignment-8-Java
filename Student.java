public class Student {
    private String name;
    private String prn;
    private int age;

    public Student(String name, String prn, int age) {
        this.name = name;
        this.prn = prn;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getPrn() {
        return prn;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", PRN: " + prn + ", Age: " + age;
    }
}
