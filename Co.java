class Student {
    int id;
    int age;

    Student(int i, int a) {
        id = i;
        age = a;
    }

    void display() {
        System.out.println("ID: " + id + " Age: " + age);
    }
}

public class Co {
    public static void main(String[] args) {
        Student s1 = new Student(1, 20);
        Student s2 = new Student(2, 30);

        s1.display();
        s2.display();
    }
}