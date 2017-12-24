package i.utest;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static Intent createIntent(Context context, String username) {
        Intent intent = new Intent(context, MainActivity.class);
        intent.putExtra("user", username);
        return intent;
    }
}
