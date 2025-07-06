package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TempleBuddhistOutline: ImageVector
    get() {
        if (_TempleBuddhistOutline != null) {
            return _TempleBuddhistOutline!!
        }
        _TempleBuddhistOutline = ImageVector.Builder(
            name = "TempleBuddhistOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 9f)
                curveTo(21f, 10.1f, 20.1f, 11f, 19f, 11f)
                horizontalLineTo(18f)
                verticalLineTo(8.9f)
                curveTo(19.7f, 8.5f, 21f, 6.9f, 21f, 5.1f)
                horizontalLineTo(19f)
                curveTo(19f, 6.2f, 18.1f, 7.1f, 17f, 7.1f)
                horizontalLineTo(16.5f)
                lineTo(12f, 1f)
                lineTo(7.5f, 7f)
                horizontalLineTo(7f)
                curveTo(5.9f, 7f, 5f, 6.1f, 5f, 5f)
                horizontalLineTo(3f)
                curveTo(3f, 6.9f, 4.3f, 8.4f, 6f, 8.8f)
                verticalLineTo(11f)
                horizontalLineTo(5f)
                curveTo(3.9f, 11f, 3f, 10.1f, 3f, 9f)
                horizontalLineTo(1f)
                curveTo(1f, 10.9f, 2.3f, 12.4f, 4f, 12.8f)
                verticalLineTo(22f)
                horizontalLineTo(11f)
                verticalLineTo(18f)
                curveTo(11f, 17.5f, 11.4f, 17f, 12f, 17f)
                reflectiveCurveTo(13f, 17.5f, 13f, 18f)
                verticalLineTo(22f)
                horizontalLineTo(20f)
                verticalLineTo(12.9f)
                curveTo(21.7f, 12.5f, 23f, 10.9f, 23f, 9.1f)
                lineTo(21f, 9f)
                moveTo(12f, 4.3f)
                lineTo(14f, 7f)
                horizontalLineTo(10f)
                lineTo(12f, 4.3f)
                moveTo(8f, 9f)
                horizontalLineTo(16f)
                verticalLineTo(11f)
                horizontalLineTo(8f)
                verticalLineTo(9f)
                moveTo(18f, 20f)
                horizontalLineTo(15f)
                verticalLineTo(18f)
                curveTo(15f, 16.4f, 13.6f, 15f, 12f, 15f)
                reflectiveCurveTo(9f, 16.4f, 9f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(6f)
                verticalLineTo(13f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _TempleBuddhistOutline!!
    }

@Suppress("ObjectPropertyName")
private var _TempleBuddhistOutline: ImageVector? = null
