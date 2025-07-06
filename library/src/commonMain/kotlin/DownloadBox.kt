package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DownloadBox: ImageVector
    get() {
        if (_DownloadBox != null) {
            return _DownloadBox!!
        }
        _DownloadBox = ImageVector.Builder(
            name = "DownloadBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 3f)
                horizontalLineTo(19f)
                curveTo(20.11f, 3f, 21f, 3.9f, 21f, 5f)
                verticalLineTo(19f)
                curveTo(21f, 20.11f, 20.11f, 21f, 19f, 21f)
                horizontalLineTo(5f)
                curveTo(3.9f, 21f, 3f, 20.11f, 3f, 19f)
                verticalLineTo(5f)
                curveTo(3f, 3.9f, 3.9f, 3f, 5f, 3f)
                moveTo(8f, 17f)
                horizontalLineTo(16f)
                verticalLineTo(15f)
                horizontalLineTo(8f)
                verticalLineTo(17f)
                moveTo(16f, 10f)
                horizontalLineTo(13.5f)
                verticalLineTo(7f)
                horizontalLineTo(10.5f)
                verticalLineTo(10f)
                horizontalLineTo(8f)
                lineTo(12f, 14f)
                lineTo(16f, 10f)
                close()
            }
        }.build()

        return _DownloadBox!!
    }

@Suppress("ObjectPropertyName")
private var _DownloadBox: ImageVector? = null
