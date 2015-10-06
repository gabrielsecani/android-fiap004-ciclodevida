package br.com.fiap.rm72468.ciclodevida;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by rm72468 on 06/10/2015.
 */
public class VidaActivity extends Activity {
    protected static final String TAG = "exemplo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.
                i(TAG, getClassName() + ".onCreate() chamado: " + savedInstanceState);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.
                i(TAG, getClassName() + ".onStart() chamado.");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.
                i(TAG, getClassName() + ".onRestart() chamado.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.
                i(TAG, getClassName() + ".onResume() chamado.");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.
                i(TAG, getClassName() + ".onPause() chamado.");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.
                i(TAG, getClassName() + ".onSaveInstanceState() chamado");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.
                i(TAG, getClassName() + ".onStop() chamado.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.
                i(TAG, getClassName() + ".onDestroy() chamado.");
    }

    private String getClassName() {
        //retorna o nome da classe sem o pacote
        String s = getClass().getName();
        return s.substring(s.lastIndexOf("."));
    }
}