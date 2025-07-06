package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BusWrench: ImageVector
    get() {
        if (_BusWrench != null) {
            return _BusWrench!!
        }
        _BusWrench = ImageVector.Builder(
            name = "BusWrench",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 13f)
                verticalLineTo(6f)
                curveTo(20f, 2.5f, 16.42f, 2f, 12f, 2f)
                curveTo(7.58f, 2f, 4f, 2.5f, 4f, 6f)
                verticalLineTo(16f)
                curveTo(4f, 16.88f, 4.39f, 17.67f, 5f, 18.22f)
                verticalLineTo(20f)
                curveTo(5f, 20.27f, 5.11f, 20.5f, 5.29f, 20.71f)
                curveTo(5.5f, 20.9f, 5.74f, 21f, 6f, 21f)
                horizontalLineTo(7f)
                curveTo(7.27f, 21f, 7.5f, 20.9f, 7.71f, 20.71f)
                curveTo(7.9f, 20.5f, 8f, 20.27f, 8f, 20f)
                verticalLineTo(19f)
                horizontalLineTo(12f)
                curveTo(11.37f, 18.16f, 11f, 17.13f, 11f, 16f)
                curveTo(11f, 13.24f, 13.24f, 11f, 16f, 11f)
                curveTo(17.64f, 11f, 19.09f, 11.79f, 20f, 13f)
                moveTo(16f, 11f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                horizontalLineTo(18f)
                verticalLineTo(11f)
                horizontalLineTo(16f)
                moveTo(6.44f, 16.56f)
                curveTo(6.16f, 16.28f, 6f, 15.9f, 6f, 15.5f)
                curveTo(6f, 15.1f, 6.16f, 14.72f, 6.44f, 14.44f)
                curveTo(6.72f, 14.16f, 7.1f, 14f, 7.5f, 14f)
                curveTo(7.9f, 14f, 8.28f, 14.16f, 8.56f, 14.44f)
                curveTo(8.84f, 14.72f, 9f, 15.1f, 9f, 15.5f)
                curveTo(9f, 15.9f, 8.84f, 16.28f, 8.56f, 16.56f)
                curveTo(8.28f, 16.84f, 7.9f, 17f, 7.5f, 17f)
                curveTo(7.1f, 17f, 6.72f, 16.84f, 6.44f, 16.56f)
                moveTo(15.5f, 16.92f)
                lineTo(13.29f, 14.71f)
                curveTo(13.11f, 15.1f, 13f, 15.54f, 13f, 16f)
                curveTo(13f, 17.66f, 14.34f, 19f, 16f, 19f)
                curveTo(16.46f, 19f, 16.9f, 18.9f, 17.29f, 18.71f)
                lineTo(21.29f, 22.71f)
                lineTo(22.71f, 21.29f)
                lineTo(18.71f, 17.29f)
                curveTo(18.9f, 16.9f, 19f, 16.46f, 19f, 16f)
                curveTo(19f, 14.34f, 17.66f, 13f, 16f, 13f)
                curveTo(15.54f, 13f, 15.1f, 13.11f, 14.71f, 13.29f)
                lineTo(16.91f, 15.5f)
                lineTo(15.5f, 16.91f)
                close()
            }
        }.build()

        return _BusWrench!!
    }

@Suppress("ObjectPropertyName")
private var _BusWrench: ImageVector? = null
