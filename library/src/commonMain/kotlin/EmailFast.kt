package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EmailFast: ImageVector
    get() {
        if (_EmailFast != null) {
            return _EmailFast!!
        }
        _EmailFast = ImageVector.Builder(
            name = "EmailFast",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 5.5f)
                horizontalLineTo(9f)
                curveTo(7.9f, 5.5f, 7f, 6.4f, 7f, 7.5f)
                verticalLineTo(16.5f)
                curveTo(7f, 17.61f, 7.9f, 18.5f, 9f, 18.5f)
                horizontalLineTo(22f)
                curveTo(23.11f, 18.5f, 24f, 17.61f, 24f, 16.5f)
                verticalLineTo(7.5f)
                curveTo(24f, 6.4f, 23.11f, 5.5f, 22f, 5.5f)
                moveTo(22f, 9.17f)
                lineTo(15.5f, 12.5f)
                lineTo(9f, 9.17f)
                verticalLineTo(7.5f)
                lineTo(15.5f, 10.81f)
                lineTo(22f, 7.5f)
                verticalLineTo(9.17f)
                moveTo(5f, 16.5f)
                curveTo(5f, 16.67f, 5.03f, 16.83f, 5.05f, 17f)
                horizontalLineTo(1f)
                curveTo(0.448f, 17f, 0f, 16.55f, 0f, 16f)
                reflectiveCurveTo(0.448f, 15f, 1f, 15f)
                horizontalLineTo(5f)
                verticalLineTo(16.5f)
                moveTo(3f, 7f)
                horizontalLineTo(5.05f)
                curveTo(5.03f, 7.17f, 5f, 7.33f, 5f, 7.5f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                curveTo(2.45f, 9f, 2f, 8.55f, 2f, 8f)
                reflectiveCurveTo(2.45f, 7f, 3f, 7f)
                moveTo(1f, 12f)
                curveTo(1f, 11.45f, 1.45f, 11f, 2f, 11f)
                horizontalLineTo(5f)
                verticalLineTo(13f)
                horizontalLineTo(2f)
                curveTo(1.45f, 13f, 1f, 12.55f, 1f, 12f)
                close()
            }
        }.build()

        return _EmailFast!!
    }

@Suppress("ObjectPropertyName")
private var _EmailFast: ImageVector? = null
