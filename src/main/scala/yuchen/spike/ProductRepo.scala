package yuchen.spike

import yuchen.spike.ProductSchema.Product

class ProductRepo {
  private val products = List(
    Product("1", "Cheesecake", "Tasty"),
    Product("2", "Health Potion", "+50 HP")
  )

  def product(id: String): Option[Product] =
    products.find(_.id == id)

  def all: List[Product] = products
}

