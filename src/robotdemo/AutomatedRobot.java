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
import org.jnativehook.keyboard.NativeKeyEvent;

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

        /*
        STRUCTURE OF HASH STRING
        hk(CAPTURE_EVENT_KEY_CODE,KEY_EVENT_KEY_CODE)
        
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
        */
        
        hk.put(NativeKeyEvent.VC_ESCAPE,KeyEvent.VK_ESCAPE);
        hk.put(NativeKeyEvent.VC_F1,KeyEvent.VK_F1);
        hk.put(NativeKeyEvent.VC_F2,KeyEvent.VK_F2);
        hk.put(NativeKeyEvent.VC_F3,KeyEvent.VK_F3);
        hk.put(NativeKeyEvent.VC_F4,KeyEvent.VK_F4);
        hk.put(NativeKeyEvent.VC_F5,KeyEvent.VK_F5);
        hk.put(NativeKeyEvent.VC_F6,KeyEvent.VK_F6);
        hk.put(NativeKeyEvent.VC_F7,KeyEvent.VK_F7);
        hk.put(NativeKeyEvent.VC_F8,KeyEvent.VK_F8);
        hk.put(NativeKeyEvent.VC_F9,KeyEvent.VK_F9);
        hk.put(NativeKeyEvent.VC_F10,KeyEvent.VK_F10);
        hk.put(NativeKeyEvent.VC_F11,KeyEvent.VK_F11);
        hk.put(NativeKeyEvent.VC_F12,KeyEvent.VK_F12);
        hk.put(NativeKeyEvent.VC_PRINTSCREEN,KeyEvent.VK_PRINTSCREEN);
        hk.put(NativeKeyEvent.VC_SCROLL_LOCK,KeyEvent.VK_SCROLL_LOCK);
        hk.put(NativeKeyEvent.VC_PAUSE, KeyEvent.VK_PAUSE);
        hk.put(NativeKeyEvent.VC_QUOTE,KeyEvent.VK_QUOTE);
        hk.put(NativeKeyEvent.VC_1, KeyEvent.VK_1);
        hk.put(NativeKeyEvent.VC_2, KeyEvent.VK_2);
        hk.put(NativeKeyEvent.VC_3, KeyEvent.VK_3);
        hk.put(NativeKeyEvent.VC_4, KeyEvent.VK_4);
        hk.put(NativeKeyEvent.VC_5, KeyEvent.VK_5);
        hk.put(NativeKeyEvent.VC_6, KeyEvent.VK_6);
        hk.put(NativeKeyEvent.VC_7, KeyEvent.VK_7);
        hk.put(NativeKeyEvent.VC_8, KeyEvent.VK_8);
        hk.put(NativeKeyEvent.VC_9, KeyEvent.VK_9);
        hk.put(NativeKeyEvent.VC_0, KeyEvent.VK_0);
        hk.put(NativeKeyEvent.VC_UNDERSCORE, KeyEvent.VK_UNDERSCORE);
        hk.put(NativeKeyEvent.VC_EQUALS, KeyEvent.VK_EQUALS);
        hk.put(NativeKeyEvent.VC_BACKSPACE, KeyEvent.VK_BACK_SPACE);
        hk.put(NativeKeyEvent.VC_TAB, KeyEvent.VK_TAB);
        hk.put(NativeKeyEvent.VC_CAPS_LOCK, KeyEvent.VK_CAPS_LOCK);
        hk.put(NativeKeyEvent.VC_SHIFT_L,KeyEvent.VK_SHIFT);
        hk.put(NativeKeyEvent.VC_SHIFT_R,KeyEvent.VK_SHIFT);
        hk.put(NativeKeyEvent.VC_CONTROL_L, KeyEvent.VK_CONTROL);
        hk.put(NativeKeyEvent.VC_CONTROL_R, KeyEvent.VK_CONTROL);
        // WINDOWS BUTTON MISSED
        hk.put(NativeKeyEvent.VC_ALT_L, KeyEvent.VK_ALT);
        hk.put(NativeKeyEvent.VC_ALT_R, KeyEvent.VK_ALT);
        hk.put(NativeKeyEvent.VC_SPACE, KeyEvent.VK_SPACE);
        hk.put(NativeKeyEvent.VC_OPEN_BRACKET, KeyEvent.VK_OPEN_BRACKET);
        hk.put(NativeKeyEvent.VC_CLOSE_BRACKET, KeyEvent.VK_CLOSE_BRACKET);
        hk.put(NativeKeyEvent.VC_SLASH, KeyEvent.VK_SLASH);
        hk.put(NativeKeyEvent.VC_SEMICOLON, KeyEvent.VK_SEMICOLON);
        //DOUBLE QUOTE
        hk.put(NativeKeyEvent.VC_ENTER, KeyEvent.VK_ENTER);
        hk.put(NativeKeyEvent.VC_COMMA, KeyEvent.VK_COMMA);
        hk.put(NativeKeyEvent.VC_PERIOD, KeyEvent.VK_PERIOD);
        hk.put(NativeKeyEvent.VC_BACK_SLASH, KeyEvent.VK_BACK_SLASH);
        //RIGHT WINDOW BUTTON MISSED
        hk.put(NativeKeyEvent.VC_A, KeyEvent.VK_A);
	hk.put(NativeKeyEvent.VC_B, KeyEvent.VK_B);
	hk.put(NativeKeyEvent.VC_C, KeyEvent.VK_C);
	hk.put(NativeKeyEvent.VC_D, KeyEvent.VK_D);
	hk.put(NativeKeyEvent.VC_E, KeyEvent.VK_E);
	hk.put(NativeKeyEvent.VC_F, KeyEvent.VK_F);
	hk.put(NativeKeyEvent.VC_G, KeyEvent.VK_G);
	hk.put(NativeKeyEvent.VC_H, KeyEvent.VK_H);
	hk.put(NativeKeyEvent.VC_I, KeyEvent.VK_I);
	hk.put(NativeKeyEvent.VC_J, KeyEvent.VK_J);
	hk.put(NativeKeyEvent.VC_K, KeyEvent.VK_K);
	hk.put(NativeKeyEvent.VC_L, KeyEvent.VK_L);
	hk.put(NativeKeyEvent.VC_M, KeyEvent.VK_M);
	hk.put(NativeKeyEvent.VC_N, KeyEvent.VK_N);
	hk.put(NativeKeyEvent.VC_O, KeyEvent.VK_O);
	hk.put(NativeKeyEvent.VC_P, KeyEvent.VK_P);
	hk.put(NativeKeyEvent.VC_Q, KeyEvent.VK_Q);
	hk.put(NativeKeyEvent.VC_R, KeyEvent.VK_R);
	hk.put(NativeKeyEvent.VC_S, KeyEvent.VK_S);
	hk.put(NativeKeyEvent.VC_T, KeyEvent.VK_T);
	hk.put(NativeKeyEvent.VC_U, KeyEvent.VK_U);
	hk.put(NativeKeyEvent.VC_V, KeyEvent.VK_V);
	hk.put(NativeKeyEvent.VC_W, KeyEvent.VK_W);
	hk.put(NativeKeyEvent.VC_X, KeyEvent.VK_X);
	hk.put(NativeKeyEvent.VC_Y, KeyEvent.VK_Y);
	hk.put(NativeKeyEvent.VC_Z, KeyEvent.VK_Z);
        hk.put(NativeKeyEvent.VC_HOME, KeyEvent.VK_HOME);
        hk.put(NativeKeyEvent.VC_END, KeyEvent.VK_END);
        hk.put(NativeKeyEvent.VC_INSERT, KeyEvent.VK_INSERT);
        hk.put(NativeKeyEvent.VC_PAGE_UP, KeyEvent.VK_PAGE_UP);
        hk.put(NativeKeyEvent.VC_PAGE_DOWN, KeyEvent.VK_PAGE_DOWN);
        hk.put(NativeKeyEvent.VC_DELETE, KeyEvent.VK_DELETE);
        hk.put(NativeKeyEvent.VC_UP, KeyEvent.VK_UP);
        hk.put(NativeKeyEvent.VC_DOWN, KeyEvent.VK_DOWN);
        hk.put(NativeKeyEvent.VC_LEFT, KeyEvent.VK_LEFT);
        hk.put(NativeKeyEvent.VC_RIGHT, KeyEvent.VK_RIGHT);
        hk.put(NativeKeyEvent.VC_NUM_LOCK, KeyEvent.VK_NUM_LOCK);
        hk.put(NativeKeyEvent.VC_KP_DIVIDE, KeyEvent.VK_DIVIDE);
        hk.put(NativeKeyEvent.VC_KP_MULTIPLY, KeyEvent.VK_MULTIPLY);
        hk.put(NativeKeyEvent.VC_KP_SUBTRACT, KeyEvent.VK_MINUS);
        hk.put(NativeKeyEvent.VC_KP_ADD, KeyEvent.VK_PLUS);
        hk.put(NativeKeyEvent.VC_KP_ENTER, KeyEvent.VK_ENTER);
        /*CHECK BELOW SOME PROBLEM */
        hk.put(NativeKeyEvent.VC_KP_SEPARATOR, KeyEvent.VK_PERIOD);
       	hk.put(NativeKeyEvent.VC_KP_0, KeyEvent.VK_NUMPAD0);
	hk.put(NativeKeyEvent.VC_KP_1, KeyEvent.VK_NUMPAD1);
	hk.put(NativeKeyEvent.VC_KP_2, KeyEvent.VK_NUMPAD2);
	hk.put(NativeKeyEvent.VC_KP_3, KeyEvent.VK_NUMPAD3);
	hk.put(NativeKeyEvent.VC_KP_4, KeyEvent.VK_NUMPAD4);
	hk.put(NativeKeyEvent.VC_KP_5, KeyEvent.VK_NUMPAD5);
	hk.put(NativeKeyEvent.VC_KP_6, KeyEvent.VK_NUMPAD6);
	hk.put(NativeKeyEvent.VC_KP_7, KeyEvent.VK_NUMPAD7);
	hk.put(NativeKeyEvent.VC_KP_8, KeyEvent.VK_NUMPAD8);
	hk.put(NativeKeyEvent.VC_KP_9, KeyEvent.VK_NUMPAD9);

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
            robot.keyRelease(KeyEvent.VK_SHIFT);
                robot.keyRelease(KeyEvent.VK_CONTROL);
                robot.keyRelease(KeyEvent.VK_ALT);
                robot.keyRelease(KeyEvent.VK_Q);
                robot.mouseRelease(InputEvent.BUTTON1_MASK);
                robot.mouseRelease(InputEvent.BUTTON2_MASK);
                
            for(int i=0;i<st.length;i++)
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
                            System.out.println("CHECKED P VALUE:"+NativeKeyEvent.getKeyText(Integer.parseInt(tokenList[2])));

                            robot.keyPress(hk.get(Integer.parseInt(tokenList[2])));
                            System.out.println("TOKEN PRESSED:"+KeyEvent.getKeyText(hk.get(Integer.parseInt(tokenList[2]))));

                            robot.delay(Integer.parseInt(tokenList[3]));    
                        }
                        else if(tokenList[1].equals("r"))
                        {
                            System.out.println("KEYCODE R GOT:"+tokenList[2]);
                            System.out.println("CHECKED R VALUE:"+NativeKeyEvent.getKeyText(Integer.parseInt(tokenList[2])));
                            
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
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON2_MASK);
        }
    }
}
