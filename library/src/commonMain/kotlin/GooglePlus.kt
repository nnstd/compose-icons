package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GooglePlus: ImageVector
    get() {
        if (_GooglePlus != null) {
            return _GooglePlus!!
        }
        _GooglePlus = ImageVector.Builder(
            name = "GooglePlus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 11f)
                horizontalLineTo(21f)
                verticalLineTo(9f)
                horizontalLineTo(19f)
                verticalLineTo(11f)
                horizontalLineTo(17f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                verticalLineTo(15f)
                horizontalLineTo(21f)
                verticalLineTo(13f)
                horizontalLineTo(23f)
                moveTo(8f, 11f)
                verticalLineTo(13.4f)
                horizontalLineTo(12f)
                curveTo(11.8f, 14.4f, 10.8f, 16.4f, 8f, 16.4f)
                curveTo(5.6f, 16.4f, 3.7f, 14.4f, 3.7f, 12f)
                curveTo(3.7f, 9.6f, 5.6f, 7.6f, 8f, 7.6f)
                curveTo(9.4f, 7.6f, 10.3f, 8.2f, 10.8f, 8.7f)
                lineTo(12.7f, 6.9f)
                curveTo(11.5f, 5.7f, 9.9f, 5f, 8f, 5f)
                curveTo(4.1f, 5f, 1f, 8.1f, 1f, 12f)
                curveTo(1f, 15.9f, 4.1f, 19f, 8f, 19f)
                curveTo(12f, 19f, 14.7f, 16.2f, 14.7f, 12.2f)
                curveTo(14.7f, 11.7f, 14.7f, 11.4f, 14.6f, 11f)
                horizontalLineTo(8f)
                close()
            }
        }.build()

        return _GooglePlus!!
    }

@Suppress("ObjectPropertyName")
private var _GooglePlus: ImageVector? = null
