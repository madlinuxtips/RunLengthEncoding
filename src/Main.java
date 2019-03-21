import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;

public class Main {

  public static byte[] readFile(String filename) throws IOException {
    byte[] array={};
    array = Files.readAllBytes(new File("repeats.txt").toPath());
    return array;
  }

  public static void main(String[] args) {
    byte array[] = {};
    try{
      array = readFile("repeats.txt");
    }
    catch(IOException e){
      System.out.println("The File cannot be opened");
    }
    ArrayList<Byte> bytes = Encode.encode(array);
    System.out.println(bytes);
  }
}
