package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DownloadCircleOutline: ImageVector
    get() {
        if (_DownloadCircleOutline != null) {
            return _DownloadCircleOutline!!
        }
        _DownloadCircleOutline = ImageVector.Builder(
            name = "DownloadCircleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 17f)
                verticalLineTo(15f)
                horizontalLineTo(16f)
                verticalLineTo(17f)
                horizontalLineTo(8f)
                moveTo(16f, 10f)
                lineTo(12f, 14f)
                lineTo(8f, 10f)
                horizontalLineTo(10.5f)
                verticalLineTo(6f)
                horizontalLineTo(13.5f)
                verticalLineTo(10f)
                horizontalLineTo(16f)
                moveTo(12f, 2f)
                curveTo(17.5f, 2f, 22f, 6.5f, 22f, 12f)
                curveTo(22f, 17.5f, 17.5f, 22f, 12f, 22f)
                curveTo(6.5f, 22f, 2f, 17.5f, 2f, 12f)
                curveTo(2f, 6.5f, 6.5f, 2f, 12f, 2f)
                moveTo(12f, 4f)
                curveTo(7.58f, 4f, 4f, 7.58f, 4f, 12f)
                curveTo(4f, 16.42f, 7.58f, 20f, 12f, 20f)
                curveTo(16.42f, 20f, 20f, 16.42f, 20f, 12f)
                curveTo(20f, 7.58f, 16.42f, 4f, 12f, 4f)
                close()
            }
        }.build()

        return _DownloadCircleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _DownloadCircleOutline: ImageVector? = null
