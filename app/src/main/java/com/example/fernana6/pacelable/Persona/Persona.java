package com.example.fernana6.pacelable.Persona;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by FernanA6 on 19-Apr-18.
 */

public class Persona implements Parcelable{
    String nombre, apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    protected Persona (Parcel in){
        nombre = in.readString();
        apellido = in.readString();
    }

    public static final Creator<Persona> CREATOR = new Creator<Persona>() {
        @Override
        public Persona createFromParcel(Parcel in) {
            return new Persona(in);
        }

        @Override
        public Persona[] newArray(int i) {
            return new Persona[i];
        }
    };

    public Persona() {
        super();
    }

    public String getNombre() {
            return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nombre);
        parcel.writeString(apellido);
    }


}

