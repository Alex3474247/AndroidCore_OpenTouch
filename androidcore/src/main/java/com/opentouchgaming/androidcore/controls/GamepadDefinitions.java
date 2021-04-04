package com.opentouchgaming.androidcore.controls;

import android.view.KeyEvent;
import android.view.MotionEvent;

import androidx.core.view.MotionEventCompat;

import com.opentouchgaming.androidcore.AppInfo;

public class GamepadDefinitions
{

    static private ActionInputDefinition gamepadDefinition = null;

    static public ActionInputDefinition getDefinition(AppInfo.Apps app)
    {
        //if(gamepadDefinition == null)
        {
            gamepadDefinition = new ActionInputDefinition();
            if (app == AppInfo.Apps.DELTA_TOUCH)
            {
                gamepadDefinition.addHeader("Common");

                gamepadDefinition.addAction("analog_move_fwd", "Fwd/Back", ActionInput.ActionType.ANALOG, PortActDefs.ACTION_ANALOG_FWD, ActionInput.SourceType.AXIS, MotionEventCompat.AXIS_Y,
                                            new AnalogAxisDialog());

                gamepadDefinition.addAction("analog_move_strafe", "Strafe", ActionInput.ActionType.ANALOG, PortActDefs.ACTION_ANALOG_STRAFE, ActionInput.SourceType.AXIS, MotionEventCompat.AXIS_X,
                                            new AnalogAxisDialog());

                gamepadDefinition.addAction("analog_look_yaw", "Look Left/Right", ActionInput.ActionType.ANALOG, PortActDefs.ACTION_ANALOG_YAW, ActionInput.SourceType.AXIS, MotionEventCompat.AXIS_Z,
                                            new AnalogAxisDialog());

                gamepadDefinition.addAction("analog_look_pitch", "Look Up/Down", ActionInput.ActionType.ANALOG, PortActDefs.ACTION_ANALOG_PITCH, ActionInput.SourceType.AXIS, MotionEventCompat.AXIS_RZ,
                                            new AnalogAxisDialog());

                gamepadDefinition.addAction("attack", "Fire", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_ATTACK, ActionInput.SourceType.AXIS, MotionEventCompat.AXIS_GAS);

                gamepadDefinition.addAction("use", "Open/Use", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_USE, ActionInput.SourceType.BUTTON, KeyEvent.KEYCODE_BUTTON_A);

                gamepadDefinition.addAction("next_weapon", "Next weapon", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_NEXT_WEP, ActionInput.SourceType.BUTTON, KeyEvent.KEYCODE_BUTTON_R1);

                gamepadDefinition.addAction("prev_weapon", "Prev weapon", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_PREV_WEP, ActionInput.SourceType.BUTTON, KeyEvent.KEYCODE_BUTTON_L1);

                gamepadDefinition.addAction("weapon_wheel", "Activate Weapon wheel", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_USE_WEAPON_WHEEL, ActionInput.SourceType.BUTTON, -1,
                                            new WeaponWheelDialog());

                gamepadDefinition.addAction("map", "Map", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_MAP, ActionInput.SourceType.BUTTON, -1);

                gamepadDefinition.addAction("keyboard", "Show keyboard", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_SHOW_KBRD, ActionInput.SourceType.BUTTON, -1);

                gamepadDefinition.addAction("inv_prev", "Inventory previous", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_INVPREV, ActionInput.SourceType.BUTTON, -1);
                gamepadDefinition.addAction("inv_next", "Inventory next", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_INVNEXT, ActionInput.SourceType.BUTTON, -1);
                gamepadDefinition.addAction("inv_use", "Inventory use", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_INVUSE, ActionInput.SourceType.BUTTON, -1);

                gamepadDefinition.addAction("show_inv", "Show inventory UI (Buttons)", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_SHOW_INV, ActionInput.SourceType.BUTTON, -1);

                gamepadDefinition.addAction("show_inv_dpad", "Show inventory UI (DPAD)", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_SHOW_DPAD_INV, ActionInput.SourceType.BUTTON, -1);

                gamepadDefinition.addAction("show_utils", "Show Utils(Save,Load,Map,Keybrd etc)", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_SHOW_GP_UTILS, ActionInput.SourceType.BUTTON, -1);

                gamepadDefinition.addAction("alt_attack", "Alt Attack (GZ)", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_ALT_ATTACK, ActionInput.SourceType.BUTTON, -1);

                gamepadDefinition.addAction("jump", "Jump (GZ)", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_JUMP, ActionInput.SourceType.BUTTON, -1);

                gamepadDefinition.addAction("crouch", "Crouch (GZ)", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_DOWN, ActionInput.SourceType.BUTTON, -1);
                gamepadDefinition.addAction("crouch_toggle", "Crouch (toggle) (GZ)", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_TOGGLE_CROUCH, ActionInput.SourceType.BUTTON, -1);

                gamepadDefinition.addHeader("Custom buttons (Keypad 0 to 9)");

                gamepadDefinition.addAction("custom_0", "Custom 1 (GZ)", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_CUSTOM_0, ActionInput.SourceType.BUTTON, -1);
                gamepadDefinition.addAction("custom_1", "Custom 2 (GZ)", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_CUSTOM_1, ActionInput.SourceType.BUTTON, -1);
                gamepadDefinition.addAction("custom_2", "Custom 3 (GZ)", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_CUSTOM_2, ActionInput.SourceType.BUTTON, -1);
                gamepadDefinition.addAction("custom_3", "Custom 4 (GZ)", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_CUSTOM_3, ActionInput.SourceType.BUTTON, -1);
                gamepadDefinition.addAction("custom_4", "Custom 5 (GZ)", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_CUSTOM_4, ActionInput.SourceType.BUTTON, -1);
                gamepadDefinition.addAction("custom_5", "Custom 6 (GZ)", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_CUSTOM_5, ActionInput.SourceType.BUTTON, -1);

                gamepadDefinition.addAction("custom_6", "Custom 7 (GZ)", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_CUSTOM_6, ActionInput.SourceType.BUTTON, -1);
                gamepadDefinition.addAction("custom_7", "Custom 8 (GZ)", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_CUSTOM_7, ActionInput.SourceType.BUTTON, -1);
                gamepadDefinition.addAction("custom_8", "Custom 9 (GZ)", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_CUSTOM_8, ActionInput.SourceType.BUTTON, -1);
                gamepadDefinition.addAction("custom_9", "Custom 10 (GZ)", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_CUSTOM_9, ActionInput.SourceType.BUTTON, -1);


                gamepadDefinition.addHeader("Doom 3");

                gamepadDefinition.addAction("reload", "Reload", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_RELOAD, ActionInput.SourceType.BUTTON, -1);

                gamepadDefinition.addAction("flash_light", "Flash light", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_FLASH_LIGHT, ActionInput.SourceType.BUTTON, -1);

                gamepadDefinition.addAction("doom3_pda", "Show PDA", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_HELPCOMP, ActionInput.SourceType.BUTTON, -1);

                gamepadDefinition.addAction("doom3_sprint", "Sprint toggle or press", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_SPRINT, ActionInput.SourceType.BUTTON, -1);

                gamepadDefinition.addAction("doom3_zoom", "Zoom toggle or press", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_ZOOM_IN, ActionInput.SourceType.BUTTON, -1);

                gamepadDefinition.addHeader("Common menu navigation keys");


                gamepadDefinition.addAction("menu_select", "Menu select", ActionInput.ActionType.MENU, PortActDefs.PORT_ACT_MENU_SELECT, ActionInput.SourceType.BUTTON, KeyEvent.KEYCODE_BUTTON_A);

                gamepadDefinition.addAction("menu_back", "Menu back", ActionInput.ActionType.MENU, PortActDefs.PORT_ACT_MENU_BACK, ActionInput.SourceType.BUTTON, KeyEvent.KEYCODE_BUTTON_B);

                gamepadDefinition.addAction("menu_show", "Menu show (back button)", ActionInput.ActionType.MENU, PortActDefs.PORT_ACT_MENU_SHOW, ActionInput.SourceType.BUTTON, -1);

                gamepadDefinition.addHeader("Digital move (do not set if using sticks)");

                gamepadDefinition.addAction("forward_btn", "Move Forward button", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_FWD, ActionInput.SourceType.BUTTON, -1);
                gamepadDefinition.addAction("back_btn", "Move Backwards button", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_BACK, ActionInput.SourceType.BUTTON, -1);
                gamepadDefinition.addAction("strafe_left_btn", "Strafe Left button", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_MOVE_LEFT, ActionInput.SourceType.BUTTON, -1);
                gamepadDefinition.addAction("strafe_right_btn", "Strafe Right button", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_MOVE_RIGHT, ActionInput.SourceType.BUTTON, -1);
                gamepadDefinition.addAction("look_left_btn", "Look Left button", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_LEFT, ActionInput.SourceType.BUTTON, -1);
                gamepadDefinition.addAction("look_right_btn", "Look Right button", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_RIGHT, ActionInput.SourceType.BUTTON, -1);
            }
            else if (app == AppInfo.Apps.QUAD_TOUCH)
            {
                gamepadDefinition.addHeader("Common");

                gamepadDefinition.addAction("analog_move_fwd", "Forward/Back", ActionInput.ActionType.ANALOG, PortActDefs.ACTION_ANALOG_FWD, ActionInput.SourceType.AXIS, MotionEvent.AXIS_Y,
                                            new AnalogAxisDialog());

                gamepadDefinition.addAction("analog_move_strafe", "Strafe", ActionInput.ActionType.ANALOG, PortActDefs.ACTION_ANALOG_STRAFE, ActionInput.SourceType.AXIS, MotionEvent.AXIS_X,
                                            new AnalogAxisDialog());

                gamepadDefinition.addAction("analog_look_yaw", "Look Left/Look Right", ActionInput.ActionType.ANALOG, PortActDefs.ACTION_ANALOG_YAW, ActionInput.SourceType.AXIS, MotionEvent.AXIS_Z,
                                            new AnalogAxisDialog());

                gamepadDefinition.addAction("analog_look_pitch", "Look Up/Look Down", ActionInput.ActionType.ANALOG, PortActDefs.ACTION_ANALOG_PITCH, ActionInput.SourceType.AXIS, MotionEvent.AXIS_RZ,
                                            new AnalogAxisDialog());

                gamepadDefinition.addAction("attack", "Attack", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_ATTACK, ActionInput.SourceType.AXIS, MotionEvent.AXIS_GAS);

                gamepadDefinition.addAction("attack2", "Alt-Attack (mouse 2)", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_ALT_ATTACK, ActionInput.SourceType.AXIS, -1);

                gamepadDefinition.addAction("jump", "Jump/Swim up", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_JUMP, ActionInput.SourceType.BUTTON, KeyEvent.KEYCODE_BUTTON_A);

                gamepadDefinition.addAction("crouch", "Crouch/Swim down", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_DOWN, ActionInput.SourceType.BUTTON, KeyEvent.KEYCODE_BUTTON_THUMBL);

                gamepadDefinition.addAction("next_weapon", "Next weapon", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_NEXT_WEP, ActionInput.SourceType.BUTTON, KeyEvent.KEYCODE_BUTTON_R1);

                gamepadDefinition.addAction("prev_weapon", "Prev weapon", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_PREV_WEP, ActionInput.SourceType.BUTTON, KeyEvent.KEYCODE_BUTTON_L1);

                gamepadDefinition.addAction("weapon_wheel", "Activate Weapon wheel", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_USE_WEAPON_WHEEL, ActionInput.SourceType.BUTTON, -1,
                                            new WeaponWheelDialog());

                gamepadDefinition.addAction("keyboard", "Show keyboard", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_SHOW_KBRD, ActionInput.SourceType.BUTTON, -1);

                gamepadDefinition
                        .addAction("show_utils", "Show Utils(Save,Load,Scores,Keybrd etc)", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_SHOW_GP_UTILS, ActionInput.SourceType.BUTTON, -1);

                gamepadDefinition.addAction("custom_1", "Custom 1 (H)", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_CUSTOM_0, ActionInput.SourceType.BUTTON, -1);
                gamepadDefinition.addAction("custom_2", "Custom 2 (I)", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_CUSTOM_1, ActionInput.SourceType.BUTTON, -1);
                gamepadDefinition.addAction("custom_3", "Custom 3 (J)", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_CUSTOM_2, ActionInput.SourceType.BUTTON, -1);
                gamepadDefinition.addAction("custom_4", "Custom 4 (K)", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_CUSTOM_3, ActionInput.SourceType.BUTTON, -1);
                gamepadDefinition.addAction("custom_5", "Custom 5 (L)", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_CUSTOM_4, ActionInput.SourceType.BUTTON, -1);
                gamepadDefinition.addAction("custom_6", "Custom 6 (M)", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_CUSTOM_5, ActionInput.SourceType.BUTTON, -1);


                gamepadDefinition.addHeader("Inventory keys( Quake 2, Hexen 2)");

                gamepadDefinition.addAction("show_inv", "Show inventory buttons", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_SHOW_INV, ActionInput.SourceType.BUTTON, -1);

                gamepadDefinition.addAction("show_inv_dpad", "Show inventory DPAD", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_SHOW_DPAD_INV, ActionInput.SourceType.BUTTON, -1);

                gamepadDefinition.addAction("inven_prev", "Inventory previous", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_INVPREV, ActionInput.SourceType.BUTTON, -1);

                gamepadDefinition.addAction("inven_next", "Inventory next", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_INVNEXT, ActionInput.SourceType.BUTTON, -1);

                gamepadDefinition.addAction("inven_use", "Inventory use", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_INVUSE, ActionInput.SourceType.BUTTON, -1);

                gamepadDefinition.addAction("inven_drop", "Inventory drop", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_INVDROP, ActionInput.SourceType.BUTTON, -1);

                gamepadDefinition.addHeader("Quake 2 specific keys");

                gamepadDefinition.addAction("help_comp", "Help computer", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_HELPCOMP, ActionInput.SourceType.BUTTON, -1);

                gamepadDefinition.addHeader("Quake 3 specific keys");

                gamepadDefinition.addAction("use_item", "Use item (Q3)", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_USE, ActionInput.SourceType.BUTTON, -1);

                gamepadDefinition.addAction("zoom", "Weapon zoom (Q3)", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_ZOOM_IN, ActionInput.SourceType.BUTTON, -1);

                gamepadDefinition.addAction("use_gauntlet", "Switch to Gauntlet (Q3)", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_WEAP1, ActionInput.SourceType.BUTTON, -1);

                gamepadDefinition.addHeader("Malice specific keys");

                gamepadDefinition.addAction("malice_reload", "Reload (Q1 Malice)", ActionInput.ActionType.BUTTON, PortActDefs.PORT_MALICE_RELOAD, ActionInput.SourceType.BUTTON, -1);

                gamepadDefinition.addAction("malice_cycle", "Cycle toys (Q1 Malice)", ActionInput.ActionType.BUTTON, PortActDefs.PORT_MALICE_CYCLE, ActionInput.SourceType.BUTTON, -1);

                gamepadDefinition.addAction("malice_use", "Use toy (Q1 Malice)", ActionInput.ActionType.BUTTON, PortActDefs.PORT_MALICE_USE, ActionInput.SourceType.BUTTON, -1);

                gamepadDefinition.addHeader("Slight Mechanical Destruction specific keys");

                gamepadDefinition.addAction("smd_use", "Use", ActionInput.ActionType.BUTTON, PortActDefs.PORT_SMD_USE, ActionInput.SourceType.BUTTON, -1);

                gamepadDefinition.addHeader("Common menu navigation keys");

                gamepadDefinition.addAction("menu_select", "Menu select", ActionInput.ActionType.MENU, PortActDefs.PORT_ACT_MENU_SELECT, ActionInput.SourceType.BUTTON, KeyEvent.KEYCODE_BUTTON_A);

                gamepadDefinition.addAction("menu_back", "Menu back", ActionInput.ActionType.MENU, PortActDefs.PORT_ACT_MENU_BACK, ActionInput.SourceType.BUTTON, KeyEvent.KEYCODE_BUTTON_B);

                gamepadDefinition.addAction("menu_show", "Menu show (back button)", ActionInput.ActionType.MENU, PortActDefs.PORT_ACT_MENU_SHOW, ActionInput.SourceType.BUTTON, -1);

                gamepadDefinition.addHeader("Digital move (do not set if using sticks)");

                gamepadDefinition.addAction("forward_btn", "Move Forward button", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_FWD, ActionInput.SourceType.BUTTON, -1);
                gamepadDefinition.addAction("back_btn", "Move Backwards button", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_BACK, ActionInput.SourceType.BUTTON, -1);
                gamepadDefinition.addAction("strafe_left_btn", "Strafe Left button", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_MOVE_LEFT, ActionInput.SourceType.BUTTON, -1);
                gamepadDefinition.addAction("strafe_right_btn", "Strafe Right button", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_MOVE_RIGHT, ActionInput.SourceType.BUTTON, -1);
                gamepadDefinition.addAction("look_left_btn", "Look Left button", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_LEFT, ActionInput.SourceType.BUTTON, -1);
                gamepadDefinition.addAction("look_right_btn", "Look Right button", ActionInput.ActionType.BUTTON, PortActDefs.PORT_ACT_RIGHT, ActionInput.SourceType.BUTTON, -1);
            }
        }

        return gamepadDefinition;
    }
}
