package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DownloadOffOutline: ImageVector
    get() {
        if (_DownloadOffOutline != null) {
            return _DownloadOffOutline!!
        }
        _DownloadOffOutline = ImageVector.Builder(
            name = "DownloadOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(7.11f, 9f)
                horizontalLineTo(5f)
                lineTo(12f, 16f)
                lineTo(13.06f, 14.95f)
                lineTo(16.11f, 18f)
                horizontalLineTo(5f)
                verticalLineTo(20f)
                horizontalLineTo(18.11f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                moveTo(11f, 5f)
                horizontalLineTo(13f)
                verticalLineTo(9.8f)
                lineTo(15.6f, 12.4f)
                lineTo(19f, 9f)
                horizontalLineTo(15f)
                verticalLineTo(3f)
                horizontalLineTo(9f)
                verticalLineTo(5.8f)
                lineTo(11f, 7.8f)
                verticalLineTo(5f)
                close()
            }
        }.build()

        return _DownloadOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _DownloadOffOutline: ImageVector? = null
