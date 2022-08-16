package Com.Cydeo.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class UserTest {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Mike","Smith",35));
        users.add(new User("Tom","Evan",25));
        users.add(new User("Emma","Pollard",55));

        //print all elements in the list
        printname(users, user -> true);

        // print all people that last name starts with E

//        Consumer<ArrayList> printall = i -> System.out.println();
//        printall.accept(User<users>);
        //my attempt
        printname(users,user -> user.getLastname().startsWith("E"));



        //for name starts with E
    }
    private static void printname(List<User> users,Predicate<User> p){
        for (User user: users){
            if (p.test(user)){
                System.out.println(user.toString());
            }
        }
    }
}
