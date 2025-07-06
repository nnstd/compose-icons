package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileGifBox: ImageVector
    get() {
        if (_FileGifBox != null) {
            return _FileGifBox!!
        }
        _FileGifBox = ImageVector.Builder(
            name = "FileGifBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.1f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(20.1f, 21f, 21f, 20.1f, 21f, 19f)
                verticalLineTo(5f)
                curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                moveTo(10f, 10.5f)
                horizontalLineTo(7.5f)
                verticalLineTo(13.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(12f)
                horizontalLineTo(10f)
                verticalLineTo(13.7f)
                curveTo(10f, 14.4f, 9.5f, 15f, 8.7f, 15f)
                horizontalLineTo(7.3f)
                curveTo(6.5f, 15f, 6f, 14.3f, 6f, 13.7f)
                verticalLineTo(10.4f)
                curveTo(6f, 9.7f, 6.5f, 9f, 7.3f, 9f)
                horizontalLineTo(8.6f)
                curveTo(9.5f, 9f, 10f, 9.7f, 10f, 10.3f)
                verticalLineTo(10.5f)
                moveTo(13f, 15f)
                horizontalLineTo(11.5f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                moveTo(17.5f, 10.5f)
                horizontalLineTo(16f)
                verticalLineTo(11.5f)
                horizontalLineTo(17.5f)
                verticalLineTo(13f)
                horizontalLineTo(16f)
                verticalLineTo(15f)
                horizontalLineTo(14.5f)
                verticalLineTo(9f)
                horizontalLineTo(17.5f)
                verticalLineTo(10.5f)
                close()
            }
        }.build()

        return _FileGifBox!!
    }

@Suppress("ObjectPropertyName")
private var _FileGifBox: ImageVector? = null
