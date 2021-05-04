package homework3.Concrete;

import homework3.Abstract.CampaignService;
import homework3.Entity.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Product : " + campaign.getProduct().getName() + " , Campaign Code : " + campaign.getCampaignCode() + " created.");		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Product : " + campaign.getProduct().getName() + " , Campaign Code : " + campaign.getCampaignCode() + " updated.");		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Product : " + campaign.getProduct().getName() + " , Campaign Code : " + campaign.getCampaignCode() + " deleted.");				
	}

}
