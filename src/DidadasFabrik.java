public class DidadasFabrik implements AbstrakteFabrik {
    public AbstrakterWanderschuh erzeugeWanderschuh(){
        return new DidadasWanderschuh();
    }

    public AbstrakterSportschuh erzeugeSportschuh(){
        return new DidadasSportschuh();
    }
    public AbstrakterStiefel erzeugeStiefel(){
        return new DidadasStiefel();
    }
}
