/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JFileChooser;
import javax.swing.JScrollPane;
import java.awt.event.*;
import java.util.Formatter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Examen4 extends JFrame {

    public JButton btnLeer = new JButton("LEER");
    public JButton btnEscribir = new JButton("Escribir");
    public JButton btnLimpiar = new JButton("LIMPIAR");
    public JFrame frame = new JFrame();
    public JTextArea txtArea = new JTextArea();
    public JFileChooser file = new JFileChooser();
    public JScrollPane scrollPane = new JScrollPane();
    public JFileChooser fileChoose = new JFileChooser();
    Formatter format;
    Scanner in = new Scanner(System.in);

    public Examen4() {
        mostrar();

        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtArea.setText("");
            }
        });
        btnEscribir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (fileChoose.showOpenDialog(frame) == JFileChooser.APPROVE_OPTION) {
                    openFileToRead();
                    

                }
            }
        });
        btnLeer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fileChoose.setFileSelectionMode(JFileChooser.FILES_ONLY);

                if (fileChoose.showOpenDialog(frame) == JFileChooser.APPROVE_OPTION) {
                    openFileToRead();
                    read();
                }
            }
        });

    }

    public void mostrar() {
        generarUI();
        this.setVisible(true);
        this.setPreferredSize(new Dimension(400, 400));
        this.pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);

    }

    public void generarUI() {
        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        this.add(btnEscribir, gbc);
        gbc.gridx = 2;
        gbc.gridy = 1;
        this.add(btnLeer, gbc);
        gbc.gridx = 3;
        gbc.gridy = 1;
        this.add(btnLimpiar, gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 3;
        txtArea.setColumns(30);
        txtArea.setRows(10);
        scrollPane.setViewportView(txtArea);
        txtArea.setPreferredSize(new Dimension(200, 200));
        this.add(txtArea, gbc);

    }

    public void openFileToRead() {
        try {
            in = new Scanner(fileChoose.getSelectedFile().toPath());
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void suma() {
        double numero1, numero2, suma;

        try {
            
            numero1 = in.nextDouble();
            numero2 = in.nextDouble();
            suma = numero1 + numero2;
            System.out.println(numero1);
            System.out.println(numero2);
            System.out.println(suma);
            txtArea.setText(String.format("%.2d + %.2d = %.2d", numero1, numero2,
                    suma));
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
    public void convertir(){
        
    }
    
    void read() {
        StringBuilder strBuilder = new StringBuilder();
        String suma = "+";
        try {
            while (in.hasNext()) {
                strBuilder.append(in.nextLine());
                
                if(in.hasNext()){
                    strBuilder.append(in.nextLine());
                    System.out.println("suma");
                }else{
                    System.out.println("nada");
                }
            }
        } catch(Exception ex) {
            System.out.println(ex);
        }
        
        txtArea.setText(strBuilder.toString());
    }

    public static void main(String[] args) {
        Examen4 ex = new Examen4();
    }

}
