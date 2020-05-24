package task10;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import task10.model.Statistic;
import task10.model.User;
import task10.service.MessageService;
import task10.service.UserService;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashMap;
import java.util.Map;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class SendMessageExtendedTest {

    @Mock
    private UserService userService;

    @Mock
    private MessageService messageService;

    @InjectMocks
    private SendMessageExtended sendMessageExtended;

    private Map<String, String> toSend = new HashMap<>();

    @BeforeEach
    void setUp() {
        toSend.put("jkowalski", "Hello jkowalski");
        toSend.put("anowak", "Hello anowak");
        toSend.put("mdabrowski", "Hello mdabrowski");
    }

    @Test
    void shouldSendMessagesToAllUsers(){
        //given


        when(userService.existByUsername(anyString())).thenReturn(true);
        when(userService.getUserByName("jkowalski"))
                .thenReturn(new User("jkowalski", "jkowalski@test.pl"));
        when(userService.getUserByName("anowak"))
                .thenReturn(new User("anowak", "anowak@test.pl"));
        when(userService.getUserByName("mdabrowski"))
                .thenReturn(new User("mdabrowski", "mdabrowski@test.pl"));

        when(messageService.sendMessage(anyString(), anyString())).thenReturn(true);

        //when
        Statistic statistic = sendMessageExtended.send(toSend);

        //then
        assertThat(statistic.getSuccess()).isEqualTo(3);
        assertThat(statistic.getFailure()).isEqualTo(0);

    }

}