package homework.Adapters;

import java.rmi.RemoteException;
import java.time.ZoneId;
import java.util.Date;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter{

	public boolean CheckIfRealPerson(Long identityNumber, String firstName, String lastName, int birthYear) {
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		boolean result = true;
		
		try {
			result = kpsPublicSoapProxy.TCKimlikNoDogrula(
					identityNumber,
					firstName,
					lastName, 
					birthYear
					//user.getBirthDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear()
					);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		if(result) {
			return true;
		}else {
			return false;
		}
			
	}
	
	/*
	 * For a `String` identityNumber
	 * */
	public boolean CheckIfRealPerson(String identityNumber, String firstName, String lastName, Date birthDate) {
		return this.CheckIfRealPerson(
				Long.parseLong(identityNumber), 
				firstName, 
				lastName, 
				birthDate
				);
	}	
	/*
	 * For a `Date` birthDate
	 * */
	public boolean CheckIfRealPerson(Long identityNumber, String firstName, String lastName, Date birthDate) {
		return this.CheckIfRealPerson(
				identityNumber, 
				firstName, 
				lastName, 
				birthDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear()
				);
	}


}
