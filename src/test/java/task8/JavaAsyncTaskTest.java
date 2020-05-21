package task8;

import org.awaitility.Awaitility;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.awaitility.Awaitility.await;
import static org.junit.jupiter.api.Assertions.*;

class JavaAsyncTaskTest {

    private JavaAsyncTask javaAsyncTask = new JavaAsyncTask();

    @Test
    void shouldRunAsyncTask() {

        //given

        //when
        javaAsyncTask.runTask();

        //then
        await().until(() -> javaAsyncTask.getResult());

    }


}