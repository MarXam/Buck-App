package com.marxam.buck;

import android.app.Activity;
import android.content.Intent;

import androidx.annotation.NonNull;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class BarraNavegacionHelper {

    public static void setup(final Activity activity, int selectedItemId) {
        BottomNavigationView bottomNav = activity.findViewById(R.id.bnBarraMenu);
        if (bottomNav == null) return;

        // Marca el ítem actual
        bottomNav.setSelectedItemId(selectedItemId);

        bottomNav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull android.view.MenuItem item) {
                int id = item.getItemId();

                if (id == R.id.bmHome && selectedItemId != R.id.bmHome) {
                    activity.startActivity(new Intent(activity, MainActivity.class));
                    activity.overridePendingTransition(0, 0);
                    return true;
                } else if (id == R.id.bmPerfil && selectedItemId != R.id.bmPerfil) {
                    activity.startActivity(new Intent(activity, PerfilActivity.class));
                    activity.overridePendingTransition(0, 0);
                    return true;
                } else if (id == R.id.bmTienda && selectedItemId != R.id.bmTienda) {
                    activity.startActivity(new Intent(activity, GeoActivity.class));
                    activity.overridePendingTransition(0, 0);
                    return true;
                }
                return false;
            }
        });
    }
}