class FastDecode{
  public static byte[] Decode(byte[] readBytes){
    boolean countByte=true;
    int byteCount=0;
    for(int i=0; i<readBytes.length, i++){
      if(countByte){
        byteCount+=readBytes[i];
      }
      else{

      }
    }
    byte[] writeBytes = new byte[]
    for(int i=0; i<readBytes.length;i++){

      if(writeToggle){
        for(int j=0;j<runLength;j++){
          newBytes.add(readBytes[i]);
        }
        writeToggle=false;
      }

      else{
        runLength = (int)readBytes[i];
        writeToggle=true;
      }
    }
  }
}