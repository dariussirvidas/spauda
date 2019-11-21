package com.paveldejimas.isvestine;

import com.paveldejimas.bazine.LeidinysImpl;

public class KnygaImpl extends LeidinysImpl implements Knyga {
    private String pavadinimas;
    private boolean kietaisVirseliais;
    private String tipas;

    public KnygaImpl(String pavadinimas, boolean kietaisVirseliais, String tipas, int puslapiuSkaicius) {
        super("knyga", puslapiuSkaicius);
        this.pavadinimas = pavadinimas;
        this.kietaisVirseliais = kietaisVirseliais;
        this.tipas = tipas;
    }
    public KnygaImpl(String pavadinimas, String tipas, int puslapiuSkaicius) {
        this(pavadinimas, false, tipas, puslapiuSkaicius);
    }

    @Override
    public String getPavadinimas() {
        return pavadinimas;
    }

    @Override
    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    @Override
    public boolean isKietaisVirseliais() {
        return kietaisVirseliais;
    }

    @Override
    public void setKietaisVirseliais(boolean kietaisVirseliais) {
        this.kietaisVirseliais = kietaisVirseliais;
    }

    @Override
    public String getTipas() {
        return tipas;
    }

    @Override
    public void setTipas(String tipas) {
        this.tipas = tipas;
    }

    @Override
    public String toString() {
        String virselis = kietaisVirseliais ? "kietu viršeliu" : "minkštu viršeliu";
        return String.format("%s, \"%s\", %s , %s", super.toString(), pavadinimas, virselis, tipas);
    }
}
