public class BRegister{
 private String bit; //menyimpan bit dari RAM
 
 /**
  * Konstraktor kelas BRegister
  * @param bit input bit yang dimasukkan ke BRegister
  */
 public BRegister(String bit){
  this.bit=bit;
 }

 /**
  * Getter untuk atribut bit
  * @return nilai bit dalam string
  */
 public String getBit(){
  return this.bit;
 }

 /**
  * Setter untuk atribut bit
  * @param bit input bit yang diset ke atribut bit
  */
 public void setBit(String bit){
  this.bit=bit;
 }

 /**
  * Getter untuk mengembalikan bit dalam bentuk desimal
  * @return bit dalam desimal
  */
 public int getBitToDecimal(){
  Bit bits=new Bit(bit);
  return bits.toDecimal();
 }
}
