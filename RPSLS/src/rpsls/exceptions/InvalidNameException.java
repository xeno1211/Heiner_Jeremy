/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rpsls.exceptions;

/**
 *
 * @author Luke
 */
public class InvalidNameException extends Exception {

    /**
     * Creates a new instance of
     * <code>InvalidNameException</code> without detail message.
     */
    public InvalidNameException() {
    }

    /**
     * Constructs an instance of
     * <code>InvalidNameException</code> with the specified detail message.
     *
     * @param msg the detail message.
     */
    public InvalidNameException(String msg) {
        super(msg);
    }
}
