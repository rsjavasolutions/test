package task5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class VoidMethodExample {

    //metoda void usuwająca jakis plik z systemu
    public void delete(Path path, String fileName) throws IOException {
        Files.delete(path.resolve(fileName));
    }
}
