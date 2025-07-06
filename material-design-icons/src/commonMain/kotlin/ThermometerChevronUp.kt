package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ThermometerChevronUp: ImageVector
    get() {
        if (_ThermometerChevronUp != null) {
            return _ThermometerChevronUp!!
        }
        _ThermometerChevronUp = ImageVector.Builder(
            name = "ThermometerChevronUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.41f, 11.83f)
                lineTo(20.58f, 15f)
                lineTo(22f, 13.59f)
                lineTo(17.41f, 9f)
                lineTo(12.82f, 13.59f)
                lineTo(14.24f, 15f)
                lineTo(17.41f, 11.83f)
                moveTo(10f, 13f)
                verticalLineTo(5f)
                curveTo(10f, 3.34f, 8.66f, 2f, 7f, 2f)
                reflectiveCurveTo(4f, 3.34f, 4f, 5f)
                verticalLineTo(13f)
                curveTo(1.79f, 14.66f, 1.34f, 17.79f, 3f, 20f)
                reflectiveCurveTo(7.79f, 22.66f, 10f, 21f)
                reflectiveCurveTo(12.66f, 16.21f, 11f, 14f)
                curveTo(10.72f, 13.62f, 10.38f, 13.28f, 10f, 13f)
                moveTo(7f, 4f)
                curveTo(7.55f, 4f, 8f, 4.45f, 8f, 5f)
                verticalLineTo(8f)
                horizontalLineTo(6f)
                verticalLineTo(5f)
                curveTo(6f, 4.45f, 6.45f, 4f, 7f, 4f)
                close()
            }
        }.build()

        return _ThermometerChevronUp!!
    }

@Suppress("ObjectPropertyName")
private var _ThermometerChevronUp: ImageVector? = null
