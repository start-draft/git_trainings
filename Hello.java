class Hello {
    private String greeting;
    private String name;

    public Hello(String greeting, String name) {
        this.greeting = greeting;
        this.name = name;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        for(int i = 0; i < args.length; i++) {
            System.out.println("Hello Java " + i + "! = " + args[i]);
        }
    }
}