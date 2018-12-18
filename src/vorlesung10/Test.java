package vorlesung10;

class Test {

	public static void main(String[] args) {
		System.out.println( "start" );
		StringBuilder strb = new StringBuilder();
		String str = "";
		int laufzeit = 1000000;
		
		
		long endzeit;
		long zeit = System.currentTimeMillis();
		
		

//		for (int ii = 1; ii < laufzeit ; ii++) {
//			str += "ab";
//		}
////		System.out.println(" str : " + str );
//		endzeit = (System.currentTimeMillis() - zeit);
//		System.out.println(endzeit);
		
		
		zeit = System.currentTimeMillis();
		for( int ii=1 ; ii < laufzeit ; ii++){
			strb.append( "ab" );
			}
//		System.out.println(" strb: " + strb);
		endzeit = (System.currentTimeMillis() - zeit);
		System.out.println(endzeit);
		
		
		

	}

}
