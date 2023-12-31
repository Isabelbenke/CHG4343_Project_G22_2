import java.text.DecimalFormat;

public class TestCase1_Driver
{
    public static void main(String[] args)
    {
        DecimalFormat df_t = new DecimalFormat("0.00");
        DecimalFormat df_C = new DecimalFormat("0.#####");

        double C_A0 = 0.2; //mol/m^3
        double k_A = 0.2; //min^-1
        double v_0 = 0.05; //m^3/min

        double[] reactionConditions = {k_A,C_A0};
        double[] opConditions = {v_0};

        UncontrolledCSTR cstr = new UncontrolledCSTR(1, opConditions, reactionConditions);

        cstr.runCSTR(500, 1);

        System.out.println(cstr.toString());
    }
}
