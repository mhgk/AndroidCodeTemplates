package ${PACKAGE_NAME};
import android.databinding.DataBindingUtil;
import android.app.Activity;
import android.os.Bundle;
import dk.fcm.fcmapp.databinding.${BINDING_NAME};
#parse("File Header.java")
public class ${NAME} extends AppCompatActivity {
      private  ${BINDING_NAME} binding;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =  DataBindingUtil.setContentView(this, R.layout.${LAYOUT_NAME});
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}