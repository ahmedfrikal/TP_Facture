package org.example.Ehei.gi4.tp;

public class TvaFrService extends TvaFixService implements TvaService {
    @Override
    public float getTaux() {
        return 0.6f;
    }

    @Override
    public float CalculerTva(float montantht) {
        return super.CalculerTva(montantht);
    }
}
