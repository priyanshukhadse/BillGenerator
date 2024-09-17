package Rest_bill;
public class Bill {
	/*
	 TawaRoti = 20; TawaParatha = 30; TandooriRoti = 20; PlainNan = 60; ButterNan = 80; 
	 AlooParatha = 100;
	
	 JeeraDal = 120; DalFry = 140; DalKolhapuri = 170; SteamRice = 100; JeeraRice = 140;
	
	 PistaShake = 120; VanillaShake = 120; MangoShake = 120; ChocolateShake = 120;
	 
	
	 MixVeg = 250; VegTadka = 250; VegKofta = 280; JeeraAloo = 210; SevBhaji = 210;
	 PannerTikkaMasala = 280; PannerChatpata = 280; PannerKadhai = 280; PalakPanneer = 270;
	 ShahiPanner = 280;
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("     !!!  Bill  !!! ");
		System.out.println("-------------------------");
		Order order1 = new Order();
		order1.TawaRoti(6);
		order1.MixVeg(1);
		order1.DalFry(1);
		order1.JeeraRice(1);
		order1.getBill();
		System.out.println("!!!  Visit Again  !!! ");
		
	}

}
