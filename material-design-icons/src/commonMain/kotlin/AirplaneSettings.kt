package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AirplaneSettings: ImageVector
    get() {
        if (_AirplaneSettings != null) {
            return _AirplaneSettings!!
        }
        _AirplaneSettings = ImageVector.Builder(
            name = "AirplaneSettings",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.09f, 4.56f)
                lineTo(16.2f, 8.45f)
                lineTo(18.32f, 17.64f)
                lineTo(16.91f, 19.06f)
                lineTo(13f, 11.63f)
                lineTo(9.13f, 15.5f)
                lineTo(9.5f, 18f)
                lineTo(8.42f, 19.06f)
                lineTo(6.65f, 15.87f)
                lineTo(3.47f, 14.11f)
                lineTo(4.53f, 13.04f)
                lineTo(7f, 13.4f)
                lineTo(10.9f, 9.5f)
                lineTo(3.47f, 5.62f)
                lineTo(4.89f, 4.21f)
                lineTo(14.08f, 6.33f)
                lineTo(17.97f, 2.44f)
                curveTo(18.55f, 1.85f, 19.5f, 1.85f, 20.09f, 2.44f)
                curveTo(20.68f, 3f, 20.68f, 3.97f, 20.09f, 4.56f)
                moveTo(7f, 24f)
                horizontalLineTo(9f)
                verticalLineTo(22f)
                horizontalLineTo(7f)
                verticalLineTo(24f)
                moveTo(11f, 24f)
                horizontalLineTo(13f)
                verticalLineTo(22f)
                horizontalLineTo(11f)
                verticalLineTo(24f)
                moveTo(15f, 24f)
                horizontalLineTo(17f)
                verticalLineTo(22f)
                horizontalLineTo(15f)
                verticalLineTo(24f)
                close()
            }
        }.build()

        return _AirplaneSettings!!
    }

@Suppress("ObjectPropertyName")
private var _AirplaneSettings: ImageVector? = null
