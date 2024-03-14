/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.rcobank.cli.project;

import com.rcobank.cli.project.UI.MenuCLI;
import com.rcobank.cli.project.config.ApplicationConfig;

/**
 *
 * @author dev_rco
 */
public class CliProject {

    public static void main(String[] args) {
        ApplicationConfig.initialize();
        
        MenuCLI menu = new MenuCLI();
        
        menu.display();
    }
}
