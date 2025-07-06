package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VideoWireless: ImageVector
    get() {
        if (_VideoWireless != null) {
            return _VideoWireless!!
        }
        _VideoWireless = ImageVector.Builder(
            name = "VideoWireless",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 14.5f)
                verticalLineTo(11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 10f)
                horizontalLineTo(4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 11f)
                verticalLineTo(21f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 22f)
                horizontalLineTo(16f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 21f)
                verticalLineTo(17.5f)
                lineTo(21f, 21.5f)
                verticalLineTo(10.5f)
                moveTo(3f, 3.86f)
                lineTo(4.4f, 5.24f)
                curveTo(7.5f, 2.19f, 12.5f, 2.19f, 15.6f, 5.24f)
                lineTo(17f, 3.86f)
                curveTo(13.14f, 0.05f, 6.87f, 0.05f, 3f, 3.86f)
                moveTo(5.8f, 6.62f)
                lineTo(7.2f, 8f)
                curveTo(8.75f, 6.5f, 11.25f, 6.5f, 12.8f, 8f)
                lineTo(14.2f, 6.62f)
                curveTo(11.88f, 4.34f, 8.12f, 4.34f, 5.8f, 6.62f)
                close()
            }
        }.build()

        return _VideoWireless!!
    }

@Suppress("ObjectPropertyName")
private var _VideoWireless: ImageVector? = null
