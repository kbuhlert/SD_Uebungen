package Decorator_Gasthaus_PhilHau;

public abstract class Beilage {
    /*Dazu begreifen wir Beilagen als "Wrapper", als Hülle, die wir um ein Basisgericht legen. Es sind
    Objekte, die ein Gericht (beispielweise eine Basisgericht) besitzen. also eine Instanzvariabale auf
    ein solches besitzen. Soll eine Salatbeilage seinen Preis ausgeben, so fragt er zuerst sein Hüftsteak
    nach dessen Preis und addiert anschließend seinen eigenen Salatpreis hinzu.*/
    /*Der Trick, den wir nun nutzen, ist, dass unsere Beilagen vom selben Typ sind, wie die Basisgerichte:
    Gericht. Logisch: ein Basisgericht und eine Beilage zusammen sind immer noch ein Gericht.
    Beilagen erweitern somit ebenso das Interface Gericht. */
}
