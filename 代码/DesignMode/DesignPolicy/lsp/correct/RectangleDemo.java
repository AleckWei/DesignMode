package lsp.correct;

/**
 * 测试改进后的Rectangle和Square类
 * 
 * @author AleckWei
 *
 */
public class RectangleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle = new Rectangle();
		rectangle.setLength(20);
		rectangle.setWidth(10);

		resize(rectangle);
		printLengthAndWidth(rectangle);

		System.out.println("=============");

		Square square = new Square();
		square.setLength(10);

//		这句话就直接编译器报错了，说明Square类已经不能作为resize方法的参数了
//		resize(square);
		// 这句话还能执行，是因为它实现了四边形的抽象接口和当中的方法
		printLengthAndWidth(square);
	}

	public static void resize(Rectangle rect) {
		if (rect == null) {
			return;
		}

		while (rect.getWidth() <= rect.getLength()) {
			rect.setWidth(rect.getWidth() + 1);
		}
	}

	public static void printLengthAndWidth(Quadrilater quadrilater) {
		if (quadrilater == null) {
			System.out.println("长：0，宽：0");
			return;
		}

		System.out.println("长：" + quadrilater.getLength() + "，宽：" + quadrilater.getWidth());
	}

}
