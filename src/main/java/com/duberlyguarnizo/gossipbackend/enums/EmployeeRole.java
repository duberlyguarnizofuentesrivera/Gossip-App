package com.duberlyguarnizo.gossipbackend.enums;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum EmployeeRole {
    ADMIN("Admin", "Administrador", "Administrador"),
    SUPERVISOR("Supervisor", "Supervisor", "Supervisor"),
    HELPER("Helper", "Ayudante", "Assistente");

    public final String labelEn;
    public final String labelEs;
    public final String labelPr;


    EmployeeRole(String labelEn, String labelEs, String labelPr) {
        this.labelEn = labelEn;
        this.labelEs = labelEs;
        this.labelPr = labelPr;
    }

    @Override
    public String toString() {
        return toLabel("en");
    }

    public String toLabel(String language) {
        return switch (language) {
            case "es" -> this.labelEs;
            case "pr" -> this.labelPr;
            default -> this.labelEn;
        };
    }
}
