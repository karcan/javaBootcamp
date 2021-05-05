package homework3.Concrete;

import java.util.ArrayList;

import homework3.Abstract.CampaignService;
import homework3.Entity.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Product : " + campaign.getProduct().getName() + " , Campaign Code : " + campaign.getCampaignCode() + " created.");		
	}

	@Override
	public void addBulk(Campaign[] entity) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void update(Campaign campaign) {
		System.out.println("Product : " + campaign.getProduct().getName() + " , Campaign Code : " + campaign.getCampaignCode() + " updated.");		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Product : " + campaign.getProduct().getName() + " , Campaign Code : " + campaign.getCampaignCode() + " deleted.");				
	}

	@Override
	public ArrayList<Campaign> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
