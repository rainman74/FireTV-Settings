package com.patriot.confireator;

import android.content.ComponentName;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v17.leanback.app.GuidedStepFragment;
import android.support.v17.leanback.widget.GuidanceStylist;
import android.support.v17.leanback.widget.GuidedAction;

import java.util.List;

@SuppressWarnings("ALL")
public class Chooser extends GuidedStepFragment {
    private final int ACTION_DISPLAYSOUNDS = 1;
    private final int ACTION_NETWORK = 2;
    private final int ACTION_DEVICES = 3;
    private final int ACTION_ACCESSIBILITY = 4;
    private final int ACTION_APPS = 5;
    private final int ACTION_PREFERENCES = 6;
    private final int ACTION_DEVICE = 7;
    private final int ACTION_ALEXA = 8;
    private final int ACTION_APPSTORE = 9;
    private final int ACTION_NOTIFICATIONS = 10;
    private final int ACTION_LANGUAGE = 11;
    private final int ACTION_SUPERSU = 12;
    private final int ACTION_XPOSED = 13;
    private final int ACTION_VNC = 14;
    private final int ACTION_ACCOUNT = 15;
    private final int ACTION_MONITORING = 16;
    private final int ACTION_DEVELOPER = 17;
    private final int ACTION_RESET = 18;

    private static void addAction(List<GuidedAction> actions,long id, String title, String desc){
        actions.add(new GuidedAction.Builder()
                .id(id)
                .title(title)
                .description(desc)
                .build());
    }

    @NonNull
    @Override
    public GuidanceStylist.Guidance onCreateGuidance(Bundle savedInstanceState) {
        String title = getString(R.string.two_opts_title);
        String breadcrumb = getString(R.string.two_opts_breadcrumb);
        String description = getString(R.string.two_opts_desc);
        Drawable icon = getActivity().getDrawable(R.drawable.ic_action_account);
        return new GuidanceStylist.Guidance(title, description, breadcrumb, icon);
    }

    @Override
    public void onCreateActions(@NonNull List<GuidedAction> actions, Bundle savedInstanceState) {
        super.onCreateButtonActions(actions,savedInstanceState);
        addAction(actions,ACTION_DISPLAYSOUNDS,getString(R.string.two_opts_display),"Changing Screensaver, Resolution, Sound and HDMI-CEC");
        addAction(actions,ACTION_NETWORK,getString(R.string.two_opts_net),"Configuring Network and WLAN");
        addAction(actions,ACTION_DEVICES,getString(R.string.two_opts_dev),"Configuring Remote Control, Game Controller and Bluetooth Devices");
        addAction(actions,ACTION_ACCESSIBILITY,getString(R.string.two_opts_access),"Customize Subtitles, Voice Control and Accessibility");
        addAction(actions,ACTION_APPS,getString(R.string.two_opts_app),"Management of App Usage Data Collection");
        addAction(actions,ACTION_PREFERENCES,getString(R.string.two_opts_pref),"Setting Parental Control, Notifications, Time Zone and Language");
        addAction(actions,ACTION_DEVICE,getString(R.string.two_opts_device),"Info, Memory Card, Sleep Mode, Restart, Factory Settings");
//        addAction(actions,ACTION_ALEXA,getString(R.string.two_opts_alexa),"Show Alexa Settings");
//        addAction(actions,ACTION_APPSTORE,getString(R.string.two_opts_appstore),"Show my Apps");
//        addAction(actions,ACTION_NOTIFICATIONS,getString(R.string.two_opts_notifications),"Setting Notifications");
//        addAction(actions,ACTION_LANGUAGE,getString(R.string.two_opts_lang),"Setting the Language");
//        addAction(actions,ACTION_SUPERSU,getString(R.string.two_opts_supersu),"Display SuperSU Settings");
//        addAction(actions,ACTION_XPOSED,getString(R.string.two_opts_xposed),"Display Xposed Settings");
//        addAction(actions,ACTION_VNC,getString(R.string.two_opts_vnc),"Display VNC Server Settings");
        addAction(actions,ACTION_ACCOUNT,getString(R.string.two_opts_account),"Login and logout from Amazon Account");
        addAction(actions,ACTION_MONITORING,getString(R.string.two_opts_monitor),"Management of Data Monitoring");
        addAction(actions,ACTION_DEVELOPER,getString(R.string.two_opts_developer),"Display Developer Menu");
        addAction(actions,ACTION_RESET,getString(R.string.two_opts_res),"Restore Factory Settings");
    }

    @Override
    public void onGuidedActionClicked(GuidedAction action) {
        super.onGuidedActionClicked(action);
        if (action.getId() == ACTION_DISPLAYSOUNDS) {
            Intent localIntent = new Intent();
            localIntent.setPackage("com.amazon.tv.settings");
            localIntent.setComponent(ComponentName.unflattenFromString("com.amazon.tv.settings/.tv.display_sounds.DisplayAndSoundsActivity"));
            localIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(localIntent);
        }
        if (action.getId() == ACTION_NETWORK) {
            Intent localIntent = new Intent();
            localIntent.setPackage("com.amazon.tv.settings");
            localIntent.setComponent(ComponentName.unflattenFromString("com.amazon.tv.settings/.tv.network.NetworkActivity"));
            localIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(localIntent);
        }
        if (action.getId() == ACTION_DEVICES) {
            Intent localIntent = new Intent();
            localIntent.setPackage("com.amazon.tv.settings");
            localIntent.setComponent(ComponentName.unflattenFromString("com.amazon.tv.settings/.tv.controllers_bluetooth_devices.ControllersAndBluetoothActivity"));
            localIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(localIntent);
        }
        if (action.getId() == ACTION_ACCESSIBILITY) {
            Intent localIntent = new Intent();
            localIntent.setPackage("com.amazon.tv.settings");
            localIntent.setComponent(ComponentName.unflattenFromString("com.amazon.tv.settings/.tv.accessibility.AccessibilityActivity"));
            localIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(localIntent);
        }
        if (action.getId() == ACTION_APPS) {
            Intent localIntent = new Intent();
            localIntent.setPackage("com.amazon.tv.settings");
            localIntent.setComponent(ComponentName.unflattenFromString("com.amazon.tv.settings/.tv.applications.ApplicationsActivity"));
            localIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(localIntent);
        }
        if (action.getId() == ACTION_PREFERENCES) {
            Intent localIntent = new Intent();
            localIntent.setPackage("com.amazon.tv.notificationcenter");
            localIntent.setComponent(ComponentName.unflattenFromString("com.amazon.tv.settings/.tv.preferences.PreferencesActivity"));
            localIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(localIntent);
        }
        if (action.getId() == ACTION_DEVICE) {
            Intent localIntent = new Intent();
            localIntent.setPackage("com.amazon.tv.notificationcenter");
            localIntent.setComponent(ComponentName.unflattenFromString("com.amazon.tv.settings/.tv.device.DeviceActivity"));
            localIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(localIntent);
        }
        if (action.getId() == ACTION_ALEXA) {
            Intent localIntent = new Intent();
            localIntent.setPackage("com.amazon.vizzini");
            localIntent.setComponent(ComponentName.unflattenFromString("com.amazon.vizzini/.setting.AlexaSettingActivity"));
            localIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(localIntent);
        }
        if (action.getId() == ACTION_APPSTORE) {
            Intent localIntent = new Intent();
            localIntent.setPackage("com.amazon.venezia");
            localIntent.setComponent(ComponentName.unflattenFromString("com.amazon.venezia/.grid.AppsGridActivity"));
            localIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(localIntent);
        }
        if (action.getId() == ACTION_NOTIFICATIONS) {
            Intent localIntent = new Intent();
            localIntent.setPackage("com.amazon.tv.notificationcenter");
            localIntent.setComponent(ComponentName.unflattenFromString("com.amazon.tv.notificationcenter/.NotificationCenterActivity"));
            localIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(localIntent);
        }
        if (action.getId() == ACTION_LANGUAGE) {
            Intent localIntent = new Intent();
            localIntent.setPackage("eu.chainfire.supersu");
            localIntent.setComponent(ComponentName.unflattenFromString("com.amazon.tv.settings/.tv.preferences.LanguageSelectActivity"));
            localIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(localIntent);
        }
        if (action.getId() == ACTION_SUPERSU) {
            Intent localIntent = new Intent();
            localIntent.setPackage("eu.chainfire.supersu");
            localIntent.setComponent(ComponentName.unflattenFromString("eu.chainfire.supersu/.MainActivity-Material"));
            localIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(localIntent);
        }
        if (action.getId() == ACTION_XPOSED) {
            Intent localIntent = new Intent();
            localIntent.setPackage("de.robv.android.xposed.installer");
            localIntent.setComponent(ComponentName.unflattenFromString("de.robv.android.xposed.installer/.WelcomeActivity"));
            localIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(localIntent);
        }
        if (action.getId() == ACTION_VNC) {
            Intent localIntent = new Intent();
            localIntent.setPackage("com.vmlite.vncserver");
            localIntent.setComponent(ComponentName.unflattenFromString("com.vmlite.vncserver/.MainActivity"));
            localIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(localIntent);
        }
        if (action.getId() == ACTION_ACCOUNT) {
            Intent localIntent = new Intent();
            localIntent.setPackage("com.amazon.ssm");
            localIntent.setComponent(ComponentName.unflattenFromString("com.amazon.tv.settings/.tv.my_account.MyAccountActivity"));
            localIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(localIntent);
        }
        if (action.getId() == ACTION_MONITORING) {
            Intent localIntent = new Intent();
            localIntent.setPackage("com.amazon.tv.settings");
            localIntent.setComponent(ComponentName.unflattenFromString("com.amazon.tv.settings/.tv.preferences.data_monitoring.DataMonitoringActivity"));
            localIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(localIntent);
        }
        if (action.getId() == ACTION_DEVELOPER) {
            Intent localIntent = new Intent();
            localIntent.setPackage("com.amazon.ssm");
            localIntent.setComponent(ComponentName.unflattenFromString("com.amazon.ssm/.ControlPanel"));
            localIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(localIntent);
        }
        if (action.getId() == ACTION_RESET) {
            Intent localIntent = new Intent();
            localIntent.setPackage("com.amazon.tv.settings");
            localIntent.setComponent(ComponentName.unflattenFromString("com.amazon.tv.settings/.tv.FactoryResetActivity"));
            localIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(localIntent);
        }
    }
}
