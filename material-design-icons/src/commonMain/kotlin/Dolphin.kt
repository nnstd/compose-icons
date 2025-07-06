package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Dolphin: ImageVector
    get() {
        if (_Dolphin != null) {
            return _Dolphin!!
        }
        _Dolphin = ImageVector.Builder(
            name = "Dolphin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 7f)
                curveTo(20f, 7f, 20f, 3f, 15f, 3f)
                curveTo(13.47f, 3f, 12.15f, 3.19f, 11f, 3.5f)
                curveTo(10.5f, 3.06f, 7.26f, 0.309f, 4f, 3.57f)
                lineTo(6.56f, 6.13f)
                curveTo(2.5f, 10.53f, 4f, 18f, 4f, 18f)
                reflectiveCurveTo(1f, 18f, 1f, 22f)
                curveTo(1f, 22f, 5f, 21f, 5f, 21f)
                curveTo(5f, 21f, 9f, 22f, 9f, 22f)
                curveTo(9f, 18f, 6f, 18f, 6f, 18f)
                reflectiveCurveTo(6.85f, 12.24f, 13f, 11.18f)
                verticalLineTo(14f)
                curveTo(15f, 14f, 15.68f, 12.19f, 15.89f, 11f)
                horizontalLineTo(18f)
                curveTo(22f, 11f, 23f, 10f, 23f, 9f)
                reflectiveCurveTo(21f, 7f, 20f, 7f)
                moveTo(18f, 8f)
                curveTo(17.45f, 8f, 17f, 7.55f, 17f, 7f)
                reflectiveCurveTo(17.45f, 6f, 18f, 6f)
                reflectiveCurveTo(19f, 6.45f, 19f, 7f)
                reflectiveCurveTo(18.55f, 8f, 18f, 8f)
                close()
            }
        }.build()

        return _Dolphin!!
    }

@Suppress("ObjectPropertyName")
private var _Dolphin: ImageVector? = null
