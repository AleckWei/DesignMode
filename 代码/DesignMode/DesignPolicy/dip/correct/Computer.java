package dip.correct;

import dip.correct.imp.Cpu;
import dip.correct.imp.HardDisk;
import dip.correct.imp.Memory;

public class Computer {
	private HardDisk mHardDisk;

	private Cpu mCpu;

	private Memory mMemory;

	public HardDisk getmHardDisk() {
		return mHardDisk;
	}

	public void setmHardDisk(HardDisk mHardDisk) {
		this.mHardDisk = mHardDisk;
	}

	public Cpu getmCpu() {
		return mCpu;
	}

	public void setmCpu(Cpu mCpu) {
		this.mCpu = mCpu;
	}

	public Memory getmMemory() {
		return mMemory;
	}

	public void setmMemory(Memory mMemory) {
		this.mMemory = mMemory;
	}

	public void run() {
		if (mCpu != null && mHardDisk != null && mMemory != null) {
			mHardDisk.saveData("1234");
			mHardDisk.getData();

			mMemory.saveData("5678");
			mMemory.getData();

			mCpu.run();
		} else {
			System.out.println("计算机缺少重要部件！");
		}
	}

}
