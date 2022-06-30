package lucky.loginphp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.*;
import android.util.Log;
import android.content.Context;
import android.widget.Toast;
import lucky.loginphp.databinding.ActivityMainBinding;
import android.view.View;

public class MainActivity extends AppCompatActivity {

  private ActivityMainBinding binding;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    
    super.onCreate(savedInstanceState);
    binding = ActivityMainBinding.inflate(getLayoutInflater());
    setContentView(binding.getRoot());

    String myuser = "lucky";
    String passku = "1234";

    binding.login.setOnClickListener(
        new View.OnClickListener() {
          @Override
          public void onClick(View arg0) {
            String username = binding.username.getText().toString();
            String password = binding.password.getText().toString();
            
            if ((username.isEmpty() && password.isEmpty())) {
              binding.result.setText("Username dan Password tidak boleh kosong");
            } else {
              if (username.equals(myuser) && password.equals(passku)) {
                binding.result.setText(String.format("==== Login Berhasil ====\nSelamat Datang %s",username));
              } else {
                binding.result.setText("Login Gagal, Data untuk Login Salah.");
              }
            }
          }
        });
  }
}
