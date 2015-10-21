public class Binary4Bit{
  private Binary1Bit[] data;
  public Binary4Bit(){
    this.data={new Binary1Bit(false),new Binary1Bit(false),new Binary1Bit(false),new Binary1Bit(false)};
  }
  
  public Binary4Bit(Binary1Bit[] data){
    this.data=data;
  }
  
  public Binary1Bit[] getData{
    return this.data;
  }
  
  public void setData(Binary1Bit[] data){
    this.data=data;
  }
}
