package openClose;

import openClose.imp.AbstractSkin;

public class SouGouInput {

	private AbstractSkin mSkin;

	public void setSkin(AbstractSkin skin) {
		mSkin = skin;
	}

	public void display() {
		if (mSkin != null) {
			mSkin.display();
		}
	}

}
