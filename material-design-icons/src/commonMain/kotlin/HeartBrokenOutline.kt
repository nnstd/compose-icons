package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HeartBrokenOutline: ImageVector
    get() {
        if (_HeartBrokenOutline != null) {
            return _HeartBrokenOutline!!
        }
        _HeartBrokenOutline = ImageVector.Builder(
            name = "HeartBrokenOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.5f, 5f)
                curveTo(7.7f, 5f, 7.9f, 5f, 8.1f, 5.1f)
                lineTo(10.5f, 9.2f)
                lineTo(6.8f, 13.8f)
                curveTo(5.1f, 11.8f, 4f, 10.2f, 4f, 8.5f)
                curveTo(4f, 6.5f, 5.5f, 5f, 7.5f, 5f)
                moveTo(7.5f, 3f)
                curveTo(4.4f, 3f, 2f, 5.4f, 2f, 8.5f)
                curveTo(2f, 12.3f, 5.4f, 15.4f, 10.6f, 20f)
                lineTo(12f, 21.3f)
                lineTo(9f, 14.3f)
                lineTo(13f, 9.3f)
                lineTo(9.4f, 3.3f)
                curveTo(8.8f, 3.1f, 8.2f, 3f, 7.5f, 3f)
                moveTo(16.5f, 5f)
                curveTo(18.5f, 5f, 20f, 6.5f, 20f, 8.5f)
                curveTo(20f, 11.1f, 17.4f, 13.7f, 13.4f, 17.3f)
                lineTo(13.1f, 15f)
                lineTo(17.9f, 9.7f)
                lineTo(15.6f, 5.2f)
                curveTo(15.9f, 5f, 16.2f, 5f, 16.5f, 5f)
                moveTo(16.5f, 3f)
                curveTo(15.2f, 3f, 13.9f, 3.5f, 12.9f, 4.3f)
                lineTo(15.5f, 9.4f)
                lineTo(11f, 14.4f)
                lineTo(12f, 21.4f)
                lineTo(13.4f, 20.1f)
                curveTo(18.6f, 15.4f, 22f, 12.3f, 22f, 8.6f)
                curveTo(22f, 5.4f, 19.6f, 3f, 16.5f, 3f)
                close()
            }
        }.build()

        return _HeartBrokenOutline!!
    }

@Suppress("ObjectPropertyName")
private var _HeartBrokenOutline: ImageVector? = null
