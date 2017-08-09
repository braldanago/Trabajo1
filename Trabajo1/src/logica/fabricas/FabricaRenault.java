/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.fabricas;

import logica.productos.Llantas;
import logica.productos.LlantasRenault;
import logica.productos.Motor;
import logica.productos.MotorRenault;

/**
 *
 * @author Invitado
 */
public class FabricaRenault extends FabricaAbstracta  {
    private static FabricaRenault FabricaRenault;
    private FabricaRenault() {
    }
    
    public static FabricaRenault getFabricaRenault(){
        if(FabricaRenault==null){
            FabricaRenault= new FabricaRenault();
        }
        return FabricaRenault;
    }

    @Override
    public Llantas crearLlantas() {
       return new LlantasRenault();
    }

    @Override
    public Motor crearMotor() {
        return new MotorRenault();
    }
    
    
    
}
