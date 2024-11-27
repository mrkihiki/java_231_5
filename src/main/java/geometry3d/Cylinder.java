package geometry3d;

import exceptions.VariablesLesThanZeroException;
import exceptions.VariablesNotSetException;
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
            LOGGER.setUseParentHandlers(false);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private Figure figure;
    private float h;

    public Cylinder(float h, Figure figure) {
        if(h<0){
            LOGGER.log(Level.FINEST, "Variables(h = {0}) must be greater than zero",this.h);
            throw new VariablesLesThanZeroException("h",this.h);
        } else if (h==0) {
            LOGGER.log(Level.FINEST, "Variables(h) not set or equals 0",this.h);
            throw new VariablesNotSetException("h");
        }
        if(figure ==null){
            LOGGER.log(Level.FINEST, "Variables(Figure) not set or equals 0",this.h);
            throw new VariablesNotSetException("Figure");
        }
        this.h=h;
        this.figure =figure;
    }
    public void setH(float h){
        if(h<0){
            LOGGER.log(Level.FINEST, "Variables(h = {0}) must be greater than zero",this.h);
            throw new VariablesLesThanZeroException("h",this.h);
        } else if (h==0) {
            LOGGER.log(Level.FINEST, "Variables(h) not set or equals 0",this.h);
            throw new VariablesNotSetException("h");
        }
        this.h=h;
    }
    public void setFigure(Figure figure){
        if(figure ==null){
            LOGGER.log(Level.FINEST, "Variables(Figure) not set or equals 0",this.h);
            throw new VariablesNotSetException("Figure");
        }
        this.figure=figure;
    }
    public double volume() {
        LOGGER.fine("Start volume()");
        float answer = h * figure.area();
        LOGGER.fine("End");
        return answer;
    }
}
