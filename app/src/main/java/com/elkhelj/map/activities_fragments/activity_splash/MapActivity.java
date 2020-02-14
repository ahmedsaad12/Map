package com.elkhelj.map.activities_fragments.activity_splash;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.os.Bundle;

import com.elkhelj.map.R;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.elkhelj.map.databinding.ActivityMapBinding;
import com.elkhelj.map.language.LanguageHelper;
import com.elkhelj.map.models.Catogries_Model;
import com.mapbox.mapboxsdk.Mapbox;
import com.mapbox.mapboxsdk.annotations.Marker;
import com.mapbox.mapboxsdk.annotations.MarkerOptions;
import com.mapbox.mapboxsdk.camera.CameraPosition;
import com.mapbox.mapboxsdk.camera.CameraUpdateFactory;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.maps.MapView;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.OnMapReadyCallback;
import com.mapbox.mapboxsdk.maps.Style;

import io.paperdb.Paper;

public class MapActivity extends AppCompatActivity {
private Catogries_Model catogries_model;
private ActivityMapBinding binding;
@Override
    protected void attachBaseContext(Context newBase) {
        Paper.init(newBase);
        super.attachBaseContext(LanguageHelper.updateResources(newBase,"ar"));

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Paper.init(this);
        Mapbox.getInstance(this, "pk.eyJ1IjoiYWhtZWQxMjM0NTYiLCJhIjoiY2s2bW03ZjZ5MHA2dzNycnJjMTdtbWpwaiJ9.maG2lPboBx_1oSkzdhIylQ");
        binding = DataBindingUtil.setContentView(this, R.layout.activity_map);

        if(getIntent().getSerializableExtra("data")!=null){
            catogries_model= (Catogries_Model) getIntent().getSerializableExtra("data");
        }
if(catogries_model!=null){
    binding.setAdmodel(catogries_model);
}
       binding.mapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(@NonNull final MapboxMap mapboxMap) {
                mapboxMap.setStyle(Style.SATELLITE, new Style.OnStyleLoaded() {
                    @Override
                    public void onStyleLoaded(@NonNull Style style) {

// Map is set up and the style has loaded. Now you can add data or make other map adjustments.

if(catogries_model!=null){
                        mapboxMap.addMarker(new MarkerOptions()
                                .position(new LatLng(catogries_model.getLat(), catogries_model.getLng()))
                                .title("الاسم").setSnippet(catogries_model.getName())

                                );
    CameraPosition position = new CameraPosition.Builder()
            .target(new LatLng(catogries_model.getLat(), catogries_model.getLng())) // Sets the new camera position
            .zoom(10) // Sets the zoom// Rotate the camera
            .build(); // Creates a CameraPosition from the builder
    mapboxMap.animateCamera(CameraUpdateFactory
            .newCameraPosition(position), 1000);}




                    }
                });
            }
        });


    }

    @Override
    public void onStart() {
        super.onStart();
        binding.mapView.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
        binding.mapView.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
       binding.mapView.onPause();
    }

    @Override
    public void onStop() {
        super.onStop();
        binding.mapView.onStop();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        binding.mapView.onLowMemory();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        binding. mapView.onDestroy();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        binding. mapView.onSaveInstanceState(outState);
    }
}
