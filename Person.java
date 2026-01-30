public class Person {
    private String name;
    private int age;

    public String getName() { 
        return name;
    }

    public void setName(String name) { 
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        
        p1.setName("Alice");
        p1.setAge(25);
        
        System.out.println("Name: " + p1.getName());
        System.out.println("Age: " + p1.getAge());
    }
}