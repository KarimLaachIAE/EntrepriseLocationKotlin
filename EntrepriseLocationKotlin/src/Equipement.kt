open class Equipement{
    var code: String? = null
    var type: String? = null
    var marque: String? = null
    var anneeAchat: Int? = null
    var listeEquipementLouer = ArrayList<Location>()
    var equipementLouer: Location? = null

    fun equipLoc(l: Location){
        this.equipementLouer = l
        listeEquipementLouer.add(l)
    }

    fun estLouer() = if(this.equipementLouer != null) true else false

}