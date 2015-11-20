/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robotdemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Hashtable;

/**
 *
 * @author Madhuri
 */
public class AutomatedRobot 
{
    private String ReturnedData="";
    Robot robot;
    JNativeHookExample jnae;
    boolean killsession=false;
    
    Hashtable<Integer, Integer> hk;
    public AutomatedRobot() throws IOException, AWTException
    {
        System.out.println("REACHED ROBOT CLASS:\n\n");
        robot = new Robot();
        System.out.println("REACHED ROBOT END:\n\n");
        hk=new Hashtable<Integer, Integer>();

        hk.put(1,27);
        hk.put(59,112);
        hk.put(60,113);
        hk.put(61,114);
        hk.put(62,115);
        hk.put(63,116);
        hk.put(64,117);
        hk.put(65,118);
        hk.put(66,119);
        hk.put(67,120);
        hk.put(68,121);
        hk.put(87,122);
        hk.put(88,123);
        hk.put(41,192);
        hk.put(2,49);
        hk.put(3,50);
        hk.put(4,51);
        hk.put(5,52);
        hk.put(6,53);
        hk.put(7,54);
        hk.put(8,55);
        hk.put(9,56);
        hk.put(10,57);
        hk.put(11,48);
        hk.put(12,45);
        hk.put(13,61);
        hk.put(14,8);
        hk.put(3666,155);
        hk.put(3655,36);
        hk.put(3657,33);
        hk.put(3667,127);
        hk.put(3663,35);
        hk.put(3665,34);
        hk.put(15,9);
        hk.put(16,81);
        hk.put(17,87);
        hk.put(18,69);
        hk.put(19,82);
        hk.put(20,84);
        hk.put(21,89);
        hk.put(22,85);
        hk.put(23,73);
        hk.put(24,79);
        hk.put(25,80);
        hk.put(26,91);
        hk.put(27,93);
        hk.put(43,92);
        hk.put(58,20);
        hk.put(30,65);
        hk.put(31,83);
	hk.put(32,68);
	hk.put(33,70);
	hk.put(34,71);
	hk.put(35,72);
	hk.put(36,74);
	hk.put(37,75);
	hk.put(38,76);
	hk.put(39,59);
	hk.put(40,222);
	hk.put(28,10);
	hk.put(42,16);
	hk.put(44,90);
	hk.put(45,88);
	hk.put(46,67);
	hk.put(47,86);
	hk.put(48,66);
	hk.put(49,78);
	hk.put(50,77);
	hk.put(51,44);
	hk.put(52,46);
	hk.put(53,47);
	hk.put(54,16);
	hk.put(29,17);
	hk.put(3675,157);
	hk.put(56,18);
	hk.put(57,32);
	hk.put(3640,18);
	hk.put(3676,157);
	hk.put(0,0);
	hk.put(3613,17);
	hk.put(57416,38);
	hk.put(57419,37);
	hk.put(57424,40);
	hk.put(57421,39);
	hk.put(69,144);
	hk.put(3637,111);
	hk.put(55,106);
	hk.put(74,109);
	hk.put(78,107);
        hk.put(3639,154);
        hk.put(70,145);
        hk.put(3653,19);

    }
    
    public void startAction(int repetition_count, String loaded_data)
    {
	this.ReturnedData=loaded_data;
        //StringTokenizer st=new StringTokenizer(this.ReturnedData,"<=>");
        
        String[] st=this.ReturnedData.split("<=>");
        
        System.out.println("OBTAINED DATA :"+st.length);
        for(int i=0;i<st.length;i++)
            System.out.println(st[i]);
        
        for(int kr=0;kr<repetition_count;kr++)
        {
            for(int i=3;i<st.length-1;i++)
            {
                System.out.println("KILL VARIABLE :"+this.killsession);
                if(this.killsession==true)
                {
                    System.exit(0);
                }
                
                String tokenString=st[i];
                
                System.out.println("TOKEN PART:"+tokenString);
                String[] tokenList=tokenString.split(":");
                if(tokenList[2].equals("0"))
                {
            
                }
                else
                {
                    if(tokenList[0].equals("key"))
                    {
                        if(tokenList[1].equals("p"))
                        {
                            System.out.println("KEYCODE P GOT:"+tokenList[2]);
                            //System.out.println("CHECKED P VALUE:"+KeyEvent.getKeyText(Integer.parseInt(tokenList[2])));

                            robot.keyPress(hk.get(Integer.parseInt(tokenList[2])));
                            System.out.println("TOKEN PRESSED:"+KeyEvent.getKeyText(hk.get(Integer.parseInt(tokenList[2]))));

                            robot.delay(Integer.parseInt(tokenList[3]));    
                        }
                        else if(tokenList[1].equals("r"))
                        {
                            System.out.println("KEYCODE R GOT:"+tokenList[2]);
                            //System.out.println("CHECKED R VALUE:"+KeyEvent.getKeyText(Integer.parseInt(tokenList[2])));
                            
                            robot.keyRelease(hk.get(Integer.parseInt(tokenList[2])));
                            System.out.println("TOKEN RELEASED:"+KeyEvent.getKeyText(hk.get(Integer.parseInt(tokenList[2]))));

                            robot.delay(Integer.parseInt(tokenList[3]));
                        }
		/* 	check availability of method before removing comments
                        else if(tokenList[1].equals("t"))
                        {
                            r.keyTyped(tokenList[2]);
                        }
		*/
                    }
                    else if(tokenList[0].equals("mouse"))
                    {
                        System.out.println("TOKEN:"+tokenList[1]);
                        if(tokenList[1].equals("p"))
                        {
                            if(Integer.parseInt(tokenList[2])==1)
                            {
                                robot.mousePress(InputEvent.BUTTON1_MASK);
                            }
                            else if(Integer.parseInt(tokenList[2])==2)
                            {
                                robot.mousePress(InputEvent.BUTTON2_MASK);
                            }
                            robot.delay(Integer.parseInt(tokenList[5]));
                        }
                        else if(tokenList[1].equals("r"))
                        {
                            if(Integer.parseInt(tokenList[2])==1)
                            {
                                robot.mouseRelease(InputEvent.BUTTON1_MASK);
                            }
                            else if(Integer.parseInt(tokenList[2])==2)
                            {
                                robot.mouseRelease(InputEvent.BUTTON2_MASK);
                            }
                            robot.delay(Integer.parseInt(tokenList[5]));
                        }
                        else if(tokenList[1].equals("m"))
                        {
                            System.out.println("MOUSE MOVING");
                            robot.mouseMove(Integer.parseInt(tokenList[3]),Integer.parseInt(tokenList[4]));
                            //robot.delay(Integer.parseInt(tokenList[5]));
                            
                        }
                        else if(tokenList[1].equals("d"))
                        {
                            System.out.println("MOUSE DRAGGED");
                            if(Integer.parseInt(tokenList[2])==1)
                            {
                                robot.mousePress(InputEvent.BUTTON1_MASK);
                            }
                            else if(Integer.parseInt(tokenList[2])==2)
                            {
                                robot.mousePress(InputEvent.BUTTON2_MASK);
                            }
                            robot.mouseMove(Integer.parseInt(tokenList[3]),Integer.parseInt(tokenList[4]));
                            if(Integer.parseInt(tokenList[2])==1)
                            {
                                robot.mouseRelease(InputEvent.BUTTON1_MASK);
                            }
                            else if(Integer.parseInt(tokenList[2])==2)
                            {
                                robot.mouseRelease(InputEvent.BUTTON2_MASK);
                            }
                            //robot.delay(Integer.parseInt(tokenList[5]));
                        }
                    }
                }
            }
            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_ALT);
            robot.keyRelease(KeyEvent.VK_Q);
        }
    }
}
