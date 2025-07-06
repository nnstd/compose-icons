package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileRotateRight: ImageVector
    get() {
        if (_FileRotateRight != null) {
            return _FileRotateRight!!
        }
        _FileRotateRight = ImageVector.Builder(
            name = "FileRotateRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 20f)
                curveTo(3.9f, 20f, 3f, 19.11f, 3f, 18f)
                verticalLineTo(9f)
                curveTo(3f, 7.9f, 3.9f, 7f, 5f, 7f)
                horizontalLineTo(9f)
                lineTo(13f, 11f)
                verticalLineTo(18f)
                curveTo(13f, 19.11f, 12.11f, 20f, 11f, 20f)
                horizontalLineTo(5f)
                moveTo(11f, 11.83f)
                lineTo(8.17f, 9f)
                horizontalLineTo(8f)
                verticalLineTo(12f)
                horizontalLineTo(11f)
                verticalLineTo(11.83f)
                moveTo(20f, 11f)
                horizontalLineTo(23f)
                lineTo(19f, 15f)
                lineTo(15f, 11f)
                horizontalLineTo(18f)
                curveTo(18f, 7.69f, 15.31f, 5f, 12f, 5f)
                lineTo(11f, 5.08f)
                verticalLineTo(3.06f)
                lineTo(12f, 3f)
                curveTo(16.42f, 3f, 20f, 6.58f, 20f, 11f)
            }
        }.build()

        return _FileRotateRight!!
    }

@Suppress("ObjectPropertyName")
private var _FileRotateRight: ImageVector? = null
