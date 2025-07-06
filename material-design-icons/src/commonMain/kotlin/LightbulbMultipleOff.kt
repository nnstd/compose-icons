package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LightbulbMultipleOff: ImageVector
    get() {
        if (_LightbulbMultipleOff != null) {
            return _LightbulbMultipleOff!!
        }
        _LightbulbMultipleOff = ImageVector.Builder(
            name = "LightbulbMultipleOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.84f, 22.73f)
                lineTo(16.74f, 18.63f)
                curveTo(16.55f, 18.85f, 16.29f, 19f, 16f, 19f)
                horizontalLineTo(12f)
                curveTo(11.42f, 19f, 11f, 18.55f, 11f, 18f)
                verticalLineTo(16f)
                curveTo(9.37f, 14.8f, 8.71f, 12.82f, 9.1f, 11f)
                lineTo(7.5f, 9.39f)
                curveTo(7.17f, 10.2f, 6.97f, 11.08f, 7f, 12f)
                curveTo(6.97f, 12.68f, 7.07f, 13.35f, 7.28f, 14f)
                horizontalLineTo(7f)
                curveTo(6.42f, 14f, 6f, 13.55f, 6f, 13f)
                verticalLineTo(11f)
                curveTo(5.3f, 10.5f, 4.77f, 9.81f, 4.43f, 9.04f)
                curveTo(4f, 8.05f, 3.91f, 7f, 4.12f, 6f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                moveTo(13.58f, 5f)
                curveTo(12.46f, 2.47f, 9.5f, 1.33f, 7f, 2.45f)
                curveTo(6.68f, 2.58f, 6.39f, 2.75f, 6.13f, 2.93f)
                lineTo(9.67f, 6.47f)
                curveTo(10.76f, 5.63f, 12.1f, 5.08f, 13.58f, 5f)
                moveTo(18.06f, 14.86f)
                curveTo(19.6f, 12.66f, 19.14f, 9.62f, 17f, 8f)
                curveTo(15.2f, 6.67f, 12.84f, 6.72f, 11.12f, 7.92f)
                lineTo(18.06f, 14.86f)
                moveTo(12f, 21f)
                curveTo(12f, 21.55f, 12.42f, 22f, 13f, 22f)
                horizontalLineTo(15f)
                curveTo(15.53f, 22f, 16f, 21.55f, 16f, 21f)
                verticalLineTo(20f)
                horizontalLineTo(12f)
                verticalLineTo(21f)
                moveTo(7f, 15f)
                verticalLineTo(16f)
                curveTo(7f, 16.55f, 7.42f, 17f, 8f, 17f)
                horizontalLineTo(9f)
                verticalLineTo(16.88f)
                curveTo(8.43f, 16.33f, 8f, 15.7f, 7.66f, 15f)
                horizontalLineTo(7f)
                close()
            }
        }.build()

        return _LightbulbMultipleOff!!
    }

@Suppress("ObjectPropertyName")
private var _LightbulbMultipleOff: ImageVector? = null
