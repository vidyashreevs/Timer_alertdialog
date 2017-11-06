/*
package com.pcsalt.example.customalertdialog;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.NumberPicker;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import static com.pcsalt.example.customalertdialog.CustomAdapter.dateee;
import static com.pcsalt.example.customalertdialog.CustomAdapter.devicenum;
import static com.pcsalt.example.customalertdialog.CustomAdapter.devname;
import static com.pcsalt.example.customalertdialog.CustomAdapter.devtype;
import static com.pcsalt.example.customalertdialog.CustomAdapter.inflater;
import static com.pcsalt.example.customalertdialog.CustomAdapter.offdatare;
import static com.pcsalt.example.customalertdialog.CustomAdapter.offt;
import static com.pcsalt.example.customalertdialog.CustomAdapter.ont;
import static com.pcsalt.example.customalertdialog.CustomAdapter.repeaweekly;
import static com.pcsalt.example.customalertdialog.CustomAdapter.roomnumber;
import static com.pcsalt.example.customalertdialog.CustomAdapter.switchnumber;

public class Roomlist extends AppCompatActivity implements View.OnClickListener {
    private boolean flag1 = false;
    private boolean flag2 = false;
    private boolean flag3 = false;
    NumberPicker np, np1, np2, np3, np5, np6, np7, np8, np9;
    Button sunday, monday, tuesday, wednesday, thusday, friday, saturday, setoperation, timerlist, settimer;
    TextView tvon, tvoff, tvvv,label;
    CheckBox  cb_rgb, cb_switch21,cb_switch51;
    LinearLayout repeat;
    ArrayList aa,aa1,aa2;
    String name,name1,name2;
    ListView mtv;
    Button flash, fade, strobe, smooth;
    TextView tvspeed;
    SeekBar brightness;
    Context context;
    RadioButton rb1,rb2,rb3;
    LinearLayout ld1,ld2,ld3,ld4,ld5,ld6;
    View alertLayout;
    Button colorview;
    int color_bright;
    Object fsfs_speed, tvspeed1,color_fsfs;
    Integer rrr, ggg, bbb;
    private Button save,cancel;
    private String fsfs;
    int nnp1, nnp2, nnp3, nnp4, nnp5, nnp6, nnp7, nnp8, nnp9;
    int a, b, c, d, e, f, g;
    String fromtime, totime,zero,zero1,abcd,repdata,pushtype,one, two, three, four,check1;
    String nnnp1, nnnp2, nnnp3, nnnp4, nnnp5, nnnp6, nnnp7;
    private String responseBody;
    private String r;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.room_list);
        cb_rgb = (CheckBox) findViewById(R.id.cb_rgb);
        cb_switch21 = (CheckBox) findViewById(R.id.cb_switch21);
        cb_switch51 = (CheckBox) findViewById(R.id.cb_switch51);
        cb_switch21.setOnClickListener(this);
        cb_switch51.setOnClickListener(this);
        cb_rgb.setOnClickListener(this);
        context=this;
         mtv= (ListView) findViewById(R.id.mtv);

        boolean checked = PreferenceManager.getDefaultSharedPreferences(this)
                .getBoolean("checkBox1", false);
        cb_switch21.setChecked(checked);

        boolean checked2 = PreferenceManager.getDefaultSharedPreferences(this)
                .getBoolean("checkBox1", false);
        cb_switch51.setChecked(checked2);
}


    @Override
    public void onClick(View view) {
        if (view == cb_rgb) {
            if (cb_rgb.isChecked()) {
                rgb();
            }

        }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        else if (view == cb_switch21) {

            if (cb_switch21.isChecked()) {

                //switch21();
            }

        }


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        else if (view == cb_switch51) {

            if (cb_switch51.isChecked()) {
                switch51();

            }
        }
    }

    public  void switch51() {
        cb_rgb.setChecked(false);
        cb_switch21.setChecked(false);
        LayoutInflater inflater = getLayoutInflater();
         alertLayout = inflater.inflate(R.layout.layout_custom_dialog, null);


        TextView tv = (TextView) alertLayout.findViewById(R.id.tv1);

        tvon = (TextView) alertLayout.findViewById(R.id.tvon);
        tvoff = (TextView) alertLayout.findViewById(R.id.tvoff);

        tvvv = (TextView) alertLayout.findViewById(R.id.tv);
        label = (TextView) alertLayout.findViewById(R.id.label);

        sunday = (Button) alertLayout.findViewById(R.id.b1);
        monday = (Button) alertLayout.findViewById(R.id.b2);
        tuesday = (Button) alertLayout.findViewById(R.id.b3);
        wednesday = (Button) alertLayout.findViewById(R.id.b4);
        thusday = (Button) alertLayout.findViewById(R.id.b5);
        friday= (Button) alertLayout.findViewById(R.id.b6);
        saturday = (Button) alertLayout.findViewById(R.id.b7);
        setoperation = (Button) alertLayout.findViewById(R.id.setoperation);
        timerlist = (Button) alertLayout.findViewById(R.id.timerlist);
        settimer = (Button) alertLayout.findViewById(R.id.settimer);

        sunday.setTag(0);
        monday.setTag(0);
        tuesday.setTag(0);
        wednesday.setTag(0);
        thusday.setTag(0);
        friday.setTag(0);
        saturday.setTag(0);

        sunday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(view.getTag().equals(0))
                {
                    sunday.setBackgroundResource(R.drawable.sun_sat_02);
                    view.setTag(1);
                }
                else
                {
                    sunday.setBackgroundResource(R.drawable.sun_sat_01);
                    view.setTag(0);
                }
            }
        });


        monday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(view.getTag().equals(0))
                {
                    monday.setBackgroundResource(R.drawable.mon_02);
                    view.setTag(1);
                }
                else
                {
                    monday.setBackgroundResource(R.drawable.mon_01);
                    view.setTag(0);
                }
            }
        });


        tuesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(view.getTag().equals(0))
                {
                    tuesday.setBackgroundResource(R.drawable.tues_thur_02);
                    view.setTag(1);
                }
                else
                {
                    tuesday.setBackgroundResource(R.drawable.tues_thur_01);
                    view.setTag(0);
                }
            }
        });

        wednesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(view.getTag().equals(0))
                {
                    wednesday.setBackgroundResource(R.drawable.wed_02);
                    view.setTag(1);
                }
                else
                {
                    wednesday.setBackgroundResource(R.drawable.wed_01);
                    view.setTag(0);
                }
            }
        });

        thusday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(view.getTag().equals(0))
                {
                    thusday.setBackgroundResource(R.drawable.tues_thur_02);
                    view.setTag(1);
                }
                else
                {
                    thusday.setBackgroundResource(R.drawable.tues_thur_01);
                    view.setTag(0);
                }
            }
        });

        friday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(view.getTag().equals(0))
                {
                    friday.setBackgroundResource(R.drawable.fri_02);
                    view.setTag(1);
                }
                else
                {
                    friday.setBackgroundResource(R.drawable.fri_01);
                    view.setTag(0);
                }
            }
        });

        saturday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(view.getTag().equals(0))
                {
                    saturday.setBackgroundResource(R.drawable.sun_sat_02);
                    view.setTag(1);
                }
                else
                {
                    saturday.setBackgroundResource(R.drawable.sun_sat_01);
                    view.setTag(0);
                }
            }
        });
        timerlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Roomlist.this,EditTime.class);
                startActivity(i);

            }
        });

        settimer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             //   bbb = np.getValue();

                //   mtv.setText(""+bbb);
               // Toast.makeText(getApplicationContext(), "value=" + bbb, Toast.LENGTH_LONG).show();

                Thread t = new Thread() {

                    public void run() {

                        try {
                            post();
                        } catch (JSONException | IOException e) {
                            e.printStackTrace();
                        }
                    }

                    private void post() throws JSONException, IOException {

                        // Creating HTTP client
                        HttpClient httpClient = new DefaultHttpClient();
                        // Creating HTTP Post
                        HttpPost httpPost = new HttpPost(
                                "http://192.168.0.204/tstatus1.php?roomno=01&user=admin12345&pass=12345678");
                        //  a=ac.getText().toString();
                        //bbb = np.getValue();
                       // String z = "" + bbb;
                        // Building post parameters
                        // key and value pair
                        List<NameValuePair> nameValuePair = new ArrayList<>(2);
                        //  nameValuePair.add(new BasicNameValuePair("rdata", z));
      */
/*  nameValuePair.add(new BasicNameValuePair("data",
                "Hi, trying Android HTTP post!"));*//*


                        // Url Encoding the POST parameters
                        try {
                            httpPost.setEntity(new UrlEncodedFormEntity(nameValuePair));
                        } catch (UnsupportedEncodingException e) {

                            e.printStackTrace();
                        }

                        // Making HTTP Request
                        try {
                            final HttpResponse response = httpClient.execute(httpPost);
                            String responseBody = null;

                            HttpEntity entity = response.getEntity();
                            if (entity != null) {
                                responseBody = EntityUtils.toString(entity);

                */
/*JSONObject j = new JSONObject(responseBody);
                responseBody = j.getString("data");*//*



                                JSONArray jsonarray = new JSONArray(responseBody);
                                //  JSONObject j = new JSONObject(responseBody);
                                // responseBody = j.getString("Days");
                                aa = new ArrayList();
                                aa1 = new ArrayList();
                                aa2 = new ArrayList();
                                for (int i = 0; i < jsonarray.length(); i++) {
                                    JSONObject jsonobject = jsonarray.getJSONObject(i);
                                    name = jsonobject.getString("DeviceName");
                                    name1 = jsonobject.getString("DeviceType");
                                    name2 = jsonobject.getString("Time");
                                    aa.add(name);
                                    aa1.add(name1);
                                    aa2.add(name2);


                                }

                                //adapter = new ArrayAdapter<String>(Roomlist.this, R.layout.activity_listview,R.id.label ,aa2);
                                //  adapter2 = new ArrayAdapter<String>(Roomlist.this, R.layout.activity_listview,R.id.label2 ,aa);

                                Log.d("TAG", "Http post Response: " + responseBody);
                            }
                            Log.d("TAG", responseBody);

                            final String finalResponseBody = responseBody;
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    //  mtv.setAdapter(new CustomAdapter(Roomlist.this, aa,aa1));
                                    // mtv.setAdapter(adapter);

                                    // mtv.setText(finalResponseBody);
                                    Toast.makeText(Roomlist.this,"val="+aa+"val2="+aa1+"val3="+aa2,Toast.LENGTH_LONG).show();
                                }
                            });
                        } catch (IOException e) {
                            // writing exception to log
                            e.printStackTrace();

                        } */
/*catch (JSONException e) {
            e.printStackTrace();
        }*//*

                    }
                };
                t.start();

            }
        });


        timerlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Roomlist.this,EditTime.class);
                startActivity(i);

            }
        });


        setoperation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutInflater inflater = getLayoutInflater();
                View alertLayout1 = inflater.inflate(R.layout.switch_51_alert, null);
                AlertDialog.Builder alert = new AlertDialog.Builder(Roomlist.this, R.style.MyDialogTheme1);
                //  alert.setTitle("Login");
                // this is set the view from XML inside AlertDialog
                alert.setView(alertLayout1);
                // disallow cancel of AlertDialog on click of back button and outside touch
                alert.setCancelable(true);

                final AlertDialog dialog1 = alert.create();
                dialog1.show();
                int width = (int) (getResources().getDisplayMetrics().widthPixels * 0.70);
                int height = (int) (getResources().getDisplayMetrics().heightPixels * 0.35);
                dialog1.getWindow().setLayout(width, height);
                dialog1.show();




               */
/* set.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                         a=ac.getText().toString();
                      mtv.setText(""+a);
                         dialog1.dismiss();
                    }
                });*//*


            }
        });

        repeat = (LinearLayout) alertLayout.findViewById(R.id.repeat_linear);

        tv.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG);
         rb1 = (RadioButton) alertLayout.findViewById(R.id.rb1);
        rb2 = (RadioButton) alertLayout.findViewById(R.id.rb2);
        rb3 = (RadioButton) alertLayout.findViewById(R.id.rb3);
        ld1 = (LinearLayout) alertLayout.findViewById(R.id.ld1);
         ld2 = (LinearLayout) alertLayout.findViewById(R.id.ld2);
         ld3 = (LinearLayout) alertLayout.findViewById(R.id.ld3);
         ld4 = (LinearLayout) alertLayout.findViewById(R.id.ld4);
        ld5 = (LinearLayout) alertLayout.findViewById(R.id.ld5);
         ld6 = (LinearLayout) alertLayout.findViewById(R.id.ld6);


        rb1.setEnabled(true);
        rb2.setEnabled(true);
        rb3.setEnabled(true);


        rb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (rb1.isChecked()) {
                   rb1();
                }
            }
        });


        rb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (rb2.isChecked()) {
                    rb2();
                }
            }
        });

        rb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (rb3.isChecked()) {
                    rb3();
                }
            }
        });


       numberpicker();


        AlertDialog.Builder alert = new AlertDialog.Builder(Roomlist.this, R.style.MyDialogTheme);
        //  alert.setTitle("Login");
        // this is set the view from XML inside AlertDialog
        alert.setView(alertLayout);
        // disallow cancel of AlertDialog on click of back button and outside touch
        alert.setCancelable(true);

        AlertDialog dialog = alert.create();
        dialog.show();

        int width = (int) (getResources().getDisplayMetrics().widthPixels * 0.80);
        int height = (int) (getResources().getDisplayMetrics().heightPixels * 0.80);

        dialog.getWindow().setLayout(width, height);
        dialog.show();
        //dialog.getWindow().setLayout(450, 650);


    }



   */
/* private void switch21() {
        cb_rgb.setChecked(false);
        cb_switch51.setChecked(false);
        LayoutInflater inflater = getLayoutInflater();
         alertLayout = inflater.inflate(R.layout.layout_custom_dialog, null);


        TextView tv = (TextView) alertLayout.findViewById(R.id.tv1);

        tvon = (TextView) alertLayout.findViewById(R.id.tvon);
        tvoff = (TextView) alertLayout.findViewById(R.id.tvoff);

        tvvv = (TextView) alertLayout.findViewById(R.id.tv);


        sunday = (Button) alertLayout.findViewById(R.id.b1);
        monday = (Button) alertLayout.findViewById(R.id.b2);
        tuesday = (Button) alertLayout.findViewById(R.id.b3);
        wednesday = (Button) alertLayout.findViewById(R.id.b4);
        thusday = (Button) alertLayout.findViewById(R.id.b5);
        friday= (Button) alertLayout.findViewById(R.id.b6);
        saturday = (Button) alertLayout.findViewById(R.id.b7);
        setoperation = (Button) alertLayout.findViewById(R.id.setoperation);
        timerlist = (Button) alertLayout.findViewById(R.id.timerlist);
        settimer = (Button) alertLayout.findViewById(R.id.settimer);

        sunday.setTag(0);
        monday.setTag(0);
        tuesday.setTag(0);
        wednesday.setTag(0);
        thusday.setTag(0);
        friday.setTag(0);
        saturday.setTag(0);

        sunday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(view.getTag().equals(0))
                {
                    sunday.setBackgroundResource(R.drawable.sun_sat_02);
                    view.setTag(1);
                }
                else
                {
                    sunday.setBackgroundResource(R.drawable.sun_sat_01);
                    view.setTag(0);
                }
            }
        });


        monday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(view.getTag().equals(0))
                {
                    monday.setBackgroundResource(R.drawable.mon_02);
                    view.setTag(1);
                }
                else
                {
                    monday.setBackgroundResource(R.drawable.mon_01);
                    view.setTag(0);
                }
            }
        });


        tuesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(view.getTag().equals(0))
                {
                    tuesday.setBackgroundResource(R.drawable.tues_thur_02);
                    view.setTag(1);
                }
                else
                {
                    tuesday.setBackgroundResource(R.drawable.tues_thur_01);
                    view.setTag(0);
                }
            }
        });

        wednesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(view.getTag().equals(0))
                {
                    wednesday.setBackgroundResource(R.drawable.wed_02);
                    view.setTag(1);
                }
                else
                {
                    wednesday.setBackgroundResource(R.drawable.wed_01);
                    view.setTag(0);
                }
            }
        });

        thusday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(view.getTag().equals(0))
                {
                    thusday.setBackgroundResource(R.drawable.tues_thur_02);
                    view.setTag(1);
                }
                else
                {
                    thusday.setBackgroundResource(R.drawable.tues_thur_01);
                    view.setTag(0);
                }
            }
        });

        friday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(view.getTag().equals(0))
                {
                    friday.setBackgroundResource(R.drawable.fri_02);
                    view.setTag(1);
                }
                else
                {
                    friday.setBackgroundResource(R.drawable.fri_01);
                    view.setTag(0);
                }
            }
        });

        saturday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(view.getTag().equals(0))
                {
                    saturday.setBackgroundResource(R.drawable.sun_sat_02);
                    view.setTag(1);
                }
                else
                {
                    saturday.setBackgroundResource(R.drawable.sun_sat_01);
                    view.setTag(0);
                }
            }
        });
        timerlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Roomlist.this,EditTime.class);
                startActivity(i);

            }
        });

        settimer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //bbb = np.getValue();

                //   mtv.setText(""+bbb);
              //  Toast.makeText(getApplicationContext(), "value=" + bbb, Toast.LENGTH_LONG).show();

                Thread t = new Thread() {

                    public void run() {

                        post();
                    }

                    private void post() {

                        // Creating HTTP client
                        HttpClient httpClient = new DefaultHttpClient();
                        // Creating HTTP Post
                        HttpPost httpPost = new HttpPost(
                                "http://testpost.edisonbro.in/kaapiwaala.php");
                        //  a=ac.getText().toString();
                      //  bbb = np.getValue();
                      //  String z = "" + bbb;
                        // Building post parameters
                        // key and value pair
                        List<NameValuePair> nameValuePair = new ArrayList<>(2);
                        nameValuePair.add(new BasicNameValuePair("rdata", "abcd"));
      *//*
*/
/*  nameValuePair.add(new BasicNameValuePair("data",
                "Hi, trying Android HTTP post!"));*//*
*/
/*

                        // Url Encoding the POST parameters
                        try {
                            httpPost.setEntity(new UrlEncodedFormEntity(nameValuePair));
                        } catch (UnsupportedEncodingException e) {

                            e.printStackTrace();
                        }

                        // Making HTTP Request
                        try {
                            final HttpResponse response = httpClient.execute(httpPost);
                            String responseBody = null;

                            HttpEntity entity = response.getEntity();
                            if (entity != null) {
                                responseBody = EntityUtils.toString(entity);

                *//*
*/
/*JSONObject j = new JSONObject(responseBody);
                responseBody = j.getString("data");*//*
*/
/*

                                Log.d("TAG", "Http post Response: " + responseBody);
                            }
                            Log.d("TAG", responseBody);

                            final String finalResponseBody = responseBody;
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {

                                    // mtv.setText(finalResponseBody);
                                }
                            });
                        } catch (IOException e) {
                            // writing exception to log
                            e.printStackTrace();

                        } *//*
*/
/*catch (JSONException e) {
            e.printStackTrace();
        }*//*
*/
/*
                    }


                };
                t.start();

            }
        });


        timerlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Roomlist.this,EditTime.class);
                startActivity(i);

            }
        });


        setoperation.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {


                LayoutInflater inflater = getLayoutInflater();
                View alertLayout1 = inflater.inflate(R.layout.switch_21_alert, null);


                AlertDialog.Builder alert = new AlertDialog.Builder(Roomlist.this, R.style.MyDialogTheme1);
                //  alert.setTitle("Login");
                // this is set the view from XML inside AlertDialog
                alert.setView(alertLayout1);
                // disallow cancel of AlertDialog on click of back button and outside touch
                alert.setCancelable(true);

                final AlertDialog dialog1 = alert.create();
                dialog1.show();
                int width = (int) (getResources().getDisplayMetrics().widthPixels * 0.50);
                int height = (int) (getResources().getDisplayMetrics().heightPixels * 0.25);

                dialog1.getWindow().setLayout(width, height);
                dialog1.show();


            }
        });

        repeat = (LinearLayout) alertLayout.findViewById(R.id.repeat_linear);

        tv.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG);
        rb1 = (RadioButton) alertLayout.findViewById(R.id.rb1);
        rb2 = (RadioButton) alertLayout.findViewById(R.id.rb2);
         rb3 = (RadioButton) alertLayout.findViewById(R.id.rb3);
         ld1 = (LinearLayout) alertLayout.findViewById(R.id.ld1);
         ld2 = (LinearLayout) alertLayout.findViewById(R.id.ld2);
         ld3 = (LinearLayout) alertLayout.findViewById(R.id.ld3);
        ld4 = (LinearLayout) alertLayout.findViewById(R.id.ld4);
         ld5 = (LinearLayout) alertLayout.findViewById(R.id.ld5);
         ld6 = (LinearLayout) alertLayout.findViewById(R.id.ld6);


        rb1.setEnabled(true);
        rb2.setEnabled(true);
        rb3.setEnabled(true);


        rb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (rb1.isChecked()) {
                    rb1();
                }
            }
        });


        rb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (rb2.isChecked()) {
                   rb2();
                }
            }
        });

        rb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (rb3.isChecked()) {
                   rb3();
                }
            }
        });
        numberpicker();

        AlertDialog.Builder alert = new AlertDialog.Builder(Roomlist.this, R.style.MyDialogTheme);
        //  alert.setTitle("Login");
        // this is set the view from XML inside AlertDialog
        alert.setView(alertLayout);
        // disallow cancel of AlertDialog on click of back button and outside touch
        alert.setCancelable(true);

        AlertDialog dialog = alert.create();
        dialog.show();

        int width = (int) (getResources().getDisplayMetrics().widthPixels * 0.80);
        int height = (int) (getResources().getDisplayMetrics().heightPixels * 0.80);

        dialog.getWindow().setLayout(width, height);
        dialog.show();
        //dialog.getWindow().setLayout(450, 650);


    }*//*



    public void rgb() {
        cb_switch21.setChecked(false);
        cb_switch51.setChecked(false);
        final LayoutInflater inflater = getLayoutInflater();
         alertLayout = inflater.inflate(R.layout.layout_custom_dialog, null);
        TextView tv = (TextView) alertLayout.findViewById(R.id.tv1);
        tvon = (TextView) alertLayout.findViewById(R.id.tvon);
        tvoff = (TextView) alertLayout.findViewById(R.id.tvoff);
        tvvv = (TextView) alertLayout.findViewById(R.id.tv);
        repeat = (LinearLayout) alertLayout.findViewById(R.id.repeat_linear);
        sunday = (Button) alertLayout.findViewById(R.id.b1);
        monday = (Button) alertLayout.findViewById(R.id.b2);
        tuesday = (Button) alertLayout.findViewById(R.id.b3);
        wednesday = (Button) alertLayout.findViewById(R.id.b4);
        thusday = (Button) alertLayout.findViewById(R.id.b5);
        friday= (Button) alertLayout.findViewById(R.id.b6);
        saturday = (Button) alertLayout.findViewById(R.id.b7);
        setoperation = (Button) alertLayout.findViewById(R.id.setoperation);
        timerlist = (Button) alertLayout.findViewById(R.id.timerlist);
        settimer = (Button) alertLayout.findViewById(R.id.settimer);

        sunday.setTag(0);
        monday.setTag(0);
        tuesday.setTag(0);
        wednesday.setTag(0);
        thusday.setTag(0);
        friday.setTag(0);
        saturday.setTag(0);


        AlertDialog.Builder alert = new AlertDialog.Builder(Roomlist.this, R.style.MyDialogTheme);
        //  alert.setTitle("Login");
        // this is set the view from XML inside AlertDialog
        alert.setView(alertLayout);
        // disallow cancel of AlertDialog on click of back button and outside touch
        alert.setCancelable(true);

        final AlertDialog dialog = alert.create();
        dialog.show();

        int width = (int) (getResources().getDisplayMetrics().widthPixels * 0.80);
        int height = (int) (getResources().getDisplayMetrics().heightPixels * 0.80);

        dialog.getWindow().setLayout(width, height);
        dialog.show();
        sunday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(view.getTag().equals(0))
                {
                    sunday.setBackgroundResource(R.drawable.sun_sat_02);
                    view.setTag(1);
                }
                else
                {
                    sunday.setBackgroundResource(R.drawable.sun_sat_01);
                    view.setTag(0);
                }
            }
        });


        monday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(view.getTag().equals(0))
                {
                    monday.setBackgroundResource(R.drawable.mon_02);
                    view.setTag(1);
                }
                else
                {
                    monday.setBackgroundResource(R.drawable.mon_01);
                    view.setTag(0);
                }
            }
        });


        tuesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(view.getTag().equals(0))
                {
                    tuesday.setBackgroundResource(R.drawable.tues_thur_02);
                    view.setTag(1);
                }
                else
                {
                    tuesday.setBackgroundResource(R.drawable.tues_thur_01);
                    view.setTag(0);
                }
            }
        });

        wednesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(view.getTag().equals(0))
                {
                    wednesday.setBackgroundResource(R.drawable.wed_02);
                    view.setTag(1);
                }
                else
                {
                    wednesday.setBackgroundResource(R.drawable.wed_01);
                    view.setTag(0);
                }
            }
        });

        thusday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(view.getTag().equals(0))
                {
                    thusday.setBackgroundResource(R.drawable.tues_thur_02);
                    view.setTag(1);
                }
                else
                {
                    thusday.setBackgroundResource(R.drawable.tues_thur_01);
                    view.setTag(0);
                }
            }
        });

        friday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(view.getTag().equals(0))
                {
                    friday.setBackgroundResource(R.drawable.fri_02);
                    view.setTag(1);
                }
                else
                {
                    friday.setBackgroundResource(R.drawable.fri_01);
                    view.setTag(0);
                }
            }
        });

        saturday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(view.getTag().equals(0))
                {
                    saturday.setBackgroundResource(R.drawable.sun_sat_02);
                    view.setTag(1);
                }
                else
                {
                    saturday.setBackgroundResource(R.drawable.sun_sat_01);
                    view.setTag(0);
                }
            }
        });
        timerlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Roomlist.this,EditTime.class);
                startActivity(i);

            }
        });



        settimer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {

                nnp1 = np.getValue();
                nnp2 = np1.getValue();
                if (nnp1 < 10) {
                    nnnp1 = "0" + nnp1;
                } else if (nnp1 >= 10) {
                    nnnp1 = String.valueOf(nnp1);
                }
                if (nnp2 < 10) {
                    nnnp2 = "0" + nnp2;
                } else if (nnp2 >= 10) {
                    nnnp2 = String.valueOf(nnp2);
                }

                nnp3 = np2.getValue();
                nnp4 = np3.getValue();
                if (nnp3 < 10) {
                    nnnp3 = "0" + nnp3;
                } else if (nnp3 >= 10) {
                    nnnp3 = String.valueOf(nnp3);
                }
                if (nnp4 < 10) {
                    nnnp4 = "0" + nnp4;
                } else if (nnp4 >= 10) {
                    nnnp4 = String.valueOf(nnp4);
                }

                fromtime = nnnp1 + ":" + nnnp2;
                totime = nnnp3 + ":" + nnnp4;


                if (rb1.isChecked()) {

                      pushtype = "rep";
                    if (sunday.getTag().equals(1)) {
                        a = 1;
                    } else if (sunday.getTag().equals(0)) {
                        a = 0;
                    }
                    if (monday.getTag().equals(1)) {
                        b = 1;
                    } else if (monday.getTag().equals(0)) {
                        b = 0;
                    }
                    if (tuesday.getTag().equals(1)) {
                        c = 1;
                    } else if (tuesday.getTag().equals(0)) {
                        c = 0;
                    }
                    if (wednesday.getTag().equals(1)) {
                        d = 1;
                    } else if (wednesday.getTag().equals(0)) {
                        d = 0;
                    }
                    if (thusday.getTag().equals(1)) {
                        e = 1;
                    } else if (thusday.getTag().equals(0)) {
                        e = 0;
                    }
                    if (friday.getTag().equals(1)) {
                        f = 1;
                    } else if (friday.getTag().equals(0)) {
                        f = 0;
                    }
                    if (saturday.getTag().equals(1)) {
                        g = 1;
                    } else if (saturday.getTag().equals(0)) {
                        g = 0;
                    }


                    if (color_fsfs != null && fsfs_speed != null) {

                        abcd = "001000000" + devicenum + roomnumber+"102000000000000000" + ";" + "001000000" + devicenum + roomnumber + color_fsfs + rrr + ggg + bbb + "000000;" + "001000000" + devicenum + roomnumber + color_bright + "000000000000000;" + "001000000" + devicenum + "01" + fsfs_speed + "000000000000000";
                        repdata = fromtime + "@" + a + "@" + b + "@" + c + "@" + d + "@" + e + "@" + f + "@" + g + "@" + devname + "@" + abcd + "@" + devtype + "@" + devicenum + "@" + switchnumber + "@" + roomnumber + "@" + repeaweekly + "@" + totime + "@" + offdatare ;
                        Log.d("TAG"+"RGB CYC",String.valueOf(repdata));
                    } else {
                        Toast.makeText(view.getContext(), " Set operation", Toast.LENGTH_LONG).show();
                    }


                }

                if (rb2.isChecked()) {

                     pushtype = "cyc";
                    nnp5 = np5.getValue();
                    nnp6 = np6.getValue();

                    if (nnp5 < 10) {
                        nnnp5 = "0" + nnp5;
                    } else if (nnp5 >= 10) {
                        nnnp5 = String.valueOf(nnp5);
                    }


                    if (nnp6 < 10) {
                        nnnp6 = "0" + nnp6;
                    } else if (nnp6 >= 10) {
                        nnnp6 = String.valueOf(nnp6);
                    }
                    zero = "00:" + nnnp5;
                    zero1 = "00:" + nnnp6;
                    if (color_fsfs != null && fsfs_speed != null) {
                        abcd = "001000000" + devicenum +roomnumber+"102000000000000000" + ";" + "001000000" + devicenum + roomnumber + color_fsfs + rrr + ggg + bbb + "000000"+";" + "001000000" + devicenum + roomnumber + color_bright + "000000000000000"+";" + "001000000" + devicenum + roomnumber + fsfs_speed + "000000000000000";
                        repdata = fromtime + "@" + totime + "@" + zero + "@" + zero1 + "@" + fromtime + "@" + dateee + "@" + "1" + "@" + "0" + "@" + "0" + "@" + devname + "@" + abcd + "@" + offdatare + "@" + devtype + "@" + devicenum + "@" + switchnumber + "@" + roomnumber + "@" + ont + "@" + offt;



                        Log.d("TAG"+"RGB CYC",String.valueOf(repdata));

                    } else {
                        Toast.makeText(view.getContext(), "Set operation", Toast.LENGTH_LONG).show();
                    }


                }

                if (rb3.isChecked()) {
                     pushtype = "repd";
                    nnp7 = np7.getValue();

                    if (nnp7 < 10) {
                        nnnp7 = "0" + nnp7;
                    } else if (nnp7 >= 10) {
                        nnnp7 = String.valueOf(nnp7);
                    }

                    nnp8 = np8.getValue();
                    nnp9 = np9.getValue();

                    r = nnp9 + "-" + nnp8 + "-" + nnnp7;

                    if (color_fsfs != null && fsfs_speed != null) {

                        abcd = "001000000" + devicenum + roomnumber+"102000000000000000" + ";" + "001000000" + devicenum + roomnumber + color_fsfs + rrr + ggg + bbb + "000000;" + "001000000" + devicenum + roomnumber + color_bright + "000000000000000;" + "001000000" + devicenum +roomnumber + fsfs_speed + "000000000000000";
                        repdata = fromtime + "@" + a + "@" + b + "@" + c + "@" + d + "@" + e + "@" + f + "@" + g + "@" + devname + "@" + abcd + "@" + devtype + "@" + devicenum + "@" + switchnumber + "@" + roomnumber + "@" + repeaweekly + "@" + totime + "@" + offdatare + "@" + r + "@" + ont;
                    } else {
                        Toast.makeText(view.getContext(), "Set operation", Toast.LENGTH_LONG).show();
                    }

                }

                Thread t = new Thread() {

                    public void run() {

                        postupdins();

                    }

                };
                t.start();
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Object j = tvvv.getText();
                        if(j.equals("*UACK#"))
                        {
                            Toast.makeText(view.getContext(),"Data updated successfully",Toast.LENGTH_LONG).show();
                            dialog.dismiss();
                        }
                        else if(j.equals("*UNACK#"))
                        {
                            Toast.makeText(view.getContext(),"Data not updated",Toast.LENGTH_LONG).show();
                        }
                        else if(j.equals("*EACK#"))
                        {
                            Toast.makeText(view.getContext(),"Data already exits",Toast.LENGTH_LONG).show();

                        }
                    }
                }, 900);



            }
        });


        setoperation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertLayout = inflater.inflate(R.layout.rgb_popup, null);
                AlertDialog.Builder alert = new AlertDialog.Builder(alertLayout.getRootView().getContext(), R.style.MyDialogTheme1);

                alert.setView(alertLayout);
                alert.setCancelable(true);
                final AlertDialog dialog1 = alert.create();
                dialog1.show();



                Button c1 = (Button) alertLayout.findViewById(R.id.c1);
                Button c2 = (Button) alertLayout.findViewById(R.id.c2);
                Button c3 = (Button) alertLayout.findViewById(R.id.c3);
                Button c4 = (Button) alertLayout.findViewById(R.id.c4);
                Button c5 = (Button) alertLayout.findViewById(R.id.c5);
                Button c6 = (Button) alertLayout.findViewById(R.id.c6);
                Button c7 = (Button) alertLayout.findViewById(R.id.c7);
                Button c8 = (Button) alertLayout.findViewById(R.id.c8);
                Button c9 = (Button) alertLayout.findViewById(R.id.c9);
                Button c10 = (Button) alertLayout.findViewById(R.id.c10);
                Button c11 = (Button) alertLayout.findViewById(R.id.c11);
                Button c12 = (Button) alertLayout.findViewById(R.id.c12);

                 save = (Button) alertLayout.findViewById(R.id.save);
                 cancel = (Button) alertLayout.findViewById(R.id.cancel);
                colorview = (Button) alertLayout.findViewById(R.id.colorview);

                final Button btup = (Button) alertLayout.findViewById(R.id.up);
                final Button btdown = (Button) alertLayout.findViewById(R.id.down);
                tvspeed = (TextView) alertLayout.findViewById(R.id.tvspeed);
                brightness = (SeekBar) alertLayout.findViewById(R.id.brightness);
                flash = (Button) alertLayout.findViewById(R.id.flash);
                strobe = (Button) alertLayout.findViewById(R.id.strobe);
                fade = (Button) alertLayout.findViewById(R.id.fade);
                smooth = (Button) alertLayout.findViewById(R.id.smooth);


                cancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog1.dismiss();
                    }
                });

                save.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        CharSequence z = colorview.getText();
                        if (z.equals("")) {
                            fsfs_speed ="000";
                            int color ;
                            Drawable background = colorview.getBackground();
                            if (background instanceof ColorDrawable) {
                                color = ((ColorDrawable) background).getColor();
                                Integer intColor = color;
                                String hexColor = "#" + Integer.toHexString(intColor).substring(2);
                                rrr = Integer.valueOf(hexColor.substring(1, 3), 16);
                                ggg = Integer.valueOf(hexColor.substring(3, 5), 16);
                                bbb = Integer.valueOf(hexColor.substring(5, 7), 16);

                                color_fsfs = "112";
                                int m = brightness.getProgress();
                                if (m == 1) {
                                    color_bright = 131;
                                } else if (m == 2) {
                                    color_bright = 132;
                                } else if (m == 3) {
                                    color_bright = 133;
                                    // colorview.setText(String.valueOf(color_bright));
                                } else if (m == 4) {
                                    color_bright = 134;
                                } else if (m == 5) {
                                    color_bright = 135;
                                } else if (m == 6) {
                                    color_bright = 136;
                                } else if (m == 7) {
                                    color_bright = 137;
                                } else if (m == 8) {
                                    color_bright = 138;
                                } else if (m == 9) {
                                    color_bright = 139;
                                } else if (m == 10) {
                                    color_bright = 140;
                                }

                            }


                        } else {
                            CharSequence fs = colorview.getText();
                            if (fs.equals("FLASH")) {
                                fsfs = "104";
                            } else if (fs.equals("STROBE")) {
                                fsfs = "105";
                            } else if (fs.equals("FADE")) {
                                fsfs = "106";
                            } else if (fs.equals("SMOOTH")) {
                                fsfs = "107";
                            }

                            color_fsfs = fsfs;
                            rrr = 0;
                            ggg = 0;
                            bbb = 0;


                            int m = brightness.getProgress();
                            if (m == 1) {
                                color_bright = 131;
                            } else if (m == 2) {
                                color_bright = 132;
                            } else if (m == 3) {
                                color_bright = 133;
                                // colorview.setText(String.valueOf(color_bright));
                            } else if (m == 4) {
                                color_bright = 134;
                            } else if (m == 5) {
                                color_bright = 135;
                            } else if (m == 6) {
                                color_bright = 136;
                            } else if (m == 7) {
                                color_bright = 137;
                            } else if (m == 8) {
                                color_bright = 138;
                            } else if (m == 9) {
                                color_bright = 139;
                            } else if (m == 10) {
                                color_bright = 140;
                            }


                            tvspeed1 = tvspeed.getTag();
                            //  Drawable ggggg = colorview.getBackground();
                            if (tvspeed1.equals(0)) {
                                fsfs_speed = "120";
                            }
                            if (tvspeed1.equals(1)) {
                                fsfs_speed = "121";
                            } else if (tvspeed1.equals(2)) {
                                fsfs_speed = "122";
                            } else if (tvspeed1.equals(3)) {
                                fsfs_speed = "123";
                            } else if (tvspeed1.equals(4)) {
                                fsfs_speed = "124";
                            } else if (tvspeed1.equals(5)) {
                                fsfs_speed = "125";
                            } else if (tvspeed1.equals(6)) {
                                fsfs_speed = "126";
                            } else if (tvspeed1.equals(7)) {
                                fsfs_speed = "127";
                            } else if (tvspeed1.equals(8)) {
                                fsfs_speed = "128";
                            } else if (tvspeed1.equals(9)) {
                                fsfs_speed = "129";
                            } else if (tvspeed1.equals(10)) {
                                fsfs_speed = "130";
                            } else {
                                fsfs_speed = "000";
                            }

                        }
                        dialog1.dismiss();
                    }
                });

                brightness.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress,
                                                  boolean fromUser) {

                        // colorview.setText(String.valueOf(progress));

                        if (progress == 1) {
                            color_bright = 131;
                        } else if (progress == 2) {
                            color_bright = 132;
                        } else if (progress == 3) {
                            color_bright = 133;
                            // colorview.setText(String.valueOf(color_bright));
                        } else if (progress == 4) {
                            color_bright = 134;
                        } else if (progress == 5) {
                            color_bright = 135;
                        } else if (progress == 6) {
                            color_bright = 136;
                        } else if (progress == 7) {
                            color_bright = 137;
                        } else if (progress == 8) {
                            color_bright = 138;
                        } else if (progress == 9) {
                            color_bright = 139;
                        } else if (progress == 10) {
                            color_bright = 140;
                        }

                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                    }
                });

                c1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        colorview.setBackgroundColor(Color.parseColor("#F9F600"));
                        colorview.setText("");

                        disableflashstrobe();
                    }
                });
                c2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        colorview.setBackgroundColor(Color.parseColor("#FEBE50"));
                        colorview.setText("");
                        disableflashstrobe();

                    }
                });
                c3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        colorview.setBackgroundColor(Color.parseColor("#F7913C"));
                        colorview.setText("");
                        disableflashstrobe();

                    }
                });

                c4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        colorview.setBackgroundColor(Color.parseColor("#F3703C"));
                        colorview.setText("");
                        disableflashstrobe();

                    }
                });
                c5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        colorview.setBackgroundColor(Color.parseColor("#EA1D24"));
                        colorview.setText("");
                        disableflashstrobe();

                    }
                });
                c6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        colorview.setBackgroundColor(Color.parseColor("#9F0064"));
                        colorview.setText("");
                        disableflashstrobe();

                    }
                });
                c7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        colorview.setBackgroundColor(Color.parseColor("#892891"));
                        colorview.setText("");
                        disableflashstrobe();

                    }
                });
                c8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        colorview.setBackgroundColor(Color.parseColor("#5F6EB3"));
                        colorview.setText("");
                        disableflashstrobe();

                    }
                });
                c9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        colorview.setBackgroundColor(Color.parseColor("#0293D4"));
                        colorview.setText("");
                        disableflashstrobe();

                    }
                });
                c10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        colorview.setBackgroundColor(Color.parseColor("#009F8B"));
                        colorview.setText("");
                        disableflashstrobe();

                    }
                });
                c11.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        colorview.setBackgroundColor(Color.parseColor("#51B747"));
                        colorview.setText("");
                        disableflashstrobe();

                    }
                });
                c12.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        colorview.setBackgroundColor(Color.parseColor("#FFFFFF"));
                        colorview.setText("");
                        disableflashstrobe();

                    }
                });


                flash.setTag(0);
                flash.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (view.getTag().equals(0)) {
                            flash.setBackgroundResource(R.drawable.flash01);
                            strobe.setBackgroundResource(R.drawable.strobe);
                            fade.setBackgroundResource(R.drawable.fade);
                            smooth.setBackgroundResource(R.drawable.smooth);
                            colorview.setBackgroundResource(R.drawable.indicator_background);
                            // view.setTag(1);

                            String fls = "FLASH";
                            colorview.setText(fls);
                        } else {
                            flash.setBackgroundResource(R.drawable.flash);
                            //view.setTag(0);
                        }
                    }
                });

                strobe.setTag(0);
                strobe.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (view.getTag().equals(0)) {

                            strobe.setBackgroundResource(R.drawable.strobe01);
                            // view.setTag(1);
                            flash.setBackgroundResource(R.drawable.flash);
                            fade.setBackgroundResource(R.drawable.fade);

                            smooth.setBackgroundResource(R.drawable.smooth);
                            colorview.setBackgroundResource(R.drawable.indicator_background);
                            String str = "STROBE";
                            colorview.setText(str);
                        } else {
                            strobe.setBackgroundResource(R.drawable.strobe);
                            // view.setTag(0);
                        }
                    }
                });

                fade.setTag(0);
                fade.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (view.getTag().equals(0)) {
                            fade.setBackgroundResource(R.drawable.fade01);
                            flash.setBackgroundResource(R.drawable.flash);
                            strobe.setBackgroundResource(R.drawable.strobe);
                            smooth.setBackgroundResource(R.drawable.smooth);
                            colorview.setBackgroundResource(R.drawable.indicator_background);
                            //   view.setTag(1);
                            String fad = "FADE";
                            colorview.setText(fad);
                        } else {
                            fade.setBackgroundResource(R.drawable.fade);
                            // view.setTag(0);
                        }
                    }
                });

                smooth.setTag(0);
                smooth.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (view.getTag().equals(0)) {
                            smooth.setBackgroundResource(R.drawable.smooth01);
                            strobe.setBackgroundResource(R.drawable.strobe);
                            flash.setBackgroundResource(R.drawable.flash);
                            fade.setBackgroundResource(R.drawable.fade);
                            colorview.setBackgroundResource(R.drawable.indicator_background);
                            // view.setTag(1);
                            String fls = "SMOOTH";
                            colorview.setText(fls);
                        } else {
                            smooth.setBackgroundResource(R.drawable.smooth);
                            //view.setTag(0);
                        }
                    }
                });

                final int[] count = {0};
                btup.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        btup.setEnabled(true);
                        count[0]++;
                        if (count[0] == 0) {
                            tvspeed.setBackgroundResource(R.drawable.spzero);
                            // tvspeed.setTag(0);
                        } else if (count[0] == 1) {
                            tvspeed.setBackgroundResource(R.drawable.spone);

                            tvspeed.setTag(1);
                        } else if (count[0] == 2) {
                            tvspeed.setBackgroundResource(R.drawable.sptwo);
                            tvspeed.setTag(2);
                        } else if (count[0] == 3) {
                            tvspeed.setBackgroundResource(R.drawable.spthree);
                            tvspeed.setTag(3);
                        } else if (count[0] == 4) {
                            tvspeed.setBackgroundResource(R.drawable.spfour);
                            tvspeed.setTag(4);
                        } else if (count[0] == 5) {
                            tvspeed.setBackgroundResource(R.drawable.spfive);
                            tvspeed.setTag(5);
                        } else if (count[0] == 6) {
                            tvspeed.setBackgroundResource(R.drawable.spsix);
                            tvspeed.setTag(6);
                        } else if (count[0] == 7) {
                            tvspeed.setBackgroundResource(R.drawable.spseven);
                            tvspeed.setTag(7);
                        } else if (count[0] == 8) {
                            tvspeed.setBackgroundResource(R.drawable.speight);
                            tvspeed.setTag(8);
                        } else if (count[0] == 9) {
                            tvspeed.setBackgroundResource(R.drawable.spnine);
                            tvspeed.setTag(9);
                        } else if (count[0] == 10) {
                            tvspeed.setBackgroundResource(R.drawable.spten);
                            tvspeed.setTag(10);
                        } else if (count[0] == 11) {
                            btup.setEnabled(false);
                            count[0]--;
                        }


                        //tvspeed.setText(String.valueOf(count[0]));
                        btup.setEnabled(true);

                    }
                });

                btdown.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        btdown.setEnabled(true);
                        count[0]--;

                        if (count[0] == -1) {
                            btdown.setEnabled(false);
                            count[0]++;
                        } else if (count[0] == 0) {
                            tvspeed.setBackgroundResource(R.drawable.spzero);
                            tvspeed.setTag(0);
                        } else if (count[0] == 1) {
                            tvspeed.setBackgroundResource(R.drawable.spone);
                            tvspeed.setTag(1);
                        } else if (count[0] == 2) {
                            tvspeed.setBackgroundResource(R.drawable.sptwo);
                            tvspeed.setTag(2);
                        } else if (count[0] == 3) {
                            tvspeed.setBackgroundResource(R.drawable.spthree);
                            tvspeed.setTag(3);
                        } else if (count[0] == 4) {
                            tvspeed.setBackgroundResource(R.drawable.spfour);
                            tvspeed.setTag(4);
                        } else if (count[0] == 5) {
                            tvspeed.setBackgroundResource(R.drawable.spfive);
                            tvspeed.setTag(5);
                        } else if (count[0] == 6) {
                            tvspeed.setBackgroundResource(R.drawable.spsix);
                            tvspeed.setTag(6);
                        } else if (count[0] == 7) {
                            tvspeed.setBackgroundResource(R.drawable.spseven);
                            tvspeed.setTag(7);
                        } else if (count[0] == 8) {
                            tvspeed.setBackgroundResource(R.drawable.speight);
                            tvspeed.setTag(8);
                        } else if (count[0] == 9) {
                            tvspeed.setBackgroundResource(R.drawable.spnine);
                            tvspeed.setTag(9);
                        } else if (count[0] == 10) {
                            tvspeed.setBackgroundResource(R.drawable.spten);
                            tvspeed.setTag(10);
                        }
                        btdown.setEnabled(true);
                    }

                });

                dialog1.getWindow().setLayout(400, 450);
                dialog1.show();;
            }
        });


        tv.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG);
        rb1 = (RadioButton) alertLayout.findViewById(R.id.rb1);
        rb2 = (RadioButton) alertLayout.findViewById(R.id.rb2);
        rb3 = (RadioButton) alertLayout.findViewById(R.id.rb3);
         ld1 = (LinearLayout) alertLayout.findViewById(R.id.ld1);
         ld2 = (LinearLayout) alertLayout.findViewById(R.id.ld2);
        ld3 = (LinearLayout) alertLayout.findViewById(R.id.ld3);
        ld4 = (LinearLayout) alertLayout.findViewById(R.id.ld4);
         ld5 = (LinearLayout) alertLayout.findViewById(R.id.ld5);
        ld6 = (LinearLayout) alertLayout.findViewById(R.id.ld6);


        rb1.setEnabled(true);
        rb2.setEnabled(true);
        rb3.setEnabled(true);


        rb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (rb1.isChecked()) {
                    rb1();
                }
            }
        });


        rb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (rb2.isChecked()) {
                  rb2();
                }
            }
        });

        rb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (rb3.isChecked()) {
                   rb3();
                }
            }
        });

        numberpicker();


        //dialog.getWindow().setLayout(450, 650);






        // dialog.dismiss();
    }

    private void postupdins() {
        HttpClient httpClient = null;
        HttpPost httpPost = null;
        List<NameValuePair> nameValuePair = null;

            httpClient = new DefaultHttpClient();
            httpPost = new HttpPost("http://192.168.1.101/settimer1.php");
            String trdata = repdata;
            nameValuePair = new ArrayList<>(5);
            nameValuePair.add(new BasicNameValuePair("trdata", trdata));
            nameValuePair.add(new BasicNameValuePair("type", pushtype));
            nameValuePair.add(new BasicNameValuePair("status", "ins"));
            nameValuePair.add(new BasicNameValuePair("user", "admin12345"));
            nameValuePair.add(new BasicNameValuePair("pass", "12345678"));


        // Url Encoding the POST parameters
        try {
            httpPost.setEntity(new UrlEncodedFormEntity(nameValuePair));
        } catch (UnsupportedEncodingException e) {

            e.printStackTrace();
        }

        // Making HTTP Request
        try {
            final HttpResponse response = httpClient.execute(httpPost);


            HttpEntity entity = response.getEntity();
            if (entity != null) {
                responseBody = EntityUtils.toString(entity);

                */
/*JSONObject j = new JSONObject(responseBody);
                responseBody = j.getString("data");*//*


                Log.d("TAG", "Http post Response: " + responseBody);
            }
            Log.d("TAG", responseBody);

            final String finalResponseBody = responseBody;

            runOnUiThread(new Runnable() {
                @Override
                public void run() {

                    tvvv.setText(finalResponseBody);


                }
            });
        } catch (IOException e) {
            // writing exception to log
            e.printStackTrace();

        } */
/*catch (JSONException e) {
            e.printStackTrace();
        }*//*


    }


    void disableflashstrobe()
    {
        flash.setBackgroundResource(R.drawable.flash);
        strobe.setBackgroundResource(R.drawable.strobe);
        fade.setBackgroundResource(R.drawable.fade);
        smooth.setBackgroundResource(R.drawable.smooth);
    }


    private void rb1() {
        if (!flag2) {
            rb1.setChecked(true);
            rb2.setChecked(false);
            rb3.setChecked(false);
            flag2 = true;
            flag1 = false;
            flag3 = false;
            np5.setEnabled(false);
            np6.setEnabled(false);
            np7.setEnabled(false);
            np8.setEnabled(false);
            np9.setEnabled(false);
            tvon.setEnabled(false);
            tvoff.setEnabled(false);

            sunday.setEnabled(true);
            monday.setEnabled(true);
            tuesday.setEnabled(true);
            wednesday.setEnabled(true);
            thusday.setEnabled(true);
            friday.setEnabled(true);
            saturday.setEnabled(true);
            // rb3.setEnabled(false);
            // rb2.setEnabled(false);
            ld3.setAlpha((float) 0.5);
            ld4.setAlpha((float) 0.5);
            ld5.setAlpha((float) 0.5);
            ld6.setAlpha((float) 0.5);
            repeat.setAlpha(1.0f);
            ld1.setAlpha((float) 1.0);
            ld2.setAlpha((float) 1.0);


        } else {
            flag2 = false;
            rb1.setChecked(false);
            rb2.setChecked(false);
            rb3.setChecked(false);
            np5.setEnabled(true);
            np6.setEnabled(true);
            np7.setEnabled(true);
            np8.setEnabled(true);
            np9.setEnabled(true);
            tvon.setEnabled(true);
            tvoff.setEnabled(true);
            // rb3.setEnabled(true);
            // rb2.setEnabled(true);
            ld3.setAlpha((float) 1.0);
            ld4.setAlpha((float) 1.0);
            ld5.setAlpha((float) 1.0);
            ld6.setAlpha((float) 1.0);
        }
    }

    private void rb3() {
        if (!flag3) {
            rb3.setChecked(true);
            rb1.setChecked(false);
            rb2.setChecked(false);
            flag3 = true;
            flag1 = false;
            flag2 = false;
            np5.setEnabled(false);
            np6.setEnabled(false);
            tvon.setEnabled(false);
            tvoff.setEnabled(false);
            //rb1.setEnabled(false);
            //rb2.setEnabled(false);
            repeat.setAlpha(0.5f);
            np7.setEnabled(true);
            np8.setEnabled(true);
            np9.setEnabled(true);
            ld1.setEnabled(false);
            ld2.setEnabled(false);
            sunday.setEnabled(false);
            monday.setEnabled(false);
            tuesday.setEnabled(false);
            wednesday.setEnabled(false);
            thusday.setEnabled(false);
            friday.setEnabled(false);
            saturday.setEnabled(false);

            ld1.setAlpha((float) 0.5);
            ld2.setAlpha((float) 0.5);
            ld3.setAlpha((float) 0.5);
            ld4.setAlpha((float) 0.5);
            ld5.setAlpha((float) 1.0);
            ld6.setAlpha((float) 1.0);
        } else {
            flag3 = false;
            rb1.setChecked(false);
            rb2.setChecked(false);
            rb3.setChecked(false);
            np5.setEnabled(true);
            np6.setEnabled(true);
            tvon.setEnabled(true);
            tvoff.setEnabled(true);
            ld1.setEnabled(true);
            ld2.setEnabled(true);
            sunday.setEnabled(true);
            monday.setEnabled(true);
            tuesday.setEnabled(true);
            wednesday.setEnabled(true);
            thusday.setEnabled(true);
            friday.setEnabled(true);
            saturday.setEnabled(true);
            // rb1.setEnabled(true);
            //rb2.setEnabled(true);
            repeat.setAlpha(1.0f);
            ld1.setAlpha((float) 1.0);
            ld2.setAlpha((float) 1.0);
            ld3.setAlpha((float) 1.0);
            ld4.setAlpha((float) 1.0);
        }
    }

    private void rb2() {
        if (!flag1) {
            rb2.setChecked(true);
            rb1.setChecked(false);
            rb3.setChecked(false);
            flag1 = true;
            flag2 = false;
            flag3 = false;
            np7.setEnabled(false);
            np8.setEnabled(false);
            np9.setEnabled(false);
            // rb1.setEnabled(false);
            // rb3.setEnabled(false);
            repeat.setAlpha(0.5f);
            np5.setEnabled(true);
            np6.setEnabled(true);
            tvon.setEnabled(true);
            tvoff.setEnabled(true);

            ld1.setEnabled(false);
            ld2.setEnabled(false);
            sunday.setEnabled(false);
            monday.setEnabled(false);
            tuesday.setEnabled(false);
            wednesday.setEnabled(false);
            thusday.setEnabled(false);
            friday.setEnabled(false);
            saturday.setEnabled(false);
            ld1.setAlpha((float) 0.5);
            ld2.setAlpha((float) 0.5);
            ld5.setAlpha((float) 0.5);
            ld6.setAlpha((float) 0.5);
            ld3.setAlpha((float) 1.0);
            ld4.setAlpha((float) 1.0);
        } else {
            flag1 = false;
            rb1.setChecked(false);
            rb2.setChecked(false);
            rb3.setChecked(false);

            np7.setEnabled(true);
            np8.setEnabled(true);
            np9.setEnabled(true);
            // rb1.setEnabled(true);
            // rb3.setEnabled(true);

            ld1.setEnabled(true);
            ld2.setEnabled(true);
            sunday.setEnabled(true);
            monday.setEnabled(true);
            tuesday.setEnabled(true);
            wednesday.setEnabled(true);
            thusday.setEnabled(true);
            friday.setEnabled(true);
            saturday.setEnabled(true);
            repeat.setAlpha(1.0f);
            ld1.setAlpha((float) 1.0);
            ld2.setAlpha((float) 1.0);
            ld5.setAlpha((float) 1.0);
            ld6.setAlpha((float) 1.0);

        }
    }

    void  numberpicker(){
        np = (NumberPicker) alertLayout.findViewById(R.id.numberPicker1);
        //np.setPadding(10, 10, 10, 0);
        np.setMaxValue(23); // max value 100
        np.setMinValue(0);   // min value zero
        np.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);


        //  np.setWrapSelectorWheel(false);
        // np.setOnValueChangedListener( this);
        np1 = (NumberPicker) alertLayout.findViewById(R.id.numberPicker2);
        np1.setMaxValue(59); // max value 100
        np1.setMinValue(0);   // min value zero
        np1.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);

        np2 = (NumberPicker) alertLayout.findViewById(R.id.numberPicker3);
        np2.setMaxValue(23); // max value 100
        np2.setMinValue(0);   // min value zero
        np2.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);

        np3 = (NumberPicker) alertLayout.findViewById(R.id.numberPicker4);
        np3.setMaxValue(59); // max value 100
        np3.setMinValue(0);   // min value zero
        np3.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);


        np5 = (NumberPicker) alertLayout.findViewById(R.id.numberPicker5);
        np5.setMaxValue(59); // max value 100
        np5.setMinValue(0);   // min value zero
        np5.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);

        np6 = (NumberPicker) alertLayout.findViewById(R.id.numberPicker6);
        np6.setMaxValue(59); // max value 100
        np6.setMinValue(0);   // min value zero
        np6.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);


        np7 = (NumberPicker) alertLayout.findViewById(R.id.numberPicker7);
        np7.setMaxValue(31); // max value 100
        np7.setMinValue(1);   // min value zero
        np7.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);

        np8 = (NumberPicker) alertLayout.findViewById(R.id.numberPicker8);
        // NumberPicker pickers = new NumberPicker(this);
        String[] arrayPicker = new String[]{"","JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};

        //set min value zero
        //np8.setMinValue(0);
        //set max value from length array string reduced 1
        np8.setMaxValue(arrayPicker.length-1);
        //implement array string to number picker
        np8.setDisplayedValues(arrayPicker);
        //disable soft keyboard
        np8.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);
        //set wrap true or false, try it you will know the difference


        np9 = (NumberPicker) alertLayout.findViewById(R.id.numberPicker9);
        np9.setMaxValue(2050); // max value 100
        np9.setMinValue(1990);   // min value zero
        np9.setDescendantFocusability(NumberPicker.FOCUS_BLOCK_DESCENDANTS);

        np.setFormatter(new NumberPicker.Formatter() {
            @Override
            public String format(int i) {
                return String.format("%02d", i);
            }
        });
        np1.setFormatter(new NumberPicker.Formatter() {
            @Override
            public String format(int i) {
                return String.format("%02d", i);
            }
        });
        np2.setFormatter(new NumberPicker.Formatter() {
            @Override
            public String format(int i) {
                return String.format("%02d", i);
            }
        });
        np3.setFormatter(new NumberPicker.Formatter() {
            @Override
            public String format(int i) {
                return String.format("%02d", i);
            }
        });
        np5.setFormatter(new NumberPicker.Formatter() {
            @Override
            public String format(int i) {
                return String.format("%02d", i);
            }
        });
        np6.setFormatter(new NumberPicker.Formatter() {
            @Override
            public String format(int i) {
                return String.format("%02d", i);
            }
        });
        np7.setFormatter(new NumberPicker.Formatter() {
            @Override
            public String format(int i) {
                return String.format("%02d", i);
            }
        });

        np9.setFormatter(new NumberPicker.Formatter() {
            @Override
            public String format(int i) {
                return String.format("%04d", i);
            }
        });

    }

}

*/
