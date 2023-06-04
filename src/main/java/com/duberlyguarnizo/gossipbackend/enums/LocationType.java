package com.duberlyguarnizo.gossipbackend.enums;

public enum LocationType {
    CLIENT("client", "Cliente", "Cliente"),
    GOSSIP("Gossip", "Chisme", "Fofoca");

    public final String labelEn;
    public final String labelEs;
    public final String labelPr;


    LocationType(String labelEn, String labelEs, String labelPr) {
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

    //String neighborhood; //TODO: move this to Gossip class

}
