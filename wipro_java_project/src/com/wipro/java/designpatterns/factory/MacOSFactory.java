package com.wipro.java.designpatterns.factory;

import com.wipro.java.designpatterns.buttons.Button;
import com.wipro.java.designpatterns.buttons.MacOSButton;
import com.wipro.java.designpatterns.checkboxes.Checkbox;
import com.wipro.java.designpatterns.checkboxes.MacOSCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
