/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica.fabricas;

import logica.productos.Llantas;
import logica.productos.LlantasMazda;
import logica.productos.Motor;
import logica.productos.MotorMazda;

/**
 *
 * @author Invitado
 */
public class FabricaMazda extends FabricaAbstracta  {
    private static FabricaMazda FabricaMazda;
    private FabricaMazda(){
    }
    
    public static FabricaMazda getFabricaMazda(){
        if(FabricaMazda==null){
            FabricaMazda = new FabricaMazda();
        }
        return FabricaMazda;
    }

    @Override
    public Llantas crearLlantas() {
        return new LlantasMazda();
    }

    @Override
    public Motor crearMotor() {
        return new MotorMazda();
    }
    
}
