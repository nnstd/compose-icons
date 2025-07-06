package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Connection: ImageVector
    get() {
        if (_Connection != null) {
            return _Connection!!
        }
        _Connection = ImageVector.Builder(
            name = "Connection",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.4f, 7.5f)
                curveTo(22.2f, 8.3f, 22.2f, 9.6f, 21.4f, 10.3f)
                lineTo(18.6f, 13.1f)
                lineTo(10.8f, 5.3f)
                lineTo(13.6f, 2.5f)
                curveTo(14.4f, 1.7f, 15.7f, 1.7f, 16.4f, 2.5f)
                lineTo(18.2f, 4.3f)
                lineTo(21.2f, 1.3f)
                lineTo(22.6f, 2.7f)
                lineTo(19.6f, 5.7f)
                lineTo(21.4f, 7.5f)
                moveTo(15.6f, 13.3f)
                lineTo(14.2f, 11.9f)
                lineTo(11.4f, 14.7f)
                lineTo(9.3f, 12.6f)
                lineTo(12.1f, 9.8f)
                lineTo(10.7f, 8.4f)
                lineTo(7.9f, 11.2f)
                lineTo(6.4f, 9.8f)
                lineTo(3.6f, 12.6f)
                curveTo(2.8f, 13.4f, 2.8f, 14.7f, 3.6f, 15.4f)
                lineTo(5.4f, 17.2f)
                lineTo(1.4f, 21.2f)
                lineTo(2.8f, 22.6f)
                lineTo(6.8f, 18.6f)
                lineTo(8.6f, 20.4f)
                curveTo(9.4f, 21.2f, 10.7f, 21.2f, 11.4f, 20.4f)
                lineTo(14.2f, 17.6f)
                lineTo(12.8f, 16.2f)
                lineTo(15.6f, 13.3f)
                close()
            }
        }.build()

        return _Connection!!
    }

@Suppress("ObjectPropertyName")
private var _Connection: ImageVector? = null
