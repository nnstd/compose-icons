package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WaterOpacity: ImageVector
    get() {
        if (_WaterOpacity != null) {
            return _WaterOpacity!!
        }
        _WaterOpacity = ImageVector.Builder(
            name = "WaterOpacity",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 14f)
                verticalLineTo(12f)
                horizontalLineTo(17.61f)
                curveTo(17.85f, 12.71f, 18f, 13.39f, 18f, 14f)
                horizontalLineTo(16f)
                moveTo(15.58f, 8f)
                curveTo(15.12f, 7.29f, 14.65f, 6.61f, 14.2f, 6f)
                horizontalLineTo(14f)
                verticalLineTo(8f)
                horizontalLineTo(15.58f)
                moveTo(16f, 12f)
                verticalLineTo(10f)
                horizontalLineTo(14f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                moveTo(16f, 8.68f)
                verticalLineTo(10f)
                horizontalLineTo(16.74f)
                curveTo(16.5f, 9.56f, 16.26f, 9.11f, 16f, 8.68f)
                moveTo(12f, 16f)
                verticalLineTo(14f)
                horizontalLineTo(14f)
                verticalLineTo(12f)
                horizontalLineTo(12f)
                verticalLineTo(10f)
                horizontalLineTo(14f)
                verticalLineTo(8f)
                horizontalLineTo(12f)
                verticalLineTo(6f)
                horizontalLineTo(14f)
                verticalLineTo(5.73f)
                curveTo(12.9f, 4.26f, 12f, 3.25f, 12f, 3.25f)
                reflectiveCurveTo(6f, 10f, 6f, 14f)
                curveTo(6f, 17.31f, 8.69f, 20f, 12f, 20f)
                verticalLineTo(18f)
                horizontalLineTo(14f)
                verticalLineTo(16f)
                horizontalLineTo(12f)
                moveTo(14f, 19.65f)
                curveTo(14.75f, 19.39f, 15.42f, 19f, 16f, 18.46f)
                verticalLineTo(18f)
                horizontalLineTo(14f)
                verticalLineTo(19.65f)
                moveTo(14f, 16f)
                horizontalLineTo(16f)
                verticalLineTo(14f)
                horizontalLineTo(14f)
                verticalLineTo(16f)
                moveTo(16f, 18f)
                horizontalLineTo(16.46f)
                curveTo(17f, 17.42f, 17.39f, 16.75f, 17.65f, 16f)
                horizontalLineTo(16f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _WaterOpacity!!
    }

@Suppress("ObjectPropertyName")
private var _WaterOpacity: ImageVector? = null
