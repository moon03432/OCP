package Streams.Classes.Serialization;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by moon on 24/12/2016.
 *
 * Java use ObjectInputStream for deserialization, ObjectOutputStream for serialization
 *
 * ObjectInputStream.readObject() -> Object
 * ObjectOutputStream.writeObject(Object)
 *
 * Note: ObjectInputStream and ObjectOutputStream could read/write null object. Need to check its nullability.
 */
public class ObjectInputOutputStreams {

    private static List<Animal> readAnimals(File dataFile) throws IOException, ClassNotFoundException {
        List<Animal> animals = new ArrayList<>();

        try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(dataFile)))) {
            while (true) {
                Object object = in.readObject();
                if (object instanceof Animal) {
                    animals.add((Animal) object);
                }
            }
        } catch (EOFException e) {
            // EOF
        }

        return animals;
    }

    private static void writeAnimals(List<Animal> animals, File dataFile) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(dataFile)))) {
            for (Animal animal: animals) {
                out.writeObject(animal);
            }
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Tommy",5,'T'));
        animals.add(new Animal("Peter",8,'P'));

        File dataFile = new File("/Users/moon/Workspace/Java/OCP/IO/data/animals.txt");
        writeAnimals(animals, dataFile);
        System.out.println(readAnimals(dataFile));
    }
}
