public class BRegister{
 private String bit; // Save the bit from the RAM
 
 /**
  * The class cnstructor of BufferRegister
  * @param bit the bit input that will be enetered to BufferRegister
  */
 public BRegister(String bit){
   this.bit=bit;
 }

 /**
  * Getter for the bit attributes
  * @return the bit value in the form of String data type
  */
 public String getBit(){
  return this.bit;
 }

 /**
  * Setter for the bit attributes
  * @param bit input that will be applied to the bit attributes
  */
 public void setBit(String bit){
  this.bit=bit;
 }

 /**
  * getter for restoring the bit type to decimal number
  * @return the bit in a form of decimal number
  */
 public int getBitToDecimal(){
  Bit bits=new Bit(bit);
  return bits.toDecimal();
 }
}
