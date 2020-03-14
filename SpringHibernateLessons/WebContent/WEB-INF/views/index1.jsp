
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<form method="POST" action="index1">
	<spring:message code="label.login" />
	<div class="form-group">
		<div class="container">
			<div class="row">
				<br> <br> <br> <br> <br> <br>
				<div class="col-md-6">
					<input type="text" class="form-control input-lg"
						placeholder="Search images" name="searchWord" id="searchWord" oninput="setSubject();">
				</div>

				<div class="col-md-2"><a id="searchbtn"  href="search1" class="btn btn-lg btn-success" role="button">Search<span id="Err"></span></a>
<!-- 						<input type="submit" class="btn btn-lg btn-success" name="action" -->
<!-- 						value="Search"/> -->
				</div>
				
				<script type="text/javascript">
				 function setSubject()
				 {
					 var word = document.getElementById("searchWord").value;
					 var link = document.getElementById("searchbtn");
					 var href = link.getAttribute("href");
					 link.setAttribute("href", href + "?keywords1=" + word);
				 } 
    </script>
			</div>
		</div>
	</div>
	<div class="container">
		<br>
		<div id="myCarousel" class="carousel slide" data-ride="carousel">
			<!-- Indicators -->
			<ol class="carousel-indicators">
				<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
				<li data-target="#myCarousel" data-slide-to="1"></li>
				<li data-target="#myCarousel" data-slide-to="2"></li>
				<li data-target="#myCarousel" data-slide-to="3"></li>
			</ol>

			<!-- Wrapper for slides -->
			<div class="carousel-inner" role="listbox">
				
				<c:forEach var="photoFile" items="${firstPict.photoFiles}"
 									varStatus="loopCounter1" end="0">
 							<c:if test="${photoFile.phfSize == 2}">
								<div class="item active"
 									style="height: 480px; background-image: url('restrictedImages/?img=${photoFile.phfPath}'); background-repeat: no-repeat; background-position: center;">
 									<div class="carousel-caption">  										
 										<h3><c:out value="${firstPict.prodTitle}" /></h3> 
 										<p><c:out value="${firstPict.prodDescription}" /></p>
 									</div>
 								</div>
 							</c:if> 
 						</c:forEach>
				
<!-- 				<div class="item active"  -->
<%--  					style="height: 480px; background-image: url('restrictedImages/?img=${requestScope.path}'); background-repeat: no-repeat; background-position: center;"> --%>

<!--  					<div class="carousel-caption"> -->
<%--  						<h3><c:out value="${requestScope.title}" /></h3>  --%>
<%--  						<p><c:out value="${requestScope.description}" /></p>  --%>
<!--  					</div>  -->
<!--  				</div>  -->
				
				<c:forEach var="pict" items="${requestScope.fourPict}"
						varStatus="loopCounter">
					<c:forEach var="photoFiles" items="${pict.photoFiles}"
 									varStatus="loopCounter1" end="0">
 							<c:if test="${photoFiles.phfSize == 2}">
								<div class="item"
 									style="height: 480px; background-image: url('restrictedImages/?img=${photoFiles.phfPath}'); background-repeat: no-repeat; background-position: center;">
 									<div class="carousel-caption">  										
 										<h3><c:out value="${pict.prodTitle}" /></h3> 
 										<p><c:out value="${pict.prodDescription}" /></p>
 									</div>
 								</div>
 							</c:if> 
 						</c:forEach>
 				</c:forEach>

<!-- 				<div class="item active" -->
<!-- 					style="height: 480px; background-image: url('restrictedImages/?img=D:/MarketPlaceImages/camera-vintage-photography-classic.jpg'); background-repeat: no-repeat; background-position: center;"> -->

<!-- 					<div class="carousel-caption"> -->
<!-- 						<h3>Chania</h3> -->
<!-- 						<p>The atmosphere in Chania has a touch of Florence and -->
<!-- 							Venice.</p> -->
<!-- 					</div> -->
<!-- 				</div> -->

<!-- 				<div class="item" -->
<!-- 					style="height: 480px; background-image: url('restrictedImages/?img=D:/MarketPlaceImages/27731-red-telephone-box-london-1280x800-photography-wallpaper.jpg'); background-repeat: no-repeat; background-position: center;"> -->


<!-- 					<div class="carousel-caption"> -->
<!-- 						<h3>Chania</h3> -->
<!-- 						<p>The atmosphere in Chania has a touch of Florence and -->
<!-- 							Venice.</p> -->
<!-- 					</div> -->
<!-- 				</div> -->

<!-- 				<div class="item" -->
<!-- 					style="height: 480px; background-image: url('restrictedImages/?img=D:/MarketPlaceImages/f6eeb64bd5d3cc7f2cc238784196ca7f.jpg'); background-repeat: no-repeat; background-position: center;"> -->


<!-- 					<div class="carousel-caption"> -->
<!-- 						<h3>Flowers</h3> -->
<!-- 						<p>Beatiful flowers in Kolymbari, Crete.</p> -->
<!-- 					</div> -->
<!-- 				</div> -->

<!-- 				<div class="item" -->
<!-- 					style="height: 480px; background-image: url('restrictedImages/?img=D:/MarketPlaceImages/blue_ball_macro-wallpaper-1280x1024.jpg'); background-repeat: no-repeat; background-position: center;"> -->

<!-- 					<div class="carousel-caption"> -->
<!-- 						<h3>Flowers</h3> -->
<!-- 						<p>Beatiful flowers in Kolymbari, Crete.</p> -->
<!-- 					</div> -->
<!-- 				</div> -->

			</div>

			<!-- Left and right controls -->
			<a class="left carousel-control" href="#myCarousel" role="button"
				data-slide="prev"> <span
				class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
				<span class="sr-only">Previous</span>
			</a> <a class="right carousel-control" href="#myCarousel" role="button"
				data-slide="next"> <span
				class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
				<span class="sr-only">Next</span>
			</a>
		</div>
	</div>

	<div>
		<br>
		<br>
		<table>
			<tr>
				<td bgcolor="#EEEEEE"><b>
				<a href="search1"  class="btn btn-lg btn-success" role="button">Search a Photo</a></b></td> 
<!-- 			<input type="submit" class="btn btn-lg btn-success" name="action" value="Search a Photo" /></b></td>  -->
			</tr>
			<tr>
				<td><br> <br> <br> <b>Latest Photos</b> <br>
				<br>
					<table>
						<tr>
							<c:forEach var="photo" items="${requestScope.lastPhotoList}"
								varStatus="loopCounter">
								<td>
									<c:set var="p" scope="application" value="1"></c:set> 
									<c:if test="${photo.photoFiles!=null}">
										<c:forEach var="photoFiles" items="${photo.photoFiles}"
											varStatus="loopCounter1" end="0">
											<c:if test="${photoFiles.phfPath !=null}">
												<c:set var="p" value="0"></c:set>
											<a href="productPage?prodId=${photo.prodId}">	<div class="item"
														style="height: 150px;  width:150px;
													background-image: url('restrictedImages/?img=${photoFiles.phfPath}'); 
													background-size: 100%;   background-repeat: no-repeat"">
												</div>
												Title: <c:out value="${photo.prodTitle}" />
												<br>
<%-- 												<a href="#" onclick="_download(${photo.prodId})">Download</a> --%>
											</c:if></a>
										</c:forEach>
									</c:if></td>

<%-- 								<td>Title: <c:out value="${photo.prodTitle}" /> </br> Category:
								<c:if test="${photo.prodCategory!=null}">
									<c:forEach var="prodCategory" items="${photo.prodCategory}"
										varStatus="loopCounter1">
				${prodCategory.prcCategory}, 
				</c:forEach>
								</c:if> Description <c:out value="${photo.prodDescription}" /> <a
								href="#" onclick="_download(${photo.prodId})">Download</a>
							</td> --%>
							</c:forEach>
						</tr>
					</table>
				</td>
			</tr>

		</table>


	</div>
</form>
<script>
function _download(id){
	
	$.ajax({
		  type: "get",
		  url: "download",
		  cache: false,    
		  data:'id=' +id,
		  success: function(response){
			alert(response);
		  },
		  error: function(){      
		   alert('Error while request..');
		  }
		 });
}
</script>
