package Com.Cydeo.Feature;

import java.util.ArrayList;
import java.util.List;

public class MemberTest {
    public static void main(String[] args) {
        Person p1 = new Person("Kramer",25,Gender.MALE);
        Person p11 = new Person("Ozzy",25,Gender.MALE);
        Person p12 = new Person("Anita",29,Gender.FEMALE);

        List<Person> contactlist = new ArrayList<>();

        contactlist.add(p1);
        contactlist.add(p11);
        contactlist.add(p12);

        CheckMemeber checklambda= Person -> Person.getGender()==Gender.MALE && Person.getAge()>=18 && Person.getAge()<=25;

    print(contactlist,checklambda);

    }



    private static void print (List<Person> personList, CheckMemeber checkMemeber ){

        List<Person> result = new ArrayList<>();
        for (Person person: personList
             ) {
            if (checkMemeber.checkperson(person)){
                result.add(person);
            }
        }
        System.out.println(result);
    }
}
