public class Encode {
  public static byte[] encode(byte[] readBytes) {

    byte[] writeBytes = new byte[readBytes.length];

    //Repition count of current byte
    int count = 0;

    //Keep track of smaller index
    int writeCount=0;

    for (int i = 0; i < readBytes.length - 1; i++) {
      //Exit the program if the file is going to be larger than the original
      if(writeCount > readBytes.length - 3){
        System.out.println("File cannot be compressed with this algorithm");
        System.exit(1);
      }
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
        writeBytes[writeCount]=(byte)1;
        writeCount++;
        writeBytes[writeCount]=readBytes[i];
        writeCount++;
      }
    }
    //Remove null values at end of byte array
    byte[] cleanBytes = new byte[writeCount];
    for(int i=0;i<writeCount;i++){
      cleanBytes[i] = writeBytes[i];
    }

    return cleanBytes;
  }
}
