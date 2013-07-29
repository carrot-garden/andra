package andra.system;

import java.io.InputStream;
import java.io.StringWriter;
import java.lang.reflect.Method;

import org.apache.commons.io.IOUtils;

public class SecurityUtilities {

	private SecurityUtilities() {

	}

	public static boolean isLinuxSuperUser() {
		try {
			Process process = Runtime.getRuntime().exec("id -u");
			InputStream input = process.getInputStream();
			StringWriter writer = new StringWriter();
			IOUtils.copy(input, writer);
			String value = writer.toString();
			Integer number = Integer.parseInt(value);
			return number == 0;
		} catch (Throwable e) {
			return false;
		}
	}

	public static boolean isMacosxSuperUser() {
		return isLinuxSuperUser();
	}

	public static boolean isWindowsSuperUser() {
		try {
			Class<?> klaz = Class
					.forName("com.sun.security.auth.module.NTSystem");
			Method method = klaz.getDeclaredMethod("getGroupIDs",
					String[].class);
			Object system = klaz.newInstance();
			String[] groups = (String[]) method.invoke(system);
			for (String group : groups) {
				if (group.equals("S-1-5-32-544")) {
					return true;
				}
			}
			return false;
		} catch (Throwable e) {
			return false;
		}
	}
}
