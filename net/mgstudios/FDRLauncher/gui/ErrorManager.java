package net.mgstudios.FDRLauncher.gui;

import net.mgstudios.FDRLauncher.gui.Frame;
import net.mgstudios.FDRLauncher.gui.component.LiteLabel;

import javax.swing.*;
import java.awt.*;

public class ErrorManager {
    private static JDialog dialog;
    public static void makeDialog(String ERROR_TEXT){
        if(dialog == null || !dialog.isShowing()){
            dialog = new JDialog(Frame.frame, "ERROR");
            LiteLabel error_label = new LiteLabel(ERROR_TEXT);
            JButton OK = new JButton("OK");
            OK.setBackground(Color.BLACK);
            OK.setForeground(Color.WHITE);
            OK.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
            error_label.setBounds(0,0,500,200);
            OK.addActionListener(e -> {
                dialog.dispose();
            });
            OK.setFocusPainted(false);
            OK.setBounds(155,175,200,30);
            error_label.setHorizontalAlignment(SwingConstants.CENTER);
            error_label.setForeground(Color.RED);
            error_label.setFont(new Font(Font.SERIF,Font.PLAIN, 30));
            dialog.setSize(525,275);
            dialog.setResizable(false);
            dialog.setLayout(null);
            dialog.getContentPane().setBackground(Color.BLACK);
            dialog.add(error_label);
            dialog.add(OK);
            dialog.setVisible(true);
            dialog.setLocationRelativeTo(null);
        }
    }
}