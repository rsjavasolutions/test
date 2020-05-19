package task5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.assertj.core.api.Assertions.assertThat;


class VoidMethodExampleTest {

    private VoidMethodExample voidMethodExample = new VoidMethodExample();


    @Test
    void shouldDeleteFileWithTempDir(@TempDir Path tempDir) throws IOException {
        //given - tworzymy plik
        System.out.println(tempDir);
        Files.createFile(tempDir.resolve("testFile.txt"));
        //when - usuwamy ten plik
        voidMethodExample.delete(tempDir,"testFile.txt");
        //then - sprawdzamy czy istnieje
        assertThat(Files.exists(tempDir.resolve("/testFile.txt"))).isFalse();
    }


}

