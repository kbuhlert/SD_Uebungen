package Strategy__CarCharging_Klausur19;

public interface PricingStrategy {
    public double berchnePreis(CarCharging cc);

    //das Interface dient als Vorlage für die Implementation der unterschiechen Verhaltensmuster
    // (hier der auf unterschiedliche Arten berechnete Preis)
    //somit lassen sich Verhaltensmuster einfach abändern oder durch neue
    // Ergänzen und nur von den passenden Objekten aufrufen.
}
