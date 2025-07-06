package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ToggleSwitchOutline: ImageVector
    get() {
        if (_ToggleSwitchOutline != null) {
            return _ToggleSwitchOutline!!
        }
        _ToggleSwitchOutline = ImageVector.Builder(
            name = "ToggleSwitchOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 6f)
                horizontalLineTo(7f)
                curveTo(3.69f, 6f, 1f, 8.69f, 1f, 12f)
                reflectiveCurveTo(3.69f, 18f, 7f, 18f)
                horizontalLineTo(17f)
                curveTo(20.31f, 18f, 23f, 15.31f, 23f, 12f)
                reflectiveCurveTo(20.31f, 6f, 17f, 6f)
                moveTo(17f, 16f)
                horizontalLineTo(7f)
                curveTo(4.79f, 16f, 3f, 14.21f, 3f, 12f)
                reflectiveCurveTo(4.79f, 8f, 7f, 8f)
                horizontalLineTo(17f)
                curveTo(19.21f, 8f, 21f, 9.79f, 21f, 12f)
                reflectiveCurveTo(19.21f, 16f, 17f, 16f)
                moveTo(17f, 9f)
                curveTo(15.34f, 9f, 14f, 10.34f, 14f, 12f)
                reflectiveCurveTo(15.34f, 15f, 17f, 15f)
                reflectiveCurveTo(20f, 13.66f, 20f, 12f)
                reflectiveCurveTo(18.66f, 9f, 17f, 9f)
                close()
            }
        }.build()

        return _ToggleSwitchOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ToggleSwitchOutline: ImageVector? = null
