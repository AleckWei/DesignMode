package openClose;

import openClose.impl.DefaultSkin;

public class TestOpenClose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SouGouInput souGouInput = new SouGouInput();

		DefaultSkin skin = new DefaultSkin();
//		GinShinSkin skin = new GinShinSkin();

		souGouInput.setSkin(skin);
		souGouInput.display();
	}

}
