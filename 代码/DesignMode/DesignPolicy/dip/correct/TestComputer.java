package dip.correct;

import dip.correct.cpu.WWJCpu;
import dip.correct.hardDisk.XiJieHardDisk;
import dip.correct.memory.KingstonMemory;

public class TestComputer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer computer = new Computer();
		computer.run();

		System.out.println(" ================ ");

//		IntelCpu cpu = new IntelCpu();
		WWJCpu cpu = new WWJCpu();
		XiJieHardDisk disk = new XiJieHardDisk();
		KingstonMemory memory = new KingstonMemory();

		computer.setmCpu(cpu);
		computer.setmHardDisk(disk);
		computer.setmMemory(memory);

		computer.run();
	}

}
