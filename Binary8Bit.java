public class Binary8Bit{
  private Binary4Bit[] data;
  public Binary8Bit(Binary4Bit[] data){
    this.data=data;
  }
  
  public Binary4Bit[] getData(){
    return this.data;
  }
  
  public void setData(Binary4Bit[] data){
    this.data=data;
  }
  
  public boolean getDataAt(int idx){
    if(idx<4){
      return this.data[0].getDataAtIndex(idx);
    }
    else{
      return this.data[1].getDataAtIndex(idx+4);
    }
  }
  
  @Override
  public String toString(){
    return this.data[0]+" "+this.data[1];
  }
}
