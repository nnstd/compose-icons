package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Pirate: ImageVector
    get() {
        if (_Pirate != null) {
            return _Pirate!!
        }
        _Pirate = ImageVector.Builder(
            name = "Pirate",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.2f, 12.1f)
                curveTo(7.9f, 12.3f, 7.7f, 12.7f, 7.8f, 13f)
                curveTo(7.8f, 13.7f, 8.5f, 14.2f, 9.1f, 14.2f)
                curveTo(9.7f, 14.2f, 10.3f, 13.7f, 10.3f, 13f)
                curveTo(9.7f, 12.6f, 9f, 12.3f, 8.2f, 12.1f)
                moveTo(22f, 11f)
                lineTo(23f, 7f)
                curveTo(23f, 7f, 21f, 7f, 18f, 5f)
                curveTo(15f, 3f, 15f, 1f, 12f, 1f)
                curveTo(9f, 1f, 9f, 3f, 6f, 5f)
                curveTo(3f, 7f, 1f, 7f, 1f, 7f)
                lineTo(2f, 11f)
                horizontalLineTo(2.1f)
                curveTo(2f, 11.3f, 2f, 11.7f, 2f, 12f)
                curveTo(2f, 15.5f, 3.8f, 18.6f, 6.5f, 20.4f)
                lineTo(6f, 21.3f)
                curveTo(12.4f, 25.4f, 18f, 21.3f, 18f, 21.3f)
                lineTo(17.5f, 20.4f)
                curveTo(20.2f, 18.6f, 22f, 15.5f, 22f, 12f)
                curveTo(22f, 11.7f, 22f, 11.3f, 22f, 11f)
                moveTo(11.3f, 4.5f)
                lineTo(9.9f, 3.1f)
                lineTo(10.6f, 2.4f)
                lineTo(12f, 3.8f)
                lineTo(13.4f, 2.4f)
                lineTo(14.1f, 3.1f)
                lineTo(12.7f, 4.5f)
                lineTo(14.1f, 5.9f)
                lineTo(13.4f, 6.6f)
                lineTo(12f, 5.2f)
                lineTo(10.6f, 6.6f)
                lineTo(9.9f, 5.9f)
                lineTo(11.3f, 4.5f)
                moveTo(9.3f, 8.5f)
                curveTo(10.3f, 8.2f, 11.3f, 8f, 12f, 8f)
                curveTo(14.2f, 8f, 17.9f, 9.6f, 19.8f, 10.4f)
                curveTo(19.9f, 10.7f, 19.9f, 11f, 19.9f, 11.3f)
                lineTo(9.3f, 8.5f)
                moveTo(13.6f, 19.1f)
                curveTo(12.9f, 19.5f, 12.2f, 19.8f, 11.4f, 19.9f)
                curveTo(10.9f, 19.5f, 10.9f, 18.7f, 11.4f, 18.3f)
                curveTo(11.8f, 17.9f, 12.7f, 17.7f, 13.2f, 18.2f)
                curveTo(13.5f, 18.3f, 13.6f, 18.8f, 13.6f, 19.1f)
                moveTo(20f, 13.4f)
                curveTo(19.5f, 15.5f, 18.2f, 17.4f, 16.5f, 18.6f)
                lineTo(15f, 16f)
                horizontalLineTo(9f)
                lineTo(7.5f, 18.6f)
                curveTo(5.4f, 17.2f, 4f, 14.8f, 4f, 12f)
                curveTo(4f, 11.5f, 4.1f, 11f, 4.2f, 10.5f)
                curveTo(4.7f, 10.3f, 5.3f, 10f, 6f, 9.7f)
                lineTo(13.1f, 11.6f)
                verticalLineTo(14f)
                curveTo(13.1f, 14.5f, 13.5f, 15f, 14.1f, 15f)
                horizontalLineTo(16.1f)
                curveTo(16.6f, 15f, 17.1f, 14.6f, 17.1f, 14f)
                verticalLineTo(12.6f)
                lineTo(20f, 13.4f)
                close()
            }
        }.build()

        return _Pirate!!
    }

@Suppress("ObjectPropertyName")
private var _Pirate: ImageVector? = null
