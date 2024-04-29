package bin.vendors;
import java.util.ArrayList;
import java.util.Arrays;



public class Light {

    private static final String[] DEFAULT_COLORS =
    {
        "White", "RED", "BLUE", "GREEN", "YELLOW", "ORANGE", "PURPLE"
    };

    private int intensity;

    private ArrayList<String> colors;

    private int maxIntensity;

    private boolean isOn;

    private int colorChoice;

    public Light(int intensity)
    {
        this.colors = new ArrayList<String>(Arrays.asList(DEFAULT_COLORS));
        this.intensity = 50;
        this.isOn = false;
    }


    public void power()
    {
        isOn = !isOn;
    }

    public boolean increaseIntensity()
    {
        if (isOn && intensity < maxIntensity )
        {
            intensity++;
            return true;
        }
        return false;
    }

    public boolean decreaseIntensity()
    {
        if (isOn && intensity > 0 )
        {
            intensity--;
            return true;
        }
        return false;
    }

    public boolean changeColor(int color_Choice)
    {
        if (isOn && color_Choice > 0 && color_Choice <= colors.size())
        {
            colorChoice = color_Choice;
            return true;
        }
        return false;
    }

    public String[] getColors()
    {
        return colors.toArray(new String[colors.size()]);
    }

    public boolean isOn()
    {
        return isOn;
    }

    public int getIntensity()
    {
        return intensity;
    }

    public int getMaxIntensity()
    {
        return maxIntensity;
    }

    public String getCurrentColor()
    {
        return colors.get(colorChoice);
    }

    public int getNumColors()
    {
        return colors.size();
    }

}