public class OutputRegister{
   private Bit8 data;

   /**
    * Getter for the data
    * @return the data value
    */ 
   public Bit8 getData() {
      return this.data;
   }
    
   /**
    * Setter for the data
    * @param data the value of the data
    */
   public void setData(Bit8 data) {
      this.data = data;
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
