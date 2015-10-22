/**
 * Kelas yang merepresentasikan 1 bit angka biner
 */
public class Bit1 implements Converter{
  
  /**
   * Nilai yang direpresentasikan dengan biner 1 bit
   */
  private int value;
  
  public Bit1(int value){
    this.value=value;
  }
  
  public int getValue(){
    return this.value;
  }
  
  public void setValue(int value){
    this.value=value;
  }
  
  @Override
  public int binaryToDecimal(String b){
    return String.valueOf(b);
  }
  
  @Override
  public String decimalToBinary(int val){
    return val+"";
  }
  
  @Override
  public String toString(){
    return val+"";
  }
}
