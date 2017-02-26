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
    private DisplayChart(String title, String chartTitle) {
        super(title);
        JFreeChart lineChart = ChartFactory.createLineChart(chartTitle, "Days", "Index Value",
                createDataset(), PlotOrientation.VERTICAL, true, true, false);

        ChartPanel cp = new ChartPanel(lineChart);
        cp.setPreferredSize(new java.awt.Dimension(560, 367));
        setContentPane(cp);
    }

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

    public static void main(String[] args) {
        DisplayChart dc = new DisplayChart("Stock Market", "Index Value vs. Days");

        dc.pack();
        RefineryUtilities.centerFrameOnScreen(dc);
        dc.setVisible(true);
    }


}
