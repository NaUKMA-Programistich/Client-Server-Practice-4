package models

import java.sql.ResultSet

data class Product(
    val count: Int,
    val price: Double,
    val name: String,
    val group: String,
    val id: Int = 0
)

fun ResultSet.toProduct(): Product {
    return Product(
        id = this.getInt("id"),
        count = this.getInt("count"),
        price = this.getDouble("price"),
        name = this.getString("name"),
        group = this.getString("group")
    )
}
