package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    String action;
    String calculation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView1 = (TextView) findViewById(R.id.textView);
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        Button buttonDel = (Button) findViewById(R.id.buttonDel);
        Button buttonDot = (Button) findViewById(R.id.buttonDot);
        Button buttonPlus = (Button) findViewById(R.id.buttonPlus);
        Button buttonPercent = (Button) findViewById(R.id.buttonMod);
        Button buttonX = (Button) findViewById(R.id.buttonX);
        Button buttonMinus = (Button) findViewById(R.id.buttonMinus);
        Button buttonDiv = (Button) findViewById(R.id.buttonDiv);
        Button buttonEq = (Button) findViewById(R.id.buttonEq);
        Button buttonC = (Button) findViewById(R.id.buttonC);
        Button buttonZero = (Button) findViewById(R.id.buttonZero);
        Button buttonOne = (Button) findViewById(R.id.buttonOne);
        Button buttonTwo = (Button) findViewById(R.id.buttonTwo);
        Button buttonThree = (Button) findViewById(R.id.buttonThree);
        Button buttonFour = (Button) findViewById(R.id.buttonFour);
        Button buttonFive = (Button) findViewById(R.id.buttonFive);
        Button buttonSix = (Button) findViewById(R.id.buttonSix);
        Button buttonSeven = (Button) findViewById(R.id.buttonSeven);
        Button buttonEight = (Button) findViewById(R.id.buttonEight);
        Button buttonNine = (Button) findViewById(R.id.buttonNine);

        textView1.setText("0");
        textView2.setVisibility(4);
        buttonC.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView1.setText("0");
                textView2.setVisibility(4);
            }
        });
        buttonDel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String input = (String) textView1.getText();
                if (textView1.getText() != "0") {
                    input = input.substring(0, input.length() - 1);
                    textView1.setText(input);
                    if (input.length() == 0) {
                        textView1.setText("0");
                    }
                }
            }
        });
        buttonDot.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (textView1.getText() != "0"){
                    textView1.setText(textView1.getText() + ".");
                }
            }
        });
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (textView1.getText() != "0"){
                    textView1.setText(textView1.getText() + "+");
                }
            }
        });
        buttonPercent.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (textView1.getText() != "0"){
                    textView1.setText(textView1.getText() + "%");
                }
            }
        });
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (textView1.getText() != "0"){
                    textView1.setText(textView1.getText() + "-");
                } else {
                    textView1.setText("-");
                }
            }
        });
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (textView1.getText() != "0"){
                    textView1.setText(textView1.getText() + "÷");
                }
            }
        });
        buttonX.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (textView1.getText() != "0"){
                    textView1.setText(textView1.getText() + "×");
                }
            }
        });
        buttonZero.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (textView1.getText() == "0"){
                    textView1.setText("0");
                } else {
                    textView1.setText(textView1.getText() + "0");
                }
            }
        });
        buttonOne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (textView1.getText() == "0"){
                    textView1.setText("1");
                } else {
                    textView1.setText(textView1.getText() + "1");
                }
            }
        });
        buttonTwo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (textView1.getText() == "0"){
                    textView1.setText("2");
                } else {
                    textView1.setText(textView1.getText() + "2");
                }
            }
        });
        buttonThree.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (textView1.getText() == "0"){
                    textView1.setText("3");
                } else {
                    textView1.setText(textView1.getText() + "3");
                }
            }
        });
        buttonFour.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (textView1.getText() == "0"){
                    textView1.setText("4");
                } else {
                    textView1.setText(textView1.getText() + "4");
                }
            }
        });
        buttonFive.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (textView1.getText() == "0"){
                    textView1.setText("5");
                } else {
                    textView1.setText(textView1.getText() + "5");
                }
            }
        });
        buttonSix.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (textView1.getText() == "0"){
                    textView1.setText("6");
                } else {
                    textView1.setText(textView1.getText() + "6");
                }
            }
        });
        buttonSeven.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (textView1.getText() == "0"){
                    textView1.setText("7");
                } else {
                    textView1.setText(textView1.getText() + "7");
                }
            }
        });
        buttonEight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (textView1.getText() == "0"){
                    textView1.setText("8");
                } else {
                    textView1.setText(textView1.getText() + "8");
                }
            }
        });
        buttonNine.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (textView1.getText() == "0"){
                    textView1.setText("9");
                } else {
                    textView1.setText(textView1.getText() + "9");
                }
            }
        });

        buttonEq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculation = (String) textView1.getText();
                try {
                    if (isOperator(calculation.charAt(calculation.length() - 1))) {
                        backspace();
                    }
                    String[] splitCalculate = calculation.split("(?<=[\\d.])(?=[^\\d.])|(?<=[^\\d.])(?=[\\d.])");
                    LinkedList<Double> operands = new LinkedList<>();
                    LinkedList<String> operators = new LinkedList<>();
                    double operand;
                    String operator;

                    if (splitCalculate[0].equals("-")) {
                        splitCalculate[1] = "-" + splitCalculate[1];
                        splitCalculate[0] = "";
                    }
                    for (String split : splitCalculate) {
                        if (split.equals("")) {
                            continue;
                        } else if (isOperator(split.charAt(0))) {
                            operators.add(split);
                        } else {
                            operands.add(Double.parseDouble(split));
                        }
                    }

                    for (int i = 0; i < operators.size(); i++) {
                        operator = operators.get(i);
                        while (operator.equals("×") || operator.equals("÷") || operator.equals("%")) {
                            switch (operator) {
                                case "×":
                                    operands.set(i, operands.get(i) * operands.get(i + 1));
                                    operands.remove(i + 1);
                                    operators.remove(i);
                                    textView2.setText("true");
                                    textView2.setVisibility(1);
                                    break;
                                case "÷":
                                    operands.set(i, operands.get(i) / operands.get(i + 1));
                                    operands.remove(i + 1);
                                    operators.remove(i);
                                    break;
                                case "%":
                                    operands.set(i, operands.get(i) % operands.get(i + 1));
                                    operands.remove(i + 1);
                                    operators.remove(i);
                                    break;
                            }
                            if (!(operators.isEmpty() || i >= operators.size())) {
                                operator = operators.get(i);
                            } else {
                                break;
                            }
                        }
                    }

                    double result = operands.poll();

                    while (!operators.isEmpty()) {
                        operator = operators.poll();
                        operand = operands.poll();
                        switch (operator) {
                            case "+":
                                result += operand;
                                break;
                            case "-":
                                result -= operand;
                                break;
                        }
                    }

                    //taruh result ke dalam textview
                    textView1.setText(calculation);
                    if (result == 0) {
                        throw new Exception();
                    } else if (result % 1 == 0) {
                        calculation = Integer.toString((int) result);
                    } else {
                        calculation = Double.toString(result);
                    }
                    textView2.setText(calculation);
                    textView2.setVisibility(1);
                } catch (Exception e) { //jika ada error / exception, ubah hasil menjadi 0
                    System.out.println(e);
                    textView1.setText(calculation);
                    calculation = "";
                    textView2.setText("0");
                }
            }

            private void backspace() {
                calculation = calculation.substring(0, calculation.length()-1);
            }

            private boolean isOperator(char charAt) {
                if (charAt == '%' || charAt == '÷' || charAt == '×' || charAt == '+' || charAt == '-'){
                    return true;
                } else {
                    return false;
                }
            }

        });

    }
}