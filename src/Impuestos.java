import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;

import java.awt.*;
import javax.swing.*;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionListener;


public class Impuestos extends JFrame implements ActionListener {


    //Inicializar Paneles
    private JPanel Panel1;
    private JPanel Panel2;
    private JPanel Panel3;

    //Inicializar Botones
    private JButton B1, B2, B3;
    private JCheckBox CH1, CH2, CH3;
    //Inicializar Labels
    private JLabel L1, L2, L3, L4;
    private JLabel L5, L6, L7;
    private JLabel L8;

    //Inicializar Text Field

    private JTextField T1, T2, T3, T4;
    private JTextField T5;


    //Referenciar paneles


    public Impuestos() {
        super("Calculo de Impuestos");

        this.setLayout(new BorderLayout());


        Panel1 = new JPanel();
        Panel2 = new JPanel();
        Panel3 = new JPanel();

        Container ContentPane = getContentPane();
        ContentPane.setLayout(new FlowLayout());

        //Pertenece Panel 1
        L1 = new JLabel("Marca: ");
        T1 = new JTextField(10);
        L2 = new JLabel("Linea");
        T2 = new JTextField(10);
        L3 = new JLabel("Modelo");
        T3 = new JTextField(10);
        L4 = new JLabel("Valor");
        T4 = new JTextField(10);

        B1 = new JButton("Buscar");

        // Pertenece Panel 2
        CH1 = new JCheckBox("Descuento",false);

        CH2 = new JCheckBox("Traslado Cuenta",false);

        CH3 = new JCheckBox("servicio publico",false);



        //Pertenece Panel 3

        L8 = new JLabel("Total a Pagar");
        T5 = new JTextField(10);
        B2 = new JButton("Limpiar");
        B3 = new JButton("Calcular");

        this.add(Panel1, BorderLayout.NORTH);
        this.add(Panel2, BorderLayout.CENTER);
        this.add(Panel3, BorderLayout.SOUTH);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);


// Panel 1 Ubicado en el norte

        Panel1.setLayout(new BoxLayout(Panel1, BoxLayout.X_AXIS));
        // L1.setBounds(10,60,100,30);
        Panel1.add(L1);
        //T1.setBounds(120,60,150,30);
        Panel1.add(T1);


        Panel1.add(L2);
        Panel1.add(T2);

        Panel1.add(L3);
        Panel1.add(T3);

        Panel1.add(L4);
        Panel1.add(T4);

        Panel1.add(B1);


// Panel 2 ubicado en el centro
        Panel2.add(CH1);


        Panel2.add(CH2);


        Panel2.add(CH3);



//Panel 3 Ubicado en el sur

        Panel3.setLayout(new BoxLayout(Panel3, BoxLayout.X_AXIS));
        Panel3.add(L8);
        Panel3.add(T5);


        Panel3.add(B2);
        Panel3.add(B3);
        B3.setLayout(new BoxLayout(B3, BoxLayout.X_AXIS));


        this.B2.addActionListener(this);
        this.B3.addActionListener(this);

        this.CH1.addActionListener(this);
        this.CH2.addActionListener(this);
        this.CH3.addActionListener(this);

        pack();
        setResizable(false);

    }

    @Override
    public void actionPerformed(ActionEvent e) {


        if (e.getSource().equals(CH1)==true) {



            JOptionPane.showMessageDialog(null, "Se Realizo el proceso");


                double n1 = Double.parseDouble(T4.getText());


                double Sum = n1*.10;
                double res= n1-Sum;

                String valorTotal = Double.toString(res);


               T5.setText(valorTotal);

            // this.T1.setText("Hola Mundo");
        }
         if(e.getSource().equals (CH2))
         {

             JOptionPane.showMessageDialog(null, "Se realizo el proceso");


             double n1 = Double.parseDouble(T4.getText());


             double Sum = n1-50000;


             String valorTotal = Double.toString(Sum);


             T5.setText(valorTotal);
         }
          if(e.getSource().equals(CH3))
          {

              JOptionPane.showMessageDialog(null, "Se realizo el proceso");


              double n1 = Double.parseDouble(T4.getText());


              double Sum = n1*.5;
              double res= n1-Sum;

              String valorTotal = Double.toString(res);


              T5.setText(valorTotal);
          }

            if (e.getSource().equals(B2)) {

                this.T1.setText("Oprimiste boton 2");
                T1.setText("");
                T2.setText("");
                T3.setText("");
                T4.setText("");
                T5.setText("");


            }



        }
    }

