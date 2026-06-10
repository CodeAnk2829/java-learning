package lld.factorymethod.buttoncomponent.factory;

import lld.factorymethod.buttoncomponent.buttons.*;

public class WindowsDialog extends Dialog {
    protected IButton createButton() {
        return new WindowsButton();
    }
}
