import kotlin.math.ln1p

fun main(args: Array<String>){
    val e = Entreprise()

    val a = PaireSki()
    a.code = "PS1"
    a.type = "Paire de ski"
    a.marque = "Rossignol"
    a.taille = 170
    a.anneeAchat = 2007

    val b = PaireSki()
    b.code = "PS2"
    b.type = "Paire de ski"
    b.marque = "Salomon"
    b.taille = 190
    b.anneeAchat = 2009

    val c = Chaussure()
    c.code = "CH1"
    c.type = "Chaussure"
    c.marque = "Atomic"
    c.pointure = 42
    c.anneeAchat = 2015

    val d = Chaussure()
    d.code = "CH2"
    d.type = "Chaussure"
    d.marque = "Elan"
    d.pointure = 40
    d.anneeAchat = 2016

    val j = Chaussure()
    j.code = "CH3"
    j.type = "Chaussure"
    j.marque = "Dynastar"
    j.pointure = 41
    j.anneeAchat = 2012

    e.ajouterEquipement(a)
    e.ajouterEquipement(b)
    e.ajouterEquipement(c)
    e.ajouterEquipement(d)
    e.ajouterEquipement(j)

    val l = Location("10-11-2018" , 5, "Jean")
    val l2 = Location ("28-11-2019", 7, "Pierre")
    val l3 = Location ("01-12-2019", 15, "Eric")

    a.equipLoc(l)
    c.equipLoc(l3)

    e.afficherInfosEquipement()


}