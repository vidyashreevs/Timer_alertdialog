package com.pcsalt.example.customalertdialog;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static com.pcsalt.example.customalertdialog.EditTime.responseBody;
import static com.pcsalt.example.customalertdialog.R.id.simpleListView;

public  class CustomAdapter extends BaseAdapter{

    static Context context;
    public static LayoutInflater inflater;
    static Holder holder;


   // String type1;
  static Object ont,offt,typ,day,datee,on,offff,devname,ondatare,offdatare,devtype,devicenum,switchnumber,repeaweekly,timee,dateee;
    ArrayList  num,devicename,devicetype,type,switchnum,days,date,time,ontimerep,ondatarep,offdatarep,repeatweekly,ontime,offtime,offtimerep,devinum;

      ArrayList offtime3;
    static String roomnumber;

    public CustomAdapter(EditTime mainActivity, ArrayList num,  ArrayList devicename, ArrayList devicetype, ArrayList type, ArrayList switchnum, ArrayList days, ArrayList date,ArrayList time, ArrayList ontimerep, ArrayList ondatarep, ArrayList offdatarep, ArrayList repeatweekly,ArrayList ontime,ArrayList offtime,ArrayList offtimerep,ArrayList devinum) {
        context=  mainActivity;
        this.num=num;
        this.devicename=devicename;
        this.devicetype=devicetype;
        this.type=type;
        this.switchnum=switchnum;
        this.days=days;
        this.date=date;

        this.time=time;
        this.ontimerep=ontimerep;
        this.ondatarep=ondatarep;
        this.offdatarep=offdatarep;
        this.repeatweekly=repeatweekly;
        this.ontime=ontime;
        this.offtime=offtime;
        this.offtimerep=offtimerep;
        this.devinum=devinum;
       // devicename=devicename;
        //inflater = ( LayoutInflater )context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // inflater = LayoutInflater.from(context);
         inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }




    @Override
    public int getCount() {

        return devicename.size();

    }

    @Override
    public Object getItem(int position) {

        return position;
    }

    @Override
    public long getItemId(int position) {

        return position;
    }




    public static class Holder
    {
        TextView num;
        TextView devicename,switch1,ontime,offtime,type,data;
        ImageButton edit,delete;
    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
         holder=new Holder();
        final View rowView;

        rowView = inflater.inflate(R.layout.single_item_list, null);
        holder.num=(TextView) rowView.findViewById(R.id.num);
        holder.devicename=(TextView) rowView.findViewById(R.id.devicename);
        holder.switch1=(TextView) rowView.findViewById(R.id.switch1);
        holder.ontime=(TextView) rowView.findViewById(R.id.ontime);
        holder.offtime=(TextView) rowView.findViewById(R.id.offtime);
        holder.type=(TextView) rowView.findViewById(R.id.type1);
        holder.data=(TextView) rowView.findViewById(R.id.data);
        holder.edit=(ImageButton) rowView.findViewById(R.id.edit);
        holder.delete=(ImageButton) rowView.findViewById(R.id.delete);


        holder.devicename.setText((CharSequence) devicename.get(position));
        holder.switch1.setText((CharSequence) switchnum.get(position));
        holder.ontime.setText((CharSequence) ontimerep.get(position));
        holder.offtime.setText((CharSequence) offtimerep.get(position));
      holder.type.setText((CharSequence) type.get(position));
        holder.data.setText((CharSequence) date.get(position));

       /* int pos = position+1;
        holder.num.setText(pos);
        pos++;
*/

        holder.delete.setTag(position);
        holder.delete.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(final View v) {

                Integer index = (Integer) v.getTag();
                devname = devicename.get(index.intValue());
                devtype = devicetype.get(index.intValue());
                typ = type.get(index.intValue());
                switchnumber = switchnum.get(index.intValue());
                day = days.get(index.intValue());
                dateee = date.get(index.intValue());
                timee = time.get(index.intValue());
                ont = ontimerep.get(index.intValue());
                ondatare = ondatarep.get(index.intValue());
                offdatare = offdatarep.get(index.intValue());
                repeaweekly = repeatweekly.get(index.intValue());
                on = ontime.get(index.intValue());
                offff = offtime.get(index.intValue());
                offt = offtimerep.get(index.intValue());
                devicenum = devinum.get(index.intValue());


                if (devname.equals("S051") || devname.equals("S021")|| devname.equals("S020")|| devname.equals("SWB")) {
                    roomnumber = "01";
                    if (typ.equals("Repeat On Days")) {
                        EditTime r = new EditTime();
                        r.delete_reprow();
                    } else if (typ.equals("Repeat On Date")) {
                        EditTime r = new EditTime();
                        r.delete_reprow();
                    } else if (typ.equals("Cyclic")) {
                        EditTime r = new EditTime();
                        r.delete_cycrow();
                    }
                    final Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            if (responseBody.equals("*DACK#")) {
                                //Toast.makeText(view.getContext(),"Data updated successfully",Toast.LENGTH_LONG).show();
                                //dialog.dismiss();
                                AlertDialog.Builder builder1 = new AlertDialog.Builder(v.getContext());
                                builder1.setTitle("INFO");
                                builder1.setMessage("Switch="+switchnumber + " Deleted successfully");
                                builder1.setCancelable(true);
                                builder1.setNeutralButton(android.R.string.ok,
                                        new DialogInterface.OnClickListener() {
                                            public void onClick(DialogInterface dialog123, int id) {
                                                dialog123.cancel();

                                            }
                                        });

                                AlertDialog alert11 = builder1.create();
                                alert11.show();
                            }


                        }
                    }, 1200);
                }

                else   if(devname.equals("RGB"))
                {
                    //ebbackup
                   // roomnumber="03";
                    roomnumber="01";
                    if (typ.equals("Repeat On Days")) {
                        EditTime r=new EditTime();
                        r.delete_reprow();
                    }
                    else if (typ.equals("Repeat On Date")) {
                        EditTime r=new EditTime();
                        r.delete_reprow();
                    }
                    else if (typ.equals("Cyclic")) {
                        EditTime r=new EditTime();
                        r.delete_cycrow();
                    }
                    final Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            if (responseBody.equals("*DACK#")) {
                                //Toast.makeText(view.getContext(),"Data updated successfully",Toast.LENGTH_LONG).show();
                                //dialog.dismiss();
                                AlertDialog.Builder builder1 = new AlertDialog.Builder(v.getContext());
                                builder1.setTitle("INFO");
                                builder1.setMessage("Switch="+switchnumber + " Deleted successfully");
                                builder1.setCancelable(true);
                                builder1.setNeutralButton(android.R.string.ok,
                                        new DialogInterface.OnClickListener() {
                                            public void onClick(DialogInterface dialog123, int id) {
                                                dialog123.cancel();

                                            }
                                        });

                                AlertDialog alert11 = builder1.create();
                                alert11.show();
                            }


                        }
                    }, 1200);
                }
                else   if(devname.equals("DMR"))
                {
                    roomnumber="01";
                    if (typ.equals("Repeat On Days")) {
                        EditTime r=new EditTime();
                        r.delete_reprow();
                    }
                    else if (typ.equals("Repeat On Date")) {
                        EditTime r=new EditTime();
                        r.delete_reprow();
                    }
                    else if (typ.equals("Cyclic")) {
                        EditTime r=new EditTime();
                        r.delete_cycrow();
                    }
                    final Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            if (responseBody.equals("*DACK#")) {
                                //Toast.makeText(view.getContext(),"Data updated successfully",Toast.LENGTH_LONG).show();
                                //dialog.dismiss();
                                AlertDialog.Builder builder1 = new AlertDialog.Builder(v.getContext());
                                builder1.setTitle("INFO");
                                builder1.setMessage("Switch="+switchnumber + " Deleted successfully");
                                builder1.setCancelable(true);
                                builder1.setNeutralButton(android.R.string.ok,
                                        new DialogInterface.OnClickListener() {
                                            public void onClick(DialogInterface dialog123, int id) {
                                                dialog123.cancel();

                                            }
                                        });

                                AlertDialog alert11 = builder1.create();
                                alert11.show();
                            }


                        }
                    }, 1200);
                }




            }
        });

        holder.edit.setTag(position);

        holder.edit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                Integer index = (Integer) view.getTag();
                 ont = ontimerep.get(index.intValue());
                devname = devicename.get(index.intValue());
                devtype = devicetype.get(index.intValue());
                devicenum = devinum.get(index.intValue());
                switchnumber = switchnum.get(index.intValue());
                repeaweekly = repeatweekly.get(index.intValue());
                timee = time.get(index.intValue());

                offt = offtimerep.get(index.intValue());
                typ = type.get(index.intValue());
                day = days.get(index.intValue());

                on = ontime.get(index.intValue());
                offff = offtime.get(index.intValue());
                dateee = date.get(index.intValue());

                ondatare = ondatarep.get(index.intValue());
                offdatare = offdatarep.get(index.intValue());

                datee = date.get(index.intValue());


                if(devname.equals("S051") || devname.equals("S021")||devname.equals("SWB") || devname.equals("S020"))
                {
                    EditTime r=new EditTime();
                    roomnumber="01";
                    r.switch21();
                }
                else   if(devname.equals("RGB"))
                {
                    EditTime r=new EditTime();
                  //  roomnumber="03";
                    roomnumber="01";
                    r.rgb();
                }
                else   if(devname.equals("DMR"))
                {
                    EditTime r=new EditTime();
                    roomnumber="01";
                    r.dimmer();

                }






            }
        });
        rowView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
              //  Toast.makeText(context, "You Clicked "+ result.get(position), Toast.LENGTH_LONG).show();
            }
        });
        return rowView;
    }

}