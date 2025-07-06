package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.KeyAlert: ImageVector
    get() {
        if (_KeyAlert != null) {
            return _KeyAlert!!
        }
        _KeyAlert = ImageVector.Builder(
            name = "KeyAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 6.5f)
                curveTo(4f, 4f, 6f, 2f, 8.5f, 2f)
                reflectiveCurveTo(13f, 4f, 13f, 6.5f)
                curveTo(13f, 8.46f, 11.75f, 10.13f, 10f, 10.74f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
                verticalLineTo(18f)
                horizontalLineTo(10f)
                verticalLineTo(22f)
                horizontalLineTo(7f)
                verticalLineTo(10.74f)
                curveTo(5.25f, 10.13f, 4f, 8.46f, 4f, 6.5f)
                moveTo(7f, 6.5f)
                curveTo(7f, 7.33f, 7.67f, 8f, 8.5f, 8f)
                reflectiveCurveTo(10f, 7.33f, 10f, 6.5f)
                reflectiveCurveTo(9.33f, 5f, 8.5f, 5f)
                reflectiveCurveTo(7f, 5.67f, 7f, 6.5f)
                moveTo(18f, 7f)
                horizontalLineTo(20f)
                verticalLineTo(13f)
                horizontalLineTo(18f)
                moveTo(18f, 17f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(18f)
            }
        }.build()

        return _KeyAlert!!
    }

@Suppress("ObjectPropertyName")
private var _KeyAlert: ImageVector? = null
