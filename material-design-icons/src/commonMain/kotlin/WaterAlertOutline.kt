package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WaterAlertOutline: ImageVector
    get() {
        if (_WaterAlertOutline != null) {
            return _WaterAlertOutline!!
        }
        _WaterAlertOutline = ImageVector.Builder(
            name = "WaterAlertOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 3.25f)
                curveTo(10f, 3.25f, 4f, 10f, 4f, 14f)
                curveTo(4f, 17.31f, 6.69f, 20f, 10f, 20f)
                reflectiveCurveTo(16f, 17.31f, 16f, 14f)
                curveTo(16f, 10f, 10f, 3.25f, 10f, 3.25f)
                moveTo(10f, 18f)
                curveTo(7.79f, 18f, 6f, 16.21f, 6f, 14f)
                curveTo(6f, 12.23f, 8f, 8.96f, 10f, 6.39f)
                curveTo(12f, 8.95f, 14f, 12.23f, 14f, 14f)
                curveTo(14f, 16.21f, 12.21f, 18f, 10f, 18f)
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

        return _WaterAlertOutline!!
    }

@Suppress("ObjectPropertyName")
private var _WaterAlertOutline: ImageVector? = null
