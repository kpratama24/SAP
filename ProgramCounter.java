/**
 * Kelas yang merepresentasikan program counter
 */
public class ProgramCounter{
  
  /**
   * Nilai counter saat ini
   */
  private int count;
  
  /**
   * Constructor kelas ProgramCounter
   */
  public ProgramCounter(){
    this.count=0;
  }
  
  /**
   * Method untuk menambah nilai counter saat ini
   */
  public void countUp(){
    this.count++;
  }
  
  /**
   * Method untuk mengatur counter saat ini
   * @param nilai counter yang baru
   */
  public void setCount(int count){
    this.count=count;
  }
  
  /**
   * Method untuk melihat nilai counter saat ini
   * @return nilai counter saat ini dalam bilangan biner 4 bit
   */
  public String getCount(){
    return (new Bit4(this.count)).getValue();
  }
}
