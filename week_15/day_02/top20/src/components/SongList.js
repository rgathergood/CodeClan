import React from 'react';

const SongList = ({songs}) => {
  var songNodes = songs.map((song, index) => {
    return <li key={index}>{song['im:name'].label} {song['im:artist'].label}</li>
  });

  return (
    <ol>
      {songNodes}
    </ol>
  );
}
export default SongList;
