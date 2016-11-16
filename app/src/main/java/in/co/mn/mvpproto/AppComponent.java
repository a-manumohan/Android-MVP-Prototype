package in.co.mn.mvpproto;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = AppModule.class)
@Singleton
public interface AppComponent {
    Application application();
}
