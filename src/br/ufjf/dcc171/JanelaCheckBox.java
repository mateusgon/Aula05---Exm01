package br.ufjf.dcc171;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.plaf.FontUIResource;

class JanelaCheckBox extends JFrame {
    
    private final JTextField texto = new JTextField(20);
    private final JCheckBox chkNegrito = new JCheckBox("Negrito");
    private final JCheckBox chkItalico = new JCheckBox("Itálico");
    
    
    public JanelaCheckBox() throws HeadlessException {
        super ("Checkbox");
        setLayout(new FlowLayout(FlowLayout.LEFT));
        texto.setText("Universidade Federal de Juiz de Fora");
        texto.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
        
        add(texto);
        add(chkNegrito);
        add(chkItalico);
        
        TrocaFonte trocaFonte = new TrocaFonte();
        chkNegrito.addItemListener(trocaFonte);
        chkItalico.addItemListener(trocaFonte);
    }

    private class TrocaFonte implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            Font font = null;
            if (chkNegrito.isSelected() && chkItalico.isSelected())
            {
                font = new Font (Font.SERIF, Font.BOLD+Font.ITALIC, 14);
            }
                else if (chkItalico.isSelected())
                {
                    font = new Font(Font.SERIF, Font.ITALIC, 14);
                }
                else if (chkNegrito.isSelected())
                {
                    font = new Font(Font.SERIF, Font.BOLD, 14);
                }
                else
                {
                    font = new Font(Font.SERIF, Font.PLAIN, 14);
                }
            texto.setFont(font);
                
        }
    }
    
}
