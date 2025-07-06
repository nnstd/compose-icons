package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Steering: ImageVector
    get() {
        if (_Steering != null) {
            return _Steering!!
        }
        _Steering = ImageVector.Builder(
            name = "Steering",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 19.92f)
                curveTo(14.8f, 19.7f, 16.35f, 18.95f, 17.65f, 17.65f)
                curveTo(18.95f, 16.35f, 19.7f, 14.8f, 19.92f, 13f)
                horizontalLineTo(16.92f)
                curveTo(16.7f, 14f, 16.24f, 14.84f, 15.54f, 15.54f)
                curveTo(14.84f, 16.24f, 14f, 16.7f, 13f, 16.92f)
                verticalLineTo(19.92f)
                moveTo(10f, 8f)
                horizontalLineTo(14f)
                lineTo(17f, 11f)
                horizontalLineTo(19.92f)
                curveTo(19.67f, 9.05f, 18.79f, 7.38f, 17.27f, 6f)
                curveTo(15.76f, 4.66f, 14f, 4f, 12f, 4f)
                curveTo(10f, 4f, 8.24f, 4.66f, 6.73f, 6f)
                curveTo(5.21f, 7.38f, 4.33f, 9.05f, 4.08f, 11f)
                horizontalLineTo(7f)
                lineTo(10f, 8f)
                moveTo(11f, 19.92f)
                verticalLineTo(16.92f)
                curveTo(10f, 16.7f, 9.16f, 16.24f, 8.46f, 15.54f)
                curveTo(7.76f, 14.84f, 7.3f, 14f, 7.08f, 13f)
                horizontalLineTo(4.08f)
                curveTo(4.3f, 14.77f, 5.05f, 16.3f, 6.35f, 17.6f)
                curveTo(7.65f, 18.9f, 9.2f, 19.67f, 11f, 19.92f)
                moveTo(12f, 2f)
                curveTo(14.75f, 2f, 17.1f, 3f, 19.05f, 4.95f)
                curveTo(21f, 6.9f, 22f, 9.25f, 22f, 12f)
                curveTo(22f, 14.75f, 21f, 17.1f, 19.05f, 19.05f)
                curveTo(17.1f, 21f, 14.75f, 22f, 12f, 22f)
                curveTo(9.25f, 22f, 6.9f, 21f, 4.95f, 19.05f)
                curveTo(3f, 17.1f, 2f, 14.75f, 2f, 12f)
                curveTo(2f, 9.25f, 3f, 6.9f, 4.95f, 4.95f)
                curveTo(6.9f, 3f, 9.25f, 2f, 12f, 2f)
                close()
            }
        }.build()

        return _Steering!!
    }

@Suppress("ObjectPropertyName")
private var _Steering: ImageVector? = null
