package Model;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

public class Listitem {

    private String name;
    private String description;
    private String present;
    private String future;
    private String passé;




    public Listitem(String name, String description,String present,String future,String passé) {
        this.name=name;
        this.description=description;
        this.present=present;
        this.future=future;
        this.passé=passé;

    }





    public String getPassé() {
        return passé;
    }

    public void setPassé(String passé) {
        this.passé = passé;
    }

    public String getFuture() {
        return future;
    }

    public void setFuture(String future) {
        this.future = future;
    }

    public String getPresent() {
        return present;
    }

    public void setPresent(String present) {
        this.present = present;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
