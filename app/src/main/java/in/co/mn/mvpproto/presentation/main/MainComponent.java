package in.co.mn.mvpproto.presentation.main;

import dagger.Component;
import in.co.mn.mvpproto.ActivityScope;
import in.co.mn.mvpproto.AppComponent;

@Component(dependencies = AppComponent.class, modules = MainModule.class)
@ActivityScope
public interface MainComponent {
    void inject(MainActivity activity);
}
