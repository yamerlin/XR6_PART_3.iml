/**test
 *
 * @param nom
 */


class ville{
    public static class ville{
        public static String nom;
        public int nb_habitant = 0; //Mettre 0 par defaut

        /**test
         *
         * @param nom
         */
        //Constructeur a un argument :
        public Ville(String nom){
            this.nom = nom;
        }

        //Constructeur a deux arguments :
        public Ville(String nom, int nb_habitant){
            this.nom = nom;
            this.nb_habitant = nb_habitant;
        }

        //Constructeur par recopie :
        public Ville(Ville ville){
            nb_habitant = ville.nb_habitant;
        }

        public void afficher(){
            System.out.println("Nom de la ville : " + nom);
            System.out.println("Nombre d'habitant : " + nb_habitant);
        }

        public void setNbHabitants(int x){
            if(x >= 0){
                nb_habitant = x;
            }
            else{
                System.out.println("Le nombre d'habitant doit etre positif");
            }
        }
    }

    public static void main(String[] args){
        System.out.println("Hello world ");

        ville Test = new ville("Paris");
        Test.afficher();
        Test.setNbHabitants(-6);

        ville Oui = new ville("Oui");
        Oui.setNbHabitants(69);

        ville Non = new ville(Oui);
        Non.afficher();
/**
        Ville v1 = new Ville("Paris");
        v1.afficher();
        v1.setNbHabitants(2000000);
        v1.afficher();
        Ville v2 = new Ville("Dijon",150000);
        v2.afficher();
        v2.setNbHabitants(-200000);
        v2.afficher();
 */
    }
}