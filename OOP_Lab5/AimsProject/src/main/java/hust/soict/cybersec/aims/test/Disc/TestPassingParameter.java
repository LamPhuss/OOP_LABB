package hust.soict.cybersec.aims.test.Disc;

import hust.soict.cybersec.aims.Media.DigitalVideoDisc;

class DVDWrapper {
	DigitalVideoDisc dvd;

	DVDWrapper(DigitalVideoDisc dvd) {
		this.dvd = dvd;
	}
}

public class TestPassingParameter {

	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitle);
	}

	// New swap method for not having setters
	public static void swap(Object o1, Object o2){
		Object tmp = o1;
		o1 = o2;
		o2 = tmp;
	}

	public static void main(String[] args) {

		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

		DVDWrapper jungleDvdWrapper = new DVDWrapper(jungleDVD);
		DVDWrapper cinderellaDvdWrapper = new DVDWrapper(cinderellaDVD);

		swap(jungleDvdWrapper, cinderellaDvdWrapper);

		System.out.println("jungle dvd title: " + jungleDvdWrapper.dvd.getTitle());
		System.out.println("cinderella dvd title: " + cinderellaDvdWrapper.dvd.getTitle());

		changeTitle(jungleDVD, cinderellaDVD.getTitle());
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());

	}

}