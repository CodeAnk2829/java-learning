package lld.factorymethod.buttoncomponent.factory;

import lld.factorymethod.buttoncomponent.buttons.HtmlButton;
import lld.factorymethod.buttoncomponent.buttons.IButton;

public class WebDialog extends Dialog {
    protected IButton createButton() {
        return new HtmlButton();
    }
}
