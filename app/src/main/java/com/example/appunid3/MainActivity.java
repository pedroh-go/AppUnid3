package com.example.appunid3;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.appunid3.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    /**
     * Variáveis PG 12 PDF
     */
    private TextView textView;
    private int count;

    private EditText editText;

    CheckBox checkBox1;
    CheckBox checkBox2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
//        textView = (TextView) findViewById(R.id.textView);
//        count = 0;
//
//        editText = (EditText) findViewById(R.id.editText);

        checkBox1 = (CheckBox) findViewById(R.id.checkBox_1);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox_2);

//        binding = ActivityMainBinding.inflate(getLayoutInflater());
//        setContentView(binding.getRoot());
//
//        setSupportActionBar(binding.toolbar);
//
//        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
//        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
//        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
//
//        binding.fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

    /**
     * Método criado Pedro - PG 10 PDF DESIGN DE APP
     * @param view
     */
    public void onClick(View view){

        //primeira parte
//        Toast toast = Toast.makeText(this, "Você pressionou o botão", Toast.LENGTH_SHORT);
//        toast.show();

        //Segunda parte
//        count = count + 1;
//        textView.setText("Você pressionou o botão: "+count);

        //Terceira Parte
        String txt = editText.getText().toString();
        Toast toast = Toast.makeText(this, "Você escreveu: "+txt, Toast.LENGTH_SHORT);
        toast.show();
    }

    /**
     * Quando o checkBox é clicado
     * @param view
     */
    public void onCheckBoxClicked(View view){
        boolean checked = ((CheckBox)view).isChecked();
        switch (view.getId()){
            case R.id.checkBox_1:
                if(checked){
                    Toast.makeText(this, "Você selecionou a primeira opção", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(this, "Você cancelou a primeira opção", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.checkBox_2:
                if(checked){
                    Toast.makeText(this, "Você selecionou a segunda opção", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(this, "Você cancelou a segunda opção", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }

    /**
     * Quando o botão de verificar for clicado
     * @param view
     */
    public void onClick2(View view){
        boolean checked_1 = checkBox1.isChecked();
        boolean checked_2 = checkBox2.isChecked();

        if(checked_1 && checked_2){
            Toast.makeText(this, "Você selecionou as duas opções", Toast.LENGTH_SHORT).show();
        }else if(checked_1){
            Toast.makeText(this, "Você selecionou apenas a primeira opção", Toast.LENGTH_SHORT).show();
        }else if(checked_2){
            Toast.makeText(this, "Você selecionou apenas a segunda opção", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Você não selecionou nenhuma opção", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }

}