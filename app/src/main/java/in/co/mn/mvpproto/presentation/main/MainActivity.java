package in.co.mn.mvpproto.presentation.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import javax.inject.Inject;

import in.co.mn.mvpproto.MvpProtoApplication;
import in.co.mn.mvpproto.R;

public class MainActivity extends AppCompatActivity implements MainMvp.View {

    @Inject
    MainMvp.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerMainComponent.builder()
                .appComponent(((MvpProtoApplication) getApplication()).getAppComponent())
                .mainModule(new MainModule(this))
                .build()
                .inject(this);
        presenter.action();
    }

    @Override
    public void toast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
