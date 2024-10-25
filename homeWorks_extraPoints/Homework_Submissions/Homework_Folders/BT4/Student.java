package Bai_2_2;

public class Student {
    public String id;
    public String name;
    public int age;

    public Student() {
        this.id = "";
        this.name = "";
        this.age = 0;
    }

    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

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

    public String getInfo() {
        return String.format("Student [id=%s, name=%s, age=%d]", getId(), getName(), getAge());
    }
}
