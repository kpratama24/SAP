
public class ControlUnitSequencer{
  
  // Atribut yang menyimpan data dari InstructionRegister
    private Bit4 data;
  
  // Atribut yang menyimpan nilai [Cp,Ep,Lm',CE'],[Li',Ei',La',Ea],[Su,Eu,Lb',Lo']  
    private int[] bits;
    
    public ControlUnitSequencer() {
        this.data = data;
        // Nilai awal bits = 0011 1110 0011
        int[] values = {0,0,1,1,1,1,1,0,0,0,1,1};
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
            result+= String.valueOf(getBitsAt(i));
        }
        return result;
    }
  
    public Bit4 getData() {
        return data;
    }

    public void setData(Bit4 data) {
        this.data = data;
    }
  
}
