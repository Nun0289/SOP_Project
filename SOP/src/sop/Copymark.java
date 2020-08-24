/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sop;

/**
 *
 * @author acer
 */
public class Copymark extends XOmark{
    public XOmark copy(char shape){
        Copymark cloneXO = new Copymark();
        cloneXO.setShape(shape);
        return cloneXO;
    }
}
