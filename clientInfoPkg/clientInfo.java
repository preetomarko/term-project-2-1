package clientInfoPkg;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * Created by USER on 12/8/2015.
 */
public class clientInfo implements Serializable {
    String from;
    String to;
    LocalDate d=null;
    boolean ac=false;
    boolean nonAC=false;

    public LocalDate getD() {
        return d;
    }

    public boolean isAc() {
        return ac;
    }

    public boolean isNonAC() {
        return nonAC;
    }

    public String getFrom(){return from;}
    public String getTo(){return to;}

    public void setFrom(String s)
    {
        from=s;
    }

    public void setTo(String s)
    {
        to=s;
    }

    public void setDate(LocalDate ld)
    {
        d=ld;
    }

    public void setAC(boolean b)
    {
        ac=b;
    }

    public void setNonAC(boolean b)
    {
        nonAC=b;
    }
}
