package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WatchVibrate: ImageVector
    get() {
        if (_WatchVibrate != null) {
            return _WatchVibrate!!
        }
        _WatchVibrate = ImageVector.Builder(
            name = "WatchVibrate",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 17f)
                verticalLineTo(7f)
                horizontalLineTo(5f)
                verticalLineTo(17f)
                horizontalLineTo(3f)
                moveTo(19f, 17f)
                verticalLineTo(7f)
                horizontalLineTo(21f)
                verticalLineTo(17f)
                horizontalLineTo(19f)
                moveTo(22f, 9f)
                horizontalLineTo(24f)
                verticalLineTo(15f)
                horizontalLineTo(22f)
                verticalLineTo(9f)
                moveTo(0f, 15f)
                verticalLineTo(9f)
                horizontalLineTo(2f)
                verticalLineTo(15f)
                horizontalLineTo(0f)
                moveTo(17.96f, 11.97f)
                curveTo(17.96f, 13.87f, 17.07f, 15.57f, 15.68f, 16.67f)
                lineTo(14.97f, 20.95f)
                horizontalLineTo(9f)
                lineTo(8.27f, 16.67f)
                curveTo(6.88f, 15.57f, 6f, 13.87f, 6f, 11.97f)
                curveTo(6f, 10.07f, 6.88f, 8.37f, 8.27f, 7.28f)
                lineTo(9f, 3f)
                horizontalLineTo(14.97f)
                lineTo(15.68f, 7.28f)
                curveTo(17.07f, 8.37f, 17.96f, 10.07f, 17.96f, 11.97f)
                moveTo(7.5f, 11.97f)
                curveTo(7.5f, 14.45f, 9.5f, 16.46f, 11.97f, 16.46f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.46f, 11.97f)
                curveTo(16.46f, 9.5f, 14.45f, 7.5f, 11.97f, 7.5f)
                arcTo(4.47f, 4.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.5f, 11.97f)
                close()
            }
        }.build()

        return _WatchVibrate!!
    }

@Suppress("ObjectPropertyName")
private var _WatchVibrate: ImageVector? = null
