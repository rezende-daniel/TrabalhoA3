package com.raven.swing;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import com.raven.component.Camp;
import com.raven.component.Descricao;
import com.raven.component.OS;
import com.raven.component.Tipo;
import com.raven.component.VL;

public class ButtonClean extends JButton {
    
    private Camp campField;
    private Descricao descricaoField;
    private OS osField;
    private Tipo tipoField;
    private VL vlField;

    private boolean over;
    private boolean isClicked; // Variável para controlar estado de clique
    private Color color;
    private Color colorOver;
    private Color colorClick;
    private int radius = 20;
    
    // Configura os campos a serem limpos
    public void setFields(Camp camp, Descricao descricao, OS os, Tipo tipo, VL vl) {
        this.campField = camp;
        this.descricaoField = descricao;
        this.osField = os;
        this.tipoField = tipo;
        this.vlField = vl;
    }

    public boolean isOver() {
        return over;
    }

    public void setOver(boolean over) {
        this.over = over;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
        setBackground(color);
    }

    public Color getColorOver() {
        return colorOver;
    }

    public void setColorOver(Color colorOver) {
        this.colorOver = colorOver;
    }

    public Color getColorClick() {
        return colorClick;
    }

    public void setColorClick(Color colorClick) {
        this.colorClick = colorClick;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public ButtonClean() {
        // Inicializa as cores padrão
        color = new Color(0, 165, 129);
        colorOver = new Color(56, 239, 125);
        colorClick = new Color(0, 0, 0); 

        setContentAreaFilled(false); // Remove fundo padrão do JButton

        // Adiciona eventos de mouse
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent me) {
                setBackground(colorOver);
                over = true;
                repaint();
            }

            @Override
            public void mouseExited(MouseEvent me) {
                setBackground(color);
                over = false;
                repaint();
            }

            @Override
            public void mousePressed(MouseEvent me) {
                setBackground(colorClick);
                isClicked = true; // Define estado como clicado
                repaint();
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                isClicked = false; // Remove estado de clique
                if (over) {
                    setBackground(colorOver);
                } else {
                    setBackground(color);
                }
                
                // Limpa os campos
                if (campField != null) campField.clear();
                if (descricaoField != null) descricaoField.clear();
                if (osField != null) osField.clear();
                if (tipoField != null) tipoField.clear();
                if (vlField != null) vlField.clear();
                
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Aplica o gradiente dependendo do estado
        GradientPaint gradient;
        if (isClicked) {
            // Gradiente ao clicar
            gradient = new GradientPaint(0, 0, Color.decode("#7f1500"), 0, getHeight(), Color.decode("#7a1400"));
        } else if (over) {
            // Gradiente ao passar o mouse
            gradient = new GradientPaint(0, 0, Color.decode("#ff5938"), 0, getHeight(), Color.decode("#d32300"));
        } else {
            // Gradiente normal
            gradient = new GradientPaint(0, 0, Color.decode("#ED213A"), 0, getHeight(), Color.decode("#93291E"));
        }

        g2.setPaint(gradient);
        g2.fillRoundRect(2, 2, getWidth() - 4, getHeight() - 4, radius, radius);

        // Desenha o conteúdo padrão (texto ou ícone)
        super.paintComponent(grphcs);
    }
}
