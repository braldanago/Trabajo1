/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.ensamblaje;

import logica.fabricas.FabricaAbstracta;
import logica.productos.Llantas;
import logica.productos.Motor;

/**
 *
 * @author Invitado
 */
public class Ensamblador {

    public Ensamblador(FabricaAbstracta fabAbs) {
        Motor motor = fabAbs.crearMotor();
        Llantas llantas = fabAbs.crearLlantas();
        
        System.out.println(motor.operacion());
        System.out.println(llantas.operacion());
    }

}
