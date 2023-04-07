package org.example.Ehei.gi4.tp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class FacturationService
{
    private TvaService tvaService;
    public double Montant(float montantTTC)
    {
        return tvaService.CalculerTva(montantTTC);
    }
    public void setTvaService(TvaService tvaService)
    {
        this.tvaService=tvaService;
    }
}
