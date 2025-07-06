package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PlayBoxEditOutline: ImageVector
    get() {
        if (_PlayBoxEditOutline != null) {
            return _PlayBoxEditOutline!!
        }
        _PlayBoxEditOutline = ImageVector.Builder(
            name = "PlayBoxEditOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 18.9f)
                lineTo(19.1f, 12.8f)
                lineTo(21.2f, 14.9f)
                lineTo(15.1f, 21f)
                horizontalLineTo(13f)
                verticalLineTo(18.9f)
                moveTo(21.4f, 11.3f)
                lineTo(22.7f, 12.6f)
                curveTo(22.9f, 12.8f, 22.9f, 13.1f, 22.7f, 13.3f)
                lineTo(21.7f, 14.3f)
                lineTo(19.6f, 12.3f)
                lineTo(20.6f, 11.3f)
                curveTo(20.7f, 11.2f, 20.8f, 11.1f, 21f, 11.1f)
                reflectiveCurveTo(21.3f, 11.1f, 21.4f, 11.3f)
                moveTo(11f, 21f)
                horizontalLineTo(5f)
                curveTo(4.5f, 21f, 4f, 20.8f, 3.6f, 20.4f)
                curveTo(3.2f, 20f, 3f, 19.5f, 3f, 19f)
                verticalLineTo(5f)
                curveTo(3f, 4.5f, 3.2f, 4f, 3.6f, 3.6f)
                curveTo(4f, 3.2f, 4.5f, 3f, 5f, 3f)
                horizontalLineTo(19f)
                curveTo(20.1f, 3f, 21f, 3.9f, 21f, 5f)
                verticalLineTo(9f)
                horizontalLineTo(19f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                horizontalLineTo(11f)
                verticalLineTo(21f)
                moveTo(15f, 12f)
                lineTo(10f, 8f)
                verticalLineTo(16f)
                lineTo(15f, 12f)
                close()
            }
        }.build()

        return _PlayBoxEditOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PlayBoxEditOutline: ImageVector? = null
