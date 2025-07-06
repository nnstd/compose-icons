package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LightbulbCflSpiralOff: ImageVector
    get() {
        if (_LightbulbCflSpiralOff != null) {
            return _LightbulbCflSpiralOff!!
        }
        _LightbulbCflSpiralOff = ImageVector.Builder(
            name = "LightbulbCflSpiralOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.45f, 9.9f)
                lineTo(13.88f, 10.68f)
                lineTo(12.38f, 9.18f)
                lineTo(14.55f, 8.1f)
                curveTo(14.69f, 8.03f, 14.84f, 8f, 15f, 8f)
                curveTo(16f, 8f, 16.42f, 9.34f, 15.45f, 9.9f)
                moveTo(11.22f, 8f)
                lineTo(15.45f, 5.9f)
                curveTo(16.41f, 5.43f, 16f, 4f, 15f, 4f)
                curveTo(14.83f, 4f, 14.69f, 4.03f, 14.55f, 4.1f)
                lineTo(9.72f, 6.5f)
                lineTo(11.22f, 8f)
                moveTo(20.84f, 22.73f)
                lineTo(16.09f, 18f)
                horizontalLineTo(8f)
                curveTo(7.44f, 18f, 7f, 17.55f, 7f, 17f)
                verticalLineTo(14f)
                horizontalLineTo(8f)
                verticalLineTo(12f)
                curveTo(8f, 11.6f, 8.2f, 11.25f, 8.7f, 11.03f)
                lineTo(9f, 10.88f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                moveTo(12.11f, 14f)
                lineTo(10.5f, 12.38f)
                lineTo(10f, 12.62f)
                verticalLineTo(14f)
                horizontalLineTo(12.11f)
                moveTo(9f, 21f)
                curveTo(9f, 21.57f, 9.46f, 22f, 10f, 22f)
                horizontalLineTo(14f)
                curveTo(14.56f, 22f, 15f, 21.55f, 15f, 21f)
                verticalLineTo(20f)
                horizontalLineTo(9f)
                verticalLineTo(21f)
                moveTo(9f, 5f)
                curveTo(9.16f, 5f, 9.32f, 4.95f, 9.45f, 4.9f)
                lineTo(11.45f, 3.9f)
                curveTo(12.43f, 3.36f, 12f, 2f, 11f, 2f)
                curveTo(10.84f, 2f, 10.69f, 2.03f, 10.55f, 2.1f)
                lineTo(8.55f, 3.1f)
                curveTo(7.56f, 3.66f, 8f, 5f, 9f, 5f)
                close()
            }
        }.build()

        return _LightbulbCflSpiralOff!!
    }

@Suppress("ObjectPropertyName")
private var _LightbulbCflSpiralOff: ImageVector? = null
