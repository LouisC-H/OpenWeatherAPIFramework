package org.framework.connection_manager;

public enum UnitsEnum {
    STANDARD("standard"),
    METRIC ("metric"),
    IMPERIAL("imperial");

    private final String unitString;

    public String getUnitCode() {
        return unitString;
    }

    UnitsEnum(String unitString) {
        this.unitString = unitString;
    }
}
