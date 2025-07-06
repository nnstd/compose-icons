package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SteeringOff: ImageVector
    get() {
        if (_SteeringOff != null) {
            return _SteeringOff!!
        }
        _SteeringOff = ImageVector.Builder(
            name = "SteeringOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 5.27f)
                lineTo(3.28f, 4f)
                lineTo(20f, 20.72f)
                lineTo(18.73f, 22f)
                lineTo(17.25f, 20.5f)
                curveTo(15.7f, 21.5f, 13.95f, 22f, 12f, 22f)
                curveTo(9.25f, 22f, 6.9f, 21f, 4.95f, 19.05f)
                curveTo(3f, 17.1f, 2f, 14.75f, 2f, 12f)
                curveTo(2f, 10.05f, 2.5f, 8.3f, 3.5f, 6.75f)
                lineTo(2f, 5.27f)
                moveTo(13f, 19.92f)
                curveTo(14f, 19.8f, 14.93f, 19.5f, 15.78f, 19.05f)
                lineTo(13.5f, 16.78f)
                curveTo(13.34f, 16.84f, 13.16f, 16.88f, 13f, 16.92f)
                verticalLineTo(19.92f)
                moveTo(4.08f, 11f)
                horizontalLineTo(7f)
                lineTo(7.37f, 10.63f)
                lineTo(4.96f, 8.23f)
                curveTo(4.5f, 9.08f, 4.21f, 10f, 4.08f, 11f)
                moveTo(19.92f, 13f)
                horizontalLineTo(16.92f)
                curveTo(16.8f, 13.54f, 16.6f, 14.05f, 16.33f, 14.5f)
                lineTo(9.91f, 8.09f)
                lineTo(10f, 8f)
                horizontalLineTo(14f)
                lineTo(17f, 11f)
                horizontalLineTo(19.92f)
                curveTo(19.67f, 9.05f, 18.79f, 7.38f, 17.27f, 6f)
                curveTo(15.76f, 4.66f, 14f, 4f, 12f, 4f)
                curveTo(10.26f, 4f, 8.71f, 4.5f, 7.34f, 5.5f)
                lineTo(5.91f, 4.09f)
                curveTo(7.66f, 2.71f, 9.69f, 2f, 12f, 2f)
                curveTo(14.75f, 2f, 17.1f, 3f, 19.05f, 4.95f)
                curveTo(21f, 6.9f, 22f, 9.25f, 22f, 12f)
                curveTo(22f, 14.31f, 21.29f, 16.34f, 19.91f, 18.09f)
                lineTo(18.5f, 16.67f)
                curveTo(19.28f, 15.59f, 19.76f, 14.36f, 19.92f, 13f)
                moveTo(11f, 19.92f)
                verticalLineTo(16.92f)
                curveTo(10f, 16.7f, 9.16f, 16.24f, 8.46f, 15.54f)
                curveTo(7.76f, 14.84f, 7.3f, 14f, 7.08f, 13f)
                horizontalLineTo(4.08f)
                curveTo(4.3f, 14.77f, 5.05f, 16.3f, 6.35f, 17.6f)
                curveTo(7.65f, 18.9f, 9.2f, 19.67f, 11f, 19.92f)
                close()
            }
        }.build()

        return _SteeringOff!!
    }

@Suppress("ObjectPropertyName")
private var _SteeringOff: ImageVector? = null
