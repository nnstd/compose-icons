package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PrinterPosMinus: ImageVector
    get() {
        if (_PrinterPosMinus != null) {
            return _PrinterPosMinus!!
        }
        _PrinterPosMinus = ImageVector.Builder(
            name = "PrinterPosMinus",
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
                moveTo(15f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(23f)
                verticalLineTo(18f)
                horizontalLineTo(15f)
                close()
            }
        }.build()

        return _PrinterPosMinus!!
    }

@Suppress("ObjectPropertyName")
private var _PrinterPosMinus: ImageVector? = null
