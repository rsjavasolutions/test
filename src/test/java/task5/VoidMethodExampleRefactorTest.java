package task5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class VoidMethodExampleRefactorTest {

    private VoidMethodExampleRefactor voidMethodExampleRefactor =
            new VoidMethodExampleRefactor();

    @Test
    void shouldDeleteExistingFile(@TempDir Path tempDir) throws IOException {
        //given
        Files.createFile(tempDir.resolve("testFile.txt"));

        //when
        boolean delete = voidMethodExampleRefactor.delete(tempDir, "testFile.txt");

        //then
        assertThat(delete).isTrue();
        Set
    }

    //testujemy jeżeli plik nie istnieje
    @Test
    void shouldDeleteNoneExistingFile(@TempDir Path tempDir) throws IOException {
        //when
        boolean delete = voidMethodExampleRefactor.delete(tempDir, "testFile.txt");

        //then
        assertThat(delete).isFalse();
    }

    //test służący pokryciu całej metody
    @Test
    void shouldDeleteNoneEmptyDir(@TempDir Path tempDir) throws IOException {
        //given
        Files.createFile(tempDir.resolve("testFile.txt"));

        //when
        boolean delete = voidMethodExampleRefactor.delete(tempDir, "");

        //then
        assertThat(delete).isFalse();
    }

}