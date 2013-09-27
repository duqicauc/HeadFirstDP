package factory.ingredient;


public abstract class Pizza {
	protected String name;				// 名字
	protected Dough dough;				// 面粉
	protected Sauce sauce;				// 酱汁
	protected Veggies veggies[];		// 蔬菜
	protected Cheese cheese;			// 奶酪
	protected Pepperoni pepperoni;		// 意大利辣香肠
	protected Clams clams;				// 蛤蜊
	
	protected abstract void prepare();
	
	public void bake(){
		System.out.println("Bake for 25minutes at 350");
	}
	
	public void cut(){
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	public void box(){
		System.out.println("Place the pizza in the offical PizzaStore box");
	}
	
	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("---- " + name + " ----\n");
		display.append(dough + "\n");
		display.append(sauce + "\n");
		display.append(pepperoni + "\n");
		display.append(clams + "\n");
		return display.toString();
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the dough
	 */
	public Dough getDough() {
		return dough;
	}

	/**
	 * @param dough the dough to set
	 */
	public void setDough(Dough dough) {
		this.dough = dough;
	}

	/**
	 * @return the sauce
	 */
	public Sauce getSauce() {
		return sauce;
	}

	/**
	 * @param sauce the sauce to set
	 */
	public void setSauce(Sauce sauce) {
		this.sauce = sauce;
	}

	/**
	 * @return the veggies
	 */
	public Veggies[] getVeggies() {
		return veggies;
	}

	/**
	 * @param veggies the veggies to set
	 */
	public void setVeggies(Veggies[] veggies) {
		this.veggies = veggies;
	}

	/**
	 * @return the cheese
	 */
	public Cheese getCheese() {
		return cheese;
	}

	/**
	 * @param cheese the cheese to set
	 */
	public void setCheese(Cheese cheese) {
		this.cheese = cheese;
	}

	/**
	 * @return the pepperoni
	 */
	public Pepperoni getPepperoni() {
		return pepperoni;
	}

	/**
	 * @param pepperoni the pepperoni to set
	 */
	public void setPepperoni(Pepperoni pepperoni) {
		this.pepperoni = pepperoni;
	}

	/**
	 * @return the clams
	 */
	public Clams getClams() {
		return clams;
	}

	/**
	 * @param clams the clams to set
	 */
	public void setClams(Clams clams) {
		this.clams = clams;
	}
	
	
	
	
}
