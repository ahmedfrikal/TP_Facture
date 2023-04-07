package org.example.Ehei.gi4.tp;

public class TvaMaService extends TvaFixService implements TvaService{
    @Override
    public float getTaux() {
        return 0.2f;
    }

    @Override
    public float CalculerTva(float montantht) {
        return super.CalculerTva(montantht);
    }
}
