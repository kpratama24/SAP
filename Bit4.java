/**
 * Kelas yang merepresentasikan 4 bit angka biner
 */
public class Bit4 extends Bit{
  
  /**
   * Constructor kelas Bit4
   * @param value string biner 4 bit
   */
  public Bit4(String value){
    super(value);
  }
  
  /**
   * Constructor kelas Bit4
   * @param value bilangan desimal sebagai data 4 bit
   */
  public Bit4(int value){
    super(value,4);
  }
}
