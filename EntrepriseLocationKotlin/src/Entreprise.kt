class Entreprise{

    var listeEquipement = ArrayList<Equipement>()

    fun ajouterEquipement(e: Equipement){
        listeEquipement.add(e)
    }

    fun afficherInfosEquipement(){
        for(i in listeEquipement.indices){
            if(listeEquipement[i].estLouer() == true){
                println("-----------------------------------------------------------")
                println("L'équipement " + listeEquipement[i].type + " " + listeEquipement[i].marque + " a été loué " + listeEquipement[i].listeEquipementLouer?.size + " fois.")
                for(j in listeEquipement[i].listeEquipementLouer.indices){
                    println("\t - " + listeEquipement[i].listeEquipementLouer[j].dateDebutLocation + " par " + listeEquipement[i].listeEquipementLouer[j].nomClient)
                }
            }else{
                println("-----------------------------------------------------------")
                println("L'équipement " + listeEquipement[i].type + " " + listeEquipement[i].marque + " n'a jamais été loué.")
            }
        }
    }
}

