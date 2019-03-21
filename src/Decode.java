import java.util.ArrayList;

public class Decode {
  public static byte[] decode(byte[] readBytes){
    ArrayList<Byte> newBytes = new ArrayList<>();
    boolean writeToggle=false;
    int runlength=0;

    for(int i=0; i<readBytes.length;i++){
      if(writeToggle){
        for(int j=0;j<runlength;j++){
          newBytes.add(readBytes[i]);
        }
        writeToggle=false;
      }
      else{
        runlength = (int)readBytes[i];
        writeToggle=true;
      }

    }
    byte [] writeBytes = new byte[newBytes.size()];
    for(int i=0; i<newBytes.size();i++){
      writeBytes[i] =newBytes.get(i);
    }
    return writeBytes;
  }
}
