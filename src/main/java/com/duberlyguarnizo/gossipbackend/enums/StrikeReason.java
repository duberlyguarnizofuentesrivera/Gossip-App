package com.duberlyguarnizo.gossipbackend.enums;

public enum StrikeReason {
    SENSITIVE_DATA("Sensitive data", "Datos sensibles", "Dados sensíveis"),
    LANGUAGE("Language", "Lenguaje", "Linguagem"),
    COMPLAINT("Complaint", "Reclamo", "Reclamação"),
    OTHER("Other", "Otro", "Outro");
    public final String labelEn;
    public final String labelEs;
    public final String labelPr;


    StrikeReason(String labelEn, String labelEs, String labelPr) {
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
