package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PrinterPosNetworkOutline: ImageVector
    get() {
        if (_PrinterPosNetworkOutline != null) {
            return _PrinterPosNetworkOutline!!
        }
        _PrinterPosNetworkOutline = ImageVector.Builder(
            name = "PrinterPosNetworkOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 11f)
                horizontalLineTo(17f)
                verticalLineTo(13f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                moveTo(22f, 20f)
                verticalLineTo(22f)
                horizontalLineTo(15f)
                curveTo(15f, 22.55f, 14.55f, 23f, 14f, 23f)
                horizontalLineTo(10f)
                curveTo(9.45f, 23f, 9f, 22.55f, 9f, 22f)
                horizontalLineTo(2f)
                verticalLineTo(20f)
                horizontalLineTo(9f)
                curveTo(9f, 19.45f, 9.45f, 19f, 10f, 19f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                horizontalLineTo(4f)
                verticalLineTo(10f)
                curveTo(4f, 8.9f, 4.89f, 8f, 6f, 8f)
                horizontalLineTo(7f)
                verticalLineTo(2f)
                horizontalLineTo(17f)
                verticalLineTo(8f)
                horizontalLineTo(18f)
                curveTo(19.11f, 8f, 20f, 8.9f, 20f, 10f)
                verticalLineTo(17f)
                horizontalLineTo(13f)
                verticalLineTo(19f)
                horizontalLineTo(14f)
                curveTo(14.55f, 19f, 15f, 19.45f, 15f, 20f)
                horizontalLineTo(22f)
                moveTo(9f, 8f)
                horizontalLineTo(15f)
                verticalLineTo(4f)
                horizontalLineTo(9f)
                verticalLineTo(8f)
                moveTo(18f, 15f)
                verticalLineTo(10f)
                horizontalLineTo(6f)
                verticalLineTo(15f)
                horizontalLineTo(18f)
                close()
            }
        }.build()

        return _PrinterPosNetworkOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PrinterPosNetworkOutline: ImageVector? = null
