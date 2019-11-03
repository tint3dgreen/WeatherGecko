/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Geico;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
/**
 *
 * @author carsc
 */
@ManagedBean(name="geckoBean")
@SessionScoped
public class GeckoBean {
    public String dateTime;
    public int epochTime;
    public double tempValue;
    public String unit;
    public int precipProb;
    public int humidity;
    public int tempFeelsLike;
    public int UVIndex;
    public int windGust;
    public int rainAMT;
    public int snowAMT;
    public int iceAMT;
    public double visibility;
    
    public String zipCode;
    public String locationKey;
    
    public boolean Alert;
}
