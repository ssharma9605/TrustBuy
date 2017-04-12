package com.example.trustbuy.trustbuy_ss;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class CreateAdActivity extends MenubarActivity {
    private ImageView selectedImage;
    private Bitmap currentImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_ad_activity);
        selectedImage = (ImageView) findViewById(R.id.ad_img);
        Button openGallery = (Button) findViewById(R.id.ad_img_browse_btn);
        openGallery.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent photoPickerIntent = new Intent(Intent.ACTION_PICK);
                photoPickerIntent.setType("image/*");
                startActivityForResult(photoPickerIntent, 1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK) {
            Uri photoUri = data.getData();
            if (photoUri != null) {
                try {
                    currentImage = MediaStore.Images.Media.getBitmap(this.getContentResolver(), photoUri);
                    selectedImage.setImageBitmap(currentImage);
                } catch (Exception e) {
                   // e.printStackTrace();
                    if (currentImage != null) {
                        currentImage.recycle();
                        currentImage = null;
                        System.gc();

                    }

                }
            }
        }
    }

    public void CancelAd(View view) {
        finish();
    }
    public void Publish(View view){
        Intent intent = new Intent(this, PostedAdscreenActivity.class);
        startActivity(intent);
    }
}
