/**
 * Kelas yang merepresentasikan 1 bit angka biner
 */
public class Bit1{
  
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
}
