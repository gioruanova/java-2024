package com.exampletest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdvancedSwingApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Aplicación Avanzada Swing");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600, 400);

            JPanel mainPanel = new JPanel(new BorderLayout());

            JPanel topPanel = new JPanel();
            JLabel headerLabel = new JLabel("Bienvenido a la Aplicación Swing");
            topPanel.add(headerLabel);
            mainPanel.add(topPanel, BorderLayout.NORTH);

            JPanel centerPanel = new JPanel();
            JTextArea textArea = new JTextArea(10, 40);
            centerPanel.add(new JScrollPane(textArea));
            mainPanel.add(centerPanel, BorderLayout.CENTER);

            JPanel bottomPanel = new JPanel();
            JButton button = new JButton("Mostrar Mensaje");
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(frame, "¡Hola, este es un mensaje de Swing!");
                }
            });
            bottomPanel.add(button);
            mainPanel.add(bottomPanel, BorderLayout.SOUTH);

            frame.add(mainPanel);

            frame.setVisible(true);
        });
    }
}
