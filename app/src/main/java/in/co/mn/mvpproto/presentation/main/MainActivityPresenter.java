package in.co.mn.mvpproto.presentation.main;

import javax.inject.Inject;

public class MainActivityPresenter implements MainMvp.Presenter {
    MainMvp.View view;

    @Inject
    public MainActivityPresenter(MainMvp.View view) {
        this.view = view;
    }

    @Override
    public void action() {
        view.toast("Just a test toast");
    }
}
