/**
 * Class that represent counter of program
 */
public class ProgramCounter{
  
  /**
   * Display the current counter value
   */
  private int count;
  
  /**
   * ProgramCounter Class Constructor
   */
  public ProgramCounter(){
    this.count=0;
  }
  
  /**
   * Method to add the counter
   */
  public void countUp(){
    this.count++;
  }
  
  /**
   * Method for setting a new counter value based on user input
   * @param new counter value
   */
  public void setCount(int count){
    this.count=count;
  }
  
  /**
   * Method for getting the current counter
   * @return current counter value in a form of 4Bit number
   */
  public String getCount(){
    return (new Bit4(this.count)).getValue();
  }
}
