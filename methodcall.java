class methodcalling{

	int id;
}

class baba{
	public static void main(String[] args)
	{
		void updateId(methodcalling m)
			{
				m.id=1001;
			}
	
		int id;
		methodcalling me = new methodcalling();
		me.id=1000;
		
		updateId(me);

	}


}


