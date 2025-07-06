package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SunAngleOutline: ImageVector
    get() {
        if (_SunAngleOutline != null) {
            return _SunAngleOutline!!
        }
        _SunAngleOutline = ImageVector.Builder(
            name = "SunAngleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.8f, 5.2f)
                curveTo(13f, 5f, 12.2f, 5f, 11.4f, 5f)
                lineTo(14.6f, 2.3f)
                lineTo(16f, 6.3f)
                curveTo(15.3f, 5.8f, 14.6f, 5.5f, 13.8f, 5.2f)
                moveTo(7f, 7.1f)
                curveTo(7.6f, 6.5f, 8.3f, 6f, 9f, 5.7f)
                lineTo(4.9f, 4.9f)
                lineTo(5.6f, 9f)
                curveTo(6f, 8.3f, 6.4f, 7.6f, 7f, 7.1f)
                moveTo(5.2f, 13.8f)
                curveTo(5f, 13f, 5f, 12.2f, 5f, 11.4f)
                lineTo(2.3f, 14.6f)
                lineTo(6.3f, 16f)
                curveTo(5.8f, 15.4f, 5.4f, 14.6f, 5.2f, 13.8f)
                moveTo(22f, 19f)
                verticalLineTo(21f)
                horizontalLineTo(3f)
                lineTo(8.4f, 15.5f)
                curveTo(6.5f, 13.5f, 6.5f, 10.4f, 8.4f, 8.4f)
                curveTo(10.3f, 6.5f, 13.5f, 6.5f, 15.4f, 8.4f)
                lineTo(18.4f, 5.4f)
                lineTo(19.8f, 6.8f)
                lineTo(7.7f, 19f)
                horizontalLineTo(22f)
                moveTo(9.8f, 14.1f)
                lineTo(14f, 9.8f)
                curveTo(12.8f, 8.7f, 11f, 8.7f, 9.8f, 9.8f)
                curveTo(8.7f, 11f, 8.7f, 12.9f, 9.8f, 14.1f)
                close()
            }
        }.build()

        return _SunAngleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _SunAngleOutline: ImageVector? = null
