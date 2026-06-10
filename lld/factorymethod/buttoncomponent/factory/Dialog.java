package lld.factorymethod.buttoncomponent.factory;

import lld.factorymethod.buttoncomponent.buttons.IButton;
abstract public class Dialog {
    protected abstract IButton createButton();
    
    public void renderDialog() {
        IButton button = this.createButton();
        button.render();
        button.onClick();
    }
}