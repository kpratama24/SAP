/**
 * Class that represent counter of program
 */
public class ProgramCounter{
  
  /**
   * Display the current counter value
   */
  private Bit4 count;
  /**
   * current counter value for MAR
   */
  private Bit4 ctMar;
  
  /**
   * ProgramCounter Class Constructor
   */
  public ProgramCounter(){
    this.count=new Bit4(0);
    this.ctMar=new Bit4(0);
  }
  
  /**
   * Method to add the counter
   */
  public void countUp(){
    this.count.setValue(this.count.toBinary(this.count.toDecimal()+1,4));
  }
  
  /**
   * Method for setting a new counter value based on user input
   * @param new counter value
   */
  public void setCount(Bit4 count){
    this.count=count;
  }
  
  /**
   * Method for getting the current counter
   * @return current counter value in a form of 4Bit number
   */
  public Bit4 getCount(){
    return this.count;
  }
  
  /**
   * Method for getting the current counter for MAR
   * @return current counter for MAR value in a form of 4Bit number
   */
  public Bit4 getCtMar() {
    return ctMar;
  }

  /**
   * Method for setting a new counter for MAR value based on user input
   * @param new counter for MAR value
   */
  public void setCtMar(Bit4 ctMar) {
    this.ctMar = ctMar;
  }
  
  /**
   * Method ini mengembalikan nilai dari data
   * @return nilai data dalam biner jika tidak null, XXXXXXXX jika null
   */
	public String toString(){
    if(count!=null){
      return this.count.getValue();
    }
    return "XXXXXXXX";
  }
}
