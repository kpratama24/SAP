public class MemoryAddressRegister{
    
    private Bit4 data;
    
    /**
     * Constructor for class MemoryAddressRegister
     * @param data input value for the data attribute
     */
    public MemoryAddressRegister(Bit4 data) {
        this.data = data;
    }

    /**
     * Method for get the data in Bit8
     * @return the data in Bit8
     */
    public Bit8 getDataInBit8() {
        return this.convertToBit8();
    }
    
    /**
     * Method for converting the data into a Bit8
     * @return the data in Bit8
     */
    private Bit8 convertToBit8() {
        int result = this.data.toDecimal();
        return new Bit8(result);
    }

  /**
   * Setter for the data
   * @param data the value that given by the user
   */ 
    public void setData(Bit4 data) {
        this.data = data;
    }

  /**
   * Getter for the data
   * @return the value for the data
   */ 
    public Bit4 getData() {
        return this.data;
    }
}
