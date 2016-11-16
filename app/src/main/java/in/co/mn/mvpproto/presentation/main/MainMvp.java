package in.co.mn.mvpproto.presentation.main;

public interface MainMvp {
    interface Presenter {
        void action();
    }

    interface View {
        void toast(String message);
    }
}
