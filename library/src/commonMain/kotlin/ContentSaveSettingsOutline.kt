package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ContentSaveSettingsOutline: ImageVector
    get() {
        if (_ContentSaveSettingsOutline != null) {
            return _ContentSaveSettingsOutline!!
        }
        _ContentSaveSettingsOutline = ImageVector.Builder(
            name = "ContentSaveSettingsOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 22f)
                horizontalLineTo(9f)
                verticalLineTo(24f)
                horizontalLineTo(7f)
                verticalLineTo(22f)
                moveTo(11f, 22f)
                horizontalLineTo(13f)
                verticalLineTo(24f)
                horizontalLineTo(11f)
                verticalLineTo(22f)
                moveTo(15f, 22f)
                horizontalLineTo(17f)
                verticalLineTo(24f)
                horizontalLineTo(15f)
                verticalLineTo(22f)
                moveTo(17f, 2f)
                horizontalLineTo(5f)
                curveTo(3.89f, 2f, 3f, 2.9f, 3f, 4f)
                verticalLineTo(18f)
                curveTo(3f, 19.1f, 3.89f, 20f, 5f, 20f)
                horizontalLineTo(19f)
                curveTo(20.1f, 20f, 21f, 19.1f, 21f, 18f)
                verticalLineTo(6f)
                lineTo(17f, 2f)
                moveTo(19f, 18f)
                horizontalLineTo(5f)
                verticalLineTo(4f)
                horizontalLineTo(16.17f)
                lineTo(19f, 6.83f)
                verticalLineTo(18f)
                moveTo(12f, 11f)
                curveTo(10.34f, 11f, 9f, 12.34f, 9f, 14f)
                reflectiveCurveTo(10.34f, 17f, 12f, 17f)
                reflectiveCurveTo(15f, 15.66f, 15f, 14f)
                reflectiveCurveTo(13.66f, 11f, 12f, 11f)
                moveTo(6f, 5f)
                horizontalLineTo(15f)
                verticalLineTo(9f)
                horizontalLineTo(6f)
                verticalLineTo(5f)
                close()
            }
        }.build()

        return _ContentSaveSettingsOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ContentSaveSettingsOutline: ImageVector? = null
