package com.DavidNingthoujam.ScreenOrientationFix;

import com.google.appinventor.components.annotations.*;
import com.google.appinventor.components.annotations.androidmanifest.ActivityElement;
import com.google.appinventor.components.annotations.androidmanifest.ProviderElement;
import com.google.appinventor.components.common.ComponentCategory;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;


@DesignerComponent(
        version = 1,
        description = "",
        category = ComponentCategory.EXTENSION,
        nonVisible = true,
        iconName = "")

@SimpleObject(external = true)

//Libraries
@UsesLibraries(libraries = "")

@UsesContentProviders(providers = @ProviderElement(name = "com.DavidNingthoujam.ScreenOrientationFix.Ori", exported = "false", authorities = "%packageName%"))

public class ScreenOrientationFix extends AndroidNonvisibleComponent {

    public ScreenOrientationFix(ComponentContainer container) {
        super(container.$form());
        fixer.OriFix(container.$form());
    }

}



