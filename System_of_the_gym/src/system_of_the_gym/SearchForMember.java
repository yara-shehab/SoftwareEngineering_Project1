
package system_of_the_gym;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SearchForMember extends JFrame{
    public SearchForMember()
    {
        this.setLayout(new BorderLayout());
        this.setBounds(200, 200, 400,300);
        this.setMinimumSize(new Dimension(400,300));
        this.setTitle("Search For Member");
        
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
                     for(int i=0;i<Reg.listofmembers.size();i++)
                     {
                         
                       if(Reg.listofmembers.get(i).getID1(i).equalsIgnoreCase(txtID.getText()))
                         {
                              area.setText("ID :"+txtID.getText()+"\n"+"Name :"+Reg.listofmembers.get(i).getname1(i)
                             +"\n"+"Adress :"+Reg.listofmembers.get(i).getadress1(i)+"\n"+"Birthdate :"+Reg.listofmembers.get(i).getbirthdate1(i)
                             +"\n"+"Height :"+Reg.listofmembers.get(i).getheight1(i)+"\n"+"Weight :"+Reg.listofmembers.get(i).getweight1(i)
                             +"\n"+"Registration date :"+Reg.listofmembers.get(i).getregdate1(i)+"\n"+"Number of Months :"+Reg.listofmembers.get(i).getnumofmonth1(i)
                              +"\n"+"InBody :"+Reg.listofmembers.get(i).getinbody1(i));
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

