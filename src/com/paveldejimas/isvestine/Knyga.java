package com.paveldejimas.isvestine;

public interface Knyga {
    String getPavadinimas();
    void setPavadinimas(String pavadinimas);
    boolean isKietaisVirseliais();
    void setKietaisVirseliais(boolean kietaisVirseliais);
    String getTipas();
    void setTipas(String tipas);
}
