import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 * A Class which creates and displays a line chart using the JFreeChart Library.
 *
 * @author Freyja Jokulsdottir
 * @since 20.02.2017
 * @version 1.0
 */
public class DisplayChart extends ApplicationFrame {
    /**
     * A DisplayChart object to be used by main to display the chart
     *
     * @param title the title of the window frame
     * @param chartTitle the title of the chart
     */
    private DisplayChart(String title, String chartTitle) {
        // The title of the window frame
        super(title);
        // Create a chart with a title, x-axis title, y-axis title and dataset from CVS file
        JFreeChart lineChart = ChartFactory.createLineChart(chartTitle, "Days", "Index Value",
                createDataset(), PlotOrientation.VERTICAL, true, true, false);

        // The type of the chart is a line chart
        ChartPanel cp = new ChartPanel(lineChart);
        // Size of the chart
        cp.setPreferredSize(new java.awt.Dimension(560, 367));
        setContentPane(cp);
    }

    /**
     * Create a dataset to be used in the chart
     * TODO manipulate this data using CalculateMA.java
     *
     * @return a dataset to be graphed in the chart
     */
    private DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset ds = new DefaultCategoryDataset();

        //Get data from CVS file
        ReadCVS read = new ReadCVS();
        read.reader();
        String[] date = read.getDate();
        float[] open, close, high, low, volume, adjClose;
        open = read.getOpen();
        close = read.getClose();
        high = read.getHigh();
        low = read.getLow();
        volume = read.getVolume();
        adjClose = read.getAdjClose();

        // Add the data to the dataset
        for(int i = 1; i < open.length; i++){
            ds.addValue(open[i], "Open", date[i]);
            ds.addValue(close[i], "Close", date[i]);
            ds.addValue(high[i], "High", date[i]);
            ds.addValue(low[i], "Low", date[i]);
            ds.addValue(volume[i], "Volume", date[i]);
            ds.addValue(adjClose[i], "Adjacent Close", date[i]);
        }

        return ds;
    }

    /**
     * A main method for displaying the chart
     * This method could be moved into a user interface class of some sort.
     *
     * @param args
     */
    /*
    public static void main(String[] args) {
        DisplayChart dc = new DisplayChart("Stock Market", "Index Value vs. Days");

        dc.pack();
        RefineryUtilities.centerFrameOnScreen(dc);
        dc.setVisible(true);
    }
*/

}
