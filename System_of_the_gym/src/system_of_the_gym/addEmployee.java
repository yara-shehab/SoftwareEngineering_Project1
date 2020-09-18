
package system_of_the_gym;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class addEmployee extends JFrame {
    
    public static ArrayList<addEmployee> listofmember = new ArrayList<addEmployee>() ;
    private String name;
    private String ID;
    private String adress;
    private String birthdate;
    private String salary;
    private String DateOfEmployment;
    private String Position;
    
    public addEmployee()
    {
        String [] day = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        String [] month = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        
        
        this.setLayout(new BorderLayout());
        this.setBounds(200, 200, 600,300);
        this.setMinimumSize(new Dimension(600,300));
        this.setTitle("Add Employee");
        
            JButton saved= new JButton("save");
       
            JPanel pnlright = new JPanel();
            JPanel pnlleft = new JPanel();
            JPanel pnldateofemployment = new JPanel();
            JPanel pnldate = new JPanel();
            JPanel pnlbot = new JPanel();
            
            JLabel name = new JLabel("Name :");
            JLabel id = new JLabel("ID :");
            JLabel adress = new JLabel("Adress :");
            JLabel birth = new JLabel("Birthdate :");
            JLabel salary = new JLabel("Salary :");
            JLabel date_of_employment = new JLabel("Date of Employment :");
            JLabel position = new JLabel("Position :");
          
            Container con = this.getContentPane();
            
            pnlbot.add(saved);
            con.add(pnlbot,BorderLayout.SOUTH);
            
            pnldateofemployment.setLayout(new GridLayout(1,3));
            JComboBox comdayreg = new JComboBox(day);
            JComboBox commonthreg = new JComboBox(month);
            JTextField txtyearreg = new JTextField();
            txtyearreg.addKeyListener(new KeyAdapter() 
{ 
                    public void keyTyped(KeyEvent ke) 
                        { 
                            char c = ke.getKeyChar(); 
                                if((!(Character.isDigit(c))))
                                        { 
                                        ke.consume(); 
                                            } 
                                                    } 
});
            pnldateofemployment.add(comdayreg);
            pnldateofemployment.add(commonthreg);
            pnldateofemployment.add(txtyearreg);
            
            pnldate.setLayout(new GridLayout(1,3));
            JComboBox comday = new JComboBox(day);
            JComboBox commonth = new JComboBox(month);
            JTextField txtyear = new JTextField();
            txtyear.addKeyListener(new KeyAdapter() 
{ 
                    public void keyTyped(KeyEvent ke) 
                        { 
                            char c = ke.getKeyChar(); 
                                if((!(Character.isDigit(c))))
                                        { 
                                        ke.consume(); 
                                            } 
                                                    } 
});
            pnldate.add(comday);
            pnldate.add(commonth);
            pnldate.add(txtyear);
            
            
            pnlleft.setLayout(new GridLayout(7,1));
            
            pnlleft.add(id);
            pnlleft.add(name);
            pnlleft.add(adress);
            pnlleft.add(birth);
            pnlleft.add(salary);
            pnlleft.add(date_of_employment);
            pnlleft.add(position);
            
            con.add(pnlleft,BorderLayout.WEST);
             
            JTextField txtname = new JTextField("", 20);
            JTextField txtid = new JTextField("", 20);
            JTextField txtadress = new JTextField("",20);
            JTextField txtsalary = new JTextField("",20);
            txtsalary.addKeyListener(new KeyAdapter() 
{ 
                    public void keyTyped(KeyEvent ke) 
                        { 
                            char c = ke.getKeyChar(); 
                                if((!(Character.isDigit(c))))
                                        { 
                                        ke.consume(); 
                                            } 
                                                    } 
});
            JTextField txtposition = new JTextField("",20);
          
            
            pnlright.setLayout(new GridLayout(7, 1));
            pnlright.add(txtid);
            pnlright.add(txtname);  
            pnlright.add(txtadress);
            pnlright.add(pnldate);
            pnlright.add(txtsalary);
            pnlright.add(pnldateofemployment);
            pnlright.add(txtposition);
    
            con.add(pnlright,BorderLayout.EAST);
            
                 
                      saved.addActionListener( new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                     addEmployee r = new addEmployee();
                     int x=0;
                     for(int i=0;i<addEmployee.listofmember.size();i++)
                     {
                         if(addEmployee.listofmember.get(i).getID1(i).equals(txtid.getText()))
                         {
                             txtid.setText("Repeated ID! Try Again");
                             txtname.setText("");
                             txtadress.setText("");
                             txtposition.setText("");
                             txtsalary.setText(""); 
                             txtyearreg.setText("");
                             txtyear.setText("");

                             x++;
                         }
                     }
                     if(x==0)
                     {
                    addEmployee i=new addEmployee();
                     i.setID(txtid.getText());
                     i.setname(txtname.getText());
                     i.setadress(txtadress.getText());
                     i.setbirthdate(comday.getSelectedItem().toString()+"/"+commonth.getSelectedItem().toString()+"/"+txtyear.getText()); 
                     i.setsalary(txtsalary.getText());
                     i.setdateofemployment(comdayreg.getSelectedItem().toString()+"/"+commonthreg.getSelectedItem().toString()+"/"+txtyearreg.getText()); 
                     i.setposition(txtposition.getText());
                     listofmember.add(i);
                     txtid.setText("");
                     txtname.setText("");
                     txtadress.setText("");
                     txtsalary.setText("");
                     txtposition.setText("");
                }
                }
            });
           
            this.repaint();
    }
                              
    public void setname(String s)
    {
       this.name=s;
    }public void setID(String i)
    {
        this.ID=i;
    }
    public void setadress(String i)
    {
        this.adress=i;
    }public void setbirthdate(String i)
    {
        this.birthdate=i;
    }public void setsalary(String i)
    {
        this.salary=i;
    }public void setdateofemployment(String i)
    {
        this.DateOfEmployment=i;
    }
    public void setposition(String i)
    {
        this.Position=i;
    }
      public String getname()
    {
        String s = "";
        for(int i=0;i<listofmember.size();i++)
        {
            
            s=s+listofmember.get(i).name+ "\n";
        }
        return s;
    }
           public String getname1(int i1)
    {
        String s = "";
        for(int i=0;i<listofmember.size();i++)
        {
            if(i==i1)
            {
              s=s+listofmember.get(i).name;
            }
        }
        return s;
    }
      public String getID1(int i1 )
      {
          String s = "";
          for(int i=0;i<listofmember.size();i++)
         {
            if(i==i1)
            {
                s = listofmember.get(i).ID;
            }
        }
        return s;
      }
   public  String getID()
    {
       String s = "";
        for(int i=0;i<listofmember.size();i++)
        {
            
            s=s+listofmember.get(i).ID+ "\n";
        }
        return s;
    }
       public  String getadress()
    {
        String s = "";
        for(int i=0;i<listofmember.size();i++)
        {
            
            s=s+listofmember.get(i).adress+ "\n";
        }
        return s;
    }
            public String getadress1(int i1)
    {
        String s = "";
        for(int i=0;i<listofmember.size();i++)
        {
            if(i==i1)
            {
              s=s+listofmember.get(i).adress;
            }
        }
        return s;
    }
       public  String getbirthdate()
    {
        String s = "";
        for(int i=0;i<listofmember.size();i++)
        {
            
            s=s+listofmember.get(i).birthdate+ "\n";
        }
        return s;
    }
            public String getbirthdate1(int i1)
    {
        String s = "";
        for(int i=0;i<listofmember.size();i++)
        {
            if(i==i1)
            {
              s=s+listofmember.get(i).birthdate;
            }
        }
        return s;
    }
     public String getsalary()
    {
       String s = "";
        for(int i=0;i<listofmember.size();i++)
        {
            
            s=s+listofmember.get(i).salary+ "\n";
        }
        return s;
    }
          public String getsalary1(int i1)
    {
        String s = "";
        for(int i=0;i<listofmember.size();i++)
        {
            if(i==i1)
            {
              s=s+listofmember.get(i).salary;
            }
        }
        return s;
    }
     public String getdateofemployment()
    {
        String s = "";
        for(int i=0;i<listofmember.size();i++)
        {
            
            s=s+listofmember.get(i).DateOfEmployment+ "\n";
        }
        return s;
    }
          public String getdateofemployment1(int i1)
    {
        String s = "";
        for(int i=0;i<listofmember.size();i++)
        {
            if(i==i1)
            {
              s=s+listofmember.get(i).DateOfEmployment;
            }
        }
        return s;
    }
    public String getposition()
    {
        String s = "";
        for(int i=0;i<listofmember.size();i++)
        {
            
            s=s+listofmember.get(i).Position+ "\n";
        }
        return s;
    }
       public String getposition1(int i1)
    {
        String s = "";
        for(int i=0;i<listofmember.size();i++)
        {
            if(i==i1)
            {
              s=s+listofmember.get(i).Position;
            }
        }
        return s;
    }
 
}
