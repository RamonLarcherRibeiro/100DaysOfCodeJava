import Classes.PersonList;
import Classes.Person;

public class App{
    public static void main(String[] args) {
        //pessoas
        Person p1 = new Person("Alice",20);
        Person p2 = new Person("Maria", 25);
        Person p3 = new Person("Ana" , 22);

        PersonList personList1 = new PersonList(p1,p2,p3);
        personList1.sortPeople();
        personList1.printPeople();

    }
}

