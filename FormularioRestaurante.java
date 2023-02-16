/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulariorestaurante;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author aluno
 */
public class FormularioRestaurante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JRadioButton Sim, Nao;

        JFrame janela = new JFrame("Pedido de Restaurante");
        janela.setBounds(50, 100, 400, 150);

        JPanel miJPanel = new JPanel();
        miJPanel.setSize(300, 300);

        miJPanel.setLayout(new FlowLayout());

        JLabel nomeCliente = new JLabel();
        nomeCliente.setText("Nome do cliente: ");


        JLabel pedido = new JLabel();
        pedido.setText("Digite o pedido: ");

        JLabel numeroDaMesa = new JLabel();
        numeroDaMesa.setText("Informe o numero da mesa: ");

        JLabel avaliacaoCliente = new JLabel();
        avaliacaoCliente.setText("Gostou da comida? ");


        JTextField campoDeTexto1NomeCliente = new JTextField(null, 10);
        JTextField campoDeTexto2Pedido = new JTextField(null, 10);
        JTextField campoDeTexto3NumeroMesa = new JTextField(null, 5);


        miJPanel.add(nomeCliente);
        miJPanel.add(campoDeTexto1NomeCliente);

        miJPanel.add(pedido);
        miJPanel.add(campoDeTexto2Pedido);

        miJPanel.add(numeroDaMesa);
        miJPanel.add(campoDeTexto3NumeroMesa);

        miJPanel.add(avaliacaoCliente);

        janela.add(miJPanel);
        janela.setVisible(true);

        FlowLayout flow = new FlowLayout();
        Container caixa = janela.getContentPane();
        caixa.setLayout(flow);

        Sim = new JRadioButton("Sim");
        Nao = new JRadioButton("Não");

        caixa.add(Sim);
        caixa.add(Nao);
        janela.setVisible(true);
    }
    
}
