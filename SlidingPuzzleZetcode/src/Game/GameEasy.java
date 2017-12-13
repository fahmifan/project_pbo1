/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.awt.EventQueue;

/**
 *
 * @author fahmi-irfan
 */
public class GameEasy extends GameParent{
    
    public GameEasy(String path){
        super(3, path);
        super.hintImage.setVisible(false);
    }
    
//    public static void main(String args[]) {
//        EventQueue.invokeLater(() -> {
//            GameEasy puzzle = new GameEasy();
//            puzzle.setVisible(true);
//        });
//    }    
}
