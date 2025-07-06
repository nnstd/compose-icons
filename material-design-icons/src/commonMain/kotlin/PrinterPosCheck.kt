package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PrinterPosCheck: ImageVector
    get() {
        if (_PrinterPosCheck != null) {
            return _PrinterPosCheck!!
        }
        _PrinterPosCheck = ImageVector.Builder(
            name = "PrinterPosCheck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 9f)
                horizontalLineTo(7f)
                verticalLineTo(4f)
                horizontalLineTo(17f)
                verticalLineTo(9f)
                moveTo(19f, 13f)
                curveTo(15.69f, 13f, 13f, 15.69f, 13f, 19f)
                horizontalLineTo(4f)
                verticalLineTo(12f)
                curveTo(4f, 10.9f, 4.89f, 10f, 6f, 10f)
                horizontalLineTo(18f)
                curveTo(19.11f, 10f, 20f, 10.9f, 20f, 12f)
                verticalLineTo(13.09f)
                curveTo(19.67f, 13.04f, 19.34f, 13f, 19f, 13f)
                moveTo(10f, 12f)
                horizontalLineTo(6f)
                verticalLineTo(14f)
                horizontalLineTo(10f)
                verticalLineTo(12f)
                moveTo(21.34f, 15.84f)
                lineTo(17.75f, 19.43f)
                lineTo(16.16f, 17.84f)
                lineTo(15f, 19f)
                lineTo(17.75f, 22f)
                lineTo(22.5f, 17.25f)
                lineTo(21.34f, 15.84f)
                close()
            }
        }.build()

        return _PrinterPosCheck!!
    }

@Suppress("ObjectPropertyName")
private var _PrinterPosCheck: ImageVector? = null
