/**
 * Kelas yang merepresentasikan 1 bit angka biner
 */
public class Bit{
  
  /**
   * Nilai yang direpresentasikan dengan biner 1 bit
   */
  protected String value;
  
  /**
   * Constructor kelas Bit
   */
  public Bit(String value){
    this.value=value;
  }
  
  /**
   * Method getter atribut value
   * @return string berupa bilangan biner
   */
  public String getValue(){
    return this.value;
  }
  
  /**
   * Method setter untuk atribut value
   * @param value bilangan biner baru
   */
  public void setValue(String value){
    this.value=value;
  }
  
  /**
   * Method untuk mengubah bilangan biner ke bilangan desimal
   * @return nilai desimal dari bilangan biner yang ada
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
   * Method untuk mengubah bilangan desimal ke bilangan biner
   * @param val bilangan desimal yang akan diubah ke biner
   * @param bitLength panjang bilangan biner
   * @return string berupa bilangan biner dari bilangan desimal yang diberikan oleh user
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
