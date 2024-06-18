package Classes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonList {

    private List<Person> people;

    public PersonList(Person ...persons){
        people = new ArrayList<>();

        for(Person person : persons){
            people.add(person);
        }
    }

    //Classe interna estatica para comparar pessoas por idade
    static class IdadeComparador implements Comparator<Person>{
        @Override
        public int compare(Person p1, Person p2) {
            return Integer.compare(p1.idade, p2.idade);
        }
    }

    public void sortPeople(){
        Collections.sort(people, new IdadeComparador());
    }

    public void printPeople(){
        for (Person person :people){
            System.out.println(person.nome+" : "+person.idade);
        }
    }
}