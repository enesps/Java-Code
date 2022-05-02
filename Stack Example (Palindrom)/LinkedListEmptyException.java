
package mystack;

/**
 *
 * @author User
 */
class LinkedListEmptyException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
 
    /**
     *
     */
    public LinkedListEmptyException() {
		super();
	}
 
    /**
     *
     * @param message
     */
    public LinkedListEmptyException(String message) {
		super(message);
	}
}
