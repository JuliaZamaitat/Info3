public class UmapFabrik implements AbstrakteFabrik  {
    public AbstrakterWanderschuh erzeugeWanderschuh(){
        return new UmapWanderschuh();
    }

    public AbstrakterSportschuh erzeugeSportschuh(){
       return new UmapSportschuh();
    }
    public AbstrakterStiefel erzeugeStiefel(){
      return new UmapStiefel();
    }
}
