import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by freyjaj93 on 2017-02-20.
 *
 * A class which reads a CVS file with dates and stock information
 *
 * @author Freyja Jokulsdottir
 * @version 1.0
 * @since 20.02.2017
 */
public class ReadCVS {
    /**
     * A method for reading the CVS file
     */
    public void reader() {
        String csvLocation = "CSV_File/SampleData.csv";
        BufferedReader buffer = null;
        String lineIn = "";
        String[] date = new String[13786];
        float[] open = new float[13786], high = new float[13786], low = new float[13786], close = new float[13786],
                volume = new float[13786], adjClose = new float[13786];
        int i = 0;

        try {
            buffer = new BufferedReader(new FileReader(csvLocation));

            // Read each line of the file
            while((lineIn = buffer.readLine()) != null){
                // Split each line by commas
                String[] stock = lineIn.split(",");

                // Divide the line into their corresponding column
                // This meant that the variables in line n will be in array[n-1]
                if(i != 0) {
                    date[i] = stock[0];
                    open[i] = Float.parseFloat(stock[1]);
                    high[i] = Float.parseFloat(stock[2]);
                    low[i] = Float.parseFloat(stock[3]);
                    close[i] = Float.parseFloat(stock[4]);
                    volume[i] = Float.parseFloat(stock[5]);
                    adjClose[i] = Float.parseFloat(stock[6]);
                }
                i++;

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
