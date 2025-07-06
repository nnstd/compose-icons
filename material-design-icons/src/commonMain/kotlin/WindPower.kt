package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WindPower: ImageVector
    get() {
        if (_WindPower != null) {
            return _WindPower!!
        }
        _WindPower = ImageVector.Builder(
            name = "WindPower",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 3f)
                horizontalLineTo(10f)
                verticalLineTo(5f)
                horizontalLineTo(4f)
                verticalLineTo(3f)
                moveTo(1f, 7f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                horizontalLineTo(1f)
                verticalLineTo(7f)
                moveTo(3f, 19f)
                horizontalLineTo(8f)
                verticalLineTo(21f)
                horizontalLineTo(3f)
                verticalLineTo(19f)
                moveTo(13.73f, 10.61f)
                curveTo(14.5f, 10.84f, 15.03f, 11.39f, 15.3f, 12.07f)
                lineTo(19.57f, 4.96f)
                curveTo(20.22f, 3.88f, 19.87f, 2.5f, 18.79f, 1.83f)
                curveTo(17.92f, 1.31f, 16.8f, 1.42f, 16.06f, 2.12f)
                lineTo(12.63f, 5.33f)
                curveTo(12.23f, 5.7f, 12f, 6.23f, 12f, 6.78f)
                verticalLineTo(10.71f)
                curveTo(12.36f, 10.56f, 13f, 10.38f, 13.73f, 10.61f)
                moveTo(10.61f, 12.27f)
                curveTo(10.77f, 11.75f, 11.09f, 11.31f, 11.5f, 11f)
                horizontalLineTo(3.28f)
                curveTo(2f, 11f, 1f, 12f, 1f, 13.28f)
                curveTo(1f, 14.3f, 1.67f, 15.19f, 2.65f, 15.47f)
                lineTo(7.16f, 16.76f)
                curveTo(7.69f, 16.91f, 8.26f, 16.84f, 8.74f, 16.55f)
                lineTo(11.43f, 14.94f)
                curveTo(10.66f, 14.32f, 10.3f, 13.27f, 10.61f, 12.27f)
                moveTo(22.21f, 18.61f)
                lineTo(19.93f, 14.5f)
                curveTo(19.66f, 14.03f, 19.2f, 13.68f, 18.67f, 13.54f)
                lineTo(15.5f, 12.74f)
                curveTo(15.5f, 13.06f, 15.5f, 13.4f, 15.39f, 13.73f)
                curveTo(15.07f, 14.79f, 14.11f, 15.5f, 13f, 15.5f)
                curveTo(12.39f, 15.5f, 12f, 15.28f, 12f, 15.28f)
                verticalLineTo(21f)
                curveTo(10.9f, 21f, 10f, 21.9f, 10f, 23f)
                horizontalLineTo(16f)
                curveTo(16f, 21.9f, 15.1f, 21f, 14f, 21f)
                verticalLineTo(16.72f)
                lineTo(18.61f, 21.33f)
                curveTo(19.5f, 22.22f, 20.94f, 22.22f, 21.83f, 21.33f)
                curveTo(22.55f, 20.61f, 22.71f, 19.5f, 22.21f, 18.61f)
                moveTo(12.56f, 14.43f)
                curveTo(13.35f, 14.67f, 14.19f, 14.23f, 14.43f, 13.43f)
                curveTo(14.67f, 12.64f, 14.23f, 11.8f, 13.43f, 11.56f)
                curveTo(12.64f, 11.32f, 11.8f, 11.76f, 11.56f, 12.56f)
                curveTo(11.32f, 13.35f, 11.77f, 14.19f, 12.56f, 14.43f)
                close()
            }
        }.build()

        return _WindPower!!
    }

@Suppress("ObjectPropertyName")
private var _WindPower: ImageVector? = null
