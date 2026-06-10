package lld.factorymethod.client;

import lld.factorymethod.buttoncomponent.factory.Dialog;
import lld.factorymethod.buttoncomponent.factory.WebDialog;
import lld.factorymethod.buttoncomponent.factory.WindowsDialog;

public class DialogBox {
    private String dialogType;
    private Dialog dialog;

    public DialogBox(String dialogType) {
        this.dialogType = dialogType;
    }

    public void renderDialogOnButtonClick() {
        switch (dialogType) {
            case "windows":
                this.dialog = new WindowsDialog();
                this.dialog.renderDialog();
                break;
                
            case "html": 
                this.dialog = new WebDialog();
                this.dialog.renderDialog();
                break;
            
            default:
                System.out.println("Invalid dialog type");
                break;
        }
    }
}
