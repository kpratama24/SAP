public class ALU {

 //index Su yang didapat dari ControlUnitSequencer
 private final int IDXSU=8;

// Atribut yang menyimpan bit yang didapat dari Accumulator dan BRegister
    private Bit8 ACCData, BRegData;

    public ALU(Accumulator acc, BRegister br) {
        this.ACCData = acc.getData();
        this.BRegData = br.getData();     
    }
    
    /**
     * method untuk melakukan operasi penjumlahan atau pengurangan
     * antara ACCData dan BRegData
     * @return hasil dari operasi perhitungan yang diinginkan
     */
    public Bit8 calculate() {
        ControlUnitSequencer cu = new ControlUnitSequencer();
        switch(cu.getBitsAt(IDXSU)) {
            case 0:
                return this.add();
            case 1:
                return this.substract();
            default:
                return null;
        }
    }
    
    /**
     * Method untuk melakukan operasi penjumlahan
     * antara ACCData dan BRegData
     * @return hasil penjumlahan
     */
    private Bit8 add() {
        int result = ACCData.toDecimal() + BRegData.toDecimal();
        return new Bit8(result);
    }
    
    /**
     * Method untuk melakukan operasi pengurangan
     * antara ACCData dan BRegData
     * @return hasil pengurangan
     */
    private Bit8 substract() {
        int result = ACCData.toDecimal() - BRegData.toDecimal();
        return new Bit8(result);
    }
    
}
