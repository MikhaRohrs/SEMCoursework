package com.napier.sem;

import java.sql.*;

public class City {

    public int ID;
    public String name;
    public String country;
    public String district;
    public int population;

    @Override
    public String toString() {
        return ID + " " + name + " " + country + " " + district + " " + population;
    }
}
