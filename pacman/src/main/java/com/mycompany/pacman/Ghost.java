/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pacman;

/**
 *
 * @author giovanna.palmeida1
 */
public class Ghost extends GameObject{
    public int direction;

    public Ghost(int direction, int x, int y) {
        super(x, y);
         if (direction < 0) {
            throw new RuntimeException("Direção inválida");
        }
        this.direction = direction;
    }

    public Ghost() {
    }
    
      public void move() {
         int max = 3;
         int min = 0;
         int range = max - min +1;
         
         int rand = (int) (Math.random() * range) + min;
        System.out.println(rand);
        
        if(rand == 0){
        this.setDirection (0);
        }
        
        if(rand == 1){
        this.setDirection (90);
        }
        
        if(rand == 2){
        this.setDirection (180);
        }
        
        if(rand == 3){
        this.setDirection (270);
        }
        
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
    
    
    public int getDirection() {
        return direction;
    }
       public void setDirection(int direction) {
            if (direction < 0) {
            throw new RuntimeException("Direção inválida");
        }
        this.direction = direction;
    }

}
