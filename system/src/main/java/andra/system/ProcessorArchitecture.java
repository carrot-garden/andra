package andra.system;

/**
 * @author Andrei Pozolotin
 */
public enum ProcessorArchitecture {

	ARM_32, //

	ARM_64, //

	X86_32, //

	X86_64, //

	UNKNOWN, //

	;

	public static ProcessorArchitecture detect(){ 
		return UNKNOWN; 
	}
	
}
