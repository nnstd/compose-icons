package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DatabaseAlertOutline: ImageVector
    get() {
        if (_DatabaseAlertOutline != null) {
            return _DatabaseAlertOutline!!
        }
        _DatabaseAlertOutline = ImageVector.Builder(
            name = "DatabaseAlertOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 3f)
                curveTo(5.58f, 3f, 2f, 4.79f, 2f, 7f)
                verticalLineTo(17f)
                curveTo(2f, 19.21f, 5.59f, 21f, 10f, 21f)
                reflectiveCurveTo(18f, 19.21f, 18f, 17f)
                verticalLineTo(7f)
                curveTo(18f, 4.79f, 14.42f, 3f, 10f, 3f)
                moveTo(16f, 17f)
                curveTo(16f, 17.5f, 13.87f, 19f, 10f, 19f)
                reflectiveCurveTo(4f, 17.5f, 4f, 17f)
                verticalLineTo(14.77f)
                curveTo(5.61f, 15.55f, 7.72f, 16f, 10f, 16f)
                reflectiveCurveTo(14.39f, 15.55f, 16f, 14.77f)
                verticalLineTo(17f)
                moveTo(16f, 12.45f)
                curveTo(14.7f, 13.4f, 12.42f, 14f, 10f, 14f)
                reflectiveCurveTo(5.3f, 13.4f, 4f, 12.45f)
                verticalLineTo(9.64f)
                curveTo(5.47f, 10.47f, 7.61f, 11f, 10f, 11f)
                reflectiveCurveTo(14.53f, 10.47f, 16f, 9.64f)
                verticalLineTo(12.45f)
                moveTo(10f, 9f)
                curveTo(6.13f, 9f, 4f, 7.5f, 4f, 7f)
                reflectiveCurveTo(6.13f, 5f, 10f, 5f)
                reflectiveCurveTo(16f, 6.5f, 16f, 7f)
                reflectiveCurveTo(13.87f, 9f, 10f, 9f)
                moveTo(22f, 7f)
                verticalLineTo(13f)
                horizontalLineTo(20f)
                verticalLineTo(7f)
                horizontalLineTo(22f)
                moveTo(20f, 15f)
                horizontalLineTo(22f)
                verticalLineTo(17f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _DatabaseAlertOutline!!
    }

@Suppress("ObjectPropertyName")
private var _DatabaseAlertOutline: ImageVector? = null
