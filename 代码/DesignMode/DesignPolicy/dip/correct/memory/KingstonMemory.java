package dip.correct.memory;

import dip.correct.imp.Memory;

public class KingstonMemory implements Memory {

	@Override
	public void saveData(Object data) {
		// TODO Auto-generated method stub
		System.out.println("金士顿内存正在保存数据：" + data);
	}

	@Override
	public void getData() {
		// TODO Auto-generated method stub
		System.out.println("从金士顿内存中获取数据");
	}

}
