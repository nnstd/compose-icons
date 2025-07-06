package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ApplicationBraces: ImageVector
    get() {
        if (_ApplicationBraces != null) {
            return _ApplicationBraces!!
        }
        _ApplicationBraces = ImageVector.Builder(
            name = "ApplicationBraces",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 2f)
                horizontalLineTo(3f)
                curveTo(1.9f, 2f, 1f, 2.9f, 1f, 4f)
                verticalLineTo(20f)
                curveTo(1f, 21.1f, 1.9f, 22f, 3f, 22f)
                horizontalLineTo(21f)
                curveTo(22.1f, 22f, 23f, 21.1f, 23f, 20f)
                verticalLineTo(4f)
                curveTo(23f, 2.9f, 22.1f, 2f, 21f, 2f)
                moveTo(11f, 11f)
                horizontalLineTo(9f)
                verticalLineTo(12.5f)
                curveTo(9f, 13.6f, 8.1f, 14.5f, 7f, 14.5f)
                curveTo(8.1f, 14.5f, 9f, 15.4f, 9f, 16.5f)
                verticalLineTo(18f)
                horizontalLineTo(11f)
                verticalLineTo(20f)
                horizontalLineTo(9f)
                curveTo(7.9f, 20f, 7f, 19.1f, 7f, 18f)
                verticalLineTo(17.5f)
                curveTo(7f, 16.4f, 6.1f, 15.5f, 5f, 15.5f)
                verticalLineTo(13.5f)
                curveTo(6.1f, 13.5f, 7f, 12.6f, 7f, 11.5f)
                verticalLineTo(11f)
                curveTo(7f, 9.9f, 7.9f, 9f, 9f, 9f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                moveTo(19f, 15.5f)
                curveTo(17.9f, 15.5f, 17f, 16.4f, 17f, 17.5f)
                verticalLineTo(18f)
                curveTo(17f, 19.1f, 16.1f, 20f, 15f, 20f)
                horizontalLineTo(13f)
                verticalLineTo(18f)
                horizontalLineTo(15f)
                verticalLineTo(16.5f)
                curveTo(15f, 15.4f, 15.9f, 14.5f, 17f, 14.5f)
                curveTo(15.9f, 14.5f, 15f, 13.6f, 15f, 12.5f)
                verticalLineTo(11f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(15f)
                curveTo(16.1f, 9f, 17f, 9.9f, 17f, 11f)
                verticalLineTo(11.5f)
                curveTo(17f, 12.6f, 17.9f, 13.5f, 19f, 13.5f)
                verticalLineTo(15.5f)
                moveTo(21f, 7f)
                horizontalLineTo(3f)
                verticalLineTo(4f)
                horizontalLineTo(21f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _ApplicationBraces!!
    }

@Suppress("ObjectPropertyName")
private var _ApplicationBraces: ImageVector? = null
