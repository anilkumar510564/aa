//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package project.model;

class Passenger implements Comparable<Passenger> {
    private String name;
    private int age;
    private char gender;

    public Passenger(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return this.gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String toString() {
        return "Passenger{name='" + this.name + '\'' + ", age=" + this.age + ", gender=" + this.gender + '}';
    }

    public int compareTo(Passenger o) {
        if (o.getName().compareTo(this.name) > 0) {
            return -1;
        } else {
            return o.getName().equals(this.name) ? 0 : 1;
        }
    }
}
