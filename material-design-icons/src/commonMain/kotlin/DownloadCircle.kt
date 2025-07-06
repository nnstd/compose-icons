package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DownloadCircle: ImageVector
    get() {
        if (_DownloadCircle != null) {
            return _DownloadCircle!!
        }
        _DownloadCircle = ImageVector.Builder(
            name = "DownloadCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(17.5f, 2f, 22f, 6.5f, 22f, 12f)
                curveTo(22f, 17.5f, 17.5f, 22f, 12f, 22f)
                curveTo(6.5f, 22f, 2f, 17.5f, 2f, 12f)
                curveTo(2f, 6.5f, 6.5f, 2f, 12f, 2f)
                moveTo(8f, 17f)
                horizontalLineTo(16f)
                verticalLineTo(15f)
                horizontalLineTo(8f)
                verticalLineTo(17f)
                moveTo(16f, 10f)
                horizontalLineTo(13.5f)
                verticalLineTo(6f)
                horizontalLineTo(10.5f)
                verticalLineTo(10f)
                horizontalLineTo(8f)
                lineTo(12f, 14f)
                lineTo(16f, 10f)
                close()
            }
        }.build()

        return _DownloadCircle!!
    }

@Suppress("ObjectPropertyName")
private var _DownloadCircle: ImageVector? = null
