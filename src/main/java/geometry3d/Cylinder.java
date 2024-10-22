package geometry3d;

import exceptions.VariablesLesThanZero;
import exceptions.VariablesNotSet;
import geometry2d.Figure;

import java.io.IOException;
import java.util.logging.*;

public class Cylinder {
    private static final Logger LOGGER = Logger.getLogger(Cylinder.class.getName());
    Handler fileHandler;
    {
        try {
            fileHandler = new FileHandler("cylinder.log");
            fileHandler.setFormatter(new SimpleFormatter());
            LOGGER.addHandler(fileHandler);
            LOGGER.setLevel(Level.FINEST);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private Figure figure;
    private float h;
    public Cylinder(float h, Figure figure) {
        this.h=h;
        this.figure =figure;
        if(this.h<0){
            LOGGER.log(Level.FINEST, "Variables(h = {0}) must be greater than zero",this.h);
            throw new VariablesLesThanZero("h",this.h);
        } else if (this.h==0) {
            LOGGER.log(Level.FINEST, "Variables(h) not set or equals 0",this.h);
            throw new VariablesNotSet("h");
        }
        if(this.figure ==null){
            LOGGER.log(Level.FINEST, "Variables(Figure) not set or equals 0",this.h);
            throw new VariablesNotSet("Figure");
        }
    }
    public void setH(float h){
        this.h=h;
    }
    public void setFigure(Figure figure){
        this.figure=figure;
    }
    public double volume() {
        if(this.h<0){
            LOGGER.log(Level.FINEST, "Variables(h = {0}) must be greater than zero",this.h);
            throw new VariablesLesThanZero("h",this.h);
        } else if (this.h==0) {
            LOGGER.log(Level.FINEST, "Variables(h) not set or equals 0",this.h);
            throw new VariablesNotSet("h");
        }
        if(this.figure ==null){
            LOGGER.log(Level.FINEST, "Variables(Figure) not set or equals 0",this.h);
            throw new VariablesNotSet("Figure");
        }
        return h* figure.area();
    }
}
