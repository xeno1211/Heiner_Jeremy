/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rpsls.exceptions;

/**
 *
 * @author Xenocyde
 */
public class NumberException extends Exception {

    public NumberException() {
    }

    public NumberException(String message) {
        super(message);
    }

    public NumberException(String message, Throwable cause) {
        super(message, cause);
    }

    public NumberException(Throwable cause) {
        super(cause);
    }
    
}
