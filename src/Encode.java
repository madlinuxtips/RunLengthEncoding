
public class Encode {
  public static byte[] encode(byte[] readBytes) {
    byte[] writeBytes = new byte[readBytes.length];
    int count = 0;
    int writeCount=0;

    for (int i = 0; i < readBytes.length - 1; i++) {

      if (readBytes[i] == readBytes[i+1]) {

        count = 2;

        while (i < readBytes.length - 2) {

          i++;

          if (readBytes[i] == readBytes[i+1]) {
            count++;
          }
          else {
            break;
          }
        }
        writeBytes[writeCount]=(byte)count;
        writeCount++;
        writeBytes[writeCount]=readBytes[i];
        writeCount++;
      }
      else {
        writeBytes[writeCount]=readBytes[i];
        writeCount++;
      }
    }
    return writeBytes;
  }
}
