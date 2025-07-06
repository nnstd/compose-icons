package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HockeySticks: ImageVector
    get() {
        if (_HockeySticks != null) {
            return _HockeySticks!!
        }
        _HockeySticks = ImageVector.Builder(
            name = "HockeySticks",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.68f, 4f)
                horizontalLineTo(14.3f)
                lineTo(12.56f, 8f)
                curveTo(12.53f, 8.04f, 12.45f, 8.22f, 12.31f, 8.5f)
                reflectiveCurveTo(12.06f, 9.04f, 12f, 9.19f)
                lineTo(9.7f, 4f)
                horizontalLineTo(6.32f)
                lineTo(10.41f, 12.84f)
                curveTo(10.5f, 13.06f, 10.73f, 13.59f, 11.11f, 14.43f)
                curveTo(11.5f, 15.28f, 11.78f, 15.91f, 12f, 16.35f)
                lineTo(13.41f, 19.44f)
                curveTo(13.6f, 19.78f, 13.89f, 19.95f, 14.3f, 19.95f)
                lineTo(19f, 20f)
                verticalLineTo(16f)
                horizontalLineTo(15f)
                lineTo(13.6f, 12.84f)
                lineTo(17.68f, 4f)
                moveTo(20.03f, 16f)
                verticalLineTo(20f)
                horizontalLineTo(22f)
                verticalLineTo(17f)
                curveTo(22f, 16.73f, 21.91f, 16.5f, 21.72f, 16.28f)
                curveTo(21.53f, 16.08f, 21.3f, 16f, 21f, 16f)
                horizontalLineTo(20.03f)
                moveTo(5f, 16f)
                verticalLineTo(20f)
                lineTo(9.7f, 19.95f)
                curveTo(10.11f, 19.95f, 10.4f, 19.78f, 10.59f, 19.44f)
                lineTo(11.44f, 17.5f)
                lineTo(9.84f, 14.06f)
                lineTo(9f, 16f)
                horizontalLineTo(5f)
                moveTo(2f, 20f)
                horizontalLineTo(3.97f)
                verticalLineTo(16f)
                horizontalLineTo(3f)
                curveTo(2.7f, 16f, 2.47f, 16.08f, 2.28f, 16.28f)
                curveTo(2.09f, 16.5f, 2f, 16.73f, 2f, 17f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _HockeySticks!!
    }

@Suppress("ObjectPropertyName")
private var _HockeySticks: ImageVector? = null
