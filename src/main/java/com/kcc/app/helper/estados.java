package com.kcc.app.helper;

public enum estados {
    activo("A"),
    eliminado("E")
    ;

    private final String text;

    /**
     * @param text
     */
    private estados(final String text) {
        this.text = text;
    }

    /* (non-Javadoc)
     * @see java.lang.Enum#toString()
     */
    @Override
    public String toString() {
        return text;
    }
    public String toStr() {
        return text;
    }
}