public class Accumulator{
  //attribute for load data with type Bit8 
  private Bit8 data;
  /**
     * methode for set a bit8 data.
     * @return void
     */
  public void setData(Bit8 data) {
      this.data = data;
  }
  /** 
     * methode for take a data from accumulator
     * @return Bit8
     */
  public Bit8 getData() {
      return this.data;
  }
  
    /**
     * this methode return a Bit8 data to string type just if data is not null
     * @return String of Bit8 data
     */
  public String toString(){
      if(data!=null){
          return this.data.getValue();
      }
      return "XXXXXXXX";
  }
}
