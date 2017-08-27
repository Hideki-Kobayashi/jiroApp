package com.lifeistech.android.jiro_machijikan;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class KabukityoActivity extends AppCompatActivity {
    EditText mNinzuEditText;
    Button mButtonGo;
    TextView mNinzuTextView;


    DatabaseReference mRootRef = FirebaseDatabase.getInstance().getReference();
    DatabaseReference mMachininzuRef = mRootRef.child("待ち人数は");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mita);

        mNinzuEditText = (EditText) findViewById(R.id.ninzuEditText);
        mButtonGo = (Button) findViewById(R.id.buttonGo);
        mNinzuTextView = (TextView) findViewById(R.id.machininzuTextView);
    }
    public void star(View v){
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);

    }
    public void camera (View v){
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivity(intent);
    }
    public void twitter(View v){
        String url = "https://twitter.com/share?";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();

        mMachininzuRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String text = dataSnapshot.getValue(String.class);
                mNinzuTextView.setText(text);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        mButtonGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mNinzuText = mNinzuEditText.getText().toString();
                mMachininzuRef.setValue(mNinzuText + "人");
            }
        });


    }
}
