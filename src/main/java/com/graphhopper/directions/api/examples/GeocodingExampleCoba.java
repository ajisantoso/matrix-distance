package com.graphhopper.directions.api.examples;
import com.graphhopper.directions.api.client.*;
import com.graphhopper.directions.api.client.auth.*;
import com.graphhopper.directions.api.client.model.*;
import com.graphhopper.directions.api.client.api.GeocodingApi;

import java.io.File;
import java.util.*;

public class GeocodingExampleCoba {

    public static void main(String[] args) {
        
        GeocodingApi apiInstance = new GeocodingApi();
        String key = "fb7765aa-375b-4b44-a9c2-12ae6bb1b10b"; // String | Get your key at graphhopper.com
        String q = "Telkom University"; // String | If you do forward geocoding, then this would be a textual description of the adress you are looking for. If you do reverse geocoding this would be in lat,lon.
        String locale = "locale_example"; // String | Display the search results for the specified locale. Currently French (fr), English (en), German (de) and Italian (it) are supported. If the locale wasn't found the default (en) is used.
        Integer limit = 56; // Integer | Specify the maximum number of returned results
        Boolean reverse = false; // Boolean | Set to true to do a reverse Geocoding request
        String point = "-6.975353, 107.629601"; // String | The location bias in the format 'latitude,longitude' e.g. point=45.93272,11.58803
        String provider = "default"; // String | Can be either, default, nominatim, opencagedata
        try {
            GeocodingResponse result = apiInstance.geocodeGet(key, q, locale, limit, reverse, point, provider);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GeocodingApi#geocodeGet");
            e.printStackTrace();
        }
    }
}