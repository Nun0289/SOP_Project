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
public class Singleton_gameboard {
    private static final char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
        {'-', '+', '-', '+', '-'},
        {' ', '|', ' ', '|', ' '},
        {'-', '+', '-', '+', '-'},
        {' ', '|', ' ', '|', ' '}
        };
    private Singleton_gameboard(){
        
    }
    public static char[][] getInstance(){
        return gameBoard;
    }
}
