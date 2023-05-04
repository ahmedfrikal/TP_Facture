package org.example.Ehei.gi4.tp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FacturationService
{
@Autowired
@Qualifier("tvs")
    private TvaService tvaService;
    public double Montant(float montantTTC)
    {
        return tvaService.CalculerTva(montantTTC);
    }

    /* Le autowired qui va prendre la main
    public void setTvaService(TvaService tvaService)
    {
        this.tvaService=tvaService;
    }*/
}
