package com.pakbachelors.countrylist;

import com.pakbachelors.countrylist.model.Country;

import java.util.ArrayList;
import java.util.List;

public class SingletonList {
    private static SingletonList mInstence;

    private List<Country> countryList;

    private SingletonList() {
        countryList = new ArrayList<>();
        countryList.add(new Country("ad", "376", "Andorra", R.drawable.ic_andorra, true));
        countryList.add(new Country("ae", "971", "United Arab Emirates (UAE)", R.drawable.ic_united_arab_emirates, false));
        countryList.add(new Country("af", "93", "Afghanistan", R.drawable.ic_afghanistan, false));
        countryList.add(new Country("ag", "1", "Antigua and Barbuda", R.drawable.ic_antigua_and_barbuda, false));
        countryList.add(new Country("ai", "1", "Anguilla", R.drawable.ic_anguilla, false));
        countryList.add(new Country("al", "355", "Albania", R.drawable.ic_albania, false));
        countryList.add(new Country("am", "374", "Armenia", R.drawable.ic_armenia, false));
        countryList.add(new Country("ao", "244", "Angola", R.drawable.ic_angola, false));
        countryList.add(new Country("aq", "672", "Antarctica", R.drawable.ic_antarctica, false));
        countryList.add(new Country("ar", "54", "Argentina", R.drawable.ic_argentina, false));
        countryList.add(new Country("as", "1", "American Samoa", R.drawable.ic_american_samoa, false));
        countryList.add(new Country("at", "43", "Austria", R.drawable.ic_austria, false));
        countryList.add(new Country("au", "61", "Australia", R.drawable.ic_australia, false));
        countryList.add(new Country("aw", "297", "Aruba", R.drawable.ic_aruba, false));
        countryList.add(new Country("ax", "358", "Åland Islands", R.drawable.ic_aland_islands, false));
        countryList.add(new Country("az", "994", "Azerbaijan", R.drawable.ic_azerbaijan, false));
        countryList.add(new Country("ba", "387", "Bosnia And Herzegovina", R.drawable.ic_bosnia_herzegovina, true));
        countryList.add(new Country("bb", "1", "Barbados", R.drawable.ic_barbados, false));
        countryList.add(new Country("bd", "880", "Bangladesh", R.drawable.ic_bangladesh, false));
        countryList.add(new Country("be", "32", "Belgium", R.drawable.ic_belgium, false));
        countryList.add(new Country("bf", "226", "Burkina Faso", R.drawable.ic_burkina_faso, false));
        countryList.add(new Country("bg", "359", "Bulgaria", R.drawable.ic_bulgaria, false));
        countryList.add(new Country("bh", "973", "Bahrain", R.drawable.ic_bahrain, false));
        countryList.add(new Country("bi", "257", "Burundi", R.drawable.ic_burundi, false));
        countryList.add(new Country("bj", "229", "Benin", R.drawable.ic_benin, false));
        countryList.add(new Country("bl", "590", "Saint Barthélemy", R.drawable.ic_saint_kitts, false));
        countryList.add(new Country("bm", "1", "Bermuda", R.drawable.ic_bermuda, false));
        countryList.add(new Country("bn", "673", "Brunei Darussalam", R.drawable.ic_brunei, false));
        countryList.add(new Country("bo", "591", "Bolivia, Plurinational State Of", R.drawable.ic_bolivia, false));
        countryList.add(new Country("br", "55", "Brazil", R.drawable.ic_brazil, false));
        countryList.add(new Country("bs", "1", "Bahamas", R.drawable.ic_bahamas, false));
        countryList.add(new Country("bt", "975", "Bhutan", R.drawable.ic_bhutan, false));
        countryList.add(new Country("bw", "267", "Botswana", R.drawable.ic_botswana, false));
        countryList.add(new Country("by", "375", "Belarus", R.drawable.ic_bosnia_herzegovina, false));
        countryList.add(new Country("bz", "501", "Belize", R.drawable.ic_belize, false));


    }

    public static SingletonList getmInstence() {
        if (mInstence == null)
            mInstence = new SingletonList();
        return mInstence;
    }

    public List<Country> getAll() {
        return countryList;
    }

    public void setSelectedFiles(List<Country> selectedFiles) {
        this.countryList = selectedFiles;
    }

    public void addSelectedFile(Country selectedFiles) {
        this.countryList.add(selectedFiles);
    }

    public void removeSelectedFile(Country selectedFiles) {
        this.countryList.remove(selectedFiles);
    }
}
