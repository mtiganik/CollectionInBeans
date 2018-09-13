package com.collectionExample;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class JavaCollection {
    List addressList;
    Set addressSet;
    Map addressMap;
    Properties addresProp;

    public void setAddressList(List addressList){
        this.addressList = addressList;
    }

    // prints and returns all the elements of the list
    public List getAddressList(){
        System.out.println("List Elements : " + addressList);
        return addressList;
    }

    public void setAddressSet(Set addressSet){
        this.addressSet = addressSet;
    }
    public Set getAddressSet(){
        System.out.println("Set elements: " + addressSet);
        return addressSet;
    }

    public void setAddressMap(Map addressMap){
        this.addressMap = addressMap;
    }

    public Map getAddressMap(){
        System.out.println("Map Elements : " + addressMap);
        return addressMap;
    }

    public void setAddressProp(Properties prop){
        this.addresProp = prop;
    }

    public Properties getAddresProp(){
        System.out.println("Property elements: " + addresProp);
        return addresProp;
    }
}
