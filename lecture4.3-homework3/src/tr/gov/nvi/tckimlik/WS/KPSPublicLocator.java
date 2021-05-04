/**
 * KPSPublicLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.gov.nvi.tckimlik.WS;

public class KPSPublicLocator extends org.apache.axis.client.Service implements tr.gov.nvi.tckimlik.WS.KPSPublic {

    public KPSPublicLocator() {
    }


    public KPSPublicLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public KPSPublicLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for KPSPublicSoap
    private java.lang.String KPSPublicSoap_address = "https://tckimlik.nvi.gov.tr/Service/KPSPublic.asmx";

    public java.lang.String getKPSPublicSoapAddress() {
        return KPSPublicSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String KPSPublicSoapWSDDServiceName = "KPSPublicSoap";

    public java.lang.String getKPSPublicSoapWSDDServiceName() {
        return KPSPublicSoapWSDDServiceName;
    }

    public void setKPSPublicSoapWSDDServiceName(java.lang.String name) {
        KPSPublicSoapWSDDServiceName = name;
    }

    public tr.gov.nvi.tckimlik.WS.KPSPublicSoap getKPSPublicSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(KPSPublicSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getKPSPublicSoap(endpoint);
    }

    public tr.gov.nvi.tckimlik.WS.KPSPublicSoap getKPSPublicSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            tr.gov.nvi.tckimlik.WS.KPSPublicSoapStub _stub = new tr.gov.nvi.tckimlik.WS.KPSPublicSoapStub(portAddress, this);
            _stub.setPortName(getKPSPublicSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setKPSPublicSoapEndpointAddress(java.lang.String address) {
        KPSPublicSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (tr.gov.nvi.tckimlik.WS.KPSPublicSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                tr.gov.nvi.tckimlik.WS.KPSPublicSoapStub _stub = new tr.gov.nvi.tckimlik.WS.KPSPublicSoapStub(new java.net.URL(KPSPublicSoap_address), this);
                _stub.setPortName(getKPSPublicSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("KPSPublicSoap".equals(inputPortName)) {
            return getKPSPublicSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tckimlik.nvi.gov.tr/WS", "KPSPublic");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tckimlik.nvi.gov.tr/WS", "KPSPublicSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("KPSPublicSoap".equals(portName)) {
            setKPSPublicSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
