/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Classes.Article;
import DataStructures.HashTable;
import javax.swing.JOptionPane;

/**
 *
 * @author isaac
 */
public class GlobalUI {

    private static final MainPage mainPage = new MainPage();
    private static final HashTable articleHT = new HashTable();

    /**
     * Opens proyect MainPage
     */
    public static void openMainPage() {
        getMainPage().setVisible(true);
    }

    /**
     * Getter for Article HashTable
     *
     * @return articleHT
     */
    public static HashTable getArticleHT() {
        return articleHT;
    }

    /**
     * Getter for MainPage
     *
     * @return mainPage
     */
    public static MainPage getMainPage() {
        return mainPage;
    }

    /**
     * Adds given article to HT, validates and informs
     * if the article was already in DB
     * 
     * @param article
     */
    public static void addArticleToHT(Article article) {
        if (getArticleHT().addArticle(article)) {
            JOptionPane.showMessageDialog(null, "El artículo: '" +article.getTitle()+"' fue cargado con éxito!", "Proceso éxitoso", 1);
        } else {
            JOptionPane.showMessageDialog(null, "El artículo: '" +article.getTitle()+"' ya existe en la base de datos", "Advertencia", 0);
        }

    }

}
