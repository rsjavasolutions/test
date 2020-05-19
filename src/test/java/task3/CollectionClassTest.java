package task3;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CollectionClassTest {

    private CollectionClass collectionClass = new CollectionClass();

    @Test
    void shouldGetAllUsers() {
        //when
        List<User> allUsers = collectionClass.getAllUsers();

        //then
        assertNotNull(allUsers);
        assertEquals(6, allUsers.size()); //ilu userów zawiera sie w liście

        //assertJ - bardziej naturalne i czytelniejsze
        assertThat(allUsers).
                isNotNull()
                .hasSize(6);
    }

    @Test
    void shouldGetAllActiveUsers() {
        //when
        List<User> activeUsers = collectionClass.getAllActiveUsers();

        //then
        //sprawdzam czy wszystkie pola "isActive" w liście mają wartości true
        assertThat(activeUsers).extracting("isActive").containsOnly(true);
    }

    @Test
    void shouldGetAllInactiveUsers(){
        //when
          List<User> allInactiveUsers = collectionClass.getAllInactiveUsers();
        //then
        assertThat(allInactiveUsers).extracting("isActive").containsOnly(false);
    }

    //sprawdzam czy w wyfiltorwanej liście aktywnych Userów znajdują się konkretne imiona
    @Test
    void shouldContainsSpecificUserInOrder(){
        //when
        List<User> allActiveUsers = collectionClass.getAllActiveUsers();

        //then
        assertThat(allActiveUsers).extracting("isActive").containsOnly(true);
        assertThat(allActiveUsers).extracting("name")
                .contains("Rambo", "Boris", "Budzian", "Bull");
    }
}