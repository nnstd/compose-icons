package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BunkBedOutline: ImageVector
    get() {
        if (_BunkBedOutline != null) {
            return _BunkBedOutline!!
        }
        _BunkBedOutline = ImageVector.Builder(
            name = "BunkBedOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 2f)
                horizontalLineTo(3f)
                verticalLineTo(9f)
                horizontalLineTo(10f)
                verticalLineTo(3f)
                horizontalLineTo(19f)
                curveTo(21.2f, 3f, 23f, 4.8f, 23f, 7f)
                verticalLineTo(23f)
                horizontalLineTo(21f)
                verticalLineTo(21f)
                horizontalLineTo(3f)
                verticalLineTo(23f)
                horizontalLineTo(1f)
                verticalLineTo(2f)
                moveTo(12f, 5f)
                verticalLineTo(9f)
                horizontalLineTo(21f)
                verticalLineTo(7f)
                curveTo(21f, 5.9f, 20.1f, 5f, 19f, 5f)
                horizontalLineTo(12f)
                moveTo(3f, 11f)
                verticalLineTo(19f)
                horizontalLineTo(10f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                curveTo(19.7f, 13f, 20.4f, 13.2f, 21f, 13.6f)
                verticalLineTo(11f)
                horizontalLineTo(3f)
                moveTo(6.5f, 13f)
                curveTo(7.9f, 13f, 9f, 14.1f, 9f, 15.5f)
                reflectiveCurveTo(7.9f, 18f, 6.5f, 18f)
                reflectiveCurveTo(4f, 16.9f, 4f, 15.5f)
                reflectiveCurveTo(5.1f, 13f, 6.5f, 13f)
                moveTo(6.5f, 14.6f)
                curveTo(6f, 14.6f, 5.6f, 15f, 5.6f, 15.5f)
                reflectiveCurveTo(6f, 16.4f, 6.5f, 16.4f)
                reflectiveCurveTo(7.4f, 16f, 7.4f, 15.5f)
                reflectiveCurveTo(7f, 14.6f, 6.5f, 14.6f)
                moveTo(12f, 15f)
                verticalLineTo(19f)
                horizontalLineTo(21f)
                verticalLineTo(17f)
                curveTo(21f, 15.9f, 20.1f, 15f, 19f, 15f)
                horizontalLineTo(12f)
                moveTo(6.5f, 3f)
                curveTo(7.9f, 3f, 9f, 4.1f, 9f, 5.5f)
                reflectiveCurveTo(7.9f, 8f, 6.5f, 8f)
                reflectiveCurveTo(4f, 6.9f, 4f, 5.5f)
                reflectiveCurveTo(5.1f, 3f, 6.5f, 3f)
                moveTo(6.5f, 4.6f)
                curveTo(6f, 4.6f, 5.6f, 5f, 5.6f, 5.5f)
                reflectiveCurveTo(6f, 6.4f, 6.5f, 6.4f)
                reflectiveCurveTo(7.4f, 6f, 7.4f, 5.5f)
                reflectiveCurveTo(7f, 4.6f, 6.5f, 4.6f)
                close()
            }
        }.build()

        return _BunkBedOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BunkBedOutline: ImageVector? = null
