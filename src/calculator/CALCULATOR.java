
  package calculator; 
  import java.awt.*;
  import java.awt.event.*;
  import javax.swing.*;
//--------------------------------------------------------------------------------------------------
   public class CALCULATOR extends JFrame implements ActionListener{
        JPanel obj_panel;
        JTextField obj_textfield;
        JButton button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,
        button11,button12,button13,button14,button15,button16,button17,button18,button19,button20;
        GridLayout obj_gridlayout;
        String string_1,string_2,string_3,string_4;
        double Result,Result_2,Result_3,value_1,value_2,value_3,value_4;
        int click = 0;
 //--------------------------------------------------------------------------------------------------       
    CALCULATOR(){
      setTitle("Sohel");
      setLocation(200,200);
      setSize(300,400);
      setVisible(true);
      obj_panel=new JPanel();
           button1=new JButton("AC");
           button1.addActionListener(this);
           button2=new JButton("√");
           button2.addActionListener(this);
           button3=new JButton("Pow");
           button3.addActionListener(this);
           button4=new JButton("←");
           button4.addActionListener(this);
           button5=new JButton("7");
           button5.addActionListener(this);
           button6=new JButton("8");
           button6.addActionListener(this);
           button7=new JButton("9");
           button7.addActionListener(this);
           button8=new JButton("÷");
           button8.addActionListener(this);
           button9=new JButton("4");
           button9.addActionListener(this);
           button10=new JButton("5");
           button10.addActionListener(this);
           button11=new JButton("6");
           button11.addActionListener(this);
           button12=new JButton("×");
           button12.addActionListener(this);
           button13=new JButton("1");
           button13.addActionListener(this);
           button14=new JButton("2");
           button14.addActionListener(this);
           button15=new JButton("3");
           button15.addActionListener(this);
           button16=new JButton("-");
           button16.addActionListener(this);
           button17=new JButton("0");
           button17.addActionListener(this);
           button18=new JButton(".");
           button18.addActionListener(this);
           button19=new JButton("=");
           button19.addActionListener(this);
           button20=new JButton("+");
           button20.addActionListener(this);
           obj_textfield=new JTextField();
           setLayout(new BorderLayout());
           add(obj_textfield,BorderLayout.NORTH);           
           add(obj_panel,BorderLayout.CENTER);
           obj_panel.add(button1);obj_panel.add(button2);obj_panel.add(button3);
           obj_panel.add(button4);obj_panel.add(button5);obj_panel.add(button6);
           obj_panel.add(button7);obj_panel.add(button8);obj_panel.add(button9);
           obj_panel.add(button10);obj_panel.add(button11);obj_panel.add(button12);
           obj_panel.add(button13);obj_panel.add(button14);obj_panel.add(button15);
           obj_panel.add(button16);obj_panel.add(button17);obj_panel.add(button18);
           obj_panel.add(button19);obj_panel.add(button20);
           obj_gridlayout=new GridLayout(5,4,4,4);
           obj_panel. setLayout( obj_gridlayout); 
      }
//---------------------------------------------------------------------------------------------------
    @Override
    public void actionPerformed(ActionEvent ae) {
     string_1=ae.getActionCommand();
        if("√".equals(string_1))
        {
             value_4=Double.parseDouble(obj_textfield.getText());
             obj_textfield.setText("");
             Result_3=Math.sqrt(value_4);
             obj_textfield.setText(String.valueOf(Result_3));  
        }
        if("0".equals(string_1))
        {
             obj_textfield.setText( obj_textfield.getText()+button17.getText());
        }
        if("1".equals(string_1))
        {
             obj_textfield.setText( obj_textfield.getText()+button13.getText());
        }
        if("2".equals(string_1))
        {
             obj_textfield.setText( obj_textfield.getText()+button14.getText());
        }
        if("3".equals(string_1))
        {
             obj_textfield.setText( obj_textfield.getText()+button15.getText());
        }
        if("4".equals(string_1))
        {
             obj_textfield.setText( obj_textfield.getText()+button9.getText());
        }
        if("5".equals(string_1))
        {
             obj_textfield.setText( obj_textfield.getText()+button10.getText());
        }
        if("6".equals(string_1))
        {
             obj_textfield.setText( obj_textfield.getText()+button11.getText());
        }
        
        if("7".equals(string_1))
        {
             obj_textfield.setText( obj_textfield.getText()+button5.getText());
        }
        if("8".equals(string_1))
        {
             obj_textfield.setText( obj_textfield.getText()+button6.getText());
        }
        if("9".equals(string_1))
        {
             obj_textfield.setText( obj_textfield.getText()+button7.getText());
        }
        if("+".equals(string_1))
        {
             value_1=Double.parseDouble( obj_textfield.getText());
             obj_textfield.setText("");
             click=1;
        }
        if("-".equals(string_1))
        {
            obj_textfield.getText();
            value_1=Double.parseDouble( obj_textfield.getText());
            obj_textfield.setText("");
            click=2;
        }
        if("×".equals(string_1))
        {
            obj_textfield.getText();
            value_1=Double.parseDouble( obj_textfield.getText());
            obj_textfield.setText("");
            click=3;
        }
        if("÷".equals(string_1))
        {
            obj_textfield.getText();
            value_1=Double.parseDouble( obj_textfield.getText());
            obj_textfield.setText("");
            click=4;
        }
        if("Pow".equals(string_1))
        {
           value_3=Double.parseDouble(obj_textfield.getText());
           obj_textfield.setText("");
           Result_2=  value_3* value_3;
           obj_textfield.setText(String.valueOf(Result_2));
         }
        if(".".equals(string_1))
         {
          
           obj_textfield.setText(button18.getText());
         }
        if("←".equals(string_1))
         {
           string_4= obj_textfield.getText();
           obj_textfield.setText(string_4.substring(0, string_4.length()-1)); 
         }
        if("=".equals(string_1))
         {
          value_2=Double.parseDouble( obj_textfield.getText());
        if(click==1)
           {
              Result=value_1+value_2;
              obj_textfield.setText(String.valueOf(Result));
           }
         if(click==2)
           {
              Result=value_1-value_2;
              obj_textfield.setText(String.valueOf(Result)); 
           }
        if(click==3)
           {
              Result=value_1*value_2;
              obj_textfield.setText(String.valueOf(Result));
           }
        if(click==4)
          {
              Result=value_1/value_2;   
              obj_textfield.setText(String.valueOf(Result));
          }
        
       }
     if("AC".equals(string_1))
       {
        obj_textfield.setText("");
       }
    }
//-------------------------------------------------------------------------------------------------
   public static void main(String[] args) {
   CALCULATOR cal = new CALCULATOR(); 
    }
}


