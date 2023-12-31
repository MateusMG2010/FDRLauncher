package net.mgstudios.FDRLauncher.gui.component;

import javax.swing.text.PlainDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;

public class Limit extends PlainDocument {
    private final int limit;
    public Limit(int limit) {
        super();
        this.limit = limit;
    }
    public void insertString( int offset, String  str, AttributeSet attr ) throws BadLocationException {
        if (str == null) return;

        if ((getLength() + str.length()) <= limit) {
            super.insertString(offset, str, attr);
        }
    }
}