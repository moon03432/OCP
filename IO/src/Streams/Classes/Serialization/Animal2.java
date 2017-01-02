package Streams.Classes.Serialization;

import java.io.Serializable;

/**
 * Created by moon on 24/12/2016.
 *
 * transient: not written during serialization
 * static: also not written during serialization, but data is kept in memory
 */
public class Animal2 implements Serializable {

    // This is optionally given to track the version of the object
    private static final long serialVersionUID = 2L;

    private transient String name;
    private transient int age = 10;
    private static char type = 'C';

    {
        this.age = 14;
    }

    public Animal2() {
        this.name = "Unknown";
        this.age = 12;
        this.type = 'Q';
    }

    public Animal2(String name, int age, char type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getType() {
        return type;
    }

    public String toString() {
        return "Animal [name=" + name + ", age=" + age + ", type=" + type + "]";
    }
}
