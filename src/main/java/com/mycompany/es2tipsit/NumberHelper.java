/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.es2tipsit;

/**
 *
 * @author arlin
 */
public class NumberHelper {
    
    private int number; 
    
    public NumberHelper(int n) {
        number = n;
    }

    public boolean isEven() {
        
        if(this.number%2 == 0){
        
            return true;
        }
        
        return false;
    }

    public boolean isOdd() {
        
        if(this.number%2 == 1){
        
            return true;
        }
        
        return false;
    }
    
    public int sum(int n){
        return this.number + n;
    }

    public boolean isPrime() {
        if(this.number == 0){
        
            return false;
        }
        
        if(this.number<0){
            
            this.number = this.number * (-1);
            
        }
        
        for(int i=this.number-1; i>1; i--){

            if(this.number%i == 0){

                return false;
            }
        }
        
        return true;
    }

    public boolean isDivisibleBy(int n) {
        
        if(n == 0){
        
            return false;
        }
        
        if(this.number%n == 0){
        
            return true;
        }
        
        return false;
    }
}
