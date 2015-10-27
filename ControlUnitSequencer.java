
public class ControlUnitSequencer{
  
  // Attributes that store data instructions from InstructionRegister
    private Bit4 data;
  
  // Attribute that stores the value of [ Cp , Ep , Lm ' CE ' ] , [ Li ' Ei ' , La ' , Ea ] , [ Su , Eu , Lb ' Lo '] on the last condition
    private int[] bits;
    
    // The constant that stores the initial value Control Unit ( at T0 )
    private final static int[] INITIAL_STATE={0,0,1,1,1,1,1,0,0,0,1,1};
    
    //Constants that you store the value of the Control Unit on the condition T1 ( state address )
    private final static int[] ADDRESS_STATE={0,1,0,1,1,1,1,0,0,0,1,1};
    
    // The constant that holds the value of the Control Unit on the condition T2 ( increment state )
    private final static int[] INCREMENT_STATE={1,0,1,1,1,1,1,0,0,0,1,1};
    
    // The constant that holds the value of the Control Unit in the T3 condition (memory state)
    private final static int[] MEMORY_STATE={0,0,1,0,0,1,1,0,0,0,1,1};
    
    // The constant that holds the value of the Control Unit at T4 condition for LDA , ADD and SUB
    private final static int[] GET_RAM_VALUE={0,0,0,1,1,0,1,0,0,0,1,1};
    
    // The constant that holds the value of the Control Unit at T4 condition for OUT
    private final static int[] ACC_TO_OR={0,0,1,1,1,1,1,1,0,0,1,0};
    
    // The constant that holds the value of the Control Unit on the conditions of T5 to LDA
    private final static int[] RAM_TO_ACC={0,0,1,0,1,1,0,0,0,0,1,1};
    
    // The constant that holds the value of the Control Unit on the  of T5 for ADD and SUB 
    private final static int[] RAM_TO_BREG={0,0,1,0,1,1,1,0,0,0,0,1};
    
    // The constant that holds the value of the Control Unit in the T6 condition for ADD
    private final static int[] ADD_STATE={0,0,1,1,1,1,0,0,0,1,1,1};
    
    // The constant that holds the value of the Control Unit in the T6 condition for SUB
    private final static int[] SUB_STATE={0,0,1,1,1,1,0,0,1,1,1,1};
    
    public ControlUnitSequencer(Bit4 data) {
        this.data = data;
        // first value bits = 0011 1110 0011
        int[] values = {0,0,1,1,1,1,1,0,0,0,1,1};
        bits = values;
    }
    
    public ControlUnitSequencer() {
        // first value bits = 0011 1110 0011
        int[] values = {0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1};
        bits = values;
    }
    
    /**
     * Method for get value from atribut bits
     * @param index of position search
     * @return value from index-...
     */
    public int getBitsAt(int index) {
        return bits[index];
    }
    
    /**
     * Method for change value from atribut bits
     * @param value position index want to change
     * @return void
     */
    private void changeValueAt(int index) {
        switch(getBitsAt(index)) {
            case 0:
                setValueAt(index,1);
                break;
            case 1:
                setValueAt(index,0);
                break;
        }
    }
        
    /**
     * Method for set a value from atribut bits
     * @param alue position index want to set and input for bit.
     */    
    private void setValueAt(int index, int input) {
        bits[index] = input;
    }
    
    @Override
    public String toString() {
        String result = "";
        for (int i=0; i<bits.length; i++){
            result+= bits[i]+"";
        }
        return result;
    }
  
    public Bit4 getData() {
        return data;
    }

    public void setData(Bit4 data) {
        this.data = data;
    }
    
    public void setState(int tx){
      switch(tx){
        case 0:
          bits=INITIAL_STATE;
          break;
        case 1:
          bits=ADDRESS_STATE;
          break;
        case 2:
          bits=INCREMENT_STATE;
          break;
        case 3:
          bits=MEMORY_STATE;
          break;
        case 4:
          if(this.data.toDecimal()==0){// instruksi LDA
            bits=GET_RAM_VALUE;
          }
          else if(this.data.toDecimal()==1){// instruksi ADD
            bits=GET_RAM_VALUE;
          }
          else if(this.data.toDecimal()==2){// instruksi SUB
            bits=GET_RAM_VALUE;
          }
          else if(this.data.toDecimal()==14){// instruksi OUT
            bits=ACC_TO_OR;
          }
          else{// instruksi HLT
            bits=INITIAL_STATE;
          }
          break;
        case 5:
          if(this.data.toDecimal()==0){// instruksi LDA
            bits=RAM_TO_ACC;
          }
          else if(this.data.toDecimal()==1){// instruksi ADD
            bits=RAM_TO_BREG;
          }
          else if(this.data.toDecimal()==2){// instruksi SUB
            bits=RAM_TO_BREG;
          }
          else if(this.data.toDecimal()==14){// instruksi OUT
            bits=INITIAL_STATE;
          }
          else{// instruksi HLT
            bits=INITIAL_STATE;
          }
          break;
        case 6:
          if(this.data.toDecimal()==0){// instruksi LDA
            bits=INITIAL_STATE;
          }
          else if(this.data.toDecimal()==1){// instruksi ADD
            bits=ADD_STATE;
          }
          else if(this.data.toDecimal()==2){// instruksi SUB
            bits=SUB_STATE;
          }
          else if(this.data.toDecimal()==14){// instruksi OUT
            bits=INITIAL_STATE;
          }
          else{// instruksi HLT
            bits=INITIAL_STATE;
          }
          break;
      }
    }
}
