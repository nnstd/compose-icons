package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountSettingsOutline: ImageVector
    get() {
        if (_AccountSettingsOutline != null) {
            return _AccountSettingsOutline!!
        }
        _AccountSettingsOutline = ImageVector.Builder(
            name = "AccountSettingsOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 4f)
                curveTo(14.21f, 4f, 16f, 5.79f, 16f, 8f)
                reflectiveCurveTo(14.21f, 12f, 12f, 12f)
                reflectiveCurveTo(8f, 10.21f, 8f, 8f)
                reflectiveCurveTo(9.79f, 4f, 12f, 4f)
                moveTo(12f, 6f)
                curveTo(10.9f, 6f, 10f, 6.9f, 10f, 8f)
                reflectiveCurveTo(10.9f, 10f, 12f, 10f)
                reflectiveCurveTo(14f, 9.11f, 14f, 8f)
                reflectiveCurveTo(13.11f, 6f, 12f, 6f)
                moveTo(12f, 13f)
                curveTo(14.67f, 13f, 20f, 14.33f, 20f, 17f)
                verticalLineTo(20f)
                horizontalLineTo(4f)
                verticalLineTo(17f)
                curveTo(4f, 14.33f, 9.33f, 13f, 12f, 13f)
                moveTo(12f, 14.9f)
                curveTo(9.03f, 14.9f, 5.9f, 16.36f, 5.9f, 17f)
                verticalLineTo(18.1f)
                horizontalLineTo(18.1f)
                verticalLineTo(17f)
                curveTo(18.1f, 16.36f, 14.97f, 14.9f, 12f, 14.9f)
                moveTo(13f, 22f)
                horizontalLineTo(11f)
                verticalLineTo(24f)
                horizontalLineTo(13f)
                verticalLineTo(22f)
                moveTo(17f, 22f)
                horizontalLineTo(15f)
                verticalLineTo(24f)
                horizontalLineTo(17f)
                verticalLineTo(22f)
                moveTo(9f, 22f)
                horizontalLineTo(7f)
                verticalLineTo(24f)
                horizontalLineTo(9f)
                verticalLineTo(22f)
                close()
            }
        }.build()

        return _AccountSettingsOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AccountSettingsOutline: ImageVector? = null
