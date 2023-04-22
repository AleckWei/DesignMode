package dip.error;

public class Computer {
	private InterCpu mCpu;

	private KingstonMemory mMemory;

	private XiJieHardDisk mHardDisk;

	public InterCpu getmCpu() {
		return mCpu;
	}

	public void setmCpu(InterCpu mCpu) {
		this.mCpu = mCpu;
	}

	public KingstonMemory getmMemory() {
		return mMemory;
	}

	public void setmMemory(KingstonMemory mMemory) {
		this.mMemory = mMemory;
	}

	public XiJieHardDisk getmHardDisk() {
		return mHardDisk;
	}

	public void setmHardDisk(XiJieHardDisk mHardDisk) {
		this.mHardDisk = mHardDisk;
	}

	public void run() {
		if (mCpu != null && mMemory != null && mHardDisk != null) {
			System.out.println("此电脑正常运行！");
			mCpu.run();
			mMemory.save("1234");
			mMemory.get();
			mHardDisk.saveData("5678");
			mHardDisk.getData();
		} else {
			System.out.println("此电脑缺少关键部件！");
		}
	}

}
