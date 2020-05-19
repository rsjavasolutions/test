package task5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class VoidMethodExampleRefactor {

    public boolean delete(Path path, String fileName) {
      try{
          return Files.deleteIfExists(path.resolve(fileName));
      }catch (IOException e){
          return false;
      }
    }

}
