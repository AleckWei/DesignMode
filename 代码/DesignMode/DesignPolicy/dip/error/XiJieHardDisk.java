package dip.error;

public class XiJieHardDisk {

	public void saveData(Object data) {
		System.out.println("使用希捷硬盘存储数据：" + data);
	}

	public Object getData() {
		System.out.println("使用希捷硬盘获取数据");
		return null;
	}
}
