package learnjava.misc;

import java.util.ArrayList;
import java.util.List;

public class GSONHelloWorld {
    public static void main(String[] args) {

        String poly = "[[25.046958634841058,78.96839618682861],[25.046414318770978,78.9744472503662],[25.046569837894705,78.97676467895506],[25.043420537193146,78.97852420806885],[25.04198194082529,78.97891044616699],[25.039260225856985,78.97552013397217],[25.038871404502395,78.96886825561522],[25.039299107924638,78.96637916564941],[25.04124319559187,78.96461963653564],[25.04750294849465,78.96487712860107],[25.046958634841058,78.96839618682861]]";

        String poly2 = "[[28.59979224984829,77.07008957862854],[28.59953791618173,77.07028269767761],[28.599424878799027,77.07087278366089],[28.599104605554427,77.07132339477539],[28.598445216389226,77.07139849662781],[28.598059000814054,77.07133412361145],[28.597738723406923,77.0710015296936],[28.597738723406923,77.07074403762817],[28.59831333805973,77.06947803497313],[28.598869109898935,77.06872701644897],[28.59901040735558,77.06872701644897],[28.599340100682227,77.0689308643341],[28.599895867091515,77.06992864608765],[28.59979224984829,77.07008957862854]]";

       // System.out.println(new GSONHelloWorld().parsePolygonPoints(poly2));
    }

    private List<List<Double>> parsePolygonPoints(String polygonString) {
        List<List<Double>> latlngList = new ArrayList<>();
        String planned_coordinate[] = polygonString.split(",");
        System.out.println(planned_coordinate.length);
        try {
            for (int counter = 0; counter < planned_coordinate.length; counter = counter+2) {
                System.out.println("counter : " + counter);
                List<Double> lat_lon = new ArrayList<>();
                lat_lon.add(Double.parseDouble(planned_coordinate[counter].replaceAll("[^0-9.]", "")));
                lat_lon.add(Double.parseDouble(planned_coordinate[counter + 1].replaceAll("[^0-9.]", "")));
                latlngList.add(lat_lon);
            }
        } catch (Exception e) {
            e.printStackTrace();
            //logger.info("Error while parsing poly line string  {}", e.getMessage());
        }
        return latlngList;
    }





}