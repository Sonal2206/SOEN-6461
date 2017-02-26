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
    private String[] date;
    private float[] open, close, high, low, volume, adjClose;
    /**
     * A method for reading the CVS file
     */
    public void reader() {
        String csvLocation = "CSV_File/SampleData.csv";
        BufferedReader buffer;
        String lineIn;
        this.date = new String[13786];
        this.open = new float[13786];
        this.high = new float[13786];
        this.low = new float[13786];
        this.close = new float[13786];
        this.volume = new float[13786];
        this.adjClose = new float[13786];
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
                    this.date[i] = stock[0];
                    this.open[i] = Float.parseFloat(stock[1]);
                    this.high[i] = Float.parseFloat(stock[2]);
                    this.low[i] = Float.parseFloat(stock[3]);
                    this.close[i] = Float.parseFloat(stock[4]);
                    this.volume[i] = Float.parseFloat(stock[5]);
                    this.adjClose[i] = Float.parseFloat(stock[6]);
                }
                i++;

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public float[] getOpen() {
        return this.open;
    }

    public float[] getClose() {
        return this.close;
    }

    public float[] getLow() {
        return this.low;
    }

    public float[] getHigh() {
        return this.high;
    }

    public float[] getVolume() {
        return this.volume;
    }

    public float[] getAdjClose() {
        return this.adjClose;
    }

    public String[] getDate() {
        return this.date;
    }
}
