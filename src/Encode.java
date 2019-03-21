import java.util.ArrayList;

public class Encode {
  public static ArrayList<Byte> encode(byte[] array) {
    ArrayList<Byte> bytes = new ArrayList<>();
    int count = 0;

    for (int i = 0; i < array.length - 1; i++) {

      if (array[i] == array[i+1]) {

        count = 2;

        while (i < array.length - 2) {

          i++;

          if (array[i] == array[i+1]) {
            count++;
          }
          else {
            break;
          }
        }
        bytes.add((byte) count);
        bytes.add(array[i]);
      }
      else {
        bytes.add(array[i]);
      }
    }
    return bytes;
  }
}
