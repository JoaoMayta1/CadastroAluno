package com.etec.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DayTime 
{
    private String data;
    private String hora;
    
    public DayTime()
    {
        Date dataHoraAtual = new Date();
        this.setData(new SimpleDateFormat("dd/MM/yyyyy").format(dataHoraAtual));
        this.setHora(new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual));
    }
    public String getData()
    {
        return data;
    }
    public void setData(String data)
    {
        this.data = data;
    }
    public String getHora(){
        return hora;
    }
    public void setHora(String hora)
    {
        this.hora = hora;
    }
}
