package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ImageSearchOutline: ImageVector
    get() {
        if (_ImageSearchOutline != null) {
            return _ImageSearchOutline!!
        }
        _ImageSearchOutline = ImageVector.Builder(
            name = "ImageSearchOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.5f, 9f)
                curveTo(16.2f, 9f, 16.79f, 8.76f, 17.27f, 8.27f)
                curveTo(17.76f, 7.79f, 18f, 7.2f, 18f, 6.5f)
                curveTo(18f, 5.83f, 17.76f, 5.23f, 17.27f, 4.73f)
                curveTo(16.79f, 4.23f, 16.2f, 4f, 15.5f, 4f)
                curveTo(14.83f, 4f, 14.23f, 4.23f, 13.73f, 4.73f)
                curveTo(13.23f, 5.23f, 13f, 5.83f, 13f, 6.5f)
                curveTo(13f, 7.2f, 13.23f, 7.79f, 13.73f, 8.27f)
                curveTo(14.23f, 8.76f, 14.83f, 9f, 15.5f, 9f)
                moveTo(19.31f, 8.91f)
                lineTo(22.41f, 12f)
                lineTo(21f, 13.41f)
                lineTo(17.86f, 10.31f)
                curveTo(17.08f, 10.78f, 16.28f, 11f, 15.47f, 11f)
                curveTo(14.22f, 11f, 13.16f, 10.58f, 12.3f, 9.7f)
                curveTo(11.45f, 8.83f, 11f, 7.77f, 11f, 6.5f)
                curveTo(11f, 5.27f, 11.45f, 4.2f, 12.33f, 3.33f)
                curveTo(13.2f, 2.45f, 14.27f, 2f, 15.5f, 2f)
                curveTo(16.77f, 2f, 17.83f, 2.45f, 18.7f, 3.33f)
                curveTo(19.58f, 4.2f, 20f, 5.27f, 20f, 6.5f)
                curveTo(20f, 7.33f, 19.78f, 8.13f, 19.31f, 8.91f)
                moveTo(16.5f, 18f)
                horizontalLineTo(5.5f)
                lineTo(8.25f, 14.5f)
                lineTo(10.22f, 16.83f)
                lineTo(12.94f, 13.31f)
                lineTo(16.5f, 18f)
                moveTo(18f, 13f)
                lineTo(20f, 15f)
                verticalLineTo(20f)
                curveTo(20f, 20.55f, 19.81f, 21f, 19.41f, 21.4f)
                curveTo(19f, 21.79f, 18.53f, 22f, 18f, 22f)
                horizontalLineTo(4f)
                curveTo(3.45f, 22f, 3f, 21.79f, 2.6f, 21.4f)
                curveTo(2.21f, 21f, 2f, 20.55f, 2f, 20f)
                verticalLineTo(6f)
                curveTo(2f, 5.47f, 2.21f, 5f, 2.6f, 4.59f)
                curveTo(3f, 4.19f, 3.45f, 4f, 4f, 4f)
                horizontalLineTo(9.5f)
                curveTo(9.2f, 4.64f, 9.03f, 5.31f, 9f, 6f)
                horizontalLineTo(4f)
                verticalLineTo(20f)
                horizontalLineTo(18f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _ImageSearchOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ImageSearchOutline: ImageVector? = null
