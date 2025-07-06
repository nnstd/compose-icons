package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HorseVariantFast: ImageVector
    get() {
        if (_HorseVariantFast != null) {
            return _HorseVariantFast!!
        }
        _HorseVariantFast = ImageVector.Builder(
            name = "HorseVariantFast",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 8f)
                verticalLineTo(16f)
                lineTo(20f, 17f)
                lineTo(16.91f, 11.5f)
                curveTo(16.65f, 11.04f, 15.92f, 11.27f, 16f, 11.81f)
                lineTo(17f, 21f)
                lineTo(7f, 17f)
                lineTo(8.15f, 8.94f)
                curveTo(8.64f, 5.53f, 11.56f, 3f, 15f, 3f)
                horizontalLineTo(23f)
                lineTo(21.42f, 5.37f)
                curveTo(22.36f, 5.88f, 23f, 6.86f, 23f, 8f)
                moveTo(4f, 5f)
                horizontalLineTo(7.58f)
                curveTo(8.08f, 4.24f, 8.7f, 3.57f, 9.41f, 3f)
                horizontalLineTo(4f)
                curveTo(3.45f, 3f, 3f, 3.45f, 3f, 4f)
                reflectiveCurveTo(3.45f, 5f, 4f, 5f)
                moveTo(5.84f, 11f)
                horizontalLineTo(2f)
                curveTo(1.45f, 11f, 1f, 11.45f, 1f, 12f)
                reflectiveCurveTo(1.45f, 13f, 2f, 13f)
                horizontalLineTo(5.55f)
                lineTo(5.84f, 11f)
                moveTo(3f, 9f)
                horizontalLineTo(6.12f)
                lineTo(6.17f, 8.66f)
                curveTo(6.25f, 8.08f, 6.39f, 7.53f, 6.58f, 7f)
                horizontalLineTo(3f)
                curveTo(2.45f, 7f, 2f, 7.45f, 2f, 8f)
                reflectiveCurveTo(2.45f, 9f, 3f, 9f)
                close()
            }
        }.build()

        return _HorseVariantFast!!
    }

@Suppress("ObjectPropertyName")
private var _HorseVariantFast: ImageVector? = null
