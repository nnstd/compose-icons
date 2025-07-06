.PHONY: all
all: clean icons

.PHONY: clean
clean:
	rm -rf ./library/src/commonMain/kotlin/*.kt

.PHONY: icon-pack
icon-pack:
	valkyrie iconpack --output-path=./library/src/commonMain/kotlin --package-name=org.nnstd.compose.icons.mdi --iconpack=MaterialDesignIcons

.PHONY: icons
icons: icon-pack
	valkyrie svgxml2imagevector --input-path=./node_modules/@mdi/svg/svg --output-path=./library/src/commonMain/kotlin --package-name=org.nnstd.compose.icons.mdi  --iconpack-name MaterialDesignIcons
