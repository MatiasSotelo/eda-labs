package lab1;
import java.util.List;
//import java.util.Arrays;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



public class ReadCSV{
    final static String COMMA_DELIMITER = ",";
    public static void main(String[] args) throws FileNotFoundException, IOException{
        String file = "addresses.csv";
        BufferedReader br = new BufferedReader(new FileReader(file));  
        List<Person> personList = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            String[] personCSV = line.split(COMMA_DELIMITER);
            
            Person person = new Person();
            person.name = personCSV[0];
            person.lastname = personCSV[1];
            personList.add(person);
        } 
        System.out.println(personList.get(0).name);
        System.out.println(personList.get(0).lastname);
        br.close();
    }
}

class Person {
    public String name;
    public String lastname;
    public Person() {
        name = "";
        lastname = "";
    }
}