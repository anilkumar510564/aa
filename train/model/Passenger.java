package com.train.model;

public class Passenger {
    private String name;
    private  Integer age;
    private  String gender;
    private Train train;

    public Passenger() {
    }

    public Passenger(String name, Integer age, String gender, Train train) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.train = train;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", train=" + train +
                '}';
    }
}
