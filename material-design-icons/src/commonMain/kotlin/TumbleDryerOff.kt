package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TumbleDryerOff: ImageVector
    get() {
        if (_TumbleDryerOff != null) {
            return _TumbleDryerOff!!
        }
        _TumbleDryerOff = ImageVector.Builder(
            name = "TumbleDryerOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(4f, 5.89f)
                verticalLineTo(20f)
                curveTo(4f, 21.11f, 4.89f, 22f, 6f, 22f)
                horizontalLineTo(18f)
                curveTo(18.58f, 22f, 19.1f, 21.75f, 19.46f, 21.35f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                moveTo(12f, 20f)
                curveTo(8.69f, 20f, 6f, 17.31f, 6f, 14f)
                curveTo(6f, 12.32f, 6.7f, 10.8f, 7.82f, 9.71f)
                lineTo(8.61f, 10.5f)
                horizontalLineTo(8.11f)
                curveTo(7.85f, 12.29f, 8.32f, 13.64f, 9.42f, 14.71f)
                curveTo(10f, 15.33f, 10.24f, 16.12f, 10f, 17.5f)
                horizontalLineTo(11.89f)
                curveTo(12.16f, 15.71f, 11.68f, 14.36f, 10.58f, 13.29f)
                curveTo(10.22f, 12.91f, 10f, 12.44f, 9.95f, 11.84f)
                lineTo(14.03f, 15.92f)
                curveTo(14.11f, 16.35f, 14.11f, 16.86f, 14f, 17.5f)
                horizontalLineTo(15.61f)
                lineTo(16.29f, 18.18f)
                curveTo(15.2f, 19.3f, 13.69f, 20f, 12f, 20f)
                moveTo(11.25f, 8.05f)
                curveTo(11.5f, 8f, 11.75f, 8f, 12f, 8f)
                curveTo(15.31f, 8f, 18f, 10.69f, 18f, 14f)
                curveTo(18f, 14.25f, 18f, 14.5f, 17.95f, 14.75f)
                lineTo(20f, 16.8f)
                verticalLineTo(4f)
                curveTo(20f, 2.9f, 19.11f, 2f, 18f, 2f)
                horizontalLineTo(6f)
                curveTo(5.76f, 2f, 5.54f, 2.05f, 5.33f, 2.13f)
                lineTo(11.25f, 8.05f)
                moveTo(10f, 4f)
                curveTo(10.55f, 4f, 11f, 4.45f, 11f, 5f)
                reflectiveCurveTo(10.55f, 6f, 10f, 6f)
                reflectiveCurveTo(9f, 5.55f, 9f, 5f)
                reflectiveCurveTo(9.45f, 4f, 10f, 4f)
                close()
            }
        }.build()

        return _TumbleDryerOff!!
    }

@Suppress("ObjectPropertyName")
private var _TumbleDryerOff: ImageVector? = null
