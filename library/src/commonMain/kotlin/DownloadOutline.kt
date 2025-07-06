package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DownloadOutline: ImageVector
    get() {
        if (_DownloadOutline != null) {
            return _DownloadOutline!!
        }
        _DownloadOutline = ImageVector.Builder(
            name = "DownloadOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 5f)
                verticalLineTo(11f)
                horizontalLineTo(14.17f)
                lineTo(12f, 13.17f)
                lineTo(9.83f, 11f)
                horizontalLineTo(11f)
                verticalLineTo(5f)
                horizontalLineTo(13f)
                moveTo(15f, 3f)
                horizontalLineTo(9f)
                verticalLineTo(9f)
                horizontalLineTo(5f)
                lineTo(12f, 16f)
                lineTo(19f, 9f)
                horizontalLineTo(15f)
                verticalLineTo(3f)
                moveTo(19f, 18f)
                horizontalLineTo(5f)
                verticalLineTo(20f)
                horizontalLineTo(19f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _DownloadOutline!!
    }

@Suppress("ObjectPropertyName")
private var _DownloadOutline: ImageVector? = null
