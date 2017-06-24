package in.marino.myapplication;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng orissa = new LatLng(20.2223696,85.7340381);
        mMap.addMarker(new MarkerOptions().position(orissa).title("Resouces in Orissa"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(orissa));

        LatLng cvraman = new LatLng(20.371213,85.5180873);
        mMap.addMarker(new MarkerOptions().position(cvraman).title("Resouces in Orissa"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(cvraman));

        LatLng sundarban = new LatLng(21.949727,89.183330);
        mMap.addMarker(new MarkerOptions().position(sundarban).title("Resouces in Orissa"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sundarban));

        LatLng lakshdeep = new LatLng(8.295414,73.048982);
        mMap.addMarker(new MarkerOptions().position(lakshdeep).title("Resouces in Orissa"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(lakshdeep));

        LatLng asd = new LatLng(8.294200,73.027368);
        mMap.addMarker(new MarkerOptions().position(asd).title("Resouces in Orissa"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(asd));
    }
}
