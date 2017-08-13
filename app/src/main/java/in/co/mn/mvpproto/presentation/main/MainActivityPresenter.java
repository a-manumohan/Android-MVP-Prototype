package in.co.mn.mvpproto.presentation.main;

import javax.inject.Inject;

class MainActivityPresenter implements MainMvp.Presenter {
    private MainMvp.View view;

    @Inject
    MainActivityPresenter(MainMvp.View view) {
        this.view = view;
    }

    @Override
    public void action() {
        view.toast("Just a test toast");
    }
}
