package com.paveldejimas.bazine;

public class LeidinysImpl {
    private String rusis;
    private boolean periodinis;
    private int puslapiuSkaicius;

    public LeidinysImpl(String rusis, boolean periodinis, int puslapiuSkaicius) {
        this.rusis = rusis;
        this.periodinis = periodinis;
        this.puslapiuSkaicius = puslapiuSkaicius;
    }

    public LeidinysImpl(String rusis, int puslapiuSkaicius) {
        this(rusis, false, puslapiuSkaicius);
    }

    public LeidinysImpl(String rusis) {
        this(rusis, false, 1);
    }

    public String getRusis() {
        return rusis;
    }

    public void setRusis(String rusis) {
        this.rusis = rusis;
    }

    public boolean isPeriodinis() {
        return periodinis;
    }

    public void setPeriodinis(boolean periodinis) {
        this.periodinis = periodinis;
    }

    public int getPuslapiuSkaicius() {
        return puslapiuSkaicius;
    }

    public void setPuslapiuSkaicius(int puslapiuSkaicius) {
        this.puslapiuSkaicius = puslapiuSkaicius;
    }
}
