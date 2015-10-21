public class ProgramCounter{
  private int count;
  
  public ProgramCounter(){
    this.count=0;
  }
  
  public void countUp(){
    this.count++;
  }
  
  public void setCount(int count){
    this.count=count;
  }
  
  public int getCount(){
    return this.count;
  }
}
