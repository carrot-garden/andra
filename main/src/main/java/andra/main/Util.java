package andra.main;

import com.sun.security.auth.module.UnixSystem;

public class Util {
	
	static final String WINDOWS_SYSTEM="com.sun.security.auth.module.NTSystem";
	static final String UNIX_SYSTEM="com.sun.security.auth.module.UnixSystem";

	public static boolean isAdmin() {
		
		UnixSystem system = new com.sun.security.auth.module.UnixSystem();
		
	    String groups[] = null;
	    for (String group : groups) {
	        if (group.equals("S-1-5-32-544"))
	            return true;
	    }
	    return false;
	}
	
}
