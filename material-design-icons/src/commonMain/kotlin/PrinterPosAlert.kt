package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PrinterPosAlert: ImageVector
    get() {
        if (_PrinterPosAlert != null) {
            return _PrinterPosAlert!!
        }
        _PrinterPosAlert = ImageVector.Builder(
            name = "PrinterPosAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 10f)
                horizontalLineTo(4f)
                curveTo(2.9f, 10f, 2f, 10.9f, 2f, 12f)
                verticalLineTo(19f)
                horizontalLineTo(18f)
                verticalLineTo(12f)
                curveTo(18f, 10.9f, 17.11f, 10f, 16f, 10f)
                moveTo(16f, 14f)
                horizontalLineTo(12f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(14f)
                moveTo(15f, 9f)
                horizontalLineTo(5f)
                verticalLineTo(4f)
                horizontalLineTo(15f)
                verticalLineTo(9f)
                moveTo(22f, 7f)
                verticalLineTo(13f)
                horizontalLineTo(20f)
                verticalLineTo(7f)
                horizontalLineTo(22f)
                moveTo(20f, 15f)
                horizontalLineTo(22f)
                verticalLineTo(17f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _PrinterPosAlert!!
    }

@Suppress("ObjectPropertyName")
private var _PrinterPosAlert: ImageVector? = null
