/**
 * this is a tester clas
 * @Author Github
 */
public class Main{

    String[] memory = new String[16];
        memory[0] = "00001001";
        memory[1] = "00011010";
        memory[2] = "00011011";
        memory[3] = "00011100";
        memory[4] = "00101101";
        memory[5] = "11100000";
        memory[6] = "11110000";
        memory[7] = "00000000";
        memory[8] = "00000000";
        memory[9] = "00010000";
        memory[10] = "00010100";
        memory[11] = "00011000";
        memory[12] = "00011100";
        memory[13] = "00100000";
        memory[14] = "00000000";
        memory[15] = "00000000";
        SAPSimulator simulator = new SAPSimulator(memory);
        simulator.start();
}
