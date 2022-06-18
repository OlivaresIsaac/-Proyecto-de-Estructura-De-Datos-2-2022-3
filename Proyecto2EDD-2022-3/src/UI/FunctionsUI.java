/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import javax.swing.JFileChooser;
import main.FunctionsTXT;

/**
 *
 * @author isaac
 */
public class FunctionsUI {

    /**
     * Opens JFileChooser 
     */
    public static void openJFileChooser() {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            FunctionsTXT.readArticleTxt(fileChooser.getSelectedFile());

        }
    }

}

