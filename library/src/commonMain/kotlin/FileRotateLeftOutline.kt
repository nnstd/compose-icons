package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileRotateLeftOutline: ImageVector
    get() {
        if (_FileRotateLeftOutline != null) {
            return _FileRotateLeftOutline!!
        }
        _FileRotateLeftOutline = ImageVector.Builder(
            name = "FileRotateLeftOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 11f)
                curveTo(4f, 6.58f, 7.58f, 3f, 12f, 3f)
                lineTo(13f, 3.06f)
                verticalLineTo(5.08f)
                lineTo(12f, 5f)
                curveTo(8.69f, 5f, 6f, 7.69f, 6f, 11f)
                horizontalLineTo(9f)
                lineTo(5f, 15f)
                lineTo(1f, 11f)
                horizontalLineTo(4f)
                moveTo(17f, 7f)
                horizontalLineTo(13f)
                curveTo(11.9f, 7f, 11f, 7.9f, 11f, 9f)
                verticalLineTo(18f)
                curveTo(11f, 19.11f, 11.9f, 20f, 13f, 20f)
                horizontalLineTo(19f)
                curveTo(20.11f, 20f, 21f, 19.11f, 21f, 18f)
                verticalLineTo(11f)
                lineTo(17f, 7f)
                moveTo(19f, 18f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(19f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _FileRotateLeftOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FileRotateLeftOutline: ImageVector? = null
