package com.marxam.buck;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class GeoActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geo);

        SupportMapFragment mapFragment =
                (SupportMapFragment) getSupportFragmentManager()
                        .findFragmentById(R.id.mapaGoogle);

        if (mapFragment != null) {
            mapFragment.getMapAsync(this);
        }

        BarraNavegacionHelper.setup(this, R.id.bmTienda);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Coordenadas fijas (ejemplo: Bogotá)
        LatLng pos = new LatLng(4.6097, -74.0817);

        mMap.addMarker(new MarkerOptions().position(pos).title("Mi ubicación fija"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(pos, 15));
    }
}
