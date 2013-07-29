package andra.system;

import static andra.system.OperatingSystem.*;
import static andra.system.ProcessorArchitecture.*;

/**
 * @author Andrei Pozolotin
 */
public enum SystemPlatform implements Superable {

	LINUX_X86_32(LINUX, X86_32), //

	LINUX_X86_64(LINUX, X86_64), //

	MACOSX_X86_32(MACOSX, X86_32), //

	MACOSX_X86_64(MACOSX, X86_64), //

	WINDOWS_X86_32(WINDOWS, X86_32), //

	WINDOWS_X86_64(WINDOWS, X86_64), //

	UNKNOWN(OperatingSystem.UNKNOWN, ProcessorArchitecture.UNKNOWN), //

	;

	public final OperatingSystem os;

	public final ProcessorArchitecture arch;

	SystemPlatform(OperatingSystem os, ProcessorArchitecture arch) {
		this.os = os;
		this.arch = arch;
	}

	public static SystemPlatform detect() {
		return UNKNOWN;
	}

	@Override
	public boolean isSuperUser() {
		switch (detect().os) {
		case LINUX:
			return SecurityUtilities.isLinuxSuperUser();
		case MACOSX:
			return SecurityUtilities.isMacosxSuperUser();
		case WINDOWS:
			return SecurityUtilities.isWindowsSuperUser();
		}
		return false;
	}

}
