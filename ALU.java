public class ALU{
 //index Su yang didapat dari ControlUnitSequencer
 private final int IDXSU=8;

 public void calculate(Accumulator acc, BRegister br){
  ControlUnitSequencer cu=new ControlUnitSequencer();
  int su=cu.getBitsAt(IDXSU);
  if(su==1){

  } else{

  }
 }
}
