package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WaterCheck: ImageVector
    get() {
        if (_WaterCheck != null) {
            return _WaterCheck!!
        }
        _WaterCheck = ImageVector.Builder(
            name = "WaterCheck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.75f, 16.25f)
                lineTo(17f, 21f)
                lineTo(14.25f, 18f)
                lineTo(15.41f, 16.84f)
                lineTo(17f, 18.43f)
                lineTo(20.59f, 14.84f)
                lineTo(21.75f, 16.25f)
                moveTo(17.62f, 12f)
                curveTo(16.31f, 8.1f, 12f, 3.25f, 12f, 3.25f)
                reflectiveCurveTo(6f, 10f, 6f, 14f)
                curveTo(6f, 17.31f, 8.69f, 20f, 12f, 20f)
                horizontalLineTo(12.34f)
                curveTo(12.12f, 19.36f, 12f, 18.7f, 12f, 18f)
                curveTo(12f, 14.82f, 14.5f, 12.22f, 17.62f, 12f)
                close()
            }
        }.build()

        return _WaterCheck!!
    }

@Suppress("ObjectPropertyName")
private var _WaterCheck: ImageVector? = null
