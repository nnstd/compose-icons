package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WatchExportVariant: ImageVector
    get() {
        if (_WatchExportVariant != null) {
            return _WatchExportVariant!!
        }
        _WatchExportVariant = ImageVector.Builder(
            name = "WatchExportVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 11f)
                horizontalLineTo(19f)
                lineTo(16.5f, 8.5f)
                lineTo(17.92f, 7.08f)
                lineTo(22.84f, 12f)
                lineTo(17.92f, 16.92f)
                lineTo(16.5f, 15.5f)
                lineTo(19f, 13f)
                horizontalLineTo(14f)
                verticalLineTo(11f)
                moveTo(8f, 0f)
                horizontalLineTo(16f)
                lineTo(16.83f, 5f)
                horizontalLineTo(17f)
                curveTo(17.28f, 5f, 17.54f, 5.06f, 17.78f, 5.16f)
                lineTo(15.94f, 7f)
                horizontalLineTo(7f)
                verticalLineTo(17f)
                horizontalLineTo(15.94f)
                lineTo(17.78f, 18.84f)
                curveTo(17.54f, 18.94f, 17.28f, 19f, 17f, 19f)
                horizontalLineTo(16.83f)
                lineTo(16f, 24f)
                horizontalLineTo(8f)
                lineTo(7.17f, 19f)
                horizontalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 17f)
                verticalLineTo(7f)
                curveTo(5f, 5.89f, 5.9f, 5f, 7f, 5f)
                horizontalLineTo(7.17f)
                lineTo(8f, 0f)
                close()
            }
        }.build()

        return _WatchExportVariant!!
    }

@Suppress("ObjectPropertyName")
private var _WatchExportVariant: ImageVector? = null
