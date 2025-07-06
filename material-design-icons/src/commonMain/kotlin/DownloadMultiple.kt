package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DownloadMultiple: ImageVector
    get() {
        if (_DownloadMultiple != null) {
            return _DownloadMultiple!!
        }
        _DownloadMultiple = ImageVector.Builder(
            name = "DownloadMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 1f)
                verticalLineTo(7f)
                horizontalLineTo(5f)
                lineTo(12f, 14f)
                lineTo(19f, 7f)
                horizontalLineTo(15f)
                verticalLineTo(1f)
                horizontalLineTo(9f)
                moveTo(5f, 16f)
                verticalLineTo(18f)
                horizontalLineTo(19f)
                verticalLineTo(16f)
                horizontalLineTo(5f)
                moveTo(5f, 20f)
                verticalLineTo(22f)
                horizontalLineTo(19f)
                verticalLineTo(20f)
                horizontalLineTo(5f)
                close()
            }
        }.build()

        return _DownloadMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _DownloadMultiple: ImageVector? = null
