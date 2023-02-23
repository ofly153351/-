import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CustomerStorage {

    public static double[] getBalanceint(int CustomerId) {
        double balance = 0.0;
        try {
            FileInputStream fin = new FileInputStream("Customer.dat");
            DataInputStream din = new DataInputStream(fin);
            balance = din.readDouble();

            din.close();
            fin.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return new double[] { balance };
    }

    public static double[] saveBalance(int customerId, double balance) {
        try {
            FileOutputStream fout = new FileOutputStream("Customer.dat");
            DataOutputStream dout = new DataOutputStream(fout);
            dout.writeDouble(balance);
            fout.close();
            dout.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static double[] getBalance(int i) {
        return null;
    }
}