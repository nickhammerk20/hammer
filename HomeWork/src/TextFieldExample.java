import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.DefaultCaret;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;

public class TextFieldExample extends JFrame {

    private static final long serialVersionUID = 1L;

    public TextFieldExample() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        JTextField tfield = new JTextField(10);
        tfield.setText("default text");
        final JTextField tfield2 = new JTextField(10);
        tfield2.setText("default text");
        tfield2.addFocusListener(new FocusListener() {

            public void focusGained(FocusEvent fe) {
                tfield2.setCaretPosition(tfield2.getDocument().getLength());
            }

            public void focusLost(FocusEvent fe) {
            }
        });
        JTextField tfield3 = new JTextField(10);
        tfield3.setText("default text");
        tfield3.setCaret(new HighlightCaret());
        panel.add(tfield);
        panel.add(tfield2);
        panel.add(tfield3);
        add(panel);
        pack();
        setVisible(true);
    }

    class HighlightCaret extends DefaultCaret {

        private final Highlighter.HighlightPainter unfocusedPainter =
                new DefaultHighlighter.DefaultHighlightPainter(new Color(230, 230, 210));
        private static final long serialVersionUID = 1L;
        private boolean isFocused;

        @Override
        protected Highlighter.HighlightPainter getSelectionPainter() {
            return isFocused ? super.getSelectionPainter() : unfocusedPainter;
        }

        @Override
        public void setSelectionVisible(boolean hasFocus) {
            if (hasFocus != isFocused) {
                isFocused = hasFocus;
                super.setSelectionVisible(false);
                super.setSelectionVisible(true);
            }
        }
    }

    public static void main(String... args) {
        SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                TextFieldExample textFieldExample = new TextFieldExample();
            }
        });
    }
}