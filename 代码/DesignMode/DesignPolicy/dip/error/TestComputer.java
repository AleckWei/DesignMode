package dip.error;

public class TestComputer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer mComputer = new Computer();
		mComputer.run();

		System.out.println("=====================");

		InterCpu cpu = new InterCpu();
		KingstonMemory memory = new KingstonMemory();
		XiJieHardDisk hardDisk = new XiJieHardDisk();

		mComputer.setmCpu(cpu);
		mComputer.setmMemory(memory);
		mComputer.setmHardDisk(hardDisk);

		mComputer.run();
	}

}
