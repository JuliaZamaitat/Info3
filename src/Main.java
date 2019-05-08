public class Main {
    public static void main (String[] args){
        AbstrakteFabrik didadasFabrik = new DidadasFabrik();
        AbstrakteFabrik enkiFabrik = new EnkiFabrik();
        AbstrakteFabrik umapFabrik = new UmapFabrik();

        AbstrakterWanderschuh didadasWanderschuh = didadasFabrik.erzeugeWanderschuh();
        AbstrakterWanderschuh enkiWanderschuh = enkiFabrik.erzeugeWanderschuh();
        AbstrakterWanderschuh umapWanderschuh = umapFabrik.erzeugeWanderschuh();

        System.out.println("erwatetes Ergebnis: DD WS " + didadasWanderschuh.getTyp() +" erwatetes Ergebnis: Enki WS "+ enkiWanderschuh.getTyp() +" erwatetes Ergebnis: Umap WS "+ umapWanderschuh.getTyp());

    }
}
