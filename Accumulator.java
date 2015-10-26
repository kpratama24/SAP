public class Accumulator{
  //Tempat penyimpanan Bit8 dalam accumulator
  private Bit8 data;
  /**
     * method untuk melakukan pengesetan data Bit8 pada accumulator
     * @return void
     */
  public void setData(Bit8 data) {
      this.data = data;
  }
  /** 
     * methode untuk mengambil data dari accumulator
     * @return Bit8
     */
  public Bit8 getData() {
      return this.data;
  }
  
    /**
     * Method ini mengembalikan nilai dari data
     * @return nilai data dalam biner jika tidak null, XXXXXXXX jika null
     */
  public String toString(){
      if(data!=null){
          return this.data.getValue();
      }
      return "XXXXXXXX";
  }
}
