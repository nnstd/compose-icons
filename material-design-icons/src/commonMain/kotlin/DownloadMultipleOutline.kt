package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DownloadMultipleOutline: ImageVector
    get() {
        if (_DownloadMultipleOutline != null) {
            return _DownloadMultipleOutline!!
        }
        _DownloadMultipleOutline = ImageVector.Builder(
            name = "DownloadMultipleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 14f)
                lineTo(19f, 7f)
                horizontalLineTo(15f)
                verticalLineTo(1f)
                horizontalLineTo(9f)
                verticalLineTo(7f)
                horizontalLineTo(5f)
                lineTo(12f, 14f)
                moveTo(12f, 11.17f)
                lineTo(9.83f, 9f)
                horizontalLineTo(11f)
                verticalLineTo(3f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(14.17f)
                lineTo(12f, 11.17f)
                moveTo(5f, 16f)
                verticalLineTo(18f)
                horizontalLineTo(19f)
                verticalLineTo(16f)
                horizontalLineTo(5f)
                moveTo(5f, 22f)
                verticalLineTo(20f)
                horizontalLineTo(19f)
                verticalLineTo(22f)
                horizontalLineTo(5f)
                close()
            }
        }.build()

        return _DownloadMultipleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _DownloadMultipleOutline: ImageVector? = null
