import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class tic_tac extends JFrame {                   //extending JFrame
    boolean player_1=true,player_2=false;
   int arr[]=new int[9];
   int arr1[]=new int[9];
   int[] player_11=new int[5];
   int[] player_22=new int[6];
   ImageIcon x,o,w,w2;              
   JButton jb[]=new JButton[9];
   JLabel jl=new JLabel("player_1 wins!");
   JLabel jl1=new JLabel("player_2 wins!");
   JPanel p;                                //defining all the variables and class out side constructor
    tic_tac()
    { 
      super("tic_tac_toe");
       x=new ImageIcon(getClass().getResource("x.jpg"));       
       o=new ImageIcon(getClass().getResource("o.jpg"));
       w=new ImageIcon(getClass().getResource("win_1.jpg"));
       w2=new ImageIcon(getClass().getResource("win_2.jpg"));       //initializing the definitions of objects
      p=new JPanel();                                               //creating  panel
      setVisible(true);                                             //show gui, default =false 
      setSize(500,500);                                             //size of gui
      setDefaultCloseOperation(EXIT_ON_CLOSE);                      //conditions for close operation    method defined in jframe    
      add(p);                                                       //adding panel t0 jframe
      
      p.setLayout(new GridLayout(3,3,2,2));                         //defining 3*3 matrix with each cell having space of 2 pixels
      for(int i=0;i<9;i++)                                          //initializing JButtons
      {
          jb[i]=new JButton();
          p.add(jb[i]);
      }
          for(int i=0;i<9;i++)                                      //defining the task of each scell when pressed 
          {
              jb[i].addActionListener(new ActionListener()
                      {
                         public void actionPerformed(ActionEvent e)
                          {  
                             for(int j=0;j<9;j++)      //logic part ahead! :P
                             {
                             if(e.getSource()==jb[j])
                             {
                                 if(player_1)
                                 {
                                 jb[j].setIcon(x);
                                 player_1=false;
                                 player_2=true;
                                 break;
                                 }
                                 else if(player_2)
                                 {
                                     jb[j].setIcon(o);
                                     player_1=true;
                                     player_2=false;
                                     break;
                                 }
                               } 
                             }
                  if(player_1==false)
                  {
                       for(int j=0;j<9;j++)
                       {
                           if(e.getSource()==jb[0])
                           {
                               arr[0]=-1;
                           }
                           else if(e.getSource()==jb[j])
                               arr[j]=j;
                       }
                       if((arr[0]==-1&&arr[1]==1&&arr[2]==2)||(arr[0]==-1&&arr[3]==3&&arr[6]==6)||(arr[0]==-1&&arr[4]==4&&arr[8]==8)
                               ||(arr[2]==2&&arr[5]==5&&arr[8]==8)||(arr[2]==2&&arr[4]==4&&arr[6]==6)
                               ||(arr[8]==8&&arr[7]==7&&arr[6]==6)
                               ||(arr[3]==3&&arr[4]==4&&arr[5]==5)
                               ||(arr[1]==1&&arr[4]==4&&arr[7]==7))
                       
                          jb[4].setIcon(w);
                   } 
                  if(player_2==false)
                  {
                       for(int j=0;j<9;j++)
                       {
                           if(e.getSource()==jb[0])
                           {
                               arr1[0]=-1;
                           }
                           else if(e.getSource()==jb[j])
                               arr1[j]=j;
                       }
                       if((arr1[0]==-1&&arr1[1]==1&&arr1[2]==2)||(arr1[0]==-1&&arr1[3]==3&&arr1[6]==6)||(arr1[0]==-1&&arr1[4]==4&&arr1[8]==8)
                               ||(arr1[2]==2&&arr1[5]==5&&arr1[8]==8)||(arr1[2]==2&&arr1[4]==4&&arr1[6]==6)
                               ||(arr1[8]==8&&arr1[7]==7&&arr1[6]==6)
                               ||(arr1[3]==3&&arr1[4]==4&&arr1[5]==5)
                               ||(arr1[1]==1&&arr1[4]==4&&arr1[7]==7))
                          jb[4].setIcon(w2);
                   } 
               }//end of actionPerformed
             });//end of actionlistener
         }//actionListener for loop
    }//end of tic tac constructor
}    
class MAIN
{
    public static void main(String[] args)
    {
        tic_tac t=new tic_tac();
    }
}