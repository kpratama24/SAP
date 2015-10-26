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
    acc=new Accumulator();
    bReg=new BRegister();
    binDisplay=new BinaryDisplay();
    ir=new InstructionRegister();
    mar=new MemoryAddressRegister();
    or=new OutputRegister();
    alu=new ALU();
  }
  
   public void start(PrintStream out){
    // simulation
    
    // Initial state - T0
    cu.setState(0);
    out.println("T0");
    out.println(this);
    
    // Address state - T1
    cu.setState(1);
    out.println("T1");
    mar.setData(pc.getCount());
    out.println(this);
    
    // Increment state - T2
    cu.setState(2);
    out.println("T2");
    pc.countUp();
    out.println(this);
    
    // Memory state - T3
    cu.setState(3);
    out.println("T3");
    ir.setRAMData(mar.getRam());
    out.println(this);
    
    // Memory state - T4
    cu.setState(4);
    out.println("T4");
    mar.setData(ir.getOperand());
    out.println(this);
    
    // Memory state - T5
    cu.setState(5);
    out.println("T5");
    acc.setData(ram.getFromMemory(mar.getData()));
    out.println(this);
    
    // Memory state - T6
    cu.setState(6);
    out.println("T6");
    out.println(this);
  }
  
  public String toString(){
    String result="";
    result+="PC  : "+pc.toString()+"\n";
    result+="MAR : "+mar.toString()+"\n";
    result+="IR  : "+ir.toString()+"\n";
    result+="CU  : "+cu.toString()+"\n";
    result+="ACC : "+acc.toString()+"\n";
    result+="ALU : "+alu.toString()+"\n";
    result+="RB  : "+bReg.toString()+"\n";
    result+="OR  : "+or.toString()+"\n";
    result+="BD  : "+binDisplay.toString()+"\n";
    return result;
  }
}
