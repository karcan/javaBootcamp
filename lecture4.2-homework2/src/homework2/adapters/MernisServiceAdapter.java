package homework2.adapters;

import java.rmi.RemoteException;
import java.time.ZoneId;

import homework2.abstracts.CustomerCheckManager;
import homework2.entities.Customer;
import homework2.interfaces.RealPersonService;
import homework2.interfaces.Result;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements RealPersonService{

	public Result CheckIfRealPerson(Customer customer) {
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		boolean result = true;
		
		try {
			result = kpsPublicSoapProxy.TCKimlikNoDogrula(
					Long.parseLong(customer.getIdentityNumber()),
					customer.getFirstName().toUpperCase(),
					customer.getLastName().toUpperCase(), 
					customer.getBirthDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear()
					);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(result) {
			return new homework2.utils.Result(true);
		}else {
			return new homework2.utils.Result(false, "kimlik doğrulama başarısız.");
		}
			
	}


}
