package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DownloadOff: ImageVector
    get() {
        if (_DownloadOff != null) {
            return _DownloadOff!!
        }
        _DownloadOff = ImageVector.Builder(
            name = "DownloadOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.84f, 22.73f)
                lineTo(18.11f, 20f)
                horizontalLineTo(5f)
                verticalLineTo(18f)
                horizontalLineTo(16.11f)
                lineTo(13.06f, 14.95f)
                lineTo(12f, 16f)
                lineTo(5f, 9f)
                horizontalLineTo(7.11f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                moveTo(19f, 9f)
                horizontalLineTo(15f)
                verticalLineTo(3f)
                horizontalLineTo(9f)
                verticalLineTo(5.8f)
                lineTo(15.6f, 12.4f)
                lineTo(19f, 9f)
                close()
            }
        }.build()

        return _DownloadOff!!
    }

@Suppress("ObjectPropertyName")
private var _DownloadOff: ImageVector? = null
