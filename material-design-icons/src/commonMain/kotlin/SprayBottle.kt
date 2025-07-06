package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SprayBottle: ImageVector
    get() {
        if (_SprayBottle != null) {
            return _SprayBottle!!
        }
        _SprayBottle = ImageVector.Builder(
            name = "SprayBottle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.72f, 10.43f)
                curveTo(14.68f, 8.39f, 14.5f, 4.66f, 14.5f, 4f)
                horizontalLineTo(13f)
                verticalLineTo(6f)
                horizontalLineTo(9f)
                verticalLineTo(4f)
                horizontalLineTo(7f)
                curveTo(7f, 2.9f, 7.9f, 2f, 9f, 2f)
                horizontalLineTo(16f)
                verticalLineTo(3f)
                curveTo(16f, 3.08f, 16.04f, 7.63f, 17.78f, 9.37f)
                lineTo(16.72f, 10.43f)
                moveTo(17f, 2f)
                verticalLineTo(4f)
                horizontalLineTo(18f)
                verticalLineTo(2f)
                horizontalLineTo(17f)
                moveTo(15f, 12f)
                curveTo(13f, 10f, 13f, 7f, 13f, 7f)
                horizontalLineTo(9f)
                verticalLineTo(9f)
                curveTo(9f, 10f, 9f, 10f, 8f, 11f)
                reflectiveCurveTo(7f, 13f, 7f, 13f)
                verticalLineTo(20f)
                curveTo(7f, 21.1f, 7.9f, 22f, 9f, 22f)
                horizontalLineTo(13f)
                curveTo(14.1f, 22f, 15f, 21.1f, 15f, 20f)
                verticalLineTo(12f)
                close()
            }
        }.build()

        return _SprayBottle!!
    }

@Suppress("ObjectPropertyName")
private var _SprayBottle: ImageVector? = null
