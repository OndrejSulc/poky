SUMMARY = "Setuptools Rust extension plugin"
DESCRIPTION = "setuptools-rust is a plugin for setuptools to build Rust \
Python extensions implemented with PyO3 or rust-cpython.\
\
Compile and distribute Python extensions written in Rust as easily as if they were written in C."
HOMEPAGE = "https://github.com/PyO3/setuptools-rust"
BUGTRACKER = "https://github.com/PyO3/setuptools-rust/issues"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=011cd92e702dd9e6b1a26157b6fd53f5"

SRC_URI = "${PYPI_SRC_URI} \
           https://files.pythonhosted.org/packages/67/08/e1aa2c582c62ac76e4d60f8e454bd3bba933781a06a88b4e38797445822a/setuptools-rust-${PV}.tar.gz \
           "
SRC_URI[sha256sum] = "94b1dd5d5308b3138d5b933c3a2b55e6d6927d1a22632e509fcea9ddd0f7e486"

inherit cargo pypi python_setuptools_build_meta

DEPENDS += "python3-setuptools-scm-native python3-wheel-native"
# remove when https://github.com/PyO3/setuptools-rust/commit/7ced8d2a8f36e1b4fc41b5544636defb7bd44bdf
# is included
DEPENDS += "python3-semantic-version-native"

RDEPENDS:${PN} += " \
    python3-distutils \
    python3-json \
    python3-semantic-version \
    python3-setuptools \
    python3-setuptools-scm \
    python3-shell \
    python3-toml \
    python3-typing-extensions \
    python3-wheel \
"

BBCLASSEXTEND = "native"
