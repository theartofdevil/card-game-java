package kart_oyunu_projesi_gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Component;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ClickCounter {

    public static void main(String[] args) {

        // Create frame with specific title
        Frame frame = new Frame("Example Frame");

        // Create a component to add to the frame; in this case a text area with sample text
        final TextArea textArea = new TextArea("Click button to handle mouse clicks...");

        // Create a component to add to the frame; in this case a button
        Component button = new Button("Click Me!!");

        // Add a mouse listener to determine click counts
        button.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent evt) {

                if (evt.getClickCount() == 3) {

                    textArea.setText("Triple click");

                } else if (evt.getClickCount() == 2) {

                    textArea.setText("Double click");

                }

            }
        });

        // Add the components to the frame; by default, the frame has a border layout
        frame.add(textArea, BorderLayout.NORTH);
        frame.add(button, BorderLayout.SOUTH);

        // Show the frame
        int width = 300;
        int height = 300;
        frame.setSize(width, height);
        frame.setVisible(true);

    }

}
