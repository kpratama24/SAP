/**
 * Class that represent 4 bit of binary number
 */
public class Bit4 extends Bit{
  
  /**
   * Bit4 Class Constructor
   * this Constructor will override the value of "value" at the bit class
   * @param value 4Bit binary in the form of String data type
   */
  public Bit4(String value){
    super(value);
  }
  
  /**
   * Constructor kelas Bit4
   * @param value the decimal number as the Bit4 data type
   */
  public Bit4(int value){
    super(value,4);
  }
}
