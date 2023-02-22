package com.hspedu.homework;

import java.io.*;
import java.util.Properties;

/**
 * @Author Agony
 * @Create 2023/2/22 11:29
 * @Version 1.0
 */
public class Homework03 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Properties properties = new Properties();
        properties.load(new FileReader("src\\dog.properties"));
        properties.list(System.out);

        String name = properties.getProperty("name");
        int age = Integer.parseInt(properties.getProperty("age"));
        String color = properties.getProperty("color");


        // Dog dog = new Dog(name, age, color);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("D:\\Test\\dog.dat"));
        objectOutputStream.writeObject(new Dog(name, age, color));
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("D:\\Test\\dog.dat"));

        Object o = objectInputStream.readObject();
        System.out.println(o);

        objectInputStream.close();
    }
}

class Dog implements Serializable {
    private String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
