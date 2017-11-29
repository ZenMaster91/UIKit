package Foundation;

/**
 * A type can be validated throw a validation.
 *  
 * @author Guillermo Facundo Colunga
 * @version 0.1
 * @since 0.1
 * @formatter Oviedo Computing Community
 */
@FunctionalInterface
public interface Validable {
	
	/**
	 * Validates the type. Returns true if valid, false otherwise.
	 * 
	 * @return  Returns true if validation succeed, false otherwise.
	 */
	public boolean isValid();
}
