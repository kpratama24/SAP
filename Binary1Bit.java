public class Binary1Bit{
  private boolean value;
  
  public Binary1Bit(boolean value){
    this.value=value;
  }
  
  public boolean getValue(){
    return this.value;
  }
  
  public void setValue(boolean value){
    this.value=value;
  }
  
  @Override
  public String toString(){
    if(this.value){
      return "1";
    }
    else{
      return "0";
    }
  }
}
