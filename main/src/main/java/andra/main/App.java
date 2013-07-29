package andra.main;

import andra.system.SystemPlatform;

public class App {

	public static void main(String[] args) {

		System.out.println("HELLO");
		
		SystemPlatform.detect().isSuperUser();
		
	}

}
