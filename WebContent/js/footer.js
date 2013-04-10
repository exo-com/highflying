
function initialize() {
  var mapOptions = {
    center: new google.maps.LatLng(37.2583442,127.0105531),
    zoom: 12,
    mapTypeId: google.maps.MapTypeId.ROADMAP
  };
  var map = new google.maps.Map(document.getElementById("mapCanvas"),
    mapOptions);
  var marker = new google.maps.Marker({
    position: new google.maps.LatLng(37.2583442,127.0105531)
  });
  marker.setMap(map);
}