package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WaterPlus: ImageVector
    get() {
        if (_WaterPlus != null) {
            return _WaterPlus!!
        }
        _WaterPlus = ImageVector.Builder(
            name = "WaterPlus",
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
                curveTo(14.5f, 12.22f, 12f, 14.82f, 12f, 18f)
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

        return _WaterPlus!!
    }

@Suppress("ObjectPropertyName")
private var _WaterPlus: ImageVector? = null
