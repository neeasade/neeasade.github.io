#Meant to be used to configure blank system with current packages and dotfiles.
sudo pacman -Syu --noconfirm
sudo pacman -S wget sudo git base-devel abs file expac yajl  --needed --noconfirm

root pass:
passwd

echo hostname:
read hostname
echo $hostname > /etc/hostname

echo user:
read user
useradd $user
echo password:
passwd $user
ln -sf /usr/share/zoneinfo/America/Chicago /etc/localtim
echo en_US.UTF-8 UTF-8 > /etc/locale.gen
locale-gen
locale > /etc/locale.conf

mkdir /home/$user/temp
cd /home/$user/temp
#install pacaur:
#build cower and install:
wget http://aur.archlinux.org/packages/co/cower/cower.tar.gz
tar xzf cower.tar.gz
cd cower
makepkg -i
cd ..
wget http://aur.archlinux.org/packages/pa/pacaur/pacaur.tar.gz
cd pacaur
makepkg -i
cd ..
git clone http://bitbucket.org/nathanisom27/packages_arch

echo login as $user and run stuff.
