package app;

import gui.InitialPage;

public class Application {

	public static void main(String[] args) {
		try {
			InitialPage frame = new InitialPage();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
