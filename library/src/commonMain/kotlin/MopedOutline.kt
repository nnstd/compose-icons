package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MopedOutline: ImageVector
    get() {
        if (_MopedOutline != null) {
            return _MopedOutline!!
        }
        _MopedOutline = ImageVector.Builder(
            name = "MopedOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 7f)
                curveTo(19f, 5.9f, 18.11f, 5f, 17f, 5f)
                horizontalLineTo(14f)
                verticalLineTo(7f)
                horizontalLineTo(17f)
                verticalLineTo(9.65f)
                lineTo(13.5f, 14f)
                horizontalLineTo(10f)
                verticalLineTo(9f)
                horizontalLineTo(6f)
                curveTo(3.79f, 9f, 2f, 10.79f, 2f, 13f)
                verticalLineTo(16f)
                horizontalLineTo(4f)
                curveTo(4f, 17.66f, 5.34f, 19f, 7f, 19f)
                reflectiveCurveTo(10f, 17.66f, 10f, 16f)
                horizontalLineTo(14.5f)
                lineTo(19f, 10.35f)
                verticalLineTo(7f)
                moveTo(7f, 17f)
                curveTo(6.45f, 17f, 6f, 16.55f, 6f, 16f)
                horizontalLineTo(8f)
                curveTo(8f, 16.55f, 7.55f, 17f, 7f, 17f)
                moveTo(8f, 14f)
                horizontalLineTo(4f)
                verticalLineTo(13f)
                curveTo(4f, 11.9f, 4.9f, 11f, 6f, 11f)
                horizontalLineTo(8f)
                verticalLineTo(14f)
                moveTo(19f, 13f)
                curveTo(17.34f, 13f, 16f, 14.34f, 16f, 16f)
                reflectiveCurveTo(17.34f, 19f, 19f, 19f)
                reflectiveCurveTo(22f, 17.66f, 22f, 16f)
                reflectiveCurveTo(20.66f, 13f, 19f, 13f)
                moveTo(19f, 17f)
                curveTo(18.45f, 17f, 18f, 16.55f, 18f, 16f)
                reflectiveCurveTo(18.45f, 15f, 19f, 15f)
                reflectiveCurveTo(20f, 15.45f, 20f, 16f)
                reflectiveCurveTo(19.55f, 17f, 19f, 17f)
                moveTo(10f, 8f)
                horizontalLineTo(5f)
                verticalLineTo(6f)
                horizontalLineTo(10f)
                verticalLineTo(8f)
                close()
            }
        }.build()

        return _MopedOutline!!
    }

@Suppress("ObjectPropertyName")
private var _MopedOutline: ImageVector? = null
