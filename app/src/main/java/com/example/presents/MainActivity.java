package com.example.presents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = findViewById(R.id.spinnerMoney);

        ArrayAdapter<String> adapter = new ArrayAdapter(
                this,
                R.layout.custom_spinner,
                getResources().getStringArray(R.array.money)
        );
        adapter.setDropDownViewResource(R.layout.custom_spinner_dropdown);
        spinner.setAdapter(adapter);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView parent, View view, int position, long id) {
                String selectedItem = spinner.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(), selectedItem, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView parent) {

            }
        });



        Present present1 = new Present("игрушка своими руками", 0, 1, "m");
        Present present2 = new Present("поделка своими руками", 0, 3, "m");
        Present present3 = new Present("мешочек хорошего настроения", 0, 6, "m");
        Present present4 = new Present("гербарий", 0, 10, "m");
        Present present5 = new Present("поход на природу", 0, 13, "m");
        Present present6 = new Present("наставление(совет)", 0, 17, "m");
        Present present7 = new Present("обнимашки", 0, 20, "m");
        Present present8 = new Present("мешочек хорошего настрооения", 0, 25, "m");
        Present present9 = new Present("обнимашки", 0, 40, "m");
        Present present10 = new Present("открытка", 0, 50, "m");
        Present present11 = new Present("декор рамки для фотографии", 0, 60, "m");
        Present present12 = new Present("провести целый день с человеком", 0, 65, "m");
        Present present13 = new Present("присыпки", 300, 1, "m");
        Present present14 = new Present("кинетический песок", 300, 3, "m");
        Present present15 = new Present("пазлы", 300, 6, "m");
        Present present16 = new Present("настольная тгра UNO", 300, 10, "m");
        Present present17 = new Present("Чехол на телефон для подводной съёмки", 300, 13, "m");
        Present present18 = new Present("компьютерная мышь", 300, 17, "m");
        Present present19 = new Present("твистер", 300, 20, "m");
        Present present20 = new Present("взрослые пазлы", 300, 25, "m");
        Present present21 = new Present("билет в кино", 300, 40, "m");
        Present present22 = new Present("футболка с принтом", 300, 50, "m");
        Present present23 = new Present("носки", 300, 60, "m");
        Present present24 = new Present("чехол для очков", 300, 65, "m");
        Present present25 = new Present("памперсы", 500, 1, "m");
        Present present26 = new Present("конструктор ЛЕГО(детский)", 500, 3, "m");
        Present present27 = new Present("мотивационный скретч-постер", 500, 6, "m");
        Present present28 = new Present("музыкальный танцевальный коврик", 500, 10, "m");
        Present present29 = new Present("3D пазлы", 500, 13, "m");
        Present present30 = new Present("блютуз наушники", 500, 17, "m");
        Present present31 = new Present("беспроводной зарядный стенд", 500, 20, "m");
        Present present32 = new Present("набор сладостей", 500, 25, "m");
        Present present33 = new Present("фотоальбом", 500, 40, "m");
        Present present34 = new Present("брендовая зажигалка", 500, 50, "m");
        Present present35 = new Present("крем для бритья", 500, 60, "m");
        Present present36 = new Present("фирменная ручка", 500, 65, "m");
        Present present37 = new Present("детское питание", 600, 1, "m");
        Present present38 = new Present("набор для рисования", 600, 3, "m");
        Present present39 = new Present("головоломка ", 600, 6, "m");
        Present present40 = new Present("набор блогера", 600, 10, "m");
        Present present41 = new Present("аппарат для сахарной ваты", 600, 13, "m");
        Present present42 = new Present("трюковый самокат", 600, 17, "m");
        Present present43 = new Present("очки VR", 600, 20, "m");
        Present present44 = new Present("мини-аппарат для приготовления сахарной ваты", 600, 25, "m");
        Present present45 = new Present("одежда(поло Lacoste)", 600, 40, "m");
        Present present46 = new Present("мини-бар", 600, 50, "m");
        Present present47 = new Present("поход в СПА", 600, 60, "m");
        Present present48 = new Present("набор для рыболовли", 600, 65, "m");
        Present present49 = new Present("погремушка", 0, 1, "w");
        Present present50 = new Present("чупа-чупс", 0, 3, "w");
        Present present51 = new Present("фломастеры", 0, 6, "w");
        Present present52 = new Present("поделка своими руками", 0, 10, "w");
        Present present53 = new Present("открытка", 0, 13, "w");
        Present present54 = new Present("совет", 0, 17, "w");
        Present present55 = new Present("шоколад", 0, 20, "w");
        Present present56 = new Present("цветы", 0, 25, "w");
        Present present57 = new Present("обнимашки", 0, 40, "w");
        Present present58 = new Present("конфета", 0, 50, "w");
        Present present59 = new Present("прогулка", 0, 60, "w");
        Present present60 = new Present("провести целый день с человеком", 0, 65, "w");
        Present present61 = new Present("пупс", 300, 1, "w");
        Present present62 = new Present("барби", 300, 3, "w");
        Present present63 = new Present("книга со сказками", 300, 6, "w");
        Present present64 = new Present("краски", 300, 10, "w");
        Present present65 = new Present("наушники", 300, 13, "w");
        Present present66 = new Present("блютуз наушники", 300, 17, "w");
        Present present67 = new Present("тортик", 300, 20, "w");
        Present present68 = new Present("подарочный сертификат", 300, 25, "w");
        Present present69 = new Present("кошелек", 300, 40, "w");
        Present present70 = new Present("носки", 300, 50, "w");
        Present present71 = new Present("кубик-рубика", 300, 60, "w");
        Present present72 = new Present("набор для вязания", 300, 65, "w");
        Present present73 = new Present("журнал", 500, 1, "w");
        Present present74 = new Present("коляска", 500, 3, "w");
        Present present75 = new Present("кубики", 500, 6, "w");
        Present present76 = new Present("кнопочныйтелефон", 500, 10, "w");
        Present present77 = new Present("набор косметики", 500, 13, "w");
        Present present78 = new Present("обувь", 500, 17, "w");
        Present present79 = new Present("худи", 500, 20, "w");
        Present present80 = new Present("билеты в кино", 500, 25, "w");
        Present present81 = new Present("экскурсия", 500, 40, "w");
        Present present82 = new Present("книга", 500, 50, "w");
        Present present83 = new Present("телевизор", 500, 60, "w");
        Present present84 = new Present("кресло", 500, 65, "w");
        Present present85 = new Present("набор для колыбели", 600, 1, "w");
        Present present86 = new Present("большой мишка", 600, 3, "w");
        Present present87 = new Present("конструктор", 600, 6, "w");
        Present present88 = new Present("сумочка", 600, 10, "w");
        Present present89 = new Present("смартфон", 600, 13, "w");
        Present present90 = new Present("ноутбук", 600, 17, "w");
        Present present91 = new Present("PS 5", 600, 20, "w");
        Present present92 = new Present("iphone", 600, 25, "w");
        Present present93 = new Present("квартира", 600, 40, "w");
        Present present94 = new Present("огромный букет из 100 роз ", 600, 50, "w");
        Present present95 = new Present("кресло-качалка", 600, 60, "w");
        Present present96 = new Present("билет на гаваи", 600, 65, "w");
        ArrayList<Present> listOfPresents = new ArrayList<>();
        listOfPresents.add(present1);
        listOfPresents.add(present2);
        listOfPresents.add(present3);
        listOfPresents.add(present4);
        listOfPresents.add(present5);
        listOfPresents.add(present6);
        listOfPresents.add(present7);
        listOfPresents.add(present8);
        listOfPresents.add(present9);
        listOfPresents.add(present10);
        listOfPresents.add(present11);
        listOfPresents.add(present12);
        listOfPresents.add(present13);
        listOfPresents.add(present14);
        listOfPresents.add(present15);
        listOfPresents.add(present16);
        listOfPresents.add(present17);
        listOfPresents.add(present18);
        listOfPresents.add(present19);
        listOfPresents.add(present20);
        listOfPresents.add(present21);
        listOfPresents.add(present22);
        listOfPresents.add(present23);
        listOfPresents.add(present24);
        listOfPresents.add(present25);
        listOfPresents.add(present26);
        listOfPresents.add(present27);
        listOfPresents.add(present28);
        listOfPresents.add(present29);
        listOfPresents.add(present30);
        listOfPresents.add(present31);
        listOfPresents.add(present32);
        listOfPresents.add(present33);
        listOfPresents.add(present34);
        listOfPresents.add(present35);
        listOfPresents.add(present36);
        listOfPresents.add(present37);
        listOfPresents.add(present38);
        listOfPresents.add(present39);
        listOfPresents.add(present40);
        listOfPresents.add(present41);
        listOfPresents.add(present42);
        listOfPresents.add(present43);
        listOfPresents.add(present44);
        listOfPresents.add(present45);
        listOfPresents.add(present46);
        listOfPresents.add(present47);
        listOfPresents.add(present48);
        listOfPresents.add(present49);
        listOfPresents.add(present50);
        listOfPresents.add(present51);
        listOfPresents.add(present52);
        listOfPresents.add(present53);
        listOfPresents.add(present54);
        listOfPresents.add(present55);
        listOfPresents.add(present56);
        listOfPresents.add(present57);
        listOfPresents.add(present58);
        listOfPresents.add(present59);
        listOfPresents.add(present60);
        listOfPresents.add(present61);
        listOfPresents.add(present62);
        listOfPresents.add(present63);
        listOfPresents.add(present64);
        listOfPresents.add(present65);
        listOfPresents.add(present66);
        listOfPresents.add(present67);
        listOfPresents.add(present68);
        listOfPresents.add(present69);
        listOfPresents.add(present70);
        listOfPresents.add(present71);
        listOfPresents.add(present72);
        listOfPresents.add(present73);
        listOfPresents.add(present74);
        listOfPresents.add(present75);
        listOfPresents.add(present76);
        listOfPresents.add(present77);
        listOfPresents.add(present78);
        listOfPresents.add(present79);
        listOfPresents.add(present80);
        listOfPresents.add(present81);
        listOfPresents.add(present82);
        listOfPresents.add(present83);
        listOfPresents.add(present84);
        listOfPresents.add(present85);
        listOfPresents.add(present86);
        listOfPresents.add(present87);
        listOfPresents.add(present88);
        listOfPresents.add(present89);
        listOfPresents.add(present90);
        listOfPresents.add(present91);
        listOfPresents.add(present92);
        listOfPresents.add(present93);
        listOfPresents.add(present94);
        listOfPresents.add(present95);
        listOfPresents.add(present96);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void click(View view) {
        Intent intent = new Intent(this, OderActivity.class);
        startActivity(intent);
    }





}
