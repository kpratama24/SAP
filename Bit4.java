/**
 * Kelas yang merepresentasikan 4 bit angka biner
 */
public class Bit4{
  
  /**
   * array angka biner 1 bit berukuran 4
   */
  private Bit1[] value;
  
  public Bit4(Bit1[] value){
    this.value=value;
  }
  
  public Bit1[] getValue(){
    return this.value;
  }
  
  public void setValue(Bit1[] value){
    this.value=value;
  }
}
