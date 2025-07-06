package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PrinterPosOutline: ImageVector
    get() {
        if (_PrinterPosOutline != null) {
            return _PrinterPosOutline!!
        }
        _PrinterPosOutline = ImageVector.Builder(
            name = "PrinterPosOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 10f)
                horizontalLineTo(17f)
                verticalLineTo(4f)
                horizontalLineTo(7f)
                verticalLineTo(10f)
                horizontalLineTo(6f)
                curveTo(4.89f, 10f, 4f, 10.9f, 4f, 12f)
                verticalLineTo(19f)
                horizontalLineTo(20f)
                verticalLineTo(12f)
                curveTo(20f, 10.9f, 19.11f, 10f, 18f, 10f)
                moveTo(9f, 6f)
                horizontalLineTo(15f)
                verticalLineTo(10f)
                horizontalLineTo(9f)
                verticalLineTo(6f)
                moveTo(18f, 17f)
                horizontalLineTo(6f)
                verticalLineTo(12f)
                horizontalLineTo(18f)
                verticalLineTo(17f)
                moveTo(17f, 15f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                horizontalLineTo(17f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _PrinterPosOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PrinterPosOutline: ImageVector? = null
