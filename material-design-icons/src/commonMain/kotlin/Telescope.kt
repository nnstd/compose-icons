package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Telescope: ImageVector
    get() {
        if (_Telescope != null) {
            return _Telescope!!
        }
        _Telescope = ImageVector.Builder(
            name = "Telescope",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.9f, 8.9f)
                lineTo(20.2f, 9.9f)
                lineTo(16.2f, 3f)
                lineTo(17.9f, 2f)
                lineTo(21.9f, 8.9f)
                moveTo(9.8f, 7.9f)
                lineTo(12.8f, 13.1f)
                lineTo(18.9f, 9.6f)
                lineTo(15.9f, 4.4f)
                lineTo(9.8f, 7.9f)
                moveTo(11.4f, 12.7f)
                lineTo(9.4f, 9.2f)
                lineTo(5.1f, 11.7f)
                lineTo(7.1f, 15.2f)
                lineTo(11.4f, 12.7f)
                moveTo(2.1f, 14.6f)
                lineTo(3.1f, 16.3f)
                lineTo(5.7f, 14.8f)
                lineTo(4.7f, 13.1f)
                lineTo(2.1f, 14.6f)
                moveTo(12.1f, 14f)
                lineTo(11.8f, 13.6f)
                lineTo(7.5f, 16.1f)
                lineTo(7.8f, 16.5f)
                curveTo(8f, 16.8f, 8.3f, 17.1f, 8.6f, 17.3f)
                lineTo(7f, 22f)
                horizontalLineTo(9f)
                lineTo(10.4f, 17.7f)
                horizontalLineTo(10.5f)
                lineTo(12f, 22f)
                horizontalLineTo(14f)
                lineTo(12.1f, 16.4f)
                curveTo(12.6f, 15.7f, 12.6f, 14.8f, 12.1f, 14f)
                close()
            }
        }.build()

        return _Telescope!!
    }

@Suppress("ObjectPropertyName")
private var _Telescope: ImageVector? = null
