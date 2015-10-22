public class RandomAccessMemory{
    private Memory[] memory;
    private Bit8 data;

    public RandomAccessMemory(String[] memory) {
        this.memory = new Memory[16];
        for (int i = 0; i < 16; i++) {
            String mem = memory[i];
            if (!mem.equals("")) {
                this.memory[i] = new Memory(mem);
            }
        }
    }

    public void setData(Bit4 bit4) {
        this.data = this.memory[bit4.toDecimal()].getData();
    }

    public Bit8 getData() {
        return this.data;
    }
    
    private Bit8 getData() {
            return new Bit8(this.data);
        }
    }

    private class Memory {

        private final Bit8 data;

        private Memory(String data) {
            this.data = new Bit8(data);
        }
}
