package sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SwimData implements Cloneable {
    Swimmer sw;
    ArrayList<Swimmer> swimmers = new ArrayList<>();

    public SwimData(String filename){
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(filename));
            while( scanner.hasNext()) {
                String name = scanner.next();
                String sex = scanner.next();
                int age = scanner.nextInt();
                float time = Float.parseFloat((scanner.next()));

                sw = new Swimmer(name, sex, age, time);
                swimmers.add(sw);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Swimmer getSwimmer(int index){
        return swimmers.get(index);
    }

    public int getTotalSwimmers(){
        return this.swimmers.size();
    }

    public SwimData makeClone() throws CloneNotSupportedException {
        return (SwimData) super.clone();
    }

    public void sortByTime(){
        int currentElementIndex, previousElementIndex;
        Swimmer key;

        for(currentElementIndex = 1; currentElementIndex < swimmers.size(); currentElementIndex++){
            key = swimmers.get(currentElementIndex);
            previousElementIndex = currentElementIndex - 1;

            while (previousElementIndex >= 0 && swimmers.get(previousElementIndex).getTime() > key.getTime()){
                swimmers.set(previousElementIndex+1, swimmers.get(previousElementIndex));
                previousElementIndex = previousElementIndex - 1;
            }

            swimmers.set((previousElementIndex + 1), key);
        }
    }

    public void sortByAge(){
        int currentElementIndex, previousElementIndex;
        Swimmer key;

        for(currentElementIndex = 1; currentElementIndex < swimmers.size(); currentElementIndex++){
            key = swimmers.get(currentElementIndex);
            previousElementIndex = currentElementIndex - 1;

            while (previousElementIndex >= 0 && swimmers.get(previousElementIndex).getAge() > key.getAge()){
                swimmers.set(previousElementIndex+1, swimmers.get(previousElementIndex));
                previousElementIndex = previousElementIndex - 1;
            }

            swimmers.set((previousElementIndex + 1), key);
        }
    }

    public void sortBySex(){
        int currentElementIndex, previousElementIndex;
        Swimmer key;

        for(currentElementIndex = 1; currentElementIndex < swimmers.size(); currentElementIndex++){
            key = swimmers.get(currentElementIndex);
            previousElementIndex = currentElementIndex - 1;

            while (previousElementIndex >= 0 && swimmers.get(previousElementIndex).getSex().compareTo(key.getSex()) > 0){
                swimmers.set(previousElementIndex+1, swimmers.get(previousElementIndex));
                previousElementIndex = previousElementIndex - 1;
            }

            swimmers.set((previousElementIndex + 1), key);
        }
    }
}
