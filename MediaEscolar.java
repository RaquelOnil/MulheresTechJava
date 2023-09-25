/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mediaescolar;

import java.util.Scanner;

/**
 *
 * @author 16128972023.1
 */
public class MediaEscolar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Double n1,n2,n3,n4,media;
        
        System.out.println("Digite a nota do 1° Bimestre:");
        n1 = sc.nextDouble();
        
        System.out.println("Digite a nota do 2° Bimestre:");
        n2 = sc.nextDouble();
        
        System.out.println("Digite a nota do 3° Bimestre:");
        n3 = sc.nextDouble();
        
        System.out.println("Digite a nota do 4° Bimestre:");
        n4 = sc.nextDouble();
        
        media = (n1+ n2 + n3 + n4)/4;
        
        if (media>=6){
            System.out.println ( "Aluno aprovado - Media = "+media);
        }
        else if (media>=3){
            System.out.println ( "Aluno recuperaçao - Media = "+media);
        }
    
        else{
            System.out.println ( "Aluno reprovado - Media = "+media);
        }
        /*
        
          
        else{
            System.out.println("Aluno Aprovado!"+media);*/
            
             }        
        
    }
    
