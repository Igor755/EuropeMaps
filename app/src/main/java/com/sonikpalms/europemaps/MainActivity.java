package com.sonikpalms.europemaps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import static com.sonikpalms.europemaps.R.id.map;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {


    //private GoogleMap map;


    // private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);


        // Get the SupportMapFragment and request notification
        // when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(map);
        mapFragment.getMapAsync(this);


        // Set a preference for minimum and maximum zoom.
        //mMap.setMinZoomPreference(6.0f);
        // mMap.setMaxZoomPreference(14.0f);


    }

    @Override
    public void onMapReady(GoogleMap map) {
        //map.addMarker(new MarkerOptions().position(new LatLng(0, 0)).title("Marker"));
        //private GoogleMap mMap;
// Create a LatLngBounds that includes Australia.


        //север восток, юго запад
        LatLngBounds Europe = new LatLngBounds(
                new LatLng(50, 10), new LatLng(50, 10));

// Set the camera to the greatest possible zoom level that includes the
// bounds
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(Europe.getCenter(), 0));
        map.setLatLngBoundsForCameraTarget(Europe);
        map.setMinZoomPreference(3.6f);
        map.setMaxZoomPreference(3.6f);
        //map.setMapType(GoogleMap.MAP_TYPE_TERRAIN);

      // map.setOnMapClickListener(OnMapClickListener );

        //final LatLng MELBOURNE = new LatLng(50, 20);
//        Marker melbourne = map.addMarker(new MarkerOptions()
        //.position(MELBOURNE)
        //              .title("Melbourne")
        //            .snippet("Population: 4,137,400"));


    }


}

