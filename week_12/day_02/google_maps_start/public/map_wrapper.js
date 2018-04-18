const MapWrapper = function (container, center, zoom) {
  this.googleMap = new google.maps.Map(container, {
    center: center,
    zoom: zoom
  });

  this.markers = [];
}

MapWrapper.prototype.addMarker = function (coords, contentString, icon) {
  const marker = new google.maps.Marker({
    map: this.googleMap,
    position: coords,
    icon: icon
  });

  const infoWindow = new google.maps.InfoWindow ({
    content: contentString,
    maxWidth: 300
  });

  marker.addListener('click', function () {
    infoWindow.open(this.googleMap, marker);
  });

  this.markers.push(marker); //keeps track of all markers
}

MapWrapper.prototype.addClickListener = function () {
  google.maps.event.addListener(this.googleMap, 'click', (event) => { //arrow function needed here for context (this.addMarker is not a function)
    const lat = event.latLng.lat();
    const lng = event.latLng.lng();
    this.addMarker({lat, lng});
  });
}

MapWrapper.prototype.codeClanEdinburgh = function (cceButton) {
  cceButton.addEventListener('click', () => {
    this.googleMap.setCenter(new google.maps.LatLng(55.946962, -3.201958))
  });
}


MapWrapper.prototype.codeClanGlasgow = function (ccgButton) {
  ccgButton.addEventListener('click', () => {
    this.googleMap.setCenter(new google.maps.LatLng(55.865477, -4.257998))
  });
}

// MapWrapper.prototype.whereAmI = function (whereAmIBtn) {
//   whereAmIBtn.addEventListener('click', () => {
//     navigator.geolocation.getCurrentPosition((position) => {
//       this.googleMap.setCenter(new google.maps)
//     })
//   })
// };
