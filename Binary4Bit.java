public class Binary4Bit{
  private Binary1Bit[] data;
  
  public Binary4Bit(Binary1Bit[] data){
    this.data=data;
  }
  
  public Binary1Bit[] getData{
    return this.data;
  }
  
  public void setData(Binary1Bit[] data){
    this.data=data;
  }
  
  public boolean getDataAtIndex(int idx){
    return this.data[idx].getValue();
  }
}
