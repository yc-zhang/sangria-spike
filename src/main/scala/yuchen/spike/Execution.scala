package yuchen.spike

import sangria.macros._
import sangria.execution._
import sangria.marshalling.circe._
import io.circe.Json

import scala.concurrent.{ExecutionContext, Future}

object Execution {
  val query =
    graphql"""
      query MyProduct {
        product(id: "2") {
          name
          description

          picture(size: 500) {
            width, height, url
          }
        }

        products {
          name
        }
      }
    """

  def testQuery(implicit execution: ExecutionContext): Future[Json] =
    Executor.execute(ProductSchema.schema, query, new ProductRepo)

}
