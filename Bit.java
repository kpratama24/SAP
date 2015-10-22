/**
 * Kelas yang merepresentasikan 1 bit angka biner
 */
public class Bit{
  
  /**
   * Nilai yang direpresentasikan dengan biner 1 bit
   */
  protected String value;
  
  public Bit(String value){
    this.value=value;
  }
  
  public String getValue(){
    return this.value;
  }
  
  public void setValue(String value){
    this.value=value;
  }
  
  public int toDecimal(){
    return String.valueOf(this.value);
  }
  
  public String toBinary(int val){
    return val+"";
  }
  
  @Override
  public String toString(){
    return this.getValue();
  }
}
