package org.netarchivesuite.heritrix3wrapper.xmlutils;

import java.util.LinkedList;
import java.util.List;

import javax.xml.transform.ErrorListener;

/**
 * Abstract XSL ErrorListener base that allows access to some useful fields and methods.
 */
public abstract class XslErrorListenerAbstract implements ErrorListener {

    /** Errors accumulated. */
    public int numberOfErrors;

    /** Errors messages. */
    public List<String> errors = new LinkedList<String>();

    /** Fatal errors accumulated. */
    public int numberOfFatalErrors;

    /** Fatal errors messages. */
    public List<String> fatalErrors = new LinkedList<String>();

    /** Warnings accumulated. */
    public int numberOfWarnings;

    /** Warning messages. */
    public List<String> warnings = new LinkedList<String>();

    /**
     * Reset accumulated errors counters.
     */
    public void reset() {
        numberOfErrors = 0;
        numberOfFatalErrors = 0;
        numberOfWarnings = 0;
        errors.clear();
        fatalErrors.clear();
        warnings.clear();
    }

    /**
     * Returns a boolean indicating whether this listener has recorded any errors.
     * @return a boolean indicating whether this listener has recorded any errors
     */
    public boolean hasErrors() {
        return numberOfErrors != 0 || numberOfFatalErrors != 0 || numberOfWarnings != 0;
    }

}
