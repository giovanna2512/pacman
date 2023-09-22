/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pacman;

/**
 *
 * @author giovanna.palmeida1
 */
public class GameObject {

    public int x;
    public int y;
    private int screenSize;

    public GameObject(int x, int y) {

        if (x < 0 || y < 0 || screenSize < 0) {
            throw new RuntimeException("Valores de posição inválida");
        }
        this.x = x;
        this.y = y;
        this.screenSize = screenSize;
    }

    public GameObject() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        
        if (x > 0) {
            
        }this.x = x;

    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        
        if (y > 0 ) {
            
            
        }this.y = y;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

}
