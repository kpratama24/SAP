/**
 * Kelas yang merepresentasikan 8 bit angka biner
 */
public class Bit8{
  
  /**
   * array angka biner 4 bit berukuran 2
   */
  private Bit4[] value;
  
  public Bit8(Bit4[] value){
    this.value=value;
  }
  
  public Bit4[] getValue(){
    return this.value;
  }
  
  public void setValue(Bit4[] value){
    this.value=value;
  }
}
