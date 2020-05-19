package task4;

import java.util.List;
import java.util.stream.Collectors;

public class CollectionClassExtended {

    private List<User> userList;

    public CollectionClassExtended(List<User> userList) {
        this.userList = userList;
    }

    public List<User> getAllUsers() {
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
