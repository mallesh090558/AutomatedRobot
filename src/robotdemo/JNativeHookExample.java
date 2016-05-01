/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robotdemo;

/**
 *
 * @author Madhuri
 */
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.mouse.NativeMouseEvent;
import org.jnativehook.keyboard.NativeKeyListener;
import org.jnativehook.mouse.NativeMouseListener;
import org.jnativehook.mouse.NativeMouseMotionListener;
/**
* @author javaQuery
* Global Keyboard Listener
*/
public class JNativeHookExample implements NativeKeyListener, NativeMouseListener, NativeMouseMotionListener 
{
/* Key Pressed */
    boolean isloadingdata;
    String loadingdata;
    
    private int ctrlprsed=0;
    private int ctrlrlsed=1;
    private int escprsed=0;
    private int escrlsed=1;
    private int f11prsed=0;
    private int f11rlsed=1;
    private int qprsed=0;
    private int qrlsed=1;
    
    private long currenttime;
    private long delaytime;

    AutomatedRobot ae;
    
    public JNativeHookExample(AutomatedRobot ar)
    {
        this.isloadingdata=false;
        this.loadingdata="";
        this.ae=ar;

        this.currenttime=System.currentTimeMillis();
        
        // Clear previous logging configurations.
        LogManager.getLogManager().reset();

        // Get the logger for "org.jnativehook" and set the level to off.
        Logger logger = Logger.getLogger(GlobalScreen.class.getPackage().getName());
        logger.setLevel(Level.OFF);
    }
    
    public void startRoboActivity(int repeat_count)
    {
        System.out.println("LOADED OBTAINED DATA :"+this.loadingdata);
        ae.startAction(repeat_count, loadingdata);
    }
    
    public void startMokeListener()
    {
        System.out.println("REACHED JNATIVE HOOK");
        try 
        {
/* Register jNativeHook */   GlobalScreen.registerNativeHook();
        } 
        catch (NativeHookException ex) 
        {
/* Its error */
            System.err.println("There was a problem registering the native hook.");
            System.err.println(ex.getMessage());
            System.exit(1);
        }
/* Construct the exam MALLESH 
ple object and initialze native hook. */
        GlobalScreen.addNativeMouseListener(this);
        GlobalScreen.addNativeMouseMotionListener(this);
        GlobalScreen.addNativeKeyListener(this);
    }
    
    @Override
    public void nativeKeyPressed(NativeKeyEvent e) 
    {
        System.out.println("VARIABLES:-\tkillSession\t:\t"+ae.killsession+"\tisloadingdata\t:\t"+isloadingdata);
        
        this.delaytime=System.currentTimeMillis()-this.currenttime;
        //System.out.println("Key Pressed: " + NativeKeyEvent.getKeyText(e.getKeyCode()));
        
        if (e.getKeyCode() ==NativeKeyEvent.VC_ESCAPE)
        {
		/*
            System.out.println("LOADED DATA\n\n"+loadingdata);
            try 
            {
                GlobalScreen.unregisterNativeHook();
            }
            catch (NativeHookException ex)
            {
                Logger.getLogger(JNativeHookExample.class.getName()).log(Level.SEVERE, null, ex);
            }
		*/
        }
        if(e.getKeyCode() ==NativeKeyEvent.VC_CONTROL_L)
        {
            this.ctrlprsed=1;
            this.ctrlrlsed=0;
        }
        else if(e.getKeyCode() ==NativeKeyEvent.VC_Q)
        {
            this.qprsed=1;
            this.qrlsed=0;
        }
        else if(e.getKeyCode()== NativeKeyEvent.VC_F11)
        {
            this.f11prsed=1;
            this.f11rlsed=0;
        }
        else if(e.getKeyCode()== NativeKeyEvent.VC_ESCAPE)
        {
            this.escprsed=1;
            this.escrlsed=0;
        }
        //System.out.println("VALUES:"+this.qprsed+"\t"+this.ctrlprsed+"\t"+this.isloadingdata);
        if(this.qprsed==1 && this.ctrlprsed==1 && isloadingdata==false)
        {
            this.isloadingdata=true;
        }
	else if(this.qprsed==1 && this.ctrlprsed==1 && isloadingdata==true)
            this.isloadingdata=false;
	else if((this.escprsed==1 && this.f11prsed==1) || (this.escprsed==1 && this.qprsed==1))
        {
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@REACHED KILL VARIABLE LOCATION@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            ae.killsession=true;
        }            
        this.currenttime=System.currentTimeMillis();
        this.LoadDatatoFilefromKey(e,'p');
    }
/* Key Released */
    @Override
    public void nativeKeyReleased(NativeKeyEvent e) 
    {
        this.delaytime=System.currentTimeMillis()-this.currenttime;
        //System.out.println("Key Released: " + e.getKeyCode());
        if(e.getKeyCode()==NativeKeyEvent.VC_CONTROL_L)
        {
            this.ctrlrlsed=1;
            this.ctrlprsed=0;
        }
        else if(e.getKeyCode()==NativeKeyEvent.VC_F11)
        {
            this.f11prsed=0;    
            this.f11rlsed=1;
        }
        else if(e.getKeyCode()==NativeKeyEvent.VC_ESCAPE)
        {
            this.escprsed=0;
            this.escrlsed=1;
        }
        else if(e.getKeyCode()==NativeKeyEvent.VC_Q)
        {
            this.qprsed=0;
            this.qrlsed=1;
        }
        this.LoadDatatoFilefromKey(e,'r');
        this.currenttime=System.currentTimeMillis();
    }
/* I can't find any outpu
t from this call */
    @Override
    public void nativeKeyTyped(NativeKeyEvent e) 
    {
        //System.out.println("Key Typed: " + e.getKeyText(e.getKeyCode()));
        //this.LoadDatatoFilefromKey(e,'t');
    }
    
    @Override
    public void nativeMouseClicked(NativeMouseEvent nme) 
    {
        this.delaytime=System.currentTimeMillis()-this.currenttime;
        //System.out.println("Mouse Button: "+nme.getButton()+"\t\t-->"+nme.getPoint());
        this.LoadDatatoFilefromMouse(nme,'c');
        this.currenttime=System.currentTimeMillis();
    }

    @Override
    public void nativeMousePressed(NativeMouseEvent nme) 
    {
        this.delaytime=System.currentTimeMillis()-this.currenttime;
        //System.out.println("Mouse Button: "+nme.getButton()+"\t\t-->"+nme.getPoint());
        this.LoadDatatoFilefromMouse(nme,'p');
        this.currenttime=System.currentTimeMillis();
    }

    @Override
    public void nativeMouseReleased(NativeMouseEvent nme) 
    {
        this.delaytime=System.currentTimeMillis()-this.currenttime;
        //System.out.println("Mouse Button: "+nme.getButton()+"\t\t-->"+nme.getPoint());
        this.LoadDatatoFilefromMouse(nme,'r');
        this.currenttime=System.currentTimeMillis();
    }
    @Override
    public void nativeMouseMoved(NativeMouseEvent nme) 
    {
        this.delaytime=System.currentTimeMillis()-this.currenttime;
        //System.out.println("Mouse Moved\t\t-->"+nme.getPoint());
        this.LoadDatatoFilefromMouse(nme,'m');
    }

    @Override
    public void nativeMouseDragged(NativeMouseEvent nme) 
    {
        this.delaytime=System.currentTimeMillis()-this.currenttime;
        //System.out.println("Mouse Dragged:"+nme.getSource()+"\t\t-->"+nme.getPoint());
        this.LoadDatatoFilefromMouse(nme,'d');
    }
    
    public void LoadDatatoFilefromKey(NativeKeyEvent e,char status)
    {
        if(isloadingdata)
        {
            //this.loadingdata+=""+NativeKeyEvent.getKeyText(e.getKeyCode())+"<=>";
            this.loadingdata+="key:"+status+":"+e.getKeyCode()+":"+this.delaytime+"<=>";
            //System.out.println(loadingdata);
        }
        else
        {
            //System.out.println("LOADING IS CANCELLED");
        }
    }
    public void LoadDatatoFilefromMouse(NativeMouseEvent e,char status)
    {
        if(isloadingdata)
        {
            //this.loadingdata+=""+e.getButton()+"("+e.getX()+":"+e.getY()+")<=>";
            this.loadingdata+="mouse:"+status+":"+1+":"+e.getX()+":"+e.getY()+":"+this.delaytime+"<=>";
            //System.out.println(loadingdata);
        }
        else
        {
            //System.out.println("LOADING IS CANCELLED");
        }
    }
}
