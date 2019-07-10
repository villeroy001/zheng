package structure.facade;

/**
 * @author weiyixiao
 * @version id: Computer.java, v 0.1 2019年07月10日 11:00:26 weiyixiao Exp $
 */
public class Computer {

    private Cpu cpu;

    private Disk disk;

    private Memory memory;

    private String getName(){
        return cpu.getName()+disk.getName()+memory.getName();
    }

    public Computer() {
        cpu = new Cpu();
        disk = new Disk();
        memory = new Memory();
    }
}
