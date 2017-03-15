/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic.tac.toe;

import javax.swing.JOptionPane;

/**
 *
 * @author estudiantes
 */
public class Tablero {
    
    public int k;
    public int j;
    public char[][] ficha= new char[3][3];
    Grafica botones=new Grafica();
    
    public void calculartriqui(){
        if (ficha[0][0]==ficha[0][1]&&ficha[0][1]==ficha[0][2]&&'a'!=ficha[0][2]){
            JOptionPane.showMessageDialog(null,"Hay triqui!, Ganó el jugador de las"+ficha[0][0]);
            botones.limpiar();
        }
        if (ficha[1][0]==ficha[1][1]&&ficha[1][1]==ficha[1][2]&&'a'!=ficha[1][2]){
            JOptionPane.showMessageDialog(null,"Hay triqui!, Ganó el jugador de las"+ficha[0][0]);
            botones.limpiar();
        }        
        if (ficha[2][0]==ficha[2][1]&&ficha[2][1]==ficha[2][2]&&'a'!=ficha[2][2]){
            JOptionPane.showMessageDialog(null,"Hay triqui!, Ganó el jugador de las"+ficha[0][0]);
            botones.limpiar();
        }
        if (ficha[0][0]==ficha[1][0]&&ficha[0][0]==ficha[2][0]&&'a'!=ficha[0][2]){
            JOptionPane.showMessageDialog(null,"Hay triqui!, Ganó el jugador de las"+ficha[0][0]);
            botones.limpiar();
        }
        if (ficha[0][1]==ficha[1][1]&&ficha[1][1]==ficha[2][1]&&'a'!=ficha[1][2]){
            JOptionPane.showMessageDialog(null,"Hay triqui!, Ganó el jugador de las"+ficha[0][0]);
            botones.limpiar();
        }
        if (ficha[0][2]==ficha[1][2]&&ficha[0][2]==ficha[2][2]&&'a'!=ficha[2][2]){
            JOptionPane.showMessageDialog(null,"Hay triqui!, Ganó el jugador de las"+ficha[0][0]);
            botones.limpiar();
        }
        if (ficha[0][0]==ficha[1][1]&&ficha[0][0]==ficha[2][2]&&'a'!=ficha[2][2]){
            JOptionPane.showMessageDialog(null,"Hay triqui!, Ganó el jugador de las"+ficha[0][0]);
            botones.limpiar();
        }
        if (ficha[0][2]==ficha[1][1]&&ficha[2][0]==ficha[0][2]&&'a'!=ficha[0][2]){
            JOptionPane.showMessageDialog(null,"Hay triqui!, Ganó el jugador de las"+ficha[0][0]);
            botones.limpiar();
        }        
    }
    
}
