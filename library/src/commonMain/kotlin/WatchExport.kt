package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WatchExport: ImageVector
    get() {
        if (_WatchExport != null) {
            return _WatchExport!!
        }
        _WatchExport = ImageVector.Builder(
            name = "WatchExport",
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
                moveTo(12f, 18f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 12f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 6f)
                curveTo(13.4f, 6f, 14.69f, 6.5f, 15.71f, 7.29f)
                lineTo(17.13f, 5.87f)
                lineTo(16.95f, 5.73f)
                lineTo(16f, 0f)
                horizontalLineTo(8f)
                lineTo(7.05f, 5.73f)
                curveTo(5.19f, 7.19f, 4f, 9.46f, 4f, 12f)
                curveTo(4f, 14.55f, 5.19f, 16.81f, 7.05f, 18.27f)
                lineTo(8f, 24f)
                horizontalLineTo(16f)
                lineTo(16.95f, 18.27f)
                lineTo(17.13f, 18.13f)
                lineTo(15.71f, 16.71f)
                curveTo(14.69f, 17.5f, 13.4f, 18f, 12f, 18f)
                close()
            }
        }.build()

        return _WatchExport!!
    }

@Suppress("ObjectPropertyName")
private var _WatchExport: ImageVector? = null
