/**
 * Class that represent counter of program
 */
public class ProgramCounter{
  
  /**
   * Display the current counter value
   */
  private Bit4 count;
  
  /**
   * ProgramCounter Class Constructor
   */
  public ProgramCounter(){
    this.count=new Bit4(0);
  }
  
  /**
   * Method to add the counter
   */
  public void countUp(){
    this.count=this.count.setValue(this.count.toBinary(this.count.toDecimal()+1,4));
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
}
