package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LightbulbAutoOutline: ImageVector
    get() {
        if (_LightbulbAutoOutline != null) {
            return _LightbulbAutoOutline!!
        }
        _LightbulbAutoOutline = ImageVector.Builder(
            name = "LightbulbAutoOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 2f)
                curveTo(12.87f, 2f, 16f, 5.13f, 16f, 9f)
                curveTo(16f, 11.38f, 14.81f, 13.47f, 13f, 14.74f)
                verticalLineTo(17f)
                curveTo(13f, 17.55f, 12.55f, 18f, 12f, 18f)
                horizontalLineTo(6f)
                curveTo(5.45f, 18f, 5f, 17.55f, 5f, 17f)
                verticalLineTo(14.74f)
                curveTo(3.19f, 13.47f, 2f, 11.38f, 2f, 9f)
                curveTo(2f, 5.13f, 5.13f, 2f, 9f, 2f)
                moveTo(6f, 21f)
                verticalLineTo(20f)
                horizontalLineTo(12f)
                verticalLineTo(21f)
                curveTo(12f, 21.55f, 11.55f, 22f, 11f, 22f)
                horizontalLineTo(7f)
                curveTo(6.45f, 22f, 6f, 21.55f, 6f, 21f)
                moveTo(9f, 4f)
                curveTo(6.24f, 4f, 4f, 6.24f, 4f, 9f)
                curveTo(4f, 11.05f, 5.23f, 12.81f, 7f, 13.58f)
                verticalLineTo(16f)
                horizontalLineTo(11f)
                verticalLineTo(13.58f)
                curveTo(12.77f, 12.81f, 14f, 11.05f, 14f, 9f)
                curveTo(14f, 6.24f, 11.76f, 4f, 9f, 4f)
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

        return _LightbulbAutoOutline!!
    }

@Suppress("ObjectPropertyName")
private var _LightbulbAutoOutline: ImageVector? = null
