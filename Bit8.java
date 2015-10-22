/**
 * Kelas yang merepresentasikan 8 bit angka biner
 */
public class Bit8 extends Bit{
  
  /**
   * Constructor kelas Bit8
   * @param value string biner 8 bit
   */
  public Bit8(String value){
    super(value);
  }
  
  /**
   * Constructor kelas Bit8
   * @param value bilangan desimal sebagai data 8 bit
   */
  public Bit8(int value){
    super(value,8);
  }
}
