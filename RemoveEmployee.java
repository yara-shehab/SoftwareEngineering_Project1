
package system_of_the_gym;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class RemoveEmployee extends JFrame {
    public RemoveEmployee()
    {
       this.setLayout(new BorderLayout());
        this.setBounds(200, 200, 350,250);
        this.setMinimumSize(new Dimension(350,250));
        this.setTitle("Remove Employee");
        
        JButton btnremove=new JButton("Remove");
        
            JPanel pnllright = new JPanel();
            JPanel pnlleft = new JPanel();
            JPanel pnllbottom = new JPanel();
            
    
           JLabel ID = new JLabel("ID:");
           
             JTextField txtID = new JTextField("",20);
    
            Container con = this.getContentPane();
            pnlleft.setLayout(new GridLayout(2,1));
            pnlleft.add(ID);
            pnlleft.add(btnremove);
         
            pnllright.setLayout(new GridLayout(2, 1));
            
            pnllright.add(txtID);
            
            con.add(pnllright,BorderLayout.EAST);
             con.add(pnlleft,BorderLayout.WEST);

            
             btnremove.addActionListener( new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                  
                     for(int i=0;i<addEmployee.listofmember.size();i++)
                     {
                         
                       if(addEmployee.listofmember.get(i).getID1(i).equalsIgnoreCase(txtID.getText()))
                         {
                              addEmployee.listofmember.remove(i);
                         }
                        
                     }
                         
                     txtID.setText("");
                  
                }
            });
             this.repaint();
             
    }       
    
}
