package org.example.Ehei.gi4.tp;

public abstract class TvaFixService implements TvaService {
    public abstract float getTaux();
    @Override
    public float CalculerTva(float montantht) {
        return montantht+montantht*getTaux();
    }
}
