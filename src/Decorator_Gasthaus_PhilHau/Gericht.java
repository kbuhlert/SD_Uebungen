package Decorator_Gasthaus_PhilHau;

public interface Gericht {
    /*Offen/Geschlossen-Prinzip (Open/Closed): Entwürfe sollten für Erweiterungen offen,
    aber für Veränderungen geschlossen sein. Gemeint ist, dass Erweiterungen (neue Verhalten etc.)
    ohne Änderungen an bestehenden Code in das System integriert werden können.
    ->Identifiziere jene Aspekte, die sich ändern und trenne sie von jenen, die konstant bleiben.*/

    public double getPreis();
    public void druckeBeschreibung();
}
