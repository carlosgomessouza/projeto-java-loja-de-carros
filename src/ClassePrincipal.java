
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ETECIA
 */
public class ClassePrincipal {
    
    public static void main(String [] args) {
        
        Carro carro = new Carro();
        
        Scanner scan = new Scanner(System.in);
     
        System.out.print("Nome do carro:");
        carro.nome = scan.next();
         
        System.out.print("Comprimento do carro:");
        carro.comprimento = scan.next();
        
        System.out.print("Numero de janelas do carro:");
        carro.janela = scan.next();
 
        System.out.print("Fabricação do carro:");
        carro.fabricacao = scan.next();
        
        System.out.print("cor do carro:" );
        carro.cor = scan.next();
        
        System.out.print("peso do carro :");
        carro.peso = scan.next();
        
        
        
        System.out.println("Nome do carro:" + carro.nome);
        
        System.out.println("Comprimento do carro:" + carro.comprimento);
        
        System.out.println("Numero de janelas do carro:" + carro.janela);
        
        System.out.println("Fabricação do carro:" + carro.fabricacao);
        
        System.out.println("cor do carro:" + carro.cor);
        
        System.out.println("peso do carro :" + carro.peso);
       
    }
    
}
