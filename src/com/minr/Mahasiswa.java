package com.minr;

public class Mahasiswa {
    private final double quiz;
    private final double uts;
    private final double uas;

    public Mahasiswa(double quiz, double uts, double uas) {
        this.quiz = quiz;
        this.uts = uts;
        this.uas = uas;
    }

    public double getQUIZ() {
        return quiz;
    }

    public double getUAS() {
        return uas;
    }

    public double getUTS() {
        return uts;
    }

    public double getNilaiAkhir() {
        return 0.2 * quiz + 0.3 * uts + 0.5 * uas;
    }

    public char getIndex(double NA) {
        char index = 0;
        if (NA >= 80 && NA <= 100) {
            index = 'A';
        } else if (NA >= 68 && NA < 80) {
            index = 'B';
        } else if (NA >= 56 && NA < 68) {
            index = 'C';
        } else if (NA >= 45 && NA < 56) {
            index = 'D';
        } else if (NA >= 0 && NA < 45) {
            index = 'E';
        }
        return index;
    }

    public String getKeterangan(char index) {
        String keterangan;
        switch (index) {
            case 'A':
                keterangan = "Sangat Baik";
                break;
            case 'B':
                keterangan = "Baik";
                break;
            case 'C':
                keterangan = "Cukup";
                break;
            case 'D':
                keterangan = "Kurang";
                break;
            case 'E':
                keterangan = "Sangat Kurang";
                break;
            default:
                keterangan = "-";
        }

        return keterangan;
    }
}
