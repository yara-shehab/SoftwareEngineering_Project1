package system_of_the_gym;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SearchForInbody extends JFrame{
    public SearchForInbody()
    {
    this.setLayout(new BorderLayout());
        this.setBounds(200, 200, 400,300);
        this.setMinimumSize(new Dimension(400,300));
        this.setTitle("Search For Inbody");
        
        JButton btnsearch=new JButton("search");
        
            JPanel pnllright = new JPanel();
            JPanel pnlleft = new JPanel();
            JPanel pnllbottom = new JPanel();
            
    
           JLabel ID = new JLabel("ID:");
           
             JTextField txtID = new JTextField("",20);
    
             JTextArea area = new JTextArea();
             area.setEnabled(false);
             area.setBorder(BorderFactory.createTitledBorder("Your Search Result :"));
             
            
             Container con = this.getContentPane();
            pnlleft.setLayout(new GridLayout(2,1));
            pnlleft.add(ID);
            pnlleft.add(btnsearch);
         
            pnllright.setLayout(new GridLayout(2, 1));
            
            pnllright.add(txtID);
            pnllright.add(area);
            
            
            con.add(pnllright,BorderLayout.EAST);
             con.add(pnlleft,BorderLayout.WEST);
             con.add(pnllbottom,BorderLayout.SOUTH);
            
             btnsearch.addActionListener( new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                     int z = 0;
                     for(int i=0;i<addinBody.listofinbodys.size();i++)
                     {
                         
                       if(addinBody.listofinbodys.get(i).getID1(i).equalsIgnoreCase(txtID.getText()))
                         {
                             area.setText("ID :"+txtID.getText()+"\n"+"Height :"+addinBody.listofinbodys.get(i).getheight1(i)
                             +"Age :"+"\n"+addinBody.listofinbodys.get(i).getage1(i)+"\n"+"Gender :"+addinBody.listofinbodys.get(i).getgender1(i)
                             +"\n"+"Test Date :"+addinBody.listofinbodys.get(i).gettestdate1(i)+"\n"+"Time :"+addinBody.listofinbodys.get(i).gettime1(i)
                             +"\n"+"Body Fat :"+addinBody.listofinbodys.get(i).getbodyfat1(i)+ "\n"+"Weight :"+ addinBody.listofinbodys.get(i).getweight1(i)+ "\n"+"BMI :"+ addinBody.listofinbodys.get(i).getBMI1(i)+ "\n"+ "PBF :"+addinBody.listofinbodys.get(i).getPBF1(i));
                             z++;
                         }
                        
                     }
                      if(z==0)
                      {
                             area.setText("Not found");
                      }    
                     
                         
                     txtID.setText("");
                  
                }
            });
             this.repaint();
    }
    }       
    

