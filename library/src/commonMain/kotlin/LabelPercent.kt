package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LabelPercent: ImageVector
    get() {
        if (_LabelPercent != null) {
            return _LabelPercent!!
        }
        _LabelPercent = ImageVector.Builder(
            name = "LabelPercent",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.63f, 5.84f)
                curveTo(17.27f, 5.33f, 16.67f, 5f, 16f, 5f)
                horizontalLineTo(5f)
                curveTo(3.9f, 5f, 3f, 5.9f, 3f, 7f)
                verticalLineTo(17f)
                curveTo(3f, 18.11f, 3.9f, 19f, 5f, 19f)
                horizontalLineTo(16f)
                curveTo(16.67f, 19f, 17.27f, 18.66f, 17.63f, 18.15f)
                lineTo(22f, 12f)
                lineTo(17.63f, 5.84f)
                moveTo(8.45f, 8.03f)
                curveTo(9.23f, 8.03f, 9.87f, 8.67f, 9.87f, 9.45f)
                reflectiveCurveTo(9.23f, 10.87f, 8.45f, 10.87f)
                reflectiveCurveTo(7.03f, 10.23f, 7.03f, 9.45f)
                reflectiveCurveTo(7.67f, 8.03f, 8.45f, 8.03f)
                moveTo(13.55f, 15.97f)
                curveTo(12.77f, 15.97f, 12.13f, 15.33f, 12.13f, 14.55f)
                reflectiveCurveTo(12.77f, 13.13f, 13.55f, 13.13f)
                reflectiveCurveTo(14.97f, 13.77f, 14.97f, 14.55f)
                reflectiveCurveTo(14.33f, 15.97f, 13.55f, 15.97f)
                moveTo(8.2f, 16f)
                lineTo(7f, 14.8f)
                lineTo(13.8f, 8f)
                lineTo(15f, 9.2f)
                lineTo(8.2f, 16f)
                close()
            }
        }.build()

        return _LabelPercent!!
    }

@Suppress("ObjectPropertyName")
private var _LabelPercent: ImageVector? = null
