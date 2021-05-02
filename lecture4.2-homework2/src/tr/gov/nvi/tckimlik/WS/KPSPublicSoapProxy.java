package tr.gov.nvi.tckimlik.WS;

public class KPSPublicSoapProxy implements tr.gov.nvi.tckimlik.WS.KPSPublicSoap {
  private String _endpoint = null;
  private tr.gov.nvi.tckimlik.WS.KPSPublicSoap kPSPublicSoap = null;
  
  public KPSPublicSoapProxy() {
    _initKPSPublicSoapProxy();
  }
  
  public KPSPublicSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initKPSPublicSoapProxy();
  }
  
  private void _initKPSPublicSoapProxy() {
    try {
      kPSPublicSoap = (new tr.gov.nvi.tckimlik.WS.KPSPublicLocator()).getKPSPublicSoap();
      if (kPSPublicSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)kPSPublicSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)kPSPublicSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (kPSPublicSoap != null)
      ((javax.xml.rpc.Stub)kPSPublicSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public tr.gov.nvi.tckimlik.WS.KPSPublicSoap getKPSPublicSoap() {
    if (kPSPublicSoap == null)
      _initKPSPublicSoapProxy();
    return kPSPublicSoap;
  }
  
  public boolean TCKimlikNoDogrula(long TCKimlikNo, java.lang.String ad, java.lang.String soyad, int dogumYili) throws java.rmi.RemoteException{
    if (kPSPublicSoap == null)
      _initKPSPublicSoapProxy();
    return kPSPublicSoap.TCKimlikNoDogrula(TCKimlikNo, ad, soyad, dogumYili);
  }
  
  
}