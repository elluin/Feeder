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
    EatingPlace("1", null, "Dixie Csirke",Coord(47.588, 18.234444), Address("2800", "Tatabánya", "Vasútállomás"),"gluténmentes, laktózmentes", User("1","hardvera"),"2022.12.31",null,"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris sodales nulla a purus sodales ultricies. Cras mattis justo nec felis sagittis, quis accumsan nibh lobortis. Donec vel massa risus. Etiam a augue nec nunc iaculis sodales. Suspendisse pellentesque nulla ac odio consectetur, convallis gravida tellus pulvinar. Fusce consectetur congue leo quis dapibus. Aenean porttitor ipsum vitae urna interdum, id porta nulla sagittis. Aenean mattis, purus eget malesuada convallis, mauris ipsum malesuada tellus, eu condimentum lectus libero eget mi. Sed suscipit pharetra quam quis rutrum. Donec vestibulum facilisis ligula, eget semper elit aliquam congue. Vestibulum semper rhoncus commodo. Cras faucibus erat dolor, eget sodales justo placerat vitae. Mauris nulla felis, dignissim et lacus id, gravida luctus felis. Donec a quam urna. Duis lobortis mi et lectus bibendum imperdiet."),
    EatingPlace("2", null, "Mentes Bolt",Coord(47.63333, 18.294444), Address("2800", "Tatabánya", "Vasútállomás"),"gluténmentes, paleo", User("1","hardvera"),"2022.12.31",null,"Lorem ipsum..."),
    EatingPlace("3", null, "King's Fusion",Coord(47.653, 18.324), Address("2890", "Tata", "Ady E. u."),"gluténmentes", User("1","hardvera"),"2022.12.31", null,"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris sodales nulla a purus sodales ultricies. Cras mattis justo nec felis sagittis, quis accumsan nibh lobortis. Donec vel massa risus. Etiam a augue nec nunc iaculis sodales. Suspendisse pellentesque nulla ac odio consectetur, convallis gravida tellus pulvinar. Fusce consectetur congue leo quis dapibus. Aenean porttitor ipsum vitae urna interdum, id porta nulla sagittis. Aenean mattis, purus eget malesuada convallis, mauris ipsum malesuada tellus, eu condimentum lectus libero eget mi. Sed suscipit pharetra quam quis rutrum. Donec vestibulum facilisis ligula, eget semper elit aliquam congue. Vestibulum semper rhoncus commodo. Cras faucibus erat dolor, eget sodales justo placerat vitae."),
    EatingPlace("4", null, "Édenkert mentes bolt",Coord(47.99333, 18.234444), Address("2800", "Tatabánya", "Béla király körtér"),"gluténmentes, laktózmentes, vegán, paleo", User("2","pitypang"),"2022.12.31", null,"Lorem ipsum..."),
    EatingPlace("1", null, "Dixie Csirke",Coord(47.588, 18.234444), Address("2800", "Tatabánya", "Vasútállomás"),"gluténmentes, laktózmentes", User("1","hardvera"),"2022.12.31",null,"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris sodales nulla a purus sodales ultricies. Cras mattis justo nec felis sagittis, quis accumsan nibh lobortis. Donec vel massa risus. Etiam a augue nec nunc iaculis sodales. Suspendisse pellentesque nulla ac odio consectetur, convallis gravida tellus pulvinar. Fusce consectetur congue leo quis dapibus. Aenean porttitor ipsum vitae urna interdum, id porta nulla sagittis. Aenean mattis, purus eget malesuada convallis, mauris ipsum malesuada tellus, eu condimentum lectus libero eget mi. Sed suscipit pharetra quam quis rutrum. Donec vestibulum facilisis ligula, eget semper elit aliquam congue. Vestibulum semper rhoncus commodo. Cras faucibus erat dolor, eget sodales justo placerat vitae. Mauris nulla felis, dignissim et lacus id, gravida luctus felis. Donec a quam urna. Duis lobortis mi et lectus bibendum imperdiet."),
    EatingPlace("2", null, "Mentes Bolt",Coord(47.63333, 18.294444), Address("2800", "Tatabánya", "Vasútállomás"),"gluténmentes, paleo", User("1","hardvera"),"2022.12.31",null,"Lorem ipsum..."),
    EatingPlace("3", null, "King's Fusion",Coord(47.653, 18.324), Address("2890", "Tata", "Ady E. u."),"gluténmentes", User("1","hardvera"),"2022.12.31", null,"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris sodales nulla a purus sodales ultricies. Cras mattis justo nec felis sagittis, quis accumsan nibh lobortis. Donec vel massa risus. Etiam a augue nec nunc iaculis sodales. Suspendisse pellentesque nulla ac odio consectetur, convallis gravida tellus pulvinar. Fusce consectetur congue leo quis dapibus. Aenean porttitor ipsum vitae urna interdum, id porta nulla sagittis. Aenean mattis, purus eget malesuada convallis, mauris ipsum malesuada tellus, eu condimentum lectus libero eget mi. Sed suscipit pharetra quam quis rutrum. Donec vestibulum facilisis ligula, eget semper elit aliquam congue. Vestibulum semper rhoncus commodo. Cras faucibus erat dolor, eget sodales justo placerat vitae.")
    )