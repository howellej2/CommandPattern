package remote;
import bin.vendors.Light;

public class ColorForward extends Action {

    private Light light;

    public ColorForward(Light light)
    {
        super("COlORS");
        this.light = light;
    }

    @Override
    public boolean performAction()
    {
        String[] all_colors = light.getColors();
        if (all_colors.length == 0)
        {
            System.out.println("No available colors");
        }
        else
        {
            for (int i = 0; i < all_colors.length; i++)
            {
                System.out.printf("The light is %d) %s\n", i, all_colors[i]);
            }
        }
        return true;
    }
    
}
   