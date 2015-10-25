/**
 * Class that represent the register instruction.
 * @author Github
 */
public class InstructionRegister {
    
    
    private Bit4 opCode;
    private Bit4 operand;
    private Bit8 ramData;
    
    /**
     * Class Constructor
     * @param input the Bit8 number
     */
    public InstructionRegister(Bit8 input) {
        this.ramData = input;
        //String binary = opCode.toBinary(input.toDecimal(), 8);
        this.opCode = new Bit4(input.getValue().substring(0,4));
        this.operand = new Bit4(input.getValue().substring(4));
    }

    /**
    * Getter for the opCode
    * @return the opCode
    */
    public Bit4 getOpCode() {
        return opCode;
    }
    
    /**
     * Setter for the opcode
     * @param opCode the value that given by the user
     */
    public void setOpCode(Bit4 opCode) {
        this.opCode = opCode;
    }

    /**
     * method to get the operand
     * @return the operand
     */ 
    public Bit4 getOperand() {
        return operand;
    }

    /**
    * Setter for the operand 
    * @param operand the operand that exist within the Bit4 class
    */ 
    public void setOperand(Bit4 operand) {
        this.operand = operand;
    }
    
    public Bit8 getRAMData(){
        return this.ramData;
    }
    
    public void setRAMData(Bit8 newData){
        this.ramData=newData;
    }
}
