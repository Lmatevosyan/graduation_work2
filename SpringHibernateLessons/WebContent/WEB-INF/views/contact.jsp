<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<body background="<c:url value='/images/0022-045-TSv.jpg'/>">
<div id="main">

<div class="loginmsg">
			<h1
				style="margin: 10px 0 7px; border-bottom: 1px solid #87CEEB; padding-bottom: 10px; color: #e54ea2">Contact Us</h1>
		</div>
	<br>
	
<!-- 	<p>So you have a question? Please do not hesitate to contact us anytime.</p> -->
<!-- 	<br> -->
<!-- 	<br> -->
	
<!-- 	<div class="lefthalf2"> -->
<!-- 		<form name="mymini_userinterfacebundle_contactus" method="post" action=""> -->
		
<!-- 			<span class="lbl" style="max-width: 150px;">Name : </span>  -->
<!-- 			<input type="text" id="mymini_userinterfacebundle_contactus_name" -->
<!-- 				name="mymini_userinterfacebundle_contactus[name]" maxlength="100" -->
<!-- 				required="true"> -->
			
<!-- 			<br>  -->
<!-- 			<span style="color: red;"></span> -->
			
<!-- 			<span class="lbl" style="max-width: 150px;">Email : </span>  -->
<!-- 			<input type="email" id="mymini_userinterfacebundle_contactus_email" -->
<!-- 				name="mymini_userinterfacebundle_contactus[email]" maxlength="255" -->
<!-- 				required="true"> -->
			
<!-- 			<br>  -->
<!-- 			<span style="color: red;"></span> -->
			
<!-- 			<span class="lbl" style="max-width: 150px;">Contact Phone : </span>  -->
<!-- 			<input type="text" id="mymini_userinterfacebundle_contactus_contactnumber" -->
<!-- 				name="mymini_userinterfacebundle_contactus[contactnumber]" -->
<!-- 				required="required" maxlength="15">  -->
			
<!-- 			<br>  -->
<!-- 			<span style="color: red;"></span>  -->
			
<!-- 			<span class="lbl" style="max-width: 150px; padding: 0 10px 10px 0;">Nature of -->
<!-- 							Query : </span>  -->
			
<!-- 			<select id="mymini_userinterfacebundle_contactus_querynature" -->
<!-- 				name="mymini_userinterfacebundle_contactus[querynature]"> -->
<!-- 				<option value="Downloading an object">Downloading an object</option> -->
<!-- 				<option value="Finding a design">Finding a design</option> -->
<!-- 				<option value="Submitting my design">Submitting my design</option> -->
<!-- 				<option value="Designing for MyMiniFactory">Designing for MyMiniFactory</option> -->
<!-- 				<option value="Printing and making money">Printing and making money</option> -->
<!-- 				<option value="Print on demand enquiries">Print on demand enquiries</option> -->
<!-- 				<option value="Other">Other</option> -->
<!-- 			</select> -->
			
<!-- 			<br>  -->
<!-- 			<span style="color: red;"></span> -->
			
<!-- 			<br>  -->
<!-- 			<span class="lbl" style="max-width: 150px;">Message : </span> -->
			
<!-- 			<br> -->
<!-- 			<textarea id="mymini_userinterfacebundle_contactus_message" -->
<!-- 				name="mymini_userinterfacebundle_contactus[message]" -->
<!-- 				required="required" cols="50" rows="10"></textarea> -->
			
<!-- 			<br>  -->
<!-- 			<span style="color: red;"></span> -->
			
<!-- 			<br>  -->
<!-- 			<span class="lbl" style="max-width: 150px;"> Prove you are human</span>  -->
<!-- 			<img id="captcha_54e21736e65b3" -->
<!-- 				src="data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD//gA7Q1JFQVRPUjogZ2QtanBlZyB2MS4wICh1c2luZyBJSkcgSlBFRyB2NjIpLCBxdWFsaXR5ID0gMzAK/9sAQwAbEhQXFBEbFxYXHhwbIChCKyglJShROj0wQmBVZWRfVV1baniZgWpxkHNbXYW1hpCeo6utq2eAvMm6pseZqKuk/9sAQwEcHh4oIyhOKytOpG5dbqSkpKSkpKSkpKSkpKSkpKSkpKSkpKSkpKSkpKSkpKSkpKSkpKSkpKSkpKSkpKSkpKSk/8AAEQgAMgCCAwEiAAIRAQMRAf/EAB8AAAEFAQEBAQEBAAAAAAAAAAABAgMEBQYHCAkKC//EALUQAAIBAwMCBAMFBQQEAAABfQECAwAEEQUSITFBBhNRYQcicRQygZGhCCNCscEVUtHwJDNicoIJChYXGBkaJSYnKCkqNDU2Nzg5OkNERUZHSElKU1RVVldYWVpjZGVmZ2hpanN0dXZ3eHl6g4SFhoeIiYqSk5SVlpeYmZqio6Slpqeoqaqys7S1tre4ubrCw8TFxsfIycrS09TV1tfY2drh4uPk5ebn6Onq8fLz9PX29/j5+v/EAB8BAAMBAQEBAQEBAQEAAAAAAAABAgMEBQYHCAkKC//EALURAAIBAgQEAwQHBQQEAAECdwABAgMRBAUhMQYSQVEHYXETIjKBCBRCkaGxwQkjM1LwFWJy0QoWJDThJfEXGBkaJicoKSo1Njc4OTpDREVGR0hJSlNUVVZXWFlaY2RlZmdoaWpzdHV2d3h5eoKDhIWGh4iJipKTlJWWl5iZmqKjpKWmp6ipqrKztLW2t7i5usLDxMXGx8jJytLT1NXW19jZ2uLj5OXm5+jp6vLz9PX29/j5+v/aAAwDAQACEQMRAD8A5miiigAooooAKKKKACiiigAoq5a6fJOyhyU38qNpyw9fYe5/DOKjeeOPKQwKvbc53t/h+lK4FelxxmkopgFFFFABRRRQAUUUUAFL1HvSUUAFX9OvbW0jfz7JbhyeCx4FUTzyPxFJS3A6vSNQS9MzPZW8VvCm5mC/596xRYXmpSy3Nta4jZiQBhR+FXrmN7LRILGJGa5uv3kiqMnHp/L8jU+pym10rTwkzxx7MHyD1bA/iHHrUbbAYDWdylyLdoXEp6KRya0rXQr4FCYF3t/z0wVj9yO59ufemx397esqRStEkXJmdssq+7f071rXeoHS9LUB5HuJhlPNPzfUjt9P/r023sBiahcSW8stlGxEYbEpz80rdyT/AEpuqWMdslvPbMzQTpkFjkg9xVrTLi3umjtZNNE8jfekDYY+pNa1zZWUlu+kwSfvB+9RSc7PbP50XsI5++sI7TT7SXcxlnBYjsB/k1n1r+JpAdQWBfuwRqn9f61kVS2GL1FJRQaYBRRRQAUUUUAFFFSw28kwLIBtHVmIAH4mgCIcVcsIozMk9wrC3RvmOOG9h7+1R7YIPvHzpO6r90H696illaVtzYGOAAMAD2pbiLuq6o+oTswQRxkAY6kgep/p0/Hmr1jcR2enGHU2SSJxvjt8bnwe+f4awic9aSiwze/tfT/OgVLRo7eI7iox8zdsjvilu9Y0yefz2095pOmZHwMfTmsCilyoDrbKye205v7PeA3c3LMW+6PQVz0yXumXoaQtHP8AeDZzn3qnT5JZJdpkdn2jAyc4FCVgCaWSeVpZWLOxySe9MooqgClHTFJRQAUUUUAFFFFABRRRQAUUUUAFFFFABRRRQAUUUUAFFFFABRRRQAUUUUAFFFFAH//Z" -->
<!-- 				alt="" title="captcha" width="130" height="50"> -->
<!-- 			<input type="text" id="mymini_userinterfacebundle_contactus_captcha" -->
<!-- 				name="mymini_userinterfacebundle_contactus[captcha]" -->
<!-- 				required="required" -->
<!-- 				style="position: static; margin-left: 0px; margin-top: 10px;"> -->
			
<!-- 			<br> -->
<!-- 			<span style="color: red;"></span>  -->
<!-- 			<input type="submit" class="button" style="width: auto;">  -->
<!-- 			<input type="hidden" id="mymini_userinterfacebundle_contactus__token" -->
<!-- 				name="mymini_userinterfacebundle_contactus[_token]" -->
<!-- 				value="WjuBZrKEW0n9o6alu926wljm_q0E6Buy8cmFfkpR730"> -->
<!-- 		</form> -->
<!-- 	</div> -->
	
<!-- 	<div class="righthalf2"> -->
<!-- 		<img alt="" class="fullwidth" src="/images/invader.jpg"> -->
<!-- 	</div> -->

</div>