package cse511

object HotzoneUtils {

  def ST_Contains(queryRectangle: String, pointString: String ): Boolean = {

    // YOU NEED TO CHANGE THIS PART        
    if(queryRectangle == null || queryRectangle.isEmpty || pointString == null || pointString.isEmpty) 
    {
      return false
    }

    val rectangleCoordinates = queryRectangle.split(",")
    val pointCoordinates = pointString.split(",")

    // To check whether the points have correct number of coordinates
    if(rectangleCoordinates.length < 4 || pointCoordinates.length < 2) 
    {
      return false
    }

    val xCorner1 = rectangleCoordinates(0).trim.toDouble
    val yCorner1 = rectangleCoordinates(1).trim.toDouble
    val xCorner2 = rectangleCoordinates(2).trim.toDouble
    val yCorner2 = rectangleCoordinates(3).trim.toDouble
    val pointX = pointCoordinates(0).trim.toDouble
    val pointY = pointCoordinates(1).trim.toDouble

    //check whether the rectangle contains given point
    if(pointX >=  math.min(xCorner1, xCorner2) && pointX <= math.max(xCorner1, xCorner2)
      && pointY >= math.min(yCorner1, yCorner2) && pointY <= math.max(yCorner1, yCorner2)) 
    {
      return true
    }
  
//    return true
      return false
  }
}
