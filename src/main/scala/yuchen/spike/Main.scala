package yuchen.spike

import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.Success

object Main extends App {

  Execution.testQuery.onComplete {
    case Success(r) => println(s"the result is $r")
    case _ => println("some Exception")
  }

  Thread.sleep(2000)
//  sampleServer
//  private def sampleServer: Unit = {
//    implicit val system: ActorSystem = ActorSystem("helloworld")
//    implicit val executor: ExecutionContext = system.dispatcher
//    implicit val materializer: ActorMaterializer = ActorMaterializer()
//
//    def route = path("hello") {
//      get {
//        complete(HttpEntity(ContentTypes.`text/html(UTF-8)`, "<h1>Say hello to akka-http</h1>"))
//      }
//    }
//
//    val bindingFuture = Http().bindAndHandle(route, "localhost", 8080)
//
//    println(s"Server online at http://localhost:8080/\nPress RETURN to stop...")
//    StdIn.readLine() // let it run until user presses return
//    bindingFuture
//      .flatMap(_.unbind()) // trigger unbinding from the port
//      .onComplete(_ => system.terminate()) // and shutdown when done
//  }

}
