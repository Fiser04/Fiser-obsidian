nmcli con add type wifi con-name eduroam ifname "interface" ssid eduroam wifi-sec.key-mgmt wpa-eap 802-1x.identity "mail" 802-1x.password "password" 802-1x.system-ca-certs yes 802-1x.eap "peap" 802-1x.phase2-auth mschapv2

nmcli connection up eduroam --ask