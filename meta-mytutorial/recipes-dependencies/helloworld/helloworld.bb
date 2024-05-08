DESCRIPTION = "Adds hello world file into /home directory"
LICENSE = "CLOSED"


#SRC_URI = "file://${THISDIR}/hello.txt"
#SRC_URI[md5sum] = "aaf4c61ddcc5e8a2dabede0f3b482cd9aea9434d"


do_patch[noexec] = "1"
do_configure[noexec] = "1"
do_compile[noexec] = "1"


do_install() {
	install -d ${D}/home/pokus
	#cp --preserve=mode,timestamps ${WORKDIR}/helloworld/hello.txt ${D}/home/pokus
}

FILES_${PN} = "/home/pokus"
