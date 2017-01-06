/*
 * Copyright (c) 2001-2017 HPD Software Ltd.
 */
package ssta.geometry;

import static java.lang.Math.PI;

/**
 * ssta.geometry.EarthDistance, created on 006 06/01/17 13:27 <p>
 * @author StephenSt
 */
public class EarthDistance {

  final static double deg2rad(double degrees) {
    return degrees * PI / 180;
  }

  final static double rad2deg(double rad) {
    return (rad * 180 / Math.PI);
  }

  private static double distanceMiles(double lat1, double lon1, double lat2, double lon2) {
    // hairy mathematical stuff that's really just applying the haversine formula to calculate the angle of the arc between two vectors on the unit circle.
    double theta = lon1 - lon2;
    double angle = Math.sin(deg2rad(lat1)) * Math.sin(deg2rad(lat2)) + Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) * Math.cos(deg2rad(theta));
    angle = Math.acos(angle);
    angle = rad2deg(angle);

    // now we have the angle (in degrees) of the arc we can calculate what distance is subtended by the arc on the earth.
    // We shamelessly cheat (lots) and leverage the fact that a minute of arc on the earth is roughly a mile on the surface (actually a degree is about 69
    // miles...) - this calculation is accurate to better than 0.5% I think...which is "good enough" for our purposes...
    // 1.515 is the number of miles one second of arc subtends (assuming the earth is a sphere, which it's not, but it's really quite close to being one)
    return angle * 60 * 1.1515;
  }


  private static double distanceKm(double lat1, double lon1, double lat2, double lon2) {
    return distanceMiles(lat1, lon1, lat2, lon2) * 1.60934;
  }
}
