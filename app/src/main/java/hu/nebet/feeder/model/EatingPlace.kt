package hu.nebet.feeder.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class EatingPlace(
    val placeId: String,
    val image: String?,
    val fullName: String,
    val coord: Coord,
    val address: Address,
    val categories: String,
    val uploadedBy: User,
    val uploadingDate: String,
    val modifyingDate: String?,
    val description: String?
)

@JsonClass(generateAdapter = true)
data class Coord(
    val lon: Double,
    val lat: Double
)

@JsonClass(generateAdapter = true)
data class Address(
    val postalCode: String,
    val City: String,
    val address: String
)


val dummyEatingPlaces = listOf(
    EatingPlace("1", null, "Dixie Csirke",Coord(47.588, 18.234444), Address("2800", "Tatabánya", "Vasútállomás"),"gyorsétterem", User("1","hardvera"),"2022.12.31",null,"Lorem ipsum..."),
    EatingPlace("2", null, "Mentes Bolt",Coord(47.63333, 18.294444), Address("2800", "Tatabánya", "Vasútállomás"),"gyorsétterem", User("1","hardvera"),"2022.12.31",null,"Lorem ipsum..."),
    EatingPlace("3", null, "King's Fusion",Coord(47.653, 18.324), Address("2890", "Tata", "Ady E. u."),"étterem", User("1","hardvera"),"2022.12.31", null,"Lorem ipsum..."),
    EatingPlace("4", null, "Édenkert mentes bolt",Coord(47.99333, 18.234444), Address("2800", "Tatabánya", "Béla király körtér"),"bolt, pékség", User("2","pitypang"),"2022.12.31", null,"Lorem ipsum..."),
)