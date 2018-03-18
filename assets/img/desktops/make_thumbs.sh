#!/bin/sh

# todo here: clear out the thumb folder 
# also regen the list on the desktop page so there isn't a disconnect there

# clear desktop list
sed -i '/^desktops/,/^---/d' "../../../pages/desktop.html"
sed -i "/permalink:/a ---" "../../../pages/desktop.html"
sed -i "/permalink:/a desktops:" "../../../pages/desktop.html"

# clear thumbs
rm thumb/*

for file in $(find full -type f); do
  convert $file -resize 900x -filter Lanczos thumb/$(basename $file) > /dev/null

  # insert the line at the top of desktops
  filename="$(basename $file | sed 's/.png//')"
  echo $filename
  sed -i "/desktops:/a \    - $filename" "../../../pages/desktop.html"
done

