package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Restart: ImageVector
    get() {
        if (_Restart != null) {
            return _Restart!!
        }
        _Restart = ImageVector.Builder(
            name = "Restart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 4f)
                curveTo(14.1f, 4f, 16.1f, 4.8f, 17.6f, 6.3f)
                curveTo(20.7f, 9.4f, 20.7f, 14.5f, 17.6f, 17.6f)
                curveTo(15.8f, 19.5f, 13.3f, 20.2f, 10.9f, 19.9f)
                lineTo(11.4f, 17.9f)
                curveTo(13.1f, 18.1f, 14.9f, 17.5f, 16.2f, 16.2f)
                curveTo(18.5f, 13.9f, 18.5f, 10.1f, 16.2f, 7.7f)
                curveTo(15.1f, 6.6f, 13.5f, 6f, 12f, 6f)
                verticalLineTo(10.6f)
                lineTo(7f, 5.6f)
                lineTo(12f, 0.6f)
                verticalLineTo(4f)
                moveTo(6.3f, 17.6f)
                curveTo(3.7f, 15f, 3.3f, 11f, 5.1f, 7.9f)
                lineTo(6.6f, 9.4f)
                curveTo(5.5f, 11.6f, 5.9f, 14.4f, 7.8f, 16.2f)
                curveTo(8.3f, 16.7f, 8.9f, 17.1f, 9.6f, 17.4f)
                lineTo(9f, 19.4f)
                curveTo(8f, 19f, 7.1f, 18.4f, 6.3f, 17.6f)
                close()
            }
        }.build()

        return _Restart!!
    }

@Suppress("ObjectPropertyName")
private var _Restart: ImageVector? = null
