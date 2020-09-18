
package system_of_the_gym;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Gym extends JFrame implements ActionListener {
    
    private JMenuBar bar = new JMenuBar();
    private JMenu member = new JMenu("Member");
    private JMenu employee = new JMenu("Employee");
    private JMenu inbody = new JMenu("InBody");
    private JMenu fitnessclass = new JMenu("Fitness Class");
    
    
    private JMenuItem addmember = new JMenuItem("Add member");
    private JMenuItem removemember = new JMenuItem("Remove Member");
    private JMenuItem searchforamember = new JMenuItem("Search for a member");
    private JMenuItem listofmembers = new JMenuItem("list of all members ");
    
    private JMenuItem addemployee = new JMenuItem("Add employee");
    private JMenuItem removeemployee = new JMenuItem("Remove employee");
    private JMenuItem searchforemployee = new JMenuItem("Search for a employee");
    private JMenuItem listofemployees = new JMenuItem("list of all employees ");
    
    private JMenuItem enterinbody = new JMenuItem("add new InBody");
    private JMenuItem removeinbody = new JMenuItem("remove an InBody");
    private JMenuItem searchforinbody = new JMenuItem("search for an InBody");
    private JMenuItem listofinbody = new JMenuItem("list of all InBody");

    
    private JMenuItem addfitnessclass = new JMenuItem("Add fitness Class");
    private JMenuItem removefitnessclass = new JMenuItem("Remove Fitness Class");
    private JMenuItem searchfofitnessclass = new JMenuItem("Search for a Fitness Class");
    private JMenuItem listoffitnessclasses = new JMenuItem("list of all Fitness Classes ");
    
     
    public Gym()
    {
        this.setTitle("My GYM");
        this.setBounds(500, 200, 300, 300);
        this.setMinimumSize(new Dimension(300,300));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container c = this.getContentPane();
        this.setJMenuBar(bar);
        bar.add(member);
        bar.add(employee);
        bar.add(inbody);
        bar.add(fitnessclass);
        
        member.add(addmember);
        member.add(removemember);
        member.add(searchforamember);
        member.add(listofmembers);
        
        employee.add(addemployee);
        employee.add(removeemployee);
        employee.add(searchforemployee);
        employee.add(listofemployees);
        
        inbody.add(enterinbody);
        inbody.add(removeinbody);
         inbody.add(searchforinbody);
        inbody.add(listofinbody);

        
        fitnessclass.add(addfitnessclass);
        fitnessclass.add(removefitnessclass);
        fitnessclass.add(searchfofitnessclass);
        fitnessclass.add(listoffitnessclasses);
        
        addmember.addActionListener(this);
        removemember.addActionListener(this);
        searchforamember.addActionListener(this);
        listofmembers.addActionListener(this);
        
        addemployee.addActionListener(this);
        removeemployee.addActionListener(this);
        searchforemployee.addActionListener(this);
        listofemployees.addActionListener(this);
        
        enterinbody.addActionListener(this);
        removeinbody.addActionListener(this);
        searchforinbody.addActionListener(this);
        listofinbody.addActionListener(this);

        
        addfitnessclass.addActionListener(this);
        removefitnessclass.addActionListener(this);
        searchfofitnessclass.addActionListener(this);
        listoffitnessclasses.addActionListener(this);
        

    }

        public void actionPerformed(ActionEvent e)
        {
            Object o = e.getSource();
            if(o==addmember){
                  AddMember(e);
            }if(o==removemember){
                 RemoveMember(e);
            }if(o==listofmembers){
                    listOfMember(e);
                  
            }if(o==searchforamember){
                    SearchForMember(e);
            }
            if(o==addemployee){
                  addEmployee(e);
            }if(o==removeemployee){
                    RemoveEmployee(e);
            }if(o==listofemployees){
                    ListofEmployees(e);
            }if(o==searchforemployee){
                    SearchForEmployee(e);
            }if(o==enterinbody){
                    addinbody(e);
            }if(o==removeinbody){
                    Removeibody(e);
                    
            }
            if(o==searchforinbody){
                    searchforinbody(e);
                    
            }if(o==listofinbody){
                    listofinbody(e);
                    
            }
            if(o==addfitnessclass){
                  addFitnessClass(e);
            }if(o==removefitnessclass){
                    RemoveFitnessClass(e);
            }
            if(o==searchfofitnessclass){
                  SearchForFitnessClass(e);
            }if(o==listoffitnessclasses){
                    ListOfFitnessClasses(e);
            }
           
        }
        public void AddMember(ActionEvent x)
        {
            Reg g = new Reg();
            g.setVisible(true);
        }
        public void RemoveMember(ActionEvent x)
        {
            RemoveMember b = new RemoveMember();
            b.setVisible(true);
                    
        }
        public void SearchForMember(ActionEvent x)
        {
            SearchForMember b = new SearchForMember();
            b.setVisible(true);
        }
        public void listOfMember(ActionEvent x)
        {
            ListOfMember b = new ListOfMember();
            b.setVisible(true);
        }
        public void addEmployee(ActionEvent x)
        {
            addEmployee b = new addEmployee();
            b.setVisible(true);
        }
        public void RemoveEmployee(ActionEvent x)
        {
            RemoveEmployee b = new RemoveEmployee();
            b.setVisible(true);
        }
        public void ListofEmployees(ActionEvent x)
        {
            ListOfEmployees b = new ListOfEmployees();
            b.setVisible(true);
        }
        public void SearchForEmployee(ActionEvent x)
        {
            SearchForEmployee b = new SearchForEmployee();
            b.setVisible(true);
        }
        public void addinbody(ActionEvent x)
        {
            addinBody b = new addinBody();
            b.setVisible(true);
        }
        public void Removeibody(ActionEvent x)
        {
            RemoveinBody b = new RemoveinBody();
            b.setVisible(true);
        }
        public void searchforinbody(ActionEvent x)
        {
            SearchForInbody b = new SearchForInbody();
            b.setVisible(true);
        }
        public void listofinbody(ActionEvent x)
        {
            ListOfInbody b = new ListOfInbody();
            b.setVisible(true);
        }
        public void addFitnessClass(ActionEvent x)
        {
            addFitnessClass b = new addFitnessClass();
            b.setVisible(true);
        }
        public void RemoveFitnessClass(ActionEvent x)
        {
            RemoveFitnessClass b = new RemoveFitnessClass();
            b.setVisible(true);
        }
        public void SearchForFitnessClass(ActionEvent x)
        {
            SearchForFitnessClass b = new SearchForFitnessClass();
            b.setVisible(true);
        }
        public void ListOfFitnessClasses(ActionEvent x)
        {
            ListOfFitnessClasses b = new ListOfFitnessClasses();
            b.setVisible(true);
        }


        
        
    }
    
           
     
    
    

    
    
    
    
    

    

    

