

DESCRIPTION = "Adds hello world file into /home directory"
LICENSE = "CLOSED"

SRC_URI = "${LAYERDIR}/recipes-dependencies/helloworlddir/hello.txt"

# SRC_URI[md5sum] = "9efdb8655e8bd67462b769089df85261"
# SRC_URI[sha256sum] = "572a22000d408fb524258b379bf272a007c8da977c3e8d47c34f4e45dd7b1932"

do_patch[noexec] = "1"
do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install() {
	install -m ${WORKDIR}/helloworlddir/hello.txt ${D}/home/helloworld
	#install -d ${D}${sbindir}
	#install -m 755 ${WORKDIR}/docker-compose-linux-aarch64 ${D}${sbindir}/docker-compose
}


FILES_${PN}_append = " ${sbindir}/*"