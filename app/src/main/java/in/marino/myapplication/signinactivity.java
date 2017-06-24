package in.marino.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignInActivity extends AppCompatActivity
{
    private EditText m_EmailId;
    private EditText m_Password;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        Button signInButton = (Button) findViewById(R.id.sign_in_button);
        Button signUpButton = (Button) findViewById(R.id.sign_up_button);

        m_EmailId = (EditText) findViewById(R.id.email_edit_text);
        m_Password = (EditText) findViewById(R.id.password_edit_text);

        m_EmailId.setText("");
        m_Password.setText("");


        signInButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // open user account
            }
        });


        signUpButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // open sign up activity

//                Intent intent = new Intent(SignInActivity.this, SignUpActivity.class);
//                startActivity(intent);

                finish();
            }
        });
    }
}
