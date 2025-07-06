package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LightbulbMultipleOutline: ImageVector
    get() {
        if (_LightbulbMultipleOutline != null) {
            return _LightbulbMultipleOutline!!
        }
        _LightbulbMultipleOutline = ImageVector.Builder(
            name = "LightbulbMultipleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 21f)
                curveTo(12f, 21.55f, 12.45f, 22f, 13f, 22f)
                horizontalLineTo(15f)
                curveTo(15.55f, 22f, 16f, 21.55f, 16f, 21f)
                verticalLineTo(20f)
                horizontalLineTo(12f)
                moveTo(14f, 7f)
                curveTo(11.24f, 7f, 9f, 9.24f, 9f, 12f)
                curveTo(9f, 13.57f, 9.74f, 15.06f, 11f, 16f)
                verticalLineTo(18f)
                curveTo(11f, 18.55f, 11.45f, 19f, 12f, 19f)
                horizontalLineTo(16f)
                curveTo(16.55f, 19f, 17f, 18.55f, 17f, 18f)
                verticalLineTo(16f)
                curveTo(19.21f, 14.34f, 19.66f, 11.21f, 18f, 9f)
                curveTo(17.06f, 7.74f, 15.57f, 7f, 14f, 7f)
                moveTo(15f, 14.82f)
                verticalLineTo(17f)
                horizontalLineTo(13f)
                verticalLineTo(14.82f)
                curveTo(11.44f, 14.27f, 10.62f, 12.55f, 11.17f, 11f)
                curveTo(11.72f, 9.43f, 13.44f, 8.61f, 15f, 9.16f)
                curveTo(16.56f, 9.72f, 17.38f, 11.43f, 16.83f, 13f)
                curveTo(16.53f, 13.85f, 15.85f, 14.5f, 15f, 14.82f)
                moveTo(7.68f, 15f)
                horizontalLineTo(7f)
                verticalLineTo(16f)
                curveTo(7f, 16.55f, 7.45f, 17f, 8f, 17f)
                horizontalLineTo(9f)
                verticalLineTo(16.88f)
                curveTo(8.46f, 16.33f, 8f, 15.7f, 7.68f, 15f)
                moveTo(13.6f, 5f)
                curveTo(12.5f, 2.47f, 9.53f, 1.33f, 7f, 2.45f)
                reflectiveCurveTo(3.34f, 6.5f, 4.45f, 9.04f)
                curveTo(4.79f, 9.81f, 5.33f, 10.5f, 6f, 11f)
                verticalLineTo(13f)
                curveTo(6f, 13.55f, 6.45f, 14f, 7f, 14f)
                horizontalLineTo(7.3f)
                curveTo(7.1f, 13.35f, 7f, 12.68f, 7f, 12f)
                curveTo(7f, 8.29f, 9.89f, 5.21f, 13.6f, 5f)
                close()
            }
        }.build()

        return _LightbulbMultipleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _LightbulbMultipleOutline: ImageVector? = null
