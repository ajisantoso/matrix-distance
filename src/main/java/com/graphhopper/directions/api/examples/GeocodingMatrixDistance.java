package com.graphhopper.directions.api.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.graphhopper.directions.api.client.ApiException;
import com.graphhopper.directions.api.client.api.GeocodingApi;
import com.graphhopper.directions.api.client.model.GeocodingLocation;
import com.graphhopper.directions.api.client.model.GeocodingResponse;
import com.graphhopper.directions.api.client.model.MatrixResponse;
import com.graphhopper.directions.api.client.api.MatrixApi;


/**
 * A simple geocoding request.
 */
public class GeocodingMatrixDistance {
    public static void main(String[] args) {
        new GeocodingMatrixDistance().start();
        new GeocodingMatrixDistance().getMatrixData();
    }

    private void start() {
        GeocodingApi geocoding = new GeocodingApi();
        String key = System.getProperty("graphhopper.key", "fb7765aa-375b-4b44-a9c2-12ae6bb1b10b");
        try {
            GeocodingResponse geocodingResponse = geocoding.geocodeGet(key, "Rumah Sakit Muhammadiyah Bandung", "en", 5, false, "", "default");
            GeocodingLocation loc0 = geocodingResponse.getHits().get(0);
            System.out.println(loc0.getPoint() + ", " + loc0.getName() + ", " + loc0.getCountry() + ", " + loc0.getState());
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public MatrixResponse getMatrixData() {

    	//Make a Object of Matrix Api.
    	        MatrixApi api = new MatrixApi();

    	//Add 2 or more points 
    	        List<String> point = getLatsLongsFromLocations();
    	        // String fromPoint ="-6.975353, 107.629601";
    	        // String toPoint = "-6.933643, 107.623175";
    	         String fromPoint =null;
    	         String toPoint =null;
   	             	      	       
    	//Add required field you want to get

    	        List<String> requiredFields = Arrays.asList("weights","distances", "times");
    	//Add Vehicle I use Car for it but You can use this link for supported vehicle https://graphhopper.com/api/1/docs/supported-vehicle-profiles/        

    	        String vehicle = "car";
    	        MatrixResponse response = null;
    	        try {
    	       response =  api.matrixGet("fb7765aa-375b-4b44-a9c2-12ae6bb1b10b", point, fromPoint, toPoint, requiredFields, vehicle);
    	     //Matrixreponse object have distance and time matrix given location.      

    	        } catch (ApiException e) {
    	            e.printStackTrace();
    	        }
    	        System.out.println(response.getTimes());
    	        System.out.println(response.getDistances());
    	        return response;
    	    }
		public List<String> getLatsLongsFromLocations() {
    	        List<String> allPoints = new ArrayList<>();

    	//I Add 2 location lat,long but you can add max 80 locations
    	            allPoints.add("-6.975353"+ "," + "107.629601");
    	            allPoints.add("-6.933643"+ "," + "107.623175");
    	            allPoints.add("-6.891945"+ "," + "107.603991");
    	        return allPoints;
    	    }
    
}
