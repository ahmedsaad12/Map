package com.elkhelj.map.activities_fragments.activity_splash.activity_my_order_detials;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;


import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.elkhelj.map.R;
import com.elkhelj.map.activities_fragments.activity_splash.MapActivity;
import com.elkhelj.map.adapters.Catogry_Adapter;
import com.elkhelj.map.databinding.ActivityDetialsBinding;
import com.elkhelj.map.interfaces.Listeners;
import com.elkhelj.map.language.LanguageHelper;
import com.elkhelj.map.models.Catogries_Model;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.prefs.Preferences;

import io.paperdb.Paper;


public class OrderDetialsActivity extends AppCompatActivity implements Listeners.BackListener {
    private ActivityDetialsBinding binding;
private Catogry_Adapter catogry_adapter;
    private Preferences preferences;
   private List<Catogries_Model> catogries_modelList;

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
        binding = DataBindingUtil.setContentView(this, R.layout.activity_detials);
        initView();



    }



    @SuppressLint("RestrictedApi")
    private void initView() {
        catogries_modelList=new ArrayList<>();
        catogry_adapter=new Catogry_Adapter(catogries_modelList,this);
        binding.recview.setLayoutManager(new LinearLayoutManager(this));
        binding.recview.setAdapter(catogry_adapter);
        setdata();
    }

    private void setdata() {
        Catogries_Model catogries_model1=new Catogries_Model();
        catogries_model1.setName("الدمام");
catogries_model1.setSize("1942982548.48");
catogries_model1.setNeighborhoods("79");
catogries_model1.setPeople2010("918154");
catogries_model1.setPeople2019("1152005");
catogries_model1.setLat(26.414896);
catogries_model1.setLng(50.065940);
        Catogries_Model catogries_model2=new Catogries_Model();
        catogries_model2.setName("الخبر و الظهران");
        catogries_model2.setSize("729352054.719");
        catogries_model2.setNeighborhoods("57");
        catogries_model2.setPeople2010("587965");
        catogries_model2.setPeople2019("741886");
        catogries_model2.setLat(26.216977);
        catogries_model2.setLng(50.197656);
        Catogries_Model catogries_model3=new Catogries_Model();
        catogries_model3.setName("القطيف");
        catogries_model3.setSize("481937256.29");
        catogries_model3.setNeighborhoods("130");
        catogries_model3.setPeople2010("531965");
        catogries_model3.setPeople2019("648438");
        catogries_model3.setLat(26.571473);
        catogries_model3.setLng(49.998461);
        Catogries_Model catogries_model4=new Catogries_Model();
        catogries_model4.setName("الجبيل ");
        catogries_model4.setSize("6481886970.52");
        catogries_model4.setNeighborhoods("23");
        catogries_model4.setPeople2010("385289");
        catogries_model4.setPeople2019("490166");
        catogries_model4.setLat(27.003345);
        catogries_model4.setLng(49.649553);
        Catogries_Model catogries_model5=new Catogries_Model();
        catogries_model5.setName("راس تنورة");
        catogries_model5.setSize("305857879.895");
        catogries_model5.setNeighborhoods("10");
        catogries_model5.setPeople2010("61736");
        catogries_model5.setPeople2019("77677");
        catogries_model5.setLat(26.793633);
        catogries_model5.setLng(49.992994);
        Catogries_Model catogries_model6=new Catogries_Model();
        catogries_model6.setName("الخفجي");
        catogries_model6.setSize("8622889851.58");
        catogries_model6.setNeighborhoods("32");
        catogries_model6.setPeople2010("77461");
        catogries_model6.setPeople2019("95837");
        catogries_model6.setLat(28.414161);
        catogries_model6.setLng(48.486720);
        Catogries_Model catogries_model7=new Catogries_Model();
        catogries_model7.setName("النعيرية");
        catogries_model7.setSize("120877300399.9");
        catogries_model7.setNeighborhoods("10");
        catogries_model7.setPeople2010("53138");
        catogries_model7.setPeople2019("65366");
        catogries_model7.setLat(27.475375
        );
        catogries_model7.setLng(48.486851);
        Catogries_Model catogries_model8=new Catogries_Model();
        catogries_model8.setName("القرية العليا");
        catogries_model8.setSize("20452258503.2999");
        catogries_model8.setNeighborhoods("10");
        catogries_model8.setPeople2010("25018");
        catogries_model8.setPeople2019("31023");
        catogries_model8.setLat(227.558666
        );
        catogries_model8.setLng(47.706270);
        Catogries_Model catogries_model9=new Catogries_Model();
        catogries_model9.setName("بقيق");
        catogries_model9.setSize("6661983827.47");
        catogries_model9.setNeighborhoods("14");
        catogries_model9.setPeople2010("54273");
        catogries_model9.setPeople2019("67178");
        catogries_model9.setLat(25.940966
        );
        catogries_model9.setLng(49.665094);
//        Catogries_Model catogries_model2=new Catogries_Model();
//        catogries_model2.setName("الخبر و الظهران");
//        catogries_model2.setSize("729352054.719");
//        catogries_model2.setNeighborhoods("57");
//        catogries_model2.setPeople2010("587965");
//        catogries_model2.setPeople2019("741886");
        catogries_modelList.add(catogries_model1);
        catogries_modelList.add(catogries_model2);
        catogries_modelList.add(catogries_model3);
        catogries_modelList.add(catogries_model4);
        catogries_modelList.add(catogries_model5);
        catogries_modelList.add(catogries_model6);
        catogries_modelList.add(catogries_model7);
        catogries_modelList.add(catogries_model8);
        catogries_modelList.add(catogries_model9);
catogry_adapter.notifyDataSetChanged();



    }


    @Override
    public void back() {
        finish();
    }


    public void showdetialss(Catogries_Model catogries_model) {
        Intent intent=new Intent(OrderDetialsActivity.this, MapActivity.class);
        intent.putExtra("data",catogries_model);
        startActivity(intent);
    }
}
