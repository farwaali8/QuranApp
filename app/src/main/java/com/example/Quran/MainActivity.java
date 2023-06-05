package com.example.Quran;
import static com.example.Quran.QDH.SurahContent;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import com.example.Quran.QDH;


public class MainActivity extends AppCompatActivity {
    public static final String surahContents="com.example.Quran.surahContents";

    ListView listview;
    List<String> surahNames;


    String urduSurahNames[] = {
            "الفاتحۃ",
            "البقرۃ",
            "آل عمران",
            "النسآء",
            "المآئدۃ",
            "الانعام",
            "الاعراف",
            "الانفال",
            "التوبۃ",
            "یونس",
            "ھود",
            "یوسف",
            "الرعد",
            "ابراھیم",
            "الحجر",
            "النحل",
            "الاسراء",
            "الکہف",
            "مریم",
            "طٰہٰ",
            "الانبیآء",
            "الحج",
            "المؤمنون",
            "النور",
            "الفرقان",
            "الشعراء",
            "النمل",
            "القصص",
            "العنکبوت",
            "الروم",
            "لقمٰن",
            "السجدۃ",
            "الاحزاب",
            "سبا",
            "فاطر",
            "یٰسٓ",
            "الصّٰفّٰت",
            "صٓ",
            "الزمر",
            "الغافر",
            "فصلت",
            "الشُّورٰی",
            "الزُّخرُف",
            "الدُّخَان",
            "الجاثیہ",
            "الاحقاف",
            "محمد",
            "الفتح",
            "الحجرات",
            "قٓ",
            "الذّٰریٰت",
            "الطّور",
            "النجم",
            "القمر",
            "الرحمٰن",
            "الواقعۃ",
            " الحدید",
            "المجادلۃ",
            "الحشر",
            " الممتحنۃ",
            "الصّف",
            "الجُمعۃ",
            "المُنٰفِقُون",
            " التّغابن",
            "الطّلاق",
            "التحریم",
            "الملک",
            "القلم",
            " الحاقہ",
            "المعارج",
            "نُوح",
            "الجن",
            "المزّمّل",
            "المدّثّر",
            "القیٰمۃ",
            "الانسان",
            "المرسلٰت",
            "النَّبَاِ",
            "النّٰزِعٰتِ",
            "عَبَسَ",
            " التَّکوِیر",
            " الاِنفِطَار",
            "المُطَفِّفِین",
            "الاِنشِقَاق",
            "البُرُوج",
            "الطَّارق",
            "الاَعلیٰ",
            "الغَاشِیَۃ",
            "الفجر",
            "البلد",
            " الشَّمس",
            "الَّیل",
            "الضُّحٰی",
            "الم نشرح",
            "التّین",
            "العَلَق",
            " القدر",
            "البیّنۃ",
            "الزّلزال",
            "العٰدیٰت",
            " القارعۃ",
            "التّکاثُر",
            " العصر",
            "الھُمَزَۃ",
            "الفِیل",
            "قُرَیش",
            "المَاعُون",
            "الکوثر",
            "الکٰفرون",
            "النَّصَر",
            "اللَّھب",
            "الاخلاص",
            "الفَلَق",
            " النَّاس"
    };


    public int[] SSP = {
            1,
            8,
            295,
            496,
            673,
            794,
            960,
            1167,
            1243,
            1372,
            1482,
            1606,
            1718,
            1762,
            1815,
            1915,
            2044,
            2156,
            2267,
            2366,
            2502,
            2615,
            2694,
            2813,
            2878,
            2956,
            3184,
            3278,
            3367,
            3437,
            3498,
            3533,
            3564,
            3638,
            3693,
            3739,
            3823,
            4006,
            4095,
            4171,
            4257,
            4312,
            4366,
            4456,
            4516,
            4554,
            4590,
            4629,
            4659,
            4678,
            4724,
            4785,
            4835,
            4898,
            4954,
            5033,
            5130,
            5160,
            5183,
            5208,
            5222,
            5237,
            5249,
            5261,
            5280,
            5293,
            5306,
            5337,
            5390,
            5443,
            5488,
            5517,
            5546,
            5567,
            5624,
            5665,
            5697,
            5748,
            5789,
            5836,
            5879,
            5909,
            5929,
            5966,
            5992,
            6015,
            6033,
            6053,
            6080,
            6111,
            6132,
            6148,
            6170,
            6182,
            6191,
            6200,
            6220,
            6226,
            6235,
            6244,
            6256,
            6268,
            6277,
            6281,
            6291,
            6297,
            6302,
            6310,
            6314,
            6321,
            6325,
            6331,
            6336,
            6342,
    };
    public int[] surahAyatCount = {
            6,
            286,
            200,
            176,
            120,
            165,
            206,
            75,
            129,
            109,
            123,
            111,
            43,
            52,
            99,
            128,
            111,
            110,
            98,
            135,
            112,
            78,
            118,
            64,
            77,
            227,
            93,
            88,
            69,
            60,
            34,
            30,
            73,
            54,
            45,
            83,
            182,
            88,
            75,
            85,
            54,
            53,
            89,
            59,
            37,
            35,
            38,
            29,
            18,
            45,
            60,
            49,
            62,
            55,
            78,
            96,
            29,
            22,
            24,
            13,
            14,
            11,
            11,
            18,
            12,
            12,
            30,
            52,
            52,
            44,
            28,
            28,
            20,
            56,
            40,
            31,
            50,
            40,
            46,
            42,
            29,
            19,
            36,
            25,
            22,
            17,
            19,
            26,
            30,
            20,
            15,
            21,
            11,
            8,
            8,
            19,
            5,
            8,
            8,
            11,
            11,
            8,
            3,
            9,
            5,
            4,
            7,
            3,
            6,
            3,
            5,
            4,
            5,
            6
    };

    //    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        surahNames = new ArrayList<>();
        for (int i = 0; i < urduSurahNames.length; i++) {
            String surahName = (i + 1) + ". " + urduSurahNames[i];
            surahNames.add(surahName);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview = findViewById(R.id.listview);
        ArrayAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, surahNames);
        listview.setAdapter(adapter);


        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //int surahIndex = position; // Get the surah index from the clicked item position
                String selectedSurah = urduSurahNames[position]; // Get the selected surah name
                //String selectedSurahContents = QDH.SurahContent[position]; // Get the corresponding surah contents





                String[] selectedSurahContents = GetData(position,SurahContent);

               // Toast.makeText(MainActivity.this, "this is second activity", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("surahName", selectedSurah); // Pass the surah name as an extra
                intent.putExtra("surahContents", selectedSurahContents); // Pass the surah contents as an extra
                listview = findViewById(R.id.listview);

                startActivity(intent);}


        });

        }

//    public String[] GetData(int StartIndex, int EndIndex) {
//        List<String> listTemp = null;
public String[] GetData(int surahIndex,String[] SurahContent) {
        
    int startIndex = SSP[surahIndex]-1;
    int endIndex = startIndex + surahAyatCount[surahIndex]+1;

    List<String> listTemp = new ArrayList<>();
        for (int i = startIndex; i < endIndex; i++) {
            listTemp.add(SurahContent[i].toString());
        }
        String[] list = listTemp.toArray(new String[]{});

        return list;
    }

    }










