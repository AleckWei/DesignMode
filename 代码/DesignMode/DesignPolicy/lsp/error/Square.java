package lsp.error;

/**
 * 正方形类
 * 
 * @author AleckWei
 *
 */
public class Square extends Rectangle {
	@Override
	public void setLength(double length) {
		super.setLength(length);
		super.setWidth(length);
	}

	@Override
	public void setWidth(double Width) {
		super.setLength(Width);
		super.setWidth(Width);
	}
}
