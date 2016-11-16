package in.co.mn.mvpproto.presentation.main;

import dagger.Module;
import dagger.Provides;
import in.co.mn.mvpproto.ActivityScope;

@Module
public class MainModule {
    private final MainMvp.View view;

    public MainModule(MainMvp.View view) {
        this.view = view;
    }

    @Provides
    @ActivityScope
    public MainMvp.View provideView() {
        return view;
    }

    @Provides
    @ActivityScope
    public MainMvp.Presenter providePresenter(MainMvp.View view) {
        return new MainActivityPresenter(view);
    }
}
