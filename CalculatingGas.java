/* Duyen Dang
 * April 5, 2019
 * A computating class, calculates pressure/temperature/volume and stores data*/
package dangsteam;

/**
 *
 * @author DuyenDang
 */
public class CalculatingGas
{
    private double iniVolume;
    private double iniPressure;
    private double iniTemperature;
    private double fiVolume;
    private double fiPressure;
    private double fiTemperature;

    public CalculatingGas()
    {
        this.fiPressure = 0;
        this.fiTemperature = 0;
        this.fiVolume = 0;
        this.iniPressure = 0;
        this.iniTemperature = 0;
        this.iniVolume = 0;
    }
    public CalculatingGas(double iniVolume, double iniPressure, double iniTemperature, double fiVolume, double fiPressure, double fiTemperature)
    {
        this.fiPressure = fiPressure;
        this.fiTemperature = fiTemperature;
        this.fiVolume = fiVolume;
        this.iniPressure = iniPressure;
        this.iniTemperature = iniTemperature;
        this.iniVolume = iniVolume;
    }
    
    public void setIniVolume(double iniVolume)
    {
        this.iniVolume = iniVolume;
    }

    public void setIniTemperature(double iniTemperature)
    {
        this.iniTemperature = iniTemperature;
    }
    
    public void setIniPressure(double iniPressure)
    {
        this.iniPressure = iniPressure;
    }
    
    public void setFiVolume(double fiVolume)
    {
        this.fiVolume = fiVolume;
    }
    
    public void setFiPressure(double fiPressure)
    {
        this.fiPressure = fiPressure;
    } 
    
    public void setFiTemperature(double fiTemperature)
    {
        this.fiTemperature = fiTemperature;
    }

    public double getIniPressure()
    {
        return iniPressure;
    }
    
    public double getIniVolume()
    {
        return iniVolume;
    }

    public double getIniTemperature()
    {
        return iniTemperature;
    }

    public double getFiVolume()
    {
        return fiVolume;
    }

    public double getFiPressure()
    {
        return fiPressure;
    }

    public double getFiTemperature()
    {
        return fiTemperature;
    }
    
    public double computeIniVolume()
    {
        this.iniVolume = (fiPressure * fiVolume * iniTemperature) / (fiTemperature * iniPressure);
        
        return iniVolume;
    }
    
    public double computeIniPressure()
    {
        this.iniPressure = (fiPressure * fiVolume * iniTemperature) / (fiTemperature * iniVolume);
        
        return iniPressure;
    }
    
    public double computeIniTemperature()
    {
        this.iniTemperature = (iniPressure * iniVolume * fiTemperature) / (fiTemperature * fiVolume);
        
        return iniTemperature;
    }
    
    public double computeFiVolume()
    {
        this.fiVolume = (iniPressure * iniVolume * fiTemperature) / (iniTemperature * fiPressure);
        
        return fiVolume;
    }
    
    public double computeFiTemperature()
    {
        this.fiTemperature = (fiPressure * fiVolume * iniTemperature) / (iniPressure * iniVolume);
        
        return fiTemperature;
    }
    
    public double computeFiPressure()
    {
        this.fiPressure = (iniPressure * iniVolume * fiTemperature) / (iniTemperature * fiVolume);
        
        return fiPressure;
    }
    
    @Override
    public String toString()
    {
        return "Gas{" + "iniVolume=" + iniVolume + ", iniPressure=" + iniPressure + ", iniTemperature=" + iniTemperature + ", fiVolume=" + fiVolume + ", fiPressure=" + fiPressure + ", fiTemperature=" + fiTemperature + '}';
    }
}

