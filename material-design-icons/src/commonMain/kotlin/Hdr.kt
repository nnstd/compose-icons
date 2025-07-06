package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Hdr: ImageVector
    get() {
        if (_Hdr != null) {
            return _Hdr!!
        }
        _Hdr = ImageVector.Builder(
            name = "Hdr",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 11.5f)
                verticalLineTo(10.5f)
                curveTo(21f, 9.7f, 20.3f, 9f, 19.5f, 9f)
                horizontalLineTo(16f)
                verticalLineTo(15f)
                horizontalLineTo(17.5f)
                verticalLineTo(13f)
                horizontalLineTo(18.6f)
                lineTo(19.5f, 15f)
                horizontalLineTo(21f)
                lineTo(20.1f, 12.9f)
                curveTo(20.6f, 12.6f, 21f, 12.1f, 21f, 11.5f)
                moveTo(19.5f, 11.5f)
                horizontalLineTo(17.5f)
                verticalLineTo(10.5f)
                horizontalLineTo(19.5f)
                verticalLineTo(11.5f)
                moveTo(6.5f, 11f)
                horizontalLineTo(4.5f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                verticalLineTo(15f)
                horizontalLineTo(4.5f)
                verticalLineTo(12.5f)
                horizontalLineTo(6.5f)
                verticalLineTo(15f)
                horizontalLineTo(8f)
                verticalLineTo(9f)
                horizontalLineTo(6.5f)
                verticalLineTo(11f)
                moveTo(13f, 9f)
                horizontalLineTo(9.5f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
                curveTo(13.8f, 15f, 14.5f, 14.3f, 14.5f, 13.5f)
                verticalLineTo(10.5f)
                curveTo(14.5f, 9.7f, 13.8f, 9f, 13f, 9f)
                moveTo(13f, 13.5f)
                horizontalLineTo(11f)
                verticalLineTo(10.5f)
                horizontalLineTo(13f)
                verticalLineTo(13.5f)
                close()
            }
        }.build()

        return _Hdr!!
    }

@Suppress("ObjectPropertyName")
private var _Hdr: ImageVector? = null
