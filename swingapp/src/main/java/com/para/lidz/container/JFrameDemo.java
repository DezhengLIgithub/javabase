package com.para.lidz.container;

import javax.swing.*;
import java.awt.*;

public class JFrameDemo extends JFrame {

    public void init(){
        this.setVisible(true);
        this.setSize(500, 500);
        this.setTitle("测试JFrame");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        JLabel jLabel = new JLabel("不要为小人生气");
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);

        Container container = this.getContentPane();
        container.add(jLabel);
        container.setBackground(Color.BLUE);
    }

}
