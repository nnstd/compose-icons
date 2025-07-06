package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PrinterOutline: ImageVector
    get() {
        if (_PrinterOutline != null) {
            return _PrinterOutline!!
        }
        _PrinterOutline = ImageVector.Builder(
            name = "PrinterOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 8f)
                curveTo(20.66f, 8f, 22f, 9.34f, 22f, 11f)
                verticalLineTo(17f)
                horizontalLineTo(18f)
                verticalLineTo(21f)
                horizontalLineTo(6f)
                verticalLineTo(17f)
                horizontalLineTo(2f)
                verticalLineTo(11f)
                curveTo(2f, 9.34f, 3.34f, 8f, 5f, 8f)
                horizontalLineTo(6f)
                verticalLineTo(3f)
                horizontalLineTo(18f)
                verticalLineTo(8f)
                horizontalLineTo(19f)
                moveTo(8f, 5f)
                verticalLineTo(8f)
                horizontalLineTo(16f)
                verticalLineTo(5f)
                horizontalLineTo(8f)
                moveTo(16f, 19f)
                verticalLineTo(15f)
                horizontalLineTo(8f)
                verticalLineTo(19f)
                horizontalLineTo(16f)
                moveTo(18f, 15f)
                horizontalLineTo(20f)
                verticalLineTo(11f)
                curveTo(20f, 10.45f, 19.55f, 10f, 19f, 10f)
                horizontalLineTo(5f)
                curveTo(4.45f, 10f, 4f, 10.45f, 4f, 11f)
                verticalLineTo(15f)
                horizontalLineTo(6f)
                verticalLineTo(13f)
                horizontalLineTo(18f)
                verticalLineTo(15f)
                moveTo(19f, 11.5f)
                curveTo(19f, 12.05f, 18.55f, 12.5f, 18f, 12.5f)
                curveTo(17.45f, 12.5f, 17f, 12.05f, 17f, 11.5f)
                curveTo(17f, 10.95f, 17.45f, 10.5f, 18f, 10.5f)
                curveTo(18.55f, 10.5f, 19f, 10.95f, 19f, 11.5f)
                close()
            }
        }.build()

        return _PrinterOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PrinterOutline: ImageVector? = null
