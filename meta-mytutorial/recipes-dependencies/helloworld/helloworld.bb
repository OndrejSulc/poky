

DESCRIPTION = "Adds hello world file into /home directory"
LICENSE = "CLOSED"

SRC_URI = "file://${THISDIR}/hello.txt"
SRC_URI[md5sum] = "aaf4c61ddcc5e8a2dabede0f3b482cd9aea9434d"

do_patch[noexec] = "1"
do_configure[noexec] = "1"
do_compile[noexec] = "1"

helloworldFiles = "${base_prefix}/home/helloworld/"
do_install() {
	install -m ${SRC_URI} "${helloworldFiles}/hello.txt"
	#install -d ${D}${sbindir}
	#install -m 755 ${WORKDIR}/docker-compose-linux-aarch64 ${D}${sbindir}/docker-compose
}


FILES_${PN} += " \
	${helloworldFiles}/*"