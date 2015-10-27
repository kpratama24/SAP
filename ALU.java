public class ALU {

 //Su index obtained from ControlUnitSequencer
 private final int IDXSU=8;

// Attributes which store bits obtained from Accumulator and BRegister
    private Bit8 ACCData, BRegData;
    
    /**
     * method do a mathematics (+,-) 
     * between ACCData and BRegData
     * @return the results of the calculation of the desired operation
     */
    public Bit8 calculate() {
        ControlUnitSequencer cu = new ControlUnitSequencer();
        switch(cu.getBitsAt(IDXSU)) {
            case 0:
                return this.add();
            case 1:
                return this.substract();
            default:
                return null;
        }
    }
    
    /**
     * Method for do adder
     * between ACCData and BRegData
     * @return the results of adder
     */
    private Bit8 add() {
        int result = ACCData.toDecimal() + BRegData.toDecimal();
        return new Bit8(result);
    }
    
    /**
     * Method to perform subtraction operation
     * between ACCData and BRegData
     * @return result of subtraction
     */
    private Bit8 substract() {
        int result = ACCData.toDecimal() - BRegData.toDecimal();
        return new Bit8(result);
    }
    
    /**
     * Getter for atribut ACCData
     * @return ACCData with tipe Bit8
     */
    public Bit8 getACCData() {
        return ACCData;
    }

    /**
     * Setter for atribut ACCData
     * @param ACCData input with type Bit8 for insert atribut ACCData
     */
    public void setACCData(Bit8 ACCData) {
        this.ACCData = ACCData;
    }

    /**
     * Getter for atribut BRegData
     * @return BRegData with type Bit8
     */
    public Bit8 getBRegData() {
        return BRegData;
    }

    /**
     * Setter untukfor atribut BRegData
     * @param BRegData input with type Bit8 
     */
    public void setBRegData(Bit8 BRegData) {
        this.BRegData = BRegData;
    }
    
    /**
     * this methode give back value form calculate.
     * @return value of calculate if ACCData and BRegData is not null
     */
    public String toString(){
      if(this.ACCData!=null && BRegData!=null){
          return this.calculate().getValue();
      }
      return "XXXXXXXX";
  }
}
