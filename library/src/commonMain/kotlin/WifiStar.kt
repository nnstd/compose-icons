package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WifiStar: ImageVector
    get() {
        if (_WifiStar != null) {
            return _WifiStar!!
        }
        _WifiStar = ImageVector.Builder(
            name = "WifiStar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 6f)
                curveTo(8.6f, 6f, 5.5f, 7.1f, 3f, 9f)
                lineTo(1.2f, 6.6f)
                curveTo(4.2f, 4.3f, 8f, 3f, 12f, 3f)
                curveTo(16f, 3f, 19.8f, 4.3f, 22.8f, 6.6f)
                lineTo(21f, 9f)
                curveTo(18.5f, 7.1f, 15.4f, 6f, 12f, 6f)
                moveTo(13f, 19f)
                curveTo(13f, 17.7f, 13.4f, 16.4f, 14.2f, 15.4f)
                curveTo(13.5f, 15.2f, 12.8f, 15f, 12f, 15f)
                curveTo(10.7f, 15f, 9.4f, 15.5f, 8.4f, 16.2f)
                lineTo(12f, 21f)
                lineTo(13f, 19.6f)
                curveTo(13f, 19.4f, 13f, 19.2f, 13f, 19f)
                moveTo(16.8f, 13.4f)
                curveTo(17.1f, 13.3f, 17.5f, 13.2f, 17.9f, 13.1f)
                lineTo(19.2f, 11.4f)
                curveTo(17.2f, 9.9f, 14.7f, 9f, 12f, 9f)
                curveTo(9.3f, 9f, 6.8f, 9.9f, 4.8f, 11.4f)
                lineTo(6.6f, 13.8f)
                curveTo(8.1f, 12.7f, 10f, 12f, 12f, 12f)
                curveTo(13.8f, 12f, 15.4f, 12.5f, 16.8f, 13.4f)
                moveTo(16.5f, 22.6f)
                lineTo(17.2f, 19.8f)
                lineTo(15f, 17.9f)
                lineTo(17.9f, 17.7f)
                lineTo(19f, 15f)
                lineTo(20.1f, 17.6f)
                lineTo(23f, 17.8f)
                lineTo(20.8f, 19.7f)
                lineTo(21.5f, 22.5f)
                lineTo(19f, 21.1f)
                lineTo(16.5f, 22.6f)
                close()
            }
        }.build()

        return _WifiStar!!
    }

@Suppress("ObjectPropertyName")
private var _WifiStar: ImageVector? = null
