package calcu.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView monitor;
    private String screen = "";

    private Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bdec, bc, be, ba, bs, bm, bd;

    boolean add, sub, mul, div;

    double n1, n2;

    Engine calculator = new Engine();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        monitor = (TextView)findViewById(R.id.mainscreen);
        monitor.setText(screen);

        b0 = (Button)findViewById(R.id.button0);
        b1 = (Button)findViewById(R.id.button1);
        b2 = (Button)findViewById(R.id.button2);
        b3 = (Button)findViewById(R.id.button3);
        b4 = (Button)findViewById(R.id.button4);
        b5 = (Button)findViewById(R.id.button5);
        b6 = (Button)findViewById(R.id.button6);
        b7 = (Button)findViewById(R.id.button7);
        b8 = (Button)findViewById(R.id.button8);
        b9 = (Button)findViewById(R.id.button9);
        bdec = (Button)findViewById(R.id.buttondot);
        bc = (Button)findViewById(R.id.buttonC);
        be = (Button)findViewById(R.id.buttonequal);
        ba = (Button)findViewById(R.id.buttonplus);
        bs = (Button)findViewById(R.id.buttonminus);
        bm = (Button)findViewById(R.id.buttonmultiply);
        bd = (Button)findViewById(R.id.buttondivide);

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b0OnClickAction();
            }

        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b1OnClickAction();
            }

        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b2OnClickAction();
            }

        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b3OnClickAction();
            }

        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b4OnClickAction();
            }

        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b5OnClickAction();
            }

        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b6OnClickAction();
            }

        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b7OnClickAction();
            }

        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b8OnClickAction();
            }

        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                b9OnClickAction();
            }

        });

        bdec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                bdecOnClickAction();
            }

        });

        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                bcOnClickAction();
            }

        });

        be.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                beOnClickAction();
            }

        });

        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                baOnClickAction();
            }

        });

        bs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                bsOnClickAction();
            }

        });

        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                bmOnClickAction();
            }

        });

        bd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                bdOnClickAction();
            }

        });

    }

    private void b0OnClickAction() {
        monitor.setText(monitor.getText()+ "0");
    }

    private void b1OnClickAction() {
        monitor.setText(monitor.getText()+ "1");
    }
    private void b2OnClickAction() {
        monitor.setText(monitor.getText()+ "2");
    }
    private void b3OnClickAction() {
        monitor.setText(monitor.getText()+ "3");
    }
    private void b4OnClickAction() {
        monitor.setText(monitor.getText()+ "4");
    }
    private void b5OnClickAction() {
        monitor.setText(monitor.getText()+ "5");
    }
    private void b6OnClickAction() {
        monitor.setText(monitor.getText()+ "6");
    }
    private void b7OnClickAction() {
        monitor.setText(monitor.getText()+ "7");
    }
    private void b8OnClickAction() {
        monitor.setText(monitor.getText()+ "8");
    }
    private void b9OnClickAction() {
        monitor.setText(monitor.getText()+ "9");
    }

    private void baOnClickAction() {

        try{
            if(monitor == null){
                monitor.setText("");
            }
            else{
                n1 = Double.parseDouble(monitor.getText() + "");

                add = true;
                monitor.setText(null);
            }
        } catch(NumberFormatException e) {
            Toast.makeText(MainActivity.this,"Please insert properly",Toast.LENGTH_LONG).show();
        }

    }

    private void bsOnClickAction() {


        try{
            if(monitor == null){
                monitor.setText("");
            }
            else{
                n1 = Double.parseDouble(monitor.getText() + "");

                sub = true;
                monitor.setText(null);
            }
        } catch(NumberFormatException e) {
            Toast.makeText(MainActivity.this,"Please insert properly",Toast.LENGTH_LONG).show();
        }


    }

    private void bmOnClickAction() {

        try{
            if(monitor == null){
                monitor.setText("");
            }
            else{
                n1 = Double.parseDouble(monitor.getText() + "");

                mul = true;
                monitor.setText(null);
            }
        } catch(NumberFormatException e) {
            Toast.makeText(MainActivity.this,"Please insert properly",Toast.LENGTH_LONG).show();
        }
    }

    private void bdecOnClickAction() {

       monitor.setText(monitor.getText()+".");
    }

    private void bdOnClickAction() {
        try{
            if(monitor == null){
                monitor.setText("");
            }
            else{
                n1 = Double.parseDouble(monitor.getText() + "");

                div = true;
                monitor.setText(null);
            }
        } catch(NumberFormatException e) {
            Toast.makeText(MainActivity.this,"Please insert properly",Toast.LENGTH_LONG).show();
        }


    }



    private void beOnClickAction() {

        n2 = Double.parseDouble(monitor.getText()+"");

        if (add == true){
            monitor.setText(calculator.Add(n1,n2)+"");
            add=false;
        }

        if (sub == true){
            monitor.setText(calculator.Sub(n1,n2)+"");
            sub=false;
        }

        if (mul == true){
            monitor.setText(calculator.Mul(n1,n2)+"");
            mul=false;
        }

        if(div == true){
            try {
                monitor.setText(calculator.Div(n1, n2) + "");
                div = false;
            }
            catch (ArithmeticException e){
                if(n2==0) {
                    Toast.makeText(MainActivity.this, "Math Error", Toast.LENGTH_LONG).show();
                }
            }
        }


    }

    private void bcOnClickAction() {
        monitor.setText("");
    }


}
