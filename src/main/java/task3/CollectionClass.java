package task3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionClass {

    private List<User> userList = new ArrayList<>();
    static final boolean ACTIVE = true;
    static final boolean INACTIVE = false;

    public CollectionClass() {
        userList.add(new User("Rambo", ACTIVE));
        userList.add(new User("John", INACTIVE));
        userList.add(new User("Boris", ACTIVE));
        userList.add(new User("Jack", INACTIVE));
        userList.add(new User("Budzian", ACTIVE));
        userList.add(new User("Bull", ACTIVE));
    }

    public List<User> getAllUsers(){
        return userList;
    }

    public List<User> getAllActiveUsers(){
        return userList.stream()
                .filter(user -> user.isActive())
                .collect(Collectors.toList());
    }

    public List<User> getAllInactiveUsers(){
        return userList.stream()
                .filter(user -> !user.isActive())
                .collect(Collectors.toList());
    }
}
