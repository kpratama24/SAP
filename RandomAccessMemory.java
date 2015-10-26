public class RandomAccessMemory{
    private Memory[] memory;
    private Bit8 data;

    /**
     * Class constructor for the RAM
     * @param memory an array that store the memory string
     */
    public RandomAccessMemory(String[] memory) {
        this.memory = new Memory[16];
        for (int i = 0; i < 16; i++) {
            String mem = memory[i];
            if (!mem.equals("")) {
                this.memory[i] = new Memory(mem);
            }
        }
    }
    
    /**
    * Setter for the data
    * @param bit4 the Bit4 data taht will be changed to decimal number
    */
    private void setData(Bit4 bit4) {
        this.data = this.memory[bit4.toDecimal()].getData();
    }

    /**
     * Getter for the data
     * @return the data value
     */
    private Bit8 getData() {
        return this.data;
    }
    
    /**
     * Getter for the data in the form of Bit8 data type
     * @return new data generated from Bit8 Class
     */
    private Bit8 getData() { //error, getData() already defined (diatas)
        return new Bit8(this.data);
    }
    public Bit8 getFromMemory(Bit4 index){
        setData(index);
        return getData();
    }
    
    private class Memory {

        private final Bit8 data;

        /** Class constructor
         *  @param data the data taht will be created  based on Bit* data type
         */
        private Memory(String data) {
            this.data = new Bit8(data);
        }
        private Bit8 getData(){
            return this.data;
        }
    }
}
