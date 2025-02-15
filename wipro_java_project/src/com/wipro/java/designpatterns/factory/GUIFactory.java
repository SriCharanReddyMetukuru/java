package com.wipro.java.designpatterns.factory;

import com.wipro.java.designpatterns.buttons.Button;
import com.wipro.java.designpatterns.checkboxes.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}