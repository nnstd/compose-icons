package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LightbulbMultiple: ImageVector
    get() {
        if (_LightbulbMultiple != null) {
            return _LightbulbMultiple!!
        }
        _LightbulbMultiple = ImageVector.Builder(
            name = "LightbulbMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 16f)
                verticalLineTo(18f)
                curveTo(17f, 18.55f, 16.53f, 19f, 16f, 19f)
                horizontalLineTo(12f)
                curveTo(11.42f, 19f, 11f, 18.55f, 11f, 18f)
                verticalLineTo(16f)
                curveTo(8.77f, 14.34f, 8.32f, 11.21f, 10f, 9f)
                reflectiveCurveTo(14.77f, 6.34f, 17f, 8f)
                reflectiveCurveTo(19.63f, 12.79f, 18f, 15f)
                curveTo(17.69f, 15.38f, 17.35f, 15.72f, 17f, 16f)
                moveTo(16f, 20f)
                horizontalLineTo(12f)
                verticalLineTo(21f)
                curveTo(12f, 21.55f, 12.42f, 22f, 13f, 22f)
                horizontalLineTo(15f)
                curveTo(15.53f, 22f, 16f, 21.55f, 16f, 21f)
                moveTo(7.66f, 15f)
                horizontalLineTo(7f)
                verticalLineTo(16f)
                curveTo(7f, 16.55f, 7.42f, 17f, 8f, 17f)
                horizontalLineTo(9f)
                verticalLineTo(16.88f)
                curveTo(8.44f, 16.33f, 8f, 15.7f, 7.66f, 15f)
                moveTo(13.58f, 5f)
                curveTo(12.46f, 2.47f, 9.5f, 1.33f, 7f, 2.45f)
                reflectiveCurveTo(3.31f, 6.5f, 4.43f, 9.04f)
                curveTo(4.77f, 9.81f, 5.3f, 10.5f, 6f, 11f)
                verticalLineTo(13f)
                curveTo(6f, 13.55f, 6.42f, 14f, 7f, 14f)
                horizontalLineTo(7.28f)
                curveTo(7.07f, 13.35f, 6.97f, 12.68f, 7f, 12f)
                curveTo(6.97f, 8.29f, 9.87f, 5.21f, 13.58f, 5f)
                close()
            }
        }.build()

        return _LightbulbMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _LightbulbMultiple: ImageVector? = null
