package code.model
import net.liftweb.mapper._

class Test  extends LongKeyedMapper[Test] with IdPK with OneToMany[Long, Test]{

    def getSingleton = Test

    object testColumn extends MappedString(this, 45) {
      override def dbColumnName = "testcolumn"
    }
}

object Test extends Test with LongKeyedMetaMapper[Test]
