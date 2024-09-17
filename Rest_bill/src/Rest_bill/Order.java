package Rest_bill;
public class Order {

	private int price;
	private int TawaRoti = 20;
	private int TawaParatha = 30;
	private int TandooriRoti = 20;
	private int PlainNan = 60;
	private int ButterNan = 80;
	private int AlooParatha = 100;
	
	private int JeeraDal = 120;
	private int DalFry = 140;
	private int DalKolhapuri = 170;
	private int SteamRice = 100;
	private int JeeraRice = 120;
	
	private int PistaShake = 120;
	private int VanillaShake = 120;
	private int MangoShake = 120;
	private int ChocolateShake = 120;
	
	
	private int MixVeg = 250;
	private int VegTadka = 250;
	private int VegKofta = 280;
	private int JeeraAloo = 210;
	private int SevBhaji = 210;
	private int PannerTikkaMasala = 280;
	private int PannerChatpata = 280;
	private int PannerKadhai = 280;
	private int PalakPanneer = 270;
	private int ShahiPanner = 280;

	
	public void TawaRoti(int x) {
		int TotalTawaRoti = TawaRoti*x;
		this.price += TotalTawaRoti;
		System.out.println("Tawa Roti : "+"20*"+x+" = "+TotalTawaRoti);

	}
	public void TawaParatha(int x) {
		int TotalTawaParatha = TawaParatha*x;
		this.price += TotalTawaParatha;
		System.out.println("Tawa Paratha : "+"30*"+x+" = "+TotalTawaParatha);

	}
	public void TandooriRoti(int x) {
		int TotalTandooriRoti = TandooriRoti*x;
		this.price += TotalTandooriRoti;
		System.out.println("Tandoori Roti : "+"20*"+x+" = "+TotalTandooriRoti);

	}
	public void PlainNan(int x) {
		int TotalPlainNan = PlainNan*x;
		this.price += TotalPlainNan;
		System.out.println("Plain Nan : "+"60*"+x+" = "+TotalPlainNan);

	}
	public void ButterNan(int x) {
		int TotalButterNan = ButterNan*x;
		this.price += TotalButterNan;
		System.out.println("Butter Nan : "+"80*"+x+" = "+TotalButterNan);

	}
	
	public void AlooParatha(int x) {
		int TotalAlooParatha = AlooParatha*x;
		this.price += TotalAlooParatha;
		System.out.println("Aloo Paratha : "+"100*"+x+" = "+TotalAlooParatha);

	}
	
//-------------------------------	
	
	public void JeeraDal(int x) {
		int TotalJeeraDal = JeeraDal*x;
		this.price += TotalJeeraDal;
		System.out.println("Jeera Dal : "+"120*"+x+" = "+TotalJeeraDal);

	}
	public void DalFry(int x) {
		int TotalDalFry = DalFry*x;
		this.price += TotalDalFry;
		System.out.println("Dal Fry : "+"140*"+x+" = "+TotalDalFry);

	}
	public void DalKolhapuri(int x) {
		int TotalDalKolhapuri = DalKolhapuri*x;
		this.price += TotalDalKolhapuri;
		System.out.println("Dal Kolhapuri : "+"170*"+x+" = "+TotalDalKolhapuri);

	}
	public void SteamRice(int x) {
		int TotalSteamRice = SteamRice*x;
		this.price += TotalSteamRice;
		System.out.println("Steam Rice : "+"100*"+x+" = "+TotalSteamRice);

	}
	public void JeeraRice(int x) {
		int TotalJeeraRice = JeeraRice*x;
		this.price += TotalJeeraRice;
		System.out.println("Jeera Rice : "+"120*"+x+" = "+TotalJeeraRice);

	}
	
	
//-------------------------------------	
	
	public void PistaShake(int x) {
		int TotalPistaShake = PistaShake*x;
		this.price += TotalPistaShake;
		System.out.println("Pista Shake : "+"120*"+x+" = "+TotalPistaShake);

	}
	
	public void VanillaShake(int x) {
		int TotalVanillaShake = VanillaShake*x;
		this.price += TotalVanillaShake;
		System.out.println("Vanilla Shake : "+"120*"+x+" = "+TotalVanillaShake);

	}
	public void MangoShake(int x) {
		int TotalMangoShake = MangoShake*x;
		this.price += TotalMangoShake;
		System.out.println("Mango Shake : "+"120*"+x+" = "+TotalMangoShake);

	}
	public void ChocolateShake(int x) {
		int TotalChocolateShake = ChocolateShake*x;
		this.price += TotalChocolateShake;
		System.out.println("Chocolate Shake : "+"120*"+x+" = "+TotalChocolateShake);

	}
	
//----------------------------------------
	
	public void MixVeg(int x) {
		int TotalMixVeg = MixVeg*x;
		this.price += TotalMixVeg;
		System.out.println("Mix Veg : "+"250*"+x+" = "+TotalMixVeg);

	}
	public void VegTadka(int x) {
		int TotalVegTadka = VegTadka*x;
		this.price += TotalVegTadka;
		System.out.println("Veg Tadka : "+"250*"+x+" = "+TotalVegTadka);

	}
	public void VegKofta(int x) {
		int TotalVegKofta = VegKofta*x;
		this.price += TotalVegKofta;
		System.out.println("Veg Kofta : "+"280*"+x+" = "+TotalVegKofta);

	}
	public void JeeraAloo(int x) {
		int TotalJeeraAloo = JeeraAloo*x;
		this.price += TotalJeeraAloo;
		System.out.println("Jeera Aloo : "+"210*"+x+" = "+TotalJeeraAloo);

	}
	public void SevBhaji(int x) {
		int TotalSevBhaji = SevBhaji*x;
		this.price += TotalSevBhaji;
		System.out.println("Sev Bhaji : "+"210*"+x+" = "+TotalSevBhaji);

	}
	public void PannerTikkaMasala(int x) {
		int TotalPannerTikkaMasala = PannerTikkaMasala*x;
		this.price += TotalPannerTikkaMasala;
		System.out.println("Panner Tikka Masala : "+"280*"+x+" = "+TotalPannerTikkaMasala);

	}
	public void PannerChatpata(int x) {
		int TotalPannerChatpata = PannerChatpata*x;
		this.price += TotalPannerChatpata;
		System.out.println("Panner Chatpata : "+"280*"+x+" = "+TotalPannerChatpata);

	}
	public void PannerKadhai(int x) {
		int TotalPannerKadhai = PannerKadhai*x;
		this.price += TotalPannerKadhai;
		System.out.println("Panner Kadhai : "+"280*"+x+" = "+TotalPannerKadhai);

	}
	public void PalakPanneer(int x) {
		int TotalPalakPanneer = PalakPanneer*x;
		this.price += TotalPalakPanneer;
		System.out.println("Palak Panneer : "+"270*"+x+" = "+TotalPalakPanneer);

	}
	public void ShahiPanner(int x) {
		int TotalShahiPanner = ShahiPanner*x;
		this.price += TotalShahiPanner;
		System.out.println("Shahi Panner : "+"280*"+x+" = "+TotalShahiPanner);

	}
	
	
	public void getBill() {
		System.out.println("-------------------------");
		System.out.println("Total Bill : "+price);
		System.out.println("-------------------------");
	}
	
}
