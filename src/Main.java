import com.paveldejimas.bazine.LeidinysImpl;
import com.paveldejimas.isvestine.KnygaImpl;

public class Main {

    public static void main(String[] args) {
        LeidinysImpl [] leidiniai = new LeidinysImpl[10];
        leidiniai[0] = new LeidinysImpl("skrajutė");
        leidiniai[1] = new KnygaImpl("Karas ir taika", true, "grožinė",1225);
        leidiniai[2] = new LeidinysImpl("laikraštis", true, 20);
        leidiniai[3] = new LeidinysImpl("katalogas", 30);
        leidiniai[4] = new KnygaImpl("Introduction to Java programming", "mokomoji", 1345);
    }
}
