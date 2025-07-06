package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DatabaseSettingsOutline: ImageVector
    get() {
        if (_DatabaseSettingsOutline != null) {
            return _DatabaseSettingsOutline!!
        }
        _DatabaseSettingsOutline = ImageVector.Builder(
            name = "DatabaseSettingsOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 3f)
                curveTo(7.58f, 3f, 4f, 4.79f, 4f, 7f)
                verticalLineTo(17f)
                curveTo(4f, 18.2f, 5.06f, 19.27f, 6.73f, 20f)
                horizontalLineTo(17.27f)
                curveTo(18.94f, 19.27f, 20f, 18.2f, 20f, 17f)
                verticalLineTo(7f)
                curveTo(20f, 4.79f, 16.42f, 3f, 12f, 3f)
                moveTo(18f, 17f)
                curveTo(18f, 17.5f, 15.87f, 19f, 12f, 19f)
                reflectiveCurveTo(6f, 17.5f, 6f, 17f)
                verticalLineTo(14.77f)
                curveTo(7.61f, 15.55f, 9.72f, 16f, 12f, 16f)
                reflectiveCurveTo(16.39f, 15.55f, 18f, 14.77f)
                verticalLineTo(17f)
                moveTo(18f, 12.45f)
                curveTo(16.7f, 13.4f, 14.42f, 14f, 12f, 14f)
                reflectiveCurveTo(7.3f, 13.4f, 6f, 12.45f)
                verticalLineTo(9.64f)
                curveTo(7.47f, 10.47f, 9.61f, 11f, 12f, 11f)
                reflectiveCurveTo(16.53f, 10.47f, 18f, 9.64f)
                verticalLineTo(12.45f)
                moveTo(12f, 9f)
                curveTo(8.13f, 9f, 6f, 7.5f, 6f, 7f)
                reflectiveCurveTo(8.13f, 5f, 12f, 5f)
                reflectiveCurveTo(18f, 6.5f, 18f, 7f)
                reflectiveCurveTo(15.87f, 9f, 12f, 9f)
                moveTo(7f, 22f)
                horizontalLineTo(9f)
                verticalLineTo(24f)
                horizontalLineTo(7f)
                verticalLineTo(22f)
                moveTo(15f, 22f)
                horizontalLineTo(17f)
                verticalLineTo(24f)
                horizontalLineTo(15f)
                verticalLineTo(22f)
                moveTo(11f, 22f)
                horizontalLineTo(13f)
                verticalLineTo(24f)
                horizontalLineTo(11f)
                verticalLineTo(22f)
                close()
            }
        }.build()

        return _DatabaseSettingsOutline!!
    }

@Suppress("ObjectPropertyName")
private var _DatabaseSettingsOutline: ImageVector? = null
