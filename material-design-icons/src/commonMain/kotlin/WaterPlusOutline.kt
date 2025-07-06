package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WaterPlusOutline: ImageVector
    get() {
        if (_WaterPlusOutline != null) {
            return _WaterPlusOutline!!
        }
        _WaterPlusOutline = ImageVector.Builder(
            name = "WaterPlusOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 18f)
                curveTo(12f, 18.7f, 12.12f, 19.36f, 12.34f, 20f)
                curveTo(12.23f, 20f, 12.12f, 20f, 12f, 20f)
                curveTo(8.69f, 20f, 6f, 17.31f, 6f, 14f)
                curveTo(6f, 10f, 12f, 3.25f, 12f, 3.25f)
                reflectiveCurveTo(16.31f, 8.1f, 17.62f, 12f)
                curveTo(16.93f, 12.06f, 16.28f, 12.22f, 15.67f, 12.47f)
                curveTo(15f, 10.68f, 13.5f, 8.33f, 12f, 6.39f)
                curveTo(10f, 8.96f, 8f, 12.23f, 8f, 14f)
                curveTo(8f, 16.21f, 9.79f, 18f, 12f, 18f)
                moveTo(19f, 17f)
                verticalLineTo(14f)
                horizontalLineTo(17f)
                verticalLineTo(17f)
                horizontalLineTo(14f)
                verticalLineTo(19f)
                horizontalLineTo(17f)
                verticalLineTo(22f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                horizontalLineTo(22f)
                verticalLineTo(17f)
                horizontalLineTo(19f)
                close()
            }
        }.build()

        return _WaterPlusOutline!!
    }

@Suppress("ObjectPropertyName")
private var _WaterPlusOutline: ImageVector? = null
