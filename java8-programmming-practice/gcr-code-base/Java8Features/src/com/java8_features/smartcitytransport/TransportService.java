package com.java8_features.smartcitytransport;

public interface TransportService {

    String getServiceName();
    String getRoute();
    double getFare();
    int getDepartureTime(); // minutes from 00:00 (e.g., 540 = 9 AM)

 
}

