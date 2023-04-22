package dip.correct.hardDisk;

import dip.correct.imp.HardDisk;

public class XiJieHardDisk implements HardDisk {

	@Override
	public void saveData(Object data) {
		// TODO Auto-generated method stub
		System.out.println("使用希捷硬盘保存数据：" + data);
	}

	@Override
	public void getData() {
		// TODO Auto-generated method stub
		System.out.println("在希捷硬盘中获取数据");
	}

}
