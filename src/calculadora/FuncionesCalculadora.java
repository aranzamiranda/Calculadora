/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author chiky
 */
public class FuncionesCalculadora {
    private double num1;
    private double num2; 
    private double result;
    
    
    public FuncionesCalculadora(){
        this.num1 = 0;
        this.num2 = 0;
        this.result = 0;
    }

    public double getNum1() {
        return this.num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return this.num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getResult() {
        return this.result;
    }

    public void setResult(double result) {
        this.result = result;
    }
     public double suma(){
       result = num1+num2;
       return result;   
   }
   public double resta(){
       result = num1-num2;
       return result;
   }
   public double multi(){
       result = num1*num2;
       return result;
   }
   public double division(){
       result = num1/num2;
       return result;
   }
}
