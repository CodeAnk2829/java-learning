package lld.factorymethod.buttoncomponent.buttons;

public class HtmlButton implements IButton {
    public void render() {
        System.out.println("Rendering button from web...");
    }

    public void onClick() {
        System.out.println("onClick function called via web");
    }
}
