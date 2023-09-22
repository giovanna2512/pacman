/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pacman;

/**
 *
 * @author giovanna.palmeida1
 */
public class Player extends GameObject {

    public int life = 5;
    public boolean invincible;
    public int direction;
    
    public Player(int direction, int x, int Y) {
        super(x, Y);
        if (direction < 0) {
            throw new RuntimeException("Direção inválida");
        
        }
        
        this.direction = direction;
    }


    public Player() {
    }
    
    

    public void move() {

        if (this.getDirection() == 270){
    this.setX(this.getX()-10);
        }
        
        if (this.getDirection() ==  90){
    this.setX(this.getX()+10);
            }
        
        if (this.getDirection() == 0){
    this.setY(this.getY()-10);
            }
        
        if (this.getDirection() ==180){
    this.setY(this.getY()+10);
            }
    }
    
    
    
    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
        if (life < 0) {
            throw new RuntimeException("Player está morto! ");
        }
    }

    public boolean isInvincible() {
        return invincible;
    }

    public void setInvincible(boolean invincible) {
        this.invincible = invincible;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

}
