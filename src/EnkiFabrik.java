public class EnkiFabrik implements AbstrakteFabrik {
    public AbstrakterWanderschuh erzeugeWanderschuh(){
        return new EnkiWanderschuh();
    }
    public AbstrakterSportschuh erzeugeSportschuh(){
        return new EnkiSportschuh();
    }
    public AbstrakterStiefel erzeugeStiefel(){
        return new EnkiStiefel();
    }
}
