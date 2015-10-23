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
    pc=new ProgramCounter();
    cu=new ControlUnitSequencer();
    ram=new RandomAccessMemory(memory);
  }
  
  public void start(){
    // simulation
    
    // Initial state - T0
    cu.setState(0);
    
    // Address state - T1
    cu.setState(1);
    
    // Increment state - T2
    cu.setState(2);
    
    // Memory state - T3
    cu.setState(3);
  }
}
