
public class ControlUnitSequencer{
  
  // Atribut yang menyimpan data instruksi dari InstructionRegister
    private Bit4 data;
  
  // Atribut yang menyimpan nilai [Cp,Ep,Lm',CE'],[Li',Ei',La',Ea],[Su,Eu,Lb',Lo'] pada kondisi terakhir
    private int[] bits;
    
    // Konstanta yang menyimpan nilai awal Control Unit (pada T0)
    private final static int[] INITIAL_STATE={0,0,1,1,1,1,1,0,0,0,1,1};
    
    //Konstanta yang menimpan nilai Control Unit pada kondisi T1 (address state)
    private final static int[] ADDRESS_STATE={0,1,0,1,1,1,1,0,0,0,1,1};
    
    // Konstanta yang menyimpan nilai Control Unit pada kondisi T2 (increment state)
    private final static int[] INCREMENT_STATE={1,0,1,1,1,1,1,0,0,0,1,1};
    
    // Konstanta yang menyimpan nilai Control Unit pada kondisi T3 (memory state)
    private final static int[] MEMORY_STATE={0,0,1,0,0,1,1,0,0,0,1,1};
    
    // Konstanta yang menyimpan nilai Control Unit pada kondisi T4 untuk LDA, ADD, dan SUB
    private final static int[] GET_RAM_VALUE={0,0,0,1,1,0,1,0,0,0,1,1};
    
    // Konstanta yang menyimpan nilai Control Unit pada kondisi T4 untuk OUT
    private final static int[] ACC_TO_OR={0,0,1,1,1,1,1,1,0,0,1,0};
    
    // Konstanta yang menyimpan nilai Control Unit pada kondisi T5 untuk LDA
    private final static int[] RAM_TO_ACC={0,0,1,0,1,1,0,0,0,0,1,1};
    
    // Konstanta yang menyimpan nilai Control Unit pada kondisi T5 untuk ADD dan SUB
    private final static int[] RAM_TO_BREG={0,0,1,0,1,1,1,0,0,0,0,1};
    
    // Konstanta yang menyimpan nilai Control Unit pada kondisi T6 untuk ADD
    private final static int[] ADD_STATE={0,0,1,1,1,1,0,0,0,1,1,1};
    
    // Konstanta yang menyimpan nilai Control Unit pada kondisi T6 untuk SUB
    private final static int[] SUB_STATE={0,0,1,1,1,1,0,0,1,1,1,1};
    
    public ControlUnitSequencer(Bit4 data) {
        this.data = data;
        // Nilai awal bits = 0011 1110 0011
        int[] values = {0,0,1,1,1,1,1,0,0,0,1,1};
        bits = values;
    }
    
    public ControlUnitSequencer() {
        // Nilai awal bits = 0011 1110 0011
        int[] values = {0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1};
        bits = values;
    }
    
    /**
     * Method untuk mendapatkan nilai dari atribut bits
     * @param index posisi nilai yang dicari
     * @return nilai dari bits ke-[index]
     */
    public int getBitsAt(int index) {
        return bits[index];
    }
    
    /**
     * Method untuk mengubah nilai dari atribut bits
     * @param index posisi nilai yang ingin diubah
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
     * Method untuk melakukan set nilai dari atribut bits
     * @param index posisi nilai yang ingin di set
     * @param input nilai untuk bits ke-[index]
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
