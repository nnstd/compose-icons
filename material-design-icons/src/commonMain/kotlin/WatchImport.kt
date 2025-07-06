package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WatchImport: ImageVector
    get() {
        if (_WatchImport != null) {
            return _WatchImport!!
        }
        _WatchImport = ImageVector.Builder(
            name = "WatchImport",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 11f)
                horizontalLineTo(7f)
                lineTo(4.5f, 8.5f)
                lineTo(5.92f, 7.08f)
                lineTo(10.84f, 12f)
                lineTo(5.92f, 16.92f)
                lineTo(4.5f, 15.5f)
                lineTo(7f, 13f)
                horizontalLineTo(2f)
                verticalLineTo(11f)
                moveTo(12f, 18f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 12f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 6f)
                curveTo(10.6f, 6f, 9.31f, 6.5f, 8.29f, 7.29f)
                lineTo(6.87f, 5.87f)
                lineTo(7.05f, 5.73f)
                lineTo(8f, 0f)
                horizontalLineTo(16f)
                lineTo(16.95f, 5.73f)
                curveTo(18.81f, 7.19f, 20f, 9.45f, 20f, 12f)
                curveTo(20f, 14.54f, 18.81f, 16.81f, 16.95f, 18.27f)
                lineTo(16f, 24f)
                horizontalLineTo(8f)
                lineTo(7.05f, 18.27f)
                lineTo(6.87f, 18.13f)
                lineTo(8.29f, 16.71f)
                curveTo(9.31f, 17.5f, 10.6f, 18f, 12f, 18f)
                close()
            }
        }.build()

        return _WatchImport!!
    }

@Suppress("ObjectPropertyName")
private var _WatchImport: ImageVector? = null
