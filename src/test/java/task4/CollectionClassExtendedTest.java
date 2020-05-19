package task4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CollectionClassExtendedTest {

    private static final boolean ACTIVE = true;
    private static final boolean INACTIVE = false;
    private CollectionClassExtended collectionClassExtended;

    @BeforeEach
    void setUp() {
        List<User> users = new ArrayList<>();
        users.add(new User("Rambo", ACTIVE));
        users.add(new User("John", INACTIVE));
        users.add(new User("Boris", ACTIVE));
        users.add(new User("Jack", INACTIVE));
        users.add(new User("Budzian", ACTIVE));
        users.add(new User("Bull", ACTIVE));
        collectionClassExtended = new CollectionClassExtended(users);
    }

    @Test
    void shouldGetAllUsers() {
        //given

        //when
        List<User> allUsers = collectionClassExtended.getAllUsers();
        //then
        assertThat(allUsers).hasSize(6);
    }

}