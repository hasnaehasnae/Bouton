import javax.swing.*;
import java .awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.awt.event.ActionListener;







public class Button extends JFrame  implements ActionListener{
	  private JPanel container = new JPanel();
	  private Fenetre2 fen;
	  private JLabel label = new JLabel("nombre d'etats ");
	  private Integer[] numbers = {1,2,3,4,5,6};
	  private JComboBox combo = new JComboBox(numbers);
	  private JComboBox comb2= new JComboBox(numbers);
	  private JLabel label2 = new JLabel("nombre de vocabulaire ");
	  static JTextField[] jtf ;

	  private      JButton b =new JButton("Mon bouton");
  
	  
      
   
      
      
      
	  public  Button(){
		  
		 
		  
		  
          b.addActionListener(this );
          
          
          
          
		  
		  
           combo.setPreferredSize(new Dimension(100, 20));
           combo.setForeground(Color.blue);
           combo.addActionListener(this);
           comb2.addActionListener(this);
         
		    
           JPanel  centre= new JPanel();
 		
 	 		  
          
           
           
           
           
           
           
           
           
           
           
	    this.setTitle("Animation");
	    this.setSize(300, 300);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);
	    container.setBackground(Color.white);
	    container.setLayout(new BorderLayout());
	    combo.setPreferredSize(new Dimension(100, 20));
        comb2.setPreferredSize(new Dimension(100, 20));
	    JPanel top = new JPanel();
	    JPanel south = new JPanel();
	    
	    
	    top.add(label);
	    top.add(combo);
	    south.add(label2);
	    south.add(comb2);
	    south.add(b);
	  
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    container.add(top, BorderLayout.NORTH);
	    container.add(south, BorderLayout.WEST);
	    
	    this.setContentPane(container);
	    this.setVisible(true);  
	    
	    
	   
	    
	    
	  }
	

	  public static void main(String argv[]) {
		  
		  Button bt=new Button();
		
		  
		  
	  }


	 
		
		
		  public void actionPerformed(ActionEvent e) {
			  int a=0;
			  int r;
			 
	    	    a=(int)combo.getSelectedItem(); 	     
	  System.out.println("ActionListener : action sur " + a );
	             r= a=(int)comb2.getSelectedItem(); 
			  
			  if(e.getSource()  ==  b ){
	  fen = new Fenetre2(a,r);
	  
	  
		
	    }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
			  }
	 
		  }
	  
		  
		      
		  
		  
	  


		 
	  
	  


 
 class Fenetre2 extends JFrame  {


	    private JLabel label = new JLabel();
	    private JButton bouton1 = new JButton("Start");
	  
	    public Fenetre2(int u,int w){
	    
	    this.setTitle("deuxième fenetre");
	    this.setSize(700,400);
	    this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    this.setLocationRelativeTo(null);
	    JTextField[][] b=new JTextField[w][u];
	    
	    
        JLabel label= new JLabel ("Remplir le tableau avec ston vocabulaire et tes etats :");
        JLabel label1= new JLabel ("                                  ");
        
		Container page = getContentPane();
		
		page.add(label);
		page.add(label1);
		
		
		page.setLayout(new GridLayout (w+1,u+1));
		
		  System.out.println("ActionListener : action sur " );
		  for(int l=0;l<w;l++){  
	    for(int k=0;k<u;k++){
	    	 b[l][k]=new JTextField("         ");
	    	    
	    		page.add(b[l][k]);
		
	    }
		  }



	    this.setVisible(true);  

	}
	    
	}
 
 
 
 
 
 
 






		  
	  
		 





	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  


		  
		  
		  



      
          
 
        
 
    
    
    
    
    
    

     
                     
    
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  
       
    










