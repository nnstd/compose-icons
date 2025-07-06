package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PhoneDial: ImageVector
    get() {
        if (_PhoneDial != null) {
            return _PhoneDial!!
        }
        _PhoneDial = ImageVector.Builder(
            name = "PhoneDial",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.6f, 10.8f)
                curveTo(8f, 13.6f, 10.4f, 15.9f, 13.2f, 17.4f)
                lineTo(15.4f, 15.2f)
                curveTo(15.7f, 14.9f, 16.1f, 14.8f, 16.4f, 15f)
                curveTo(17.5f, 15.4f, 18.7f, 15.6f, 20f, 15.6f)
                curveTo(20.6f, 15.6f, 21f, 16f, 21f, 16.6f)
                verticalLineTo(20f)
                curveTo(21f, 20.6f, 20.6f, 21f, 20f, 21f)
                curveTo(10.6f, 21f, 3f, 13.4f, 3f, 4f)
                curveTo(3f, 3.4f, 3.5f, 3f, 4f, 3f)
                horizontalLineTo(7.5f)
                curveTo(8.1f, 3f, 8.5f, 3.4f, 8.5f, 4f)
                curveTo(8.5f, 5.2f, 8.7f, 6.4f, 9.1f, 7.6f)
                curveTo(9.2f, 7.9f, 9.1f, 8.3f, 8.9f, 8.6f)
                lineTo(6.6f, 10.8f)
                moveTo(14f, 3f)
                curveTo(13.4f, 3f, 13f, 3.4f, 13f, 4f)
                reflectiveCurveTo(13.4f, 5f, 14f, 5f)
                reflectiveCurveTo(15f, 4.6f, 15f, 4f)
                reflectiveCurveTo(14.6f, 3f, 14f, 3f)
                moveTo(17f, 3f)
                curveTo(16.4f, 3f, 16f, 3.4f, 16f, 4f)
                reflectiveCurveTo(16.4f, 5f, 17f, 5f)
                reflectiveCurveTo(18f, 4.6f, 18f, 4f)
                reflectiveCurveTo(17.6f, 3f, 17f, 3f)
                moveTo(20f, 3f)
                curveTo(19.4f, 3f, 19f, 3.4f, 19f, 4f)
                reflectiveCurveTo(19.4f, 5f, 20f, 5f)
                reflectiveCurveTo(21f, 4.6f, 21f, 4f)
                reflectiveCurveTo(20.6f, 3f, 20f, 3f)
                moveTo(14f, 6f)
                curveTo(13.4f, 6f, 13f, 6.4f, 13f, 7f)
                reflectiveCurveTo(13.4f, 8f, 14f, 8f)
                reflectiveCurveTo(15f, 7.6f, 15f, 7f)
                reflectiveCurveTo(14.6f, 6f, 14f, 6f)
                moveTo(17f, 6f)
                curveTo(16.4f, 6f, 16f, 6.4f, 16f, 7f)
                reflectiveCurveTo(16.4f, 8f, 17f, 8f)
                reflectiveCurveTo(18f, 7.6f, 18f, 7f)
                reflectiveCurveTo(17.6f, 6f, 17f, 6f)
                moveTo(20f, 6f)
                curveTo(19.4f, 6f, 19f, 6.4f, 19f, 7f)
                reflectiveCurveTo(19.4f, 8f, 20f, 8f)
                reflectiveCurveTo(21f, 7.6f, 21f, 7f)
                reflectiveCurveTo(20.6f, 6f, 20f, 6f)
                moveTo(14f, 9f)
                curveTo(13.4f, 9f, 13f, 9.4f, 13f, 10f)
                reflectiveCurveTo(13.4f, 11f, 14f, 11f)
                reflectiveCurveTo(15f, 10.6f, 15f, 10f)
                reflectiveCurveTo(14.6f, 9f, 14f, 9f)
                moveTo(17f, 9f)
                curveTo(16.4f, 9f, 16f, 9.4f, 16f, 10f)
                reflectiveCurveTo(16.4f, 11f, 17f, 11f)
                reflectiveCurveTo(18f, 10.6f, 18f, 10f)
                reflectiveCurveTo(17.6f, 9f, 17f, 9f)
                moveTo(20f, 9f)
                curveTo(19.4f, 9f, 19f, 9.4f, 19f, 10f)
                reflectiveCurveTo(19.4f, 11f, 20f, 11f)
                reflectiveCurveTo(21f, 10.6f, 21f, 10f)
                reflectiveCurveTo(20.6f, 9f, 20f, 9f)
                close()
            }
        }.build()

        return _PhoneDial!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneDial: ImageVector? = null
