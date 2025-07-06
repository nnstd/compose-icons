package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PrinterPosPlayOutline: ImageVector
    get() {
        if (_PrinterPosPlayOutline != null) {
            return _PrinterPosPlayOutline!!
        }
        _PrinterPosPlayOutline = ImageVector.Builder(
            name = "PrinterPosPlayOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 15f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                horizontalLineTo(7f)
                moveTo(6f, 17f)
                horizontalLineTo(13.35f)
                curveTo(13.13f, 17.63f, 13f, 18.3f, 13f, 19f)
                horizontalLineTo(4f)
                verticalLineTo(12f)
                curveTo(4f, 10.9f, 4.89f, 10f, 6f, 10f)
                horizontalLineTo(7f)
                verticalLineTo(4f)
                horizontalLineTo(17f)
                verticalLineTo(10f)
                horizontalLineTo(18f)
                curveTo(19.11f, 10f, 20f, 10.9f, 20f, 12f)
                verticalLineTo(13.09f)
                curveTo(19.67f, 13.04f, 19.34f, 13f, 19f, 13f)
                curveTo(18.66f, 13f, 18.33f, 13.04f, 18f, 13.09f)
                verticalLineTo(12f)
                horizontalLineTo(6f)
                verticalLineTo(17f)
                moveTo(9f, 10f)
                horizontalLineTo(15f)
                verticalLineTo(6f)
                horizontalLineTo(9f)
                verticalLineTo(10f)
                moveTo(17f, 16f)
                verticalLineTo(22f)
                lineTo(22f, 19f)
                lineTo(17f, 16f)
                close()
            }
        }.build()

        return _PrinterPosPlayOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PrinterPosPlayOutline: ImageVector? = null
