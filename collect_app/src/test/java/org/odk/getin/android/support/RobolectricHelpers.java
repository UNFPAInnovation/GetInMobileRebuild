package org.odk.getin.android.support;

import org.odk.getin.android.application.Collect;
import org.odk.getin.android.injection.config.AppDependencyComponent;
import org.odk.getin.android.injection.config.AppDependencyModule;
import org.odk.getin.android.injection.config.DaggerAppDependencyComponent;
import org.robolectric.RuntimeEnvironment;

public class RobolectricHelpers {

    private RobolectricHelpers() {}

    public static void overrideAppDependencyModule(AppDependencyModule appDependencyModule) {
        AppDependencyComponent testComponent = DaggerAppDependencyComponent.builder()
                .application(RuntimeEnvironment.application)
                .appDependencyModule(appDependencyModule)
                .build();
        ((Collect) RuntimeEnvironment.application).setComponent(testComponent);
    }

    public static AppDependencyComponent getApplicationComponent() {
        return ((Collect) RuntimeEnvironment.application).getComponent();
    }
}
