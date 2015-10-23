public class SAPSimulator{
  private ALU alu;
  private Accumulator acc;
  private BRegister bReg;
  private BinaryDisplay binDisplay;
  private ControlUnitSequencer cu;
  private InstructionRegister ir;
  private MemoryAddressRegister mar;
  private OutputRegister or;
  private ProgramCounter pc;
  private RandomAccessMemory ram;
  
  public SAPSimulator(String[] memory){
    // create objects for registers
    
    ram=new RandomAccessMemory(memory);
  }
  
  public void start(){
    // simulation
  }
}
