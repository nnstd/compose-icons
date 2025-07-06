package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MagnifyRemoveCursor: ImageVector
    get() {
        if (_MagnifyRemoveCursor != null) {
            return _MagnifyRemoveCursor!!
        }
        _MagnifyRemoveCursor = ImageVector.Builder(
            name = "MagnifyRemoveCursor",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 1f)
                verticalLineTo(8f)
                lineTo(8f, 1f)
                horizontalLineTo(1f)
                moveTo(18f, 16f)
                horizontalLineTo(17.42f)
                lineTo(16.61f, 15.19f)
                curveTo(17.5f, 14f, 18f, 12.5f, 18f, 11f)
                curveTo(18f, 7.13f, 14.87f, 4f, 11f, 4f)
                curveTo(9.5f, 4f, 8f, 4.5f, 6.79f, 5.4f)
                curveTo(3.7f, 7.72f, 3.07f, 12.11f, 5.39f, 15.2f)
                curveTo(7.71f, 18.29f, 12.1f, 18.92f, 15.19f, 16.6f)
                lineTo(16f, 17.41f)
                verticalLineTo(18f)
                lineTo(21f, 23f)
                lineTo(23f, 21f)
                lineTo(18f, 16f)
                moveTo(14.6f, 13.16f)
                lineTo(13.18f, 14.58f)
                lineTo(11.06f, 12.45f)
                lineTo(8.94f, 14.58f)
                lineTo(7.5f, 13.16f)
                lineTo(9.65f, 11.04f)
                lineTo(7.5f, 8.92f)
                lineTo(8.94f, 7.5f)
                lineTo(11.06f, 9.63f)
                lineTo(13.18f, 7.5f)
                lineTo(14.6f, 8.92f)
                lineTo(12.47f, 11.04f)
                lineTo(14.6f, 13.16f)
                close()
            }
        }.build()

        return _MagnifyRemoveCursor!!
    }

@Suppress("ObjectPropertyName")
private var _MagnifyRemoveCursor: ImageVector? = null
