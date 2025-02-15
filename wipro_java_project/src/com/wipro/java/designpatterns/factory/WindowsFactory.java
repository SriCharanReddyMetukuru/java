package com.wipro.java.designpatterns.factory;

import com.wipro.java.designpatterns.buttons.Button;
import com.wipro.java.designpatterns.buttons.WindowsButton;
import com.wipro.java.designpatterns.checkboxes.Checkbox;
import com.wipro.java.designpatterns.checkboxes.WindowsCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
