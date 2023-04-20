package lsp.correct;

/**
 * 定义一个四边形接口，规范四边形的统一方法
 * 
 * @author AleckWei
 *
 */
public interface Quadrilater {
	/**
	 * 获取长度
	 * 
	 * @return 长度
	 */
	double getLength();

	/**
	 * 获取宽度
	 * 
	 * @return 宽度
	 */
	double getWidth();

	/**
	 * 设置长度
	 * 
	 * @param length 四边形的长
	 */
	void setLength(double length);

	/**
	 * 设置宽度
	 * 
	 * @param width 四边形的宽
	 */
	void setWidth(double width);
}
