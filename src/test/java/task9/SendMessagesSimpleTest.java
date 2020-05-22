package task9;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


class SendMessagesSimpleTest {

    private SendMessagesSimple sendMessagesSimple = new SendMessagesSimple();

    @Test
    void shouldSendMessageToUser() {
        //given
        sendMessagesSimple.addMessage("jkowalski", "Hello jkowalski");
        sendMessagesSimple.addMessage("anowak", "Hello anowak");
        sendMessagesSimple.addMessage("mdabrowski", "Hello mdabrowski");

        //when
        Statistic statistic = sendMessagesSimple.send();

        //then
        assertThat(statistic.getSuccess()).isEqualTo(3);
        assertThat(statistic.getFailure()).isEqualTo(0);
    }

    @Test
    void shouldSNotSendMessageToNonExistingUser() {
        //given
        sendMessagesSimple.addMessage("jdoe", "Hello jdoe");
        sendMessagesSimple.addMessage("xdoe", "Hello xdoe");
        sendMessagesSimple.addMessage("xyzdoe", "Hello xyzdoe");

        //when
        Statistic statistic = sendMessagesSimple.send();

        //then
        assertThat(statistic.getFailure()).isEqualTo(3);
        assertThat(statistic.getSuccess()).isEqualTo(0);
    }

    @Test
    void shouldNotSendMessageToAnyUser() {
        //when
        Statistic statistic = sendMessagesSimple.send();

        //then
        assertThat(statistic.getFailure()).isEqualTo(0);
        assertThat(statistic.getSuccess()).isEqualTo(0);
    }
}