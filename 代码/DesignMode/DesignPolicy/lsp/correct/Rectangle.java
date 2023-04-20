package lsp.correct;

/**
 * 改进后的长方形，它实现四边形接口
 * 
 * @author AleckWei
 *
 */
public class Rectangle implements Quadrilater {

	private double length;
	private double width;

	@Override
	public double getLength() {
		return length;
	}

	@Override
	public double getWidth() {
		return width;
	}

	@Override
	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public void setWidth(double width) {
		this.width = width;
	}

}
