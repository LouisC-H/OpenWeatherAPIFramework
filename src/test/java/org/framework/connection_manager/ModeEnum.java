package org.framework.connection_manager;

public enum ModeEnum {
    XML("xml"),
    HTML("html");

    private final String modeAsString;

    public String getModeAsString() {
        return modeAsString;
    }

    ModeEnum(String modeString) {this.modeAsString = modeString;}
}
