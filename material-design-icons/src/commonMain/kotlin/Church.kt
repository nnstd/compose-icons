package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Church: ImageVector
    get() {
        if (_Church != null) {
            return _Church!!
        }
        _Church = ImageVector.Builder(
            name = "Church",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 12.22f)
                verticalLineTo(9f)
                lineTo(13f, 6.5f)
                verticalLineTo(5f)
                horizontalLineTo(15f)
                verticalLineTo(3f)
                horizontalLineTo(13f)
                verticalLineTo(1f)
                horizontalLineTo(11f)
                verticalLineTo(3f)
                horizontalLineTo(9f)
                verticalLineTo(5f)
                horizontalLineTo(11f)
                verticalLineTo(6.5f)
                lineTo(6f, 9f)
                verticalLineTo(12.22f)
                lineTo(2f, 14f)
                verticalLineTo(22f)
                horizontalLineTo(10f)
                verticalLineTo(19f)
                curveTo(10f, 17.9f, 10.9f, 17f, 12f, 17f)
                reflectiveCurveTo(14f, 17.9f, 14f, 19f)
                verticalLineTo(22f)
                horizontalLineTo(22f)
                verticalLineTo(14f)
                lineTo(18f, 12.22f)
                moveTo(12f, 13.5f)
                curveTo(11.17f, 13.5f, 10.5f, 12.83f, 10.5f, 12f)
                reflectiveCurveTo(11.17f, 10.5f, 12f, 10.5f)
                reflectiveCurveTo(13.5f, 11.17f, 13.5f, 12f)
                reflectiveCurveTo(12.83f, 13.5f, 12f, 13.5f)
                close()
            }
        }.build()

        return _Church!!
    }

@Suppress("ObjectPropertyName")
private var _Church: ImageVector? = null
