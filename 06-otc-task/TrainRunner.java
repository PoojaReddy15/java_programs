class TrainRunner{
	public static void main(String...values){
	
	Train train = new Train();
		train.coach = "S1"; //reference
		train.numberOfBogie =20; //reference
		System.out.println(train.name);
		System.out.println(train.trainNumber);
		System.out.println(train.color);
		System.out.println(train.coach);
		System.out.println(train.numberOfBogie);
   
	}
}