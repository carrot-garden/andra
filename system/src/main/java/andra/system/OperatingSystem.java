package andra.system;

/**
 * @author Andrei Pozolotin
 */
public enum OperatingSystem{
	
	LINUX, //
	
	MACOSX, //
	
	WINDOWS, //
	
	UNKNOWN, //
	
	;

	public static OperatingSystem detect(){ 
		return UNKNOWN; 
	}

}
