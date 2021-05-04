### Main.java
```Java
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
		System.out.println("");

		// Order
		OrderService orderService = new OrderManager();
		Order order1 = new Order(1, new Date(), (Player)player1 , game1, campaign1);
		orderService.add(order1);
		System.out.println("");
	}
```
### Order Result
|orderId|productName|sellingPrice|playerName|campaignCode|discountedPrice|
|---|---|---|---|---|---|
|1|Counter-Strike: Global Offensive|35.0|Karcan Özbal|CSGOX05|17.5

### Console Result
```Console
Games : eklenmiştir.
FPS : eklenmiştir.
MMORPG : eklenmiştir.

Counter-Strike: Global Offensive : eklenmiştir.
Knight Online : eklenmiştir.

KARCAN ÖZBAL : Kimlik doğrulama başarısız.
ÖMER ACAR : Kimlik doğrulama başarısız.

Product : Counter-Strike: Global Offensive , Campaign Code : CSGOX05 created.

Campaign implemented : CSGOX05
Discounted Price : 17.5
|orderId|productName|sellingPrice|playerName|campaignCode|discountedPrice|
|---|---|---|---|---|---|
|1|Counter-Strike: Global Offensive|35.0|Karcan Özbal|CSGOX05|17.5
```
