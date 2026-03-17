class Persona {
    private String name;
    private int age;
    private double estatura;
    private String nacionalidad;

    public Persona(String name, int age, double estatura, String nacionalidad) {
        this.name = name;
        this.age = age;
        this.estatura = estatura;
        this.nacionalidad = nacionalidad;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getEstatura() {
        return estatura;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }


    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }


    public void mayorEdad() {
        if (age >= 18) {
            System.out.println(name + " es mayor de edad.");
        } else {
            System.out.println(name + " es menor de edad.");
        }
    }



    public void mostrarDatos() {
        System.out.println("Nombre: " + name);
        System.out.println("Edad: " + age);
        System.out.println("Estatura: " + estatura);
        System.out.println("Nacionalidad: " + nacionalidad);
    } 


}