package Streams.Classes.Serialization;

import java.io.Serializable;

/**
 * Created by moon on 24/12/2016.
 *
 * Serialization: objects in memory -> disk
 * Deserializarion: written object files -> memory
 *
 * Serializable: enable an object to be serialized
 *
 * If an object is serializable, it's attribute must be serializable.
 * Use transient keyword to skip serialization but its data might be lost
 * static classes will be ignored during serialization
 *
 * Thread/Stream classes are difficult to be serialized to persistent storage.
 */
public class Animal implements Serializable {

    // This is optionally given to track the version of the object
    private static final long serialVersionUID = 1L;

    private String name;
    private int age;
    private char type;

    public Animal(String name, int age, char type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public char getType() { return type; }

    public String toString() {
        return "Animal [name=" + name + ", age=" + age + ", type=" + type + "]";
    }
}
