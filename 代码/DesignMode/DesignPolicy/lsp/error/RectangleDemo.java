package lsp.error;

public class RectangleDemo {

	/**
	 * 打印长方形的长和宽
	 * 
	 * @param rect 要打印的长和宽
	 */
	public static void printLengthAndWidth(Rectangle rect) {
		if (rect != null) {
			System.out.println("长：" + rect.getLength() + ",宽：" + rect.getWidth());
		}
	}

	/**
	 * 如果这个长方形的长比宽短，则增加宽的长度直至和长一样
	 * 
	 * @param rect 要判断的长方形
	 */
	public static void resize(Rectangle rect) {
		if (rect == null) {
			return;
		}

		while (rect.getWidth() <= rect.getLength()) {
			rect.setWidth(rect.getWidth() + 1);
		}
	}

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();

		rectangle.setLength(20);
		rectangle.setWidth(10);

		resize(rectangle);
		printLengthAndWidth(rectangle);

		System.out.println("======================");

		Square square = new Square();
		square.setLength(10);

		resize(square);
		printLengthAndWidth(square);
	}

}
