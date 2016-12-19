package com.gubenko.boxLayoutP;

/**
 * Created by DmitriX on 27.09.2016.
 */
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class BorderLayoutTestWindow {
    public static void main(String[] args) {
        // создаем фрейм и устанавливаем его размер.
        JFrame jf = new JFrame();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(400, 300);

        // создаем панель.
        JPanel p = new JPanel();
        jf.add(p);

        // к панели добавляем менеджер BorderLayout.
        p.setLayout(new BorderLayout());

        // к панели добавляем кнопку и устанавливаем для нее менеджер в верхнее расположение.
        p.add(new JButton("Ok"), BorderLayout.SOUTH);
        jf.setVisible(true);
    }
}