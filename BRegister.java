public class BRegister{
 private Bit8 data; // Save the bit from the RAM

 /**
  * Getter for the data attributes
  * @return the bit value in the form of Bit8 data type
  */
 public Bit8 getData() {
  return this.data;
 }

 /**
  * Setter for the bit attributes
  * @param bit input that will be applied to the bit attributes
  */
 public void setBit(Bit8 bit){
  this.data = bit;
 }

 /**
  * getter for restoring the bit type to decimal number
  * @return the bit in a form of decimal number
  */
 public int getBitToDecimal(){
  return data.toDecimal();
 }
}
