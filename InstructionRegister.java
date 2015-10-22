public class InstructionRegister {
    
    private Bit8 opCode;
    private Bit4 operand;
    
    public InstructionRegister(Bit8 input) {
        this.opCode = input;
        String binary = opCode.toBinary(input.toDecimal(), 8);
        this.operand = new Bit4(binary.substring(4));
    }

    public Bit8 getOpCode() {
        return opCode;
    }

    public void setOpCode(Bit8 opCode) {
        this.opCode = opCode;
    }

    public Bit4 getOperand() {
        return operand;
    }

    public void setOperand(Bit4 operand) {
        this.operand = operand;
    }
    
}
