package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LightbulbAuto: ImageVector
    get() {
        if (_LightbulbAuto != null) {
            return _LightbulbAuto!!
        }
        _LightbulbAuto = ImageVector.Builder(
            name = "LightbulbAuto",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 2f)
                curveTo(5.13f, 2f, 2f, 5.13f, 2f, 9f)
                curveTo(2f, 11.38f, 3.19f, 13.47f, 5f, 14.74f)
                verticalLineTo(17f)
                curveTo(5f, 17.55f, 5.45f, 18f, 6f, 18f)
                horizontalLineTo(12f)
                curveTo(12.55f, 18f, 13f, 17.55f, 13f, 17f)
                verticalLineTo(14.74f)
                curveTo(14.81f, 13.47f, 16f, 11.38f, 16f, 9f)
                curveTo(16f, 5.13f, 12.87f, 2f, 9f, 2f)
                moveTo(6f, 21f)
                curveTo(6f, 21.55f, 6.45f, 22f, 7f, 22f)
                horizontalLineTo(11f)
                curveTo(11.55f, 22f, 12f, 21.55f, 12f, 21f)
                verticalLineTo(20f)
                horizontalLineTo(6f)
                verticalLineTo(21f)
                moveTo(19f, 13f)
                horizontalLineTo(17f)
                lineTo(13.8f, 22f)
                horizontalLineTo(15.7f)
                lineTo(16.4f, 20f)
                horizontalLineTo(19.6f)
                lineTo(20.3f, 22f)
                horizontalLineTo(22.2f)
                lineTo(19f, 13f)
                moveTo(16.85f, 18.65f)
                lineTo(18f, 15f)
                lineTo(19.15f, 18.65f)
                horizontalLineTo(16.85f)
                close()
            }
        }.build()

        return _LightbulbAuto!!
    }

@Suppress("ObjectPropertyName")
private var _LightbulbAuto: ImageVector? = null
