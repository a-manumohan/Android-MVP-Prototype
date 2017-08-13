package in.co.mn.mvpproto;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Component;
import in.co.mn.mvpproto.network.NetworkModule;

@Component(modules = {AppModule.class, NetworkModule.class})
@Singleton
public interface AppComponent {
    Application application();
}
