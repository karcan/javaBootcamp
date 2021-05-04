package homework3;

import java.util.Date;
import java.util.GregorianCalendar;

import homework3.Abstract.CampaignService;
import homework3.Abstract.CategoryService;
import homework3.Abstract.OrderService;
import homework3.Abstract.ProductService;
import homework3.Abstract.UserService;
import homework3.Adapter.MernisServiceAdapter;
import homework3.Concrete.CampaignManager;
import homework3.Concrete.CategoryManager;
import homework3.Concrete.GameManager;
import homework3.Concrete.OrderManager;
import homework3.Concrete.PlayerCheckManager;
import homework3.Concrete.PlayerManager;
import homework3.Entity.Campaign;
import homework3.Entity.Category;
import homework3.Entity.Game;
import homework3.Entity.Order;
import homework3.Entity.Player;
import homework3.Entity.Product;
import homework3.Entity.User;

public class Main {

	public static void main(String[] args) {
		// Categories
		CategoryService categoryService = new CategoryManager();
		Category games = new Category(1, "Games", 0);
		Category category1 = new Category(2, "FPS", 1);
		Category category2 = new Category(3, "MMORPG", 1);
		categoryService.addBulk(new Category[] {games, category1, category2});
		System.out.println("");
		
		// Games
		ProductService productService = new GameManager();
		Product game1 = new Game(1, "Counter-Strike: Global Offensive", "Counter-Strike: Global Offensive (CS: GO) expands upon the team-based action gameplay that it pioneered when it was launched 19 years ago.", 35, 2, 1);
		Product game2 = new Game(2, "Knight Online", "Knight Online is a leading party based medieval MMORPG that is, and will alyways be, Free to Play! Register now and enjoy Knight Online.", 0, 3, 2);
		productService.addBulk(new Product[] {game1, game2});	
		System.out.println("");
		
		// Players + IdentityNumberValidation
		UserService userService1 = new PlayerManager(new PlayerCheckManager(new MernisServiceAdapter()));
		User player1 = new Player(1, "1000", "Karcan", "Özbal", "100000000", new GregorianCalendar(1993,11,16).getTime());
		User player2 = new Player(2, "1001", "Ömer", "Acar", "10000000", new GregorianCalendar(1995,1,1).getTime());
		userService1.addBulk(new User[] {player1, player2});
		System.out.println("");
		
		// Campaign
		CampaignService campaignService = new CampaignManager();
		Campaign campaign1 = new Campaign(1, "CSGOX05", game1, "summer campaign", "", 50, new GregorianCalendar(2021,4,1).getTime(), new GregorianCalendar(2021,5,1).getTime()) ;
		campaignService.add(campaign1);

		// Order
		OrderService orderService = new OrderManager();
		Order order1 = new Order(1, new Date(), (Player)player1 , game1, campaign1);
		orderService.add(order1);
	}

}
