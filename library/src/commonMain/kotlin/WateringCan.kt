package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WateringCan: ImageVector
    get() {
        if (_WateringCan != null) {
            return _WateringCan!!
        }
        _WateringCan = ImageVector.Builder(
            name = "WateringCan",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.5f, 7.47f)
                curveTo(17.76f, 8.2f, 17.57f, 9.25f, 17.92f, 10.15f)
                lineTo(15f, 13.07f)
                verticalLineTo(11f)
                curveTo(15f, 10.45f, 14.55f, 10f, 14f, 10f)
                horizontalLineTo(12.97f)
                curveTo(13f, 9.83f, 13f, 9.67f, 13f, 9.5f)
                curveTo(13f, 6.46f, 10.54f, 4f, 7.5f, 4f)
                reflectiveCurveTo(2f, 6.46f, 2f, 9.5f)
                curveTo(2f, 11.21f, 2.78f, 12.73f, 4f, 13.74f)
                verticalLineTo(20f)
                curveTo(4f, 20.55f, 4.45f, 21f, 5f, 21f)
                horizontalLineTo(14f)
                curveTo(14.55f, 21f, 15f, 20.55f, 15f, 20f)
                verticalLineTo(15.89f)
                lineTo(19.33f, 11.56f)
                curveTo(20.23f, 11.91f, 21.28f, 11.73f, 22f, 11f)
                lineTo(18.5f, 7.47f)
                moveTo(4.05f, 10f)
                curveTo(4.03f, 9.83f, 4f, 9.67f, 4f, 9.5f)
                curveTo(4f, 7.57f, 5.57f, 6f, 7.5f, 6f)
                reflectiveCurveTo(11f, 7.57f, 11f, 9.5f)
                curveTo(11f, 9.67f, 10.97f, 9.83f, 10.95f, 10f)
                horizontalLineTo(4.05f)
                close()
            }
        }.build()

        return _WateringCan!!
    }

@Suppress("ObjectPropertyName")
private var _WateringCan: ImageVector? = null
