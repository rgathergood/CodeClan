document.addEventListener('DOMContentLoaded', () => {
  const mapContainer = document.querySelector('#main-map');

  const codeclanE = {lat: 55.946962, lng:-3.201958};
  const codeclanG = {lat:55.865477, lng:-4.257998}

  const mainMap = new MapWrapper(mapContainer, codeclanE, 15);

  const contentStringE = '<div id="content">'+
  '<div id="siteNotice">'+
  '</div>'+
  '<h1 id="firstHeading" class="firstHeading">CodeClan</h1>'+
  '<div id="bodyContent">'+
  '<p>At <b>CodeClan</b>, we are passionate about teaching digital skills'+
  'including software development and user experience design. We believe'+
  'that promoting digital excellence creates opportunities for our students,'+
  'our graduates, our employer partners and the wider economy.</p>'+
  '</div>'+
  '</div>';

  const contentStringG = '<div id="content">'+
  '<div id="siteNotice">'+
  '</div>'+
  '<h1 id="firstHeading" class="firstHeading">CodeClan</h1>'+
  '<div id="bodyContent">'+
  '<p>Located in Tontine in Merchant City, we\'re in the process of '+
  'training our fourth Glasgow cohort of software developers. Previous '+
  'Glasgow graduates have gone on to work as software developers in'+
  'organisations like Prudential, Firefish Software, Registers of Scotland and Layer Systems.</p>'+
  '</div>'+
  '</div>';

  mainMap.addMarker(codeclanE, contentStringE);
  mainMap.addMarker(codeclanG, contentStringG);

  mainMap.addClickListener();

  const codeClanEdinburghButton = document.querySelector('#cceButton');
  mainMap.codeClanEdinburgh(codeClanEdinburghButton);

  const codeClanGlasgowButton = document.querySelector('#ccgButton');
  mainMap.codeClanGlasgow(codeClanGlasgowButton);

  const whereAmIButton = document.querySelector('#whereAmIBtn');
  mainMap.whereAmI(whereAmIButton);

});
