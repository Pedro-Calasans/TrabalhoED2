/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edtrab;

import static edtrab.KNN.classify;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author pedro
 */
public class Edtrab {

    /**
     * @param args the command line arguments
     */
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
     //  Path caminho = Paths.get("C:/Users/pedro/Documents/NetBeansProjects/Edtrab/src/edtrab/knn.txt");
       Scanner leitura = new Scanner(System.in);
       LinkedList<String[]> dataset = new LinkedList();
       int i = 0;
        try{
            BufferedReader br = new BufferedReader(new FileReader("C:/Users/pedro/Documents/NetBeansProjects/Edtrab/src/edtrab/knn.txt"));

        while(br.ready()){
            String linha = br.readLine();
            String teste = linha;
            if(i>=1){
                String[] a = teste.split(",");
           //   System.out.println(linha);
                dataset.add(a);
            }
            i = i + 1;
            }
        br.close();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
        for (String[] clientes : dataset) {
         for (String cliente : clientes) {
             System.out.println (cliente);
         }
     }
        String entrada;
        System.out.println("Adicione a entrada");
        entrada = leitura.nextLine();
        int k;
        leitura = new Scanner(System.in);
        System.out.println("Digite o numero de vizinhos que quer analisar");
        k = leitura.nextInt();
        String res = classify(dataset,k,entrada);
        System.out.println("Classe mais proxima");
        System.out.println(res);
       }
  
}
