/**
 * class thart represent 1 bit of number
 */
public class Bit{
  
  /**
   * Value tha represented by a 1bit String
   */
  protected String value;
  
  /**
   * Class constructor
   * @param bilangan biner sebagai data
   */
  public Bit(String value){
    this.value=value;
  }
  
  /**
   * Class constructor
   * @param value decimal value as the data
   * @param bitLength the length of the bit
   */
  public Bit(int value,int bitLength){
    this.value=this.toBinary(value,bitLength);
  }
  
  /**
   * Getter for the value
   * @return string berupa bilangan biner
   */
  public String getValue(){
    return this.value;
  }
  
  /**
   * Setter for the value attributes
   * @param value bilangan biner baru
   */
  public void setValue(String value){
    this.value=value;
  }
  
  /**
   * Method to change the decimal number to binary number
   * @return the decimal number of the given binary number
   */
  public int toDecimal(){
    int res=0;
    for(int i=this.value.length()-1;i>=0;i--){
      if(this.value.charAt(i)=='1'){
        res+=Math.pow(2,this.value.length()-1-i);
      }
    }
    return res;
  }
  
  /**
   * Method to change the decimal number to binary number
   * @param val decimal number that will be changed top binary number
   * @param bitLength the length of binary number
   * @return String value that represent the binary number of the decimal that has been provided by the user
   */
  public String toBinary(int val,int bitLength){
    String str="";
    while(val>0&&str.length()<bitLength){
      str=(val%2)+str;
      val/=2;
    }        
    while(str.length()<bitLength){
      str='0'+str;
    }
    return str;
  }
}
