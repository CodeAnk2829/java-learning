package lld.factorymethod.buttoncomponent.buttons;

public class WindowsButton implements IButton {
    public void render() {
        System.out.println("Rendering button in windows...");
    }

    public void onClick() {
        System.out.println("onClick function called from windows");
    }
}
