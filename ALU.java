public class ALU {

 //index Su yang didapat dari ControlUnitSequencer
 private final int IDXSU=8;

// Atribut yang menyimpan bit yang didapat dari Accumulator dan BRegister
    private Bit8 ACCData, BRegData;
    
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
    
    /**
     * Getter untuk atribut ACCData
     * @return ACCData dengan tipe Bit8
     */
    public Bit8 getACCData() {
        return ACCData;
    }

    /**
     * Setter untuk atribut ACCData
     * @param ACCData input bertipe Bit8 untuk masukan atribut ACCData
     */
    public void setACCData(Bit8 ACCData) {
        this.ACCData = ACCData;
    }

    /**
     * Getter untuk atribut BRegData
     * @return BRegData dengan tipe Bit8
     */
    public Bit8 getBRegData() {
        return BRegData;
    }

    /**
     * Setter untuk atribut BRegData
     * @param BRegData input bertipe Bit8 untuk masukan atribut BRegData
     */
    public void setBRegData(Bit8 BRegData) {
        this.BRegData = BRegData;
    }
    
}
