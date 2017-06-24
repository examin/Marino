package in.marino.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity
{
    private EditText m_EmailId;
    private EditText m_Password;
    private EditText m_ConfirmPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        m_EmailId.setText("");
        m_Password.setText("");
        m_ConfirmPassword.setText("");

        Button createUserButton = (Button) findViewById(R.id.create_user_button);
        Button signInButton = (Button) findViewById(R.id.sign_in_button);


        createUserButton.setOnClickListener(
                new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // create new user in data base
            }
        });


        signInButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // open sign in activity
                startActivity(new Intent(SignUpActivity.this, SignInActivity.class));
            }
        });

    }
}
