/**
 * Class that represent the register instruction.
 * @author Github
 */
public class InstructionRegister {
    
    
    private Bit8 opCode;
    private Bit4 operand;
    
    /**
     * Class Constructor
     * @param input the Bit8 number
     */
    public InstructionRegister(Bit8 input) {
        this.opCode = input;
        String binary = opCode.toBinary(input.toDecimal(), 8);
        this.operand = new Bit4(binary.substring(4));
    }

    /**
    * Getter for the opCode
    * @return the opCode
    */
    public Bit8 getOpCode() {
        return opCode;
    }
    
    /**
     * Setter for the opcode
     * @param opCode the value that given by the user
     */
    public void setOpCode(Bit8 opCode) {
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
    
}
