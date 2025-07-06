package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WaterAlert: ImageVector
    get() {
        if (_WaterAlert != null) {
            return _WaterAlert!!
        }
        _WaterAlert = ImageVector.Builder(
            name = "WaterAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 3.25f)
                curveTo(10f, 3.25f, 16f, 10f, 16f, 14f)
                curveTo(16f, 17.31f, 13.31f, 20f, 10f, 20f)
                reflectiveCurveTo(4f, 17.31f, 4f, 14f)
                curveTo(4f, 10f, 10f, 3.25f, 10f, 3.25f)
                moveTo(20f, 7f)
                verticalLineTo(13f)
                horizontalLineTo(18f)
                verticalLineTo(7f)
                horizontalLineTo(20f)
                moveTo(18f, 17f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(18f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _WaterAlert!!
    }

@Suppress("ObjectPropertyName")
private var _WaterAlert: ImageVector? = null
