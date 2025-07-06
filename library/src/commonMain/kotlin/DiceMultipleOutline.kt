package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DiceMultipleOutline: ImageVector
    get() {
        if (_DiceMultipleOutline != null) {
            return _DiceMultipleOutline!!
        }
        _DiceMultipleOutline = ImageVector.Builder(
            name = "DiceMultipleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 8f)
                curveTo(13.45f, 8f, 13f, 7.55f, 13f, 7f)
                reflectiveCurveTo(13.45f, 6f, 14f, 6f)
                curveTo(14.55f, 6f, 15f, 6.45f, 15f, 7f)
                curveTo(15f, 7.55f, 14.55f, 8f, 14f, 8f)
                moveTo(12f, 12f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                verticalLineTo(12f)
                horizontalLineTo(12f)
                moveTo(12.78f, 10f)
                horizontalLineTo(4.22f)
                curveTo(3.55f, 10f, 3f, 10.55f, 3f, 11.22f)
                verticalLineTo(19.78f)
                curveTo(3f, 20.45f, 3.55f, 21f, 4.22f, 21f)
                horizontalLineTo(12.78f)
                curveTo(13.45f, 21f, 14f, 20.45f, 14f, 19.78f)
                verticalLineTo(11.22f)
                curveTo(14f, 10.55f, 13.45f, 10f, 12.78f, 10f)
                moveTo(19.78f, 3f)
                horizontalLineTo(11.22f)
                curveTo(10.55f, 3f, 10f, 3.55f, 10f, 4.22f)
                verticalLineTo(8f)
                horizontalLineTo(12f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(14f)
                horizontalLineTo(19.78f)
                curveTo(20.45f, 14f, 21f, 13.45f, 21f, 12.78f)
                verticalLineTo(4.22f)
                curveTo(21f, 3.55f, 20.45f, 3f, 19.78f, 3f)
                moveTo(17f, 8f)
                curveTo(16.45f, 8f, 16f, 7.55f, 16f, 7f)
                reflectiveCurveTo(16.45f, 6f, 17f, 6f)
                curveTo(17.55f, 6f, 18f, 6.45f, 18f, 7f)
                curveTo(18f, 7.55f, 17.55f, 8f, 17f, 8f)
                moveTo(17f, 11f)
                curveTo(16.45f, 11f, 16f, 10.55f, 16f, 10f)
                reflectiveCurveTo(16.45f, 9f, 17f, 9f)
                curveTo(17.55f, 9f, 18f, 9.45f, 18f, 10f)
                curveTo(18f, 10.55f, 17.55f, 11f, 17f, 11f)
                moveTo(7f, 15f)
                curveTo(6.45f, 15f, 6f, 14.55f, 6f, 14f)
                reflectiveCurveTo(6.45f, 13f, 7f, 13f)
                curveTo(7.55f, 13f, 8f, 13.45f, 8f, 14f)
                curveTo(8f, 14.55f, 7.55f, 15f, 7f, 15f)
                moveTo(10f, 18f)
                curveTo(9.45f, 18f, 9f, 17.55f, 9f, 17f)
                reflectiveCurveTo(9.45f, 16f, 10f, 16f)
                curveTo(10.55f, 16f, 11f, 16.45f, 11f, 17f)
                curveTo(11f, 17.55f, 10.55f, 18f, 10f, 18f)
            }
        }.build()

        return _DiceMultipleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _DiceMultipleOutline: ImageVector? = null
