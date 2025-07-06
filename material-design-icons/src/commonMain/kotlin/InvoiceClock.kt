package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.InvoiceClock: ImageVector
    get() {
        if (_InvoiceClock != null) {
            return _InvoiceClock!!
        }
        _InvoiceClock = ImageVector.Builder(
            name = "InvoiceClock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 13f)
                verticalLineTo(16.69f)
                lineTo(18.19f, 18.53f)
                lineTo(18.94f, 17.23f)
                lineTo(16.5f, 15.82f)
                verticalLineTo(13f)
                horizontalLineTo(15f)
                moveTo(9f, 22f)
                lineTo(10.87f, 20.76f)
                curveTo(12.14f, 22.14f, 13.97f, 23f, 16f, 23f)
                curveTo(19.87f, 23f, 23f, 19.87f, 23f, 16f)
                curveTo(23f, 14.09f, 22.24f, 12.36f, 21f, 11.1f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                verticalLineTo(22f)
                lineTo(6f, 20f)
                lineTo(9f, 22f)
                moveTo(16f, 21f)
                curveTo(13.24f, 21f, 11f, 18.76f, 11f, 16f)
                curveTo(11f, 13.24f, 13.24f, 11f, 16f, 11f)
                curveTo(18.76f, 11f, 21f, 13.24f, 21f, 16f)
                curveTo(21f, 18.76f, 18.76f, 21f, 16f, 21f)
                close()
            }
        }.build()

        return _InvoiceClock!!
    }

@Suppress("ObjectPropertyName")
private var _InvoiceClock: ImageVector? = null
