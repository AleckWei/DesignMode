package lsp.correct;

/**
 * 改进后的正方形类，实现了四边形的接口
 * 
 * @author AleckWei
 *
 */
public class Square implements Quadrilater {

	private double side;

	@Override
	public double getLength() {
		return side;
	}

	@Override
	public double getWidth() {
		return side;
	}

	@Override
	public void setLength(double length) {
		this.side = length;
	}

	@Override
	public void setWidth(double width) {
		this.side = width;
	}

}
