package powerViolate.powerSwitch;

import powerViolate.lightBulb.LightBulb;

/**
 * Created by lodz on 2016/03/28.
 */
public class PowerSwitch {
    LightBulb lightBulb;
    private boolean on;
    public PowerSwitch(LightBulb lightBulb)
    {
        this.lightBulb = lightBulb;
        this.on = true;
    }

    public boolean isOn()
    {
        return this.on;
    }

    public void press()
    {
        boolean checkOn = isOn();
        if(checkOn)
        {
            lightBulb.turnOff();
            this.on = false;
        }else
        {
            lightBulb.turnOn();
             this.on = true;
        }
    }
}
