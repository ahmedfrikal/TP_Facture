package org.example.Ehei.gi4.tp;

public class TvaESService implements TvaService {
    @Override
    public float CalculerTva(float montantht) {
        if(montantht<1000){
            return montantht;
        }
        else
        {
          return montantht+montantht*0.3f;
        }

    }
}
