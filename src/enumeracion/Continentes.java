
package enumeracion;


public enum Continentes {
    AFRICA(54, "4600 millones de habitantes"),
    EUROPA(49, "1300 millones de habitantes"),
    ASIA(43, "1000 millones de habitantes "),
    AMERICA(36 ,"750 millones de habitantes"),
    OCEANIA(16,"43 millones de habitantes");
    
    private final int paises;
    private final String habitantes;

    private Continentes(int paises, String habitantes) {
        this.paises = paises;
        this.habitantes = habitantes;
    }
    
    public int getPaises(){
        return this.paises;
    }
    
    public String getHabitantes(){
        return this.habitantes;
    }
    
    
}
