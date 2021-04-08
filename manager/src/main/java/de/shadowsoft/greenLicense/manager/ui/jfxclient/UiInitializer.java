package de.shadowsoft.greenLicense.manager.ui.jfxclient;

import de.shadowsoft.greenLicense.manager.ui.jfxclient.controller.MainViewController;
import de.shadowsoft.greenLicense.manager.ui.jfxclient.jfx.initializer.MainViewInitializer;
import javafx.application.Application;
import javafx.stage.Stage;

public class UiInitializer extends Application {

    @Override
    public void start(final Stage stage) throws Exception {
        new MainViewInitializer(new MainViewController()).show();
    }
}
    
    