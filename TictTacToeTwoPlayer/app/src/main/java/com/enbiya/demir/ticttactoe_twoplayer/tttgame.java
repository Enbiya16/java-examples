package com.enbiya.demir.ticttactoe_twoplayer;

import androidx.annotation.ColorRes;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class tttgame extends AppCompatActivity implements View.OnClickListener {




    TextView score_o,score_x,turntext;
    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9;

    int r1c1=2;
    int r1c2=2;
    int r1c3=2;
    int r2c1=2;
    int r2c2=2;
    int r2c3=2;
    int r3c1=2;
    int r3c2=2;
    int r3c3=2;

    int turn=1;

    int x=0;
    int o=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tttgame);
        getSupportActionBar().hide();

        //xml tanımlamaları

        score_o=(TextView)findViewById(R.id.score_o);
        score_x=(TextView)findViewById(R.id.score_x);
        turntext=(TextView)findViewById(R.id.turntext);

        bt1=(Button)findViewById(R.id.button_1);
        bt2=(Button)findViewById(R.id.button_2);
        bt3=(Button)findViewById(R.id.button_3);
        bt4=(Button)findViewById(R.id.button_4);
        bt5=(Button)findViewById(R.id.button_5);
        bt6=(Button)findViewById(R.id.button_6);
        bt7=(Button)findViewById(R.id.button_7);
        bt8=(Button)findViewById(R.id.button_8);
        bt9=(Button)findViewById(R.id.button_9);


        //x=1 o=0 empty=2

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (turn==1 && r1c1==2){bt1.setText("X");
                    r1c1=1;
                    turn=0;
                    turntext.setText("Turn:O");
                    turntext.setTextColor(Color.parseColor("#0000FF"));
                }

                else if(turn==0 && r1c1==2){bt1.setText("O");
                    r1c1=0;
                    turn=1;
                    turntext.setText("Turn:X");
                    turntext.setTextColor(Color.parseColor("#FF0000"));


                }
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (turn==1 && r1c2==2){bt2.setText("X");
                    r1c1=1;
                    turn=0;
                    turntext.setText("Turn:O");
                    turntext.setTextColor(Color.parseColor("#0000FF"));
                }

                else if(turn==0 && r1c2==2){bt2.setText("O");
                    r1c1=0;
                    turn=1;
                    turntext.setText("Turn:X");
                    turntext.setTextColor(Color.parseColor("#FF0000"));
                }
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (turn==1 && r1c3==2){bt3.setText("X");
                    r1c1=1;
                    turn=0;
                    turntext.setText("Turn:O");
                    turntext.setTextColor(Color.parseColor("#0000FF"));
                }

                else if(turn==0 && r1c3==2){bt3.setText("O");
                    r1c1=0;
                    turn=1;
                    turntext.setText("Turn:X");
                    turntext.setTextColor(Color.parseColor("#FF0000"));
                }
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (turn==1 && r2c1==2){bt4.setText("X");
                    r1c1=1;
                    turn=0;
                    turntext.setText("Turn:O");
                    turntext.setTextColor(Color.parseColor("#0000FF"));
                }

                else if(turn==0 && r2c1==2){bt4.setText("O");
                    r1c1=0;
                    turn=1;
                    turntext.setText("Turn:X");
                    turntext.setTextColor(Color.parseColor("#FF0000"));
                }
            }
        });

        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (turn==1 && r2c2==2){bt5.setText("X");
                    r1c1=1;
                    turn=0;
                    turntext.setText("Turn:O");
                    turntext.setTextColor(Color.parseColor("#0000FF"));
                }

                else if(turn==0 && r2c2==2){bt5.setText("O");
                    r1c1=0;
                    turn=1;
                    turntext.setText("Turn:X");
                    turntext.setTextColor(Color.parseColor("#FF0000"));
                }
            }
        });

        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (turn==1 && r2c3==2){bt6.setText("X");
                    r1c1=1;
                    turn=0;
                    turntext.setText("Turn:O");
                    turntext.setTextColor(Color.parseColor("#0000FF"));
                }

                else if(turn==0 && r2c3==2){bt6.setText("O");
                    r1c1=0;
                    turn=1;
                    turntext.setText("Turn:X");
                    turntext.setTextColor(Color.parseColor("#FF0000"));
                }
            }
        });

        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (turn==1 && r3c1==2){bt7.setText("X");
                    r1c1=1;
                    turn=0;
                    turntext.setText("Turn:O");
                    turntext.setTextColor(Color.parseColor("#0000FF"));
                }

                else if(turn==0 && r3c1==2){bt7.setText("O");
                    r1c1=0;
                    turn=1;
                    turntext.setText("Turn:X");
                    turntext.setTextColor(Color.parseColor("#FF0000"));
                }
            }
        });

        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (turn==1 && r3c2==2){bt8.setText("X");
                    r1c1=1;
                    turn=0;
                    turntext.setText("Turn:O");
                    turntext.setTextColor(Color.parseColor("#0000FF"));
                }

                else if(turn==0 && r3c2==2){bt8.setText("O");
                    r1c1=0;
                    turn=1;
                    turntext.setText("Turn:X");
                    turntext.setTextColor(Color.parseColor("#FF0000"));
                }
            }
        });

        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (turn==1 && r3c3==2){bt9.setText("X");
                    r1c1=1;
                    turn=0;
                    turntext.setText("Turn:O");
                    turntext.setTextColor(Color.parseColor("#0000FF"));
                }

                else if(turn==0 && r3c3==2){bt9.setText("O");
                    r1c1=0;
                    turn=1;
                    turntext.setText("Turn:X");
                    turntext.setTextColor(Color.parseColor("#FF0000"));
                }
            }
        });



        //ana olaylar
// 1. SATIR
        if(r1c1==r1c2 && r1c2==r1c3 && r1c1==0){o++;
            score_o.setText("O:"+o);
            int r1c1=2;
            int r1c2=2;
            int r1c3=2;
            int r2c1=2;
            int r2c2=2;
            int r2c3=2;
            int r3c1=2;
            int r3c2=2;
            int r3c3=2;
            bt1.setText("");
            bt2.setText("");
            bt3.setText("");
            bt4.setText("");
            bt5.setText("");
            bt6.setText("");
            bt7.setText("");
            bt8.setText("");
            bt9.setText("");
        }

        else if(r1c1==r1c2 && r1c2==r1c3 && r1c1==1){x++;
            score_x.setText("X:"+x);
            int r1c1=2;
            int r1c2=2;
            int r1c3=2;
            int r2c1=2;
            int r2c2=2;
            int r2c3=2;
            int r3c1=2;
            int r3c2=2;
            int r3c3=2;
            bt1.setText("");
            bt2.setText("");
            bt3.setText("");
            bt4.setText("");
            bt5.setText("");
            bt6.setText("");
            bt7.setText("");
            bt8.setText("");
            bt9.setText("");
        }

       // 2.SATIR

        else if(r2c1==r2c2 && r2c2==r2c3 && r2c1==0){o++;
            score_o.setText("O:"+o);
            int r1c1=2;
            int r1c2=2;
            int r1c3=2;
            int r2c1=2;
            int r2c2=2;
            int r2c3=2;
            int r3c1=2;
            int r3c2=2;
            int r3c3=2;
            bt1.setText("");
            bt2.setText("");
            bt3.setText("");
            bt4.setText("");
            bt5.setText("");
            bt6.setText("");
            bt7.setText("");
            bt8.setText("");
            bt9.setText("");
        }

        else if(r2c1==r2c2 && r2c2==r2c3 && r2c1==1){x++;
            score_x.setText("X:"+x);
            int r1c1=2;
            int r1c2=2;
            int r1c3=2;
            int r2c1=2;
            int r2c2=2;
            int r2c3=2;
            int r3c1=2;
            int r3c2=2;
            int r3c3=2;
            bt1.setText("");
            bt2.setText("");
            bt3.setText("");
            bt4.setText("");
            bt5.setText("");
            bt6.setText("");
            bt7.setText("");
            bt8.setText("");
            bt9.setText("");
        }

        //3.satır

        else if(r3c1==r3c2 && r3c2==r3c3 && r3c1==0){o++;
            score_o.setText("O:"+o);
            int r1c1=2;
            int r1c2=2;
            int r1c3=2;
            int r2c1=2;
            int r2c2=2;
            int r2c3=2;
            int r3c1=2;
            int r3c2=2;
            int r3c3=2;
            bt1.setText("");
            bt2.setText("");
            bt3.setText("");
            bt4.setText("");
            bt5.setText("");
            bt6.setText("");
            bt7.setText("");
            bt8.setText("");
            bt9.setText("");
        }

        else if(r3c1==r3c2 && r3c2==r3c3 && r3c1==1){x++;
            score_x.setText("X:"+x);
            int r1c1=2;
            int r1c2=2;
            int r1c3=2;
            int r2c1=2;
            int r2c2=2;
            int r2c3=2;
            int r3c1=2;
            int r3c2=2;
            int r3c3=2;
            bt1.setText("");
            bt2.setText("");
            bt3.setText("");
            bt4.setText("");
            bt5.setText("");
            bt6.setText("");
            bt7.setText("");
            bt8.setText("");
            bt9.setText("");
        }

        //1. sutun

        else if(r1c1==r2c1 && r2c1==r3c1 && r1c1==0){o++;
            score_o.setText("O:"+o);
            int r1c1=2;
            int r1c2=2;
            int r1c3=2;
            int r2c1=2;
            int r2c2=2;
            int r2c3=2;
            int r3c1=2;
            int r3c2=2;
            int r3c3=2;
            bt1.setText("");
            bt2.setText("");
            bt3.setText("");
            bt4.setText("");
            bt5.setText("");
            bt6.setText("");
            bt7.setText("");
            bt8.setText("");
            bt9.setText("");
        }

        else if(r1c1==r2c1 && r2c1==r3c1 && r1c1==1){x++;
            score_x.setText("X:"+x);
            int r1c1=2;
            int r1c2=2;
            int r1c3=2;
            int r2c1=2;
            int r2c2=2;
            int r2c3=2;
            int r3c1=2;
            int r3c2=2;
            int r3c3=2;
            bt1.setText("");
            bt2.setText("");
            bt3.setText("");
            bt4.setText("");
            bt5.setText("");
            bt6.setText("");
            bt7.setText("");
            bt8.setText("");
            bt9.setText("");
        }

        //2.sutun

        else if(r1c2==r2c2 && r2c2==r3c2 && r1c2==0){o++;
            score_o.setText("O:"+o);
            int r1c1=2;
            int r1c2=2;
            int r1c3=2;
            int r2c1=2;
            int r2c2=2;
            int r2c3=2;
            int r3c1=2;
            int r3c2=2;
            int r3c3=2;
            bt1.setText("");
            bt2.setText("");
            bt3.setText("");
            bt4.setText("");
            bt5.setText("");
            bt6.setText("");
            bt7.setText("");
            bt8.setText("");
            bt9.setText("");
        }

        else if(r1c2==r2c2 && r2c2==r3c2 && r1c2==1){x++;
            score_x.setText("X:"+x);
            int r1c1=2;
            int r1c2=2;
            int r1c3=2;
            int r2c1=2;
            int r2c2=2;
            int r2c3=2;
            int r3c1=2;
            int r3c2=2;
            int r3c3=2;
            bt1.setText("");
            bt2.setText("");
            bt3.setText("");
            bt4.setText("");
            bt5.setText("");
            bt6.setText("");
            bt7.setText("");
            bt8.setText("");
            bt9.setText("");
        }

        //3.sutun<<

        else if(r1c3==r2c3 && r2c3==r3c3 && r1c3==1){x++;
            score_x.setText("X:"+x);
            int r1c1=2;
            int r1c2=2;
            int r1c3=2;
            int r2c1=2;
            int r2c2=2;
            int r2c3=2;
            int r3c1=2;
            int r3c2=2;
            int r3c3=2;
            bt1.setText("");
            bt2.setText("");
            bt3.setText("");
            bt4.setText("");
            bt5.setText("");
            bt6.setText("");
            bt7.setText("");
            bt8.setText("");
            bt9.setText("");
        }

        else if(r1c3==r2c3 && r2c3==r3c3 && r1c3==0){o++;
            score_o.setText("O:"+o);
            int r1c1=2;
            int r1c2=2;
            int r1c3=2;
            int r2c1=2;
            int r2c2=2;
            int r2c3=2;
            int r3c1=2;
            int r3c2=2;
            int r3c3=2;
            bt1.setText("");
            bt2.setText("");
            bt3.setText("");
            bt4.setText("");
            bt5.setText("");
            bt6.setText("");
            bt7.setText("");
            bt8.setText("");
            bt9.setText("");
        }


        else if(r1c1==r2c2 && r2c2==r3c3 && r1c1==1){x++;
            score_x.setText("X:"+x);
            int r1c1=2;
            int r1c2=2;
            int r1c3=2;
            int r2c1=2;
            int r2c2=2;
            int r2c3=2;
            int r3c1=2;
            int r3c2=2;
            int r3c3=2;
            bt1.setText("");
            bt2.setText("");
            bt3.setText("");
            bt4.setText("");
            bt5.setText("");
            bt6.setText("");
            bt7.setText("");
            bt8.setText("");
            bt9.setText("");
        }

        else if(r1c1==r2c2 && r2c2==r3c3 && r1c1==0){o++;
            score_o.setText("O:"+o);
            int r1c1=2;
            int r1c2=2;
            int r1c3=2;
            int r2c1=2;
            int r2c2=2;
            int r2c3=2;
            int r3c1=2;
            int r3c2=2;
            int r3c3=2;
            bt1.setText("");
            bt2.setText("");
            bt3.setText("");
            bt4.setText("");
            bt5.setText("");
            bt6.setText("");
            bt7.setText("");
            bt8.setText("");
            bt9.setText("");
        }

        else if(r1c3==r2c2 && r2c2==r3c1 && r1c3==1){x++;
            score_x.setText("X:"+x);
            int r1c1=2;
            int r1c2=2;
            int r1c3=2;
            int r2c1=2;
            int r2c2=2;
            int r2c3=2;
            int r3c1=2;
            int r3c2=2;
            int r3c3=2;
            bt1.setText("");
            bt2.setText("");
            bt3.setText("");
            bt4.setText("");
            bt5.setText("");
            bt6.setText("");
            bt7.setText("");
            bt8.setText("");
            bt9.setText("");
        }

        else if(r1c3==r2c2 && r2c2==r3c1 && r1c3==0){o++;
            score_o.setText("O:"+o);
            int r1c1=2;
            int r1c2=2;
            int r1c3=2;
            int r2c1=2;
            int r2c2=2;
            int r2c3=2;
            int r3c1=2;
            int r3c2=2;
            int r3c3=2;
            bt1.setText("");
            bt2.setText("");
            bt3.setText("");
            bt4.setText("");
            bt5.setText("");
            bt6.setText("");
            bt7.setText("");
            bt8.setText("");
            bt9.setText("");
        }



    }



    @Override
    public void onClick(View view) {

    }
}