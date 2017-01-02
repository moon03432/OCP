package Streams.Classes.Serialization;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by moon on 24/12/2016.
 *
 * During deserialization, none of defined constructors are called
 */
public class Deserialization {

    private static List<Animal2> readAnimals(File dataFile) throws IOException, ClassNotFoundException {
        List<Animal2> animals = new ArrayList<>();

        try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(dataFile)))) {
            while (true) {
                Object object = in.readObject();
                if (object instanceof Animal2) {
                    animals.add((Animal2) object);
                }
            }
        } catch (EOFException e) {
            // EOF
        }

        return animals;
    }

    private static void writeAnimals(List<Animal2> animals, File dataFile) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(dataFile)))) {
            for (Animal2 animal: animals) {
                out.writeObject(animal);
            }
        }
    }


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Animal2> animals = new ArrayList<>();
        animals.add(new Animal2("Tommy",5,'T'));
        animals.add(new Animal2("Peter",8,'P'));

        File dataFile = new File("/Users/moon/Workspace/Java/OCP/IO/data/animals_2.txt");
        writeAnimals(animals, dataFile);
        System.out.println(readAnimals(dataFile));
        // [Animal [name=null, age=0, type=P], Animal [name=null, age=0, type=P]]
        // type = P because last static type was 'P'
    }
}
