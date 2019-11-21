import com.paveldejimas.bazine.LeidinysImpl;
import com.paveldejimas.isvestine.KnygaImpl;

public class Main {

    public static void main(String[] args) {
        LeidinysImpl [] leidiniai = new LeidinysImpl[10];
        leidiniai[0] = new LeidinysImpl("skrajutė");
        leidiniai[1] = new KnygaImpl("Karas ir taika", true, "grožinė",477);
        leidiniai[2] = new LeidinysImpl("laikraštis", true, 20);
        leidiniai[3] = new LeidinysImpl("katalogas", 30);
        leidiniai[4] = new KnygaImpl("Introduction to Java programming", "mokomoji", 1344);
        leidiniai[5] = new KnygaImpl("Nusikaltimas ir bausmė", true, "grožinė", 576);
        leidiniai[6] = new KnygaImpl("BAIMĖ. Trumpas Baltuosiuose rūmuose", "biografija", 448);
        leidiniai[7] = new LeidinysImpl("žurnalas", true, 48);
        leidiniai[8] = new LeidinysImpl("laikraštis", true, 66);
        leidiniai[9] = new KnygaImpl("Gyvulių ūkis", "grožinė", 112);

        for (LeidinysImpl leidinys : leidiniai)
            if (leidinys instanceof KnygaImpl && (((KnygaImpl) leidinys).getTipas()).equals("grožinė"))
                System.out.println(leidinys);
    }
}
