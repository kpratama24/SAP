public class BinaryDisplay{
  private Bit8 data;

  /**
  * setter for the Bit8 data
  */
  public void setData(Bit8 data) {
    this.data = data;
  }
  
  /**
   * Getter for the Bit8 data
   */
  public Bit8 getData() {
    return this.data;
  }

  /**
   * Method for printing the data int the form of decimal number
   */
  public void print() {
    System.out.println("Binary display = " + data.toDecimal());
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
