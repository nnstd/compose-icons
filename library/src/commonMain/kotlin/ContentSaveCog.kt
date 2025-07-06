package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ContentSaveCog: ImageVector
    get() {
        if (_ContentSaveCog != null) {
            return _ContentSaveCog!!
        }
        _ContentSaveCog = ImageVector.Builder(
            name = "ContentSaveCog",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 11.7f)
                verticalLineTo(7f)
                lineTo(17f, 3f)
                horizontalLineTo(5f)
                curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.1f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(11.7f)
                curveTo(11.4f, 20.3f, 11.2f, 19.6f, 11.1f, 18.8f)
                curveTo(9.9f, 18.4f, 9f, 17.3f, 9f, 16f)
                curveTo(9f, 14.3f, 10.3f, 13f, 12f, 13f)
                curveTo(12.3f, 13f, 12.6f, 13.1f, 12.9f, 13.2f)
                curveTo(14.2f, 11.8f, 16f, 11f, 18f, 11f)
                curveTo(19.1f, 11f, 20.1f, 11.2f, 21f, 11.7f)
                moveTo(15f, 9f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(15f)
                verticalLineTo(9f)
                moveTo(21.7f, 18.6f)
                verticalLineTo(17.6f)
                lineTo(22.8f, 16.8f)
                curveTo(22.9f, 16.7f, 23f, 16.6f, 22.9f, 16.5f)
                lineTo(21.9f, 14.8f)
                curveTo(21.9f, 14.7f, 21.7f, 14.7f, 21.6f, 14.7f)
                lineTo(20.4f, 15.2f)
                curveTo(20.1f, 15f, 19.8f, 14.8f, 19.5f, 14.7f)
                lineTo(19.3f, 13.4f)
                curveTo(19.3f, 13.3f, 19.2f, 13.2f, 19.1f, 13.2f)
                horizontalLineTo(17.1f)
                curveTo(16.9f, 13.2f, 16.8f, 13.3f, 16.8f, 13.4f)
                lineTo(16.6f, 14.7f)
                curveTo(16.3f, 14.9f, 16.1f, 15f, 15.8f, 15.2f)
                lineTo(14.6f, 14.7f)
                curveTo(14.5f, 14.7f, 14.4f, 14.7f, 14.3f, 14.8f)
                lineTo(13.3f, 16.5f)
                curveTo(13.3f, 16.6f, 13.3f, 16.7f, 13.4f, 16.8f)
                lineTo(14.5f, 17.6f)
                verticalLineTo(18.6f)
                lineTo(13.4f, 19.4f)
                curveTo(13.3f, 19.5f, 13.2f, 19.6f, 13.3f, 19.7f)
                lineTo(14.3f, 21.4f)
                curveTo(14.4f, 21.5f, 14.5f, 21.5f, 14.6f, 21.5f)
                lineTo(15.8f, 21f)
                curveTo(16f, 21.2f, 16.3f, 21.4f, 16.6f, 21.5f)
                lineTo(16.8f, 22.8f)
                curveTo(16.9f, 22.9f, 17f, 23f, 17.1f, 23f)
                horizontalLineTo(19.1f)
                curveTo(19.2f, 23f, 19.3f, 22.9f, 19.3f, 22.8f)
                lineTo(19.5f, 21.5f)
                curveTo(19.8f, 21.3f, 20f, 21.2f, 20.3f, 21f)
                lineTo(21.5f, 21.4f)
                curveTo(21.6f, 21.4f, 21.7f, 21.4f, 21.8f, 21.3f)
                lineTo(22.8f, 19.6f)
                curveTo(22.9f, 19.5f, 22.9f, 19.4f, 22.8f, 19.4f)
                lineTo(21.7f, 18.6f)
                moveTo(18f, 19.5f)
                curveTo(17.2f, 19.5f, 16.5f, 18.8f, 16.5f, 18f)
                reflectiveCurveTo(17.2f, 16.5f, 18f, 16.5f)
                reflectiveCurveTo(19.5f, 17.2f, 19.5f, 18f)
                reflectiveCurveTo(18.8f, 19.5f, 18f, 19.5f)
                close()
            }
        }.build()

        return _ContentSaveCog!!
    }

@Suppress("ObjectPropertyName")
private var _ContentSaveCog: ImageVector? = null
