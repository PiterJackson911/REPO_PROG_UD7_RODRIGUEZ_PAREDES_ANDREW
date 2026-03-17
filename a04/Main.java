package a04;
public class Main {
public class Main {

    public static void main(String[] args) {

        Guitarra g = new Guitarra("Claude", 7);
        g.add(Nota.DO);
        g.add(Nota.RE);
        g.add(Nota.MI);
        g.add(Nota.SOL);

        Piano p = new Piano(false, 7);
        p.add(Nota.LA);
        p.add(Nota.SI);
        p.add(Nota.DO);
        p.add(Nota.FA);
        p.add(Nota.SOL);

        Instrumento[] concierto = { g, p };

        for (Instrumento inst : concierto) {
            inst.interpretar();
        }
    }
}