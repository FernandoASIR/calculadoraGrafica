import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculadora extends JFrame implements ActionListener {
    private JButton n0, n1, n2, n3, n4, n5, n6, n7, n8, n9, bMas, bMenos, bMult, bDiv, bIgual, bC, bComa;

    private JTextField pantalla;
    private JLabel primerNumero;
    private JLabel segundoNumero;
    private JPanel panel;
    private double num1, num2, resultado;
    private int operacion;

    public Calculadora() {
        pantalla = new JTextField(20);
        pantalla.setEditable(false);
        primerNumero = new JLabel("");
        segundoNumero = new JLabel("");
        //Numeros
        n0 = new JButton("0");
        n1 = new JButton("1");
        n2 = new JButton("2");
        n3 = new JButton("3");
        n4 = new JButton("4");
        n5 = new JButton("5");
        n6 = new JButton("6");
        n7 = new JButton("7");
        n8 = new JButton("8");
        n9 = new JButton("9");

        //operaciones
        bMas = new JButton("+");
        bMenos = new JButton("-");
        bMult = new JButton("*");
        bDiv = new JButton("/");
        bIgual = new JButton("=");
        bC = new JButton("C");
        bComa = new JButton(",");


        n0.addActionListener(this);
        n1.addActionListener(this);
        n2.addActionListener(this);
        n3.addActionListener(this);
        n4.addActionListener(this);
        n5.addActionListener(this);
        n6.addActionListener(this);
        n7.addActionListener(this);
        n8.addActionListener(this);
        n9.addActionListener(this);

        bMas.addActionListener(this);
        bMenos.addActionListener(this);
        bMult.addActionListener(this);
        bDiv.addActionListener(this);
        bIgual.addActionListener(this);
        bC.addActionListener(this);


        panel = new JPanel(new GridLayout(4, 4));


        panel.add(n7);
        panel.add(n8);
        panel.add(n9);
        panel.add(bMas);

        panel.add(n4);
        panel.add(n5);
        panel.add(n6);
        panel.add(bMenos);

        panel.add(n1);
        panel.add(n2);
        panel.add(n3);
        panel.add(bMult);

        panel.add(bC);
        panel.add(n0);
        panel.add(bIgual);
        panel.add(bDiv);

        add(pantalla, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);


        setTitle("Calculadora Grafica");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true);
    }



    @Override
    public void actionPerformed(ActionEvent e) {

            if (e.getSource() == n0) {
                pantalla.setText(pantalla.getText() + "0");
            } else if (e.getSource() == n1) {
                pantalla.setText(pantalla.getText() + "1");
            } else if (e.getSource() == n2) {
                pantalla.setText(pantalla.getText() + "2");
            } else if (e.getSource() == n3) {
                pantalla.setText(pantalla.getText() + "3");
            } else if (e.getSource() == n4) {
                pantalla.setText(pantalla.getText() + "4");
            } else if (e.getSource() == n5) {
                pantalla.setText(pantalla.getText() + "5");
            } else if (e.getSource() == n6) {
                pantalla.setText(pantalla.getText() + "6");
            } else if (e.getSource() == n7) {
                pantalla.setText(pantalla.getText() + "7");
            } else if (e.getSource() == n8) {
                pantalla.setText(pantalla.getText() + "8");
            } else if (e.getSource() == n9) {
                pantalla.setText(pantalla.getText() + "9");
            } else if (e.getSource() == bMas) {
                num1 = Double.parseDouble(pantalla.getText());
                operacion = 1;
                pantalla.setText("");


            } else if (e.getSource() == bMenos) {
                num1 = Double.parseDouble(pantalla.getText());
                operacion = 2;

                pantalla.setText("");
            } else if (e.getSource() == bMult) {
                num1 = Double.parseDouble(pantalla.getText());
                operacion = 3;

                pantalla.setText("");
            } else if (e.getSource() == bDiv) {
                num1 = Double.parseDouble(pantalla.getText());
                operacion = 4;

                pantalla.setText("");
            } else if (e.getSource() == bIgual) {
                num2 = Double.parseDouble(pantalla.getText());

              double resultado=operaciones(num1,num2,operacion);
                pantalla.setText("" + resultado);
            } else if (e.getSource() == bC) {
                pantalla.setText("");

            }
        }
    private double operaciones(double num1, double num2, int operacion){
        double resultado = 0;
      switch (operacion){
          case 1:
              resultado=num1+num2;
              break;
          case 2:
              resultado=num1-num2;
              break;
          case 3:
              resultado=num1*num2;
              break;
          case 4:
              resultado=num1/num2;
              break;
      }
      return resultado;
    }
}
