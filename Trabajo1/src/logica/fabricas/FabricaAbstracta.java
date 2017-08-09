/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.fabricas;

import logica.productos.Llantas;
import logica.productos.Motor;

/**
 *
 * @author Invitado
 */
public abstract class FabricaAbstracta {
    public abstract Llantas crearLlantas();
    public abstract Motor crearMotor();
    
}
