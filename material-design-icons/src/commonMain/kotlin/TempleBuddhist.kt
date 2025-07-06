package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TempleBuddhist: ImageVector
    get() {
        if (_TempleBuddhist != null) {
            return _TempleBuddhist!!
        }
        _TempleBuddhist = ImageVector.Builder(
            name = "TempleBuddhist",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 9f)
                curveTo(21f, 10.1f, 20.1f, 11f, 19f, 11f)
                horizontalLineTo(5f)
                curveTo(3.9f, 11f, 3f, 10.1f, 3f, 9f)
                horizontalLineTo(1f)
                curveTo(1f, 10.9f, 2.3f, 12.4f, 4f, 12.8f)
                verticalLineTo(22f)
                horizontalLineTo(10f)
                verticalLineTo(19f)
                curveTo(10f, 17.9f, 10.9f, 17f, 12f, 17f)
                reflectiveCurveTo(14f, 17.9f, 14f, 19f)
                verticalLineTo(22f)
                horizontalLineTo(20f)
                verticalLineTo(12.9f)
                curveTo(20.5f, 12.8f, 23f, 11.9f, 23f, 9f)
                horizontalLineTo(21f)
                moveTo(6f, 8.9f)
                verticalLineTo(10f)
                horizontalLineTo(18f)
                verticalLineTo(8.9f)
                curveTo(18.5f, 8.8f, 21f, 7.9f, 21f, 5f)
                horizontalLineTo(19f)
                curveTo(19f, 6.1f, 18.1f, 7f, 17f, 7f)
                horizontalLineTo(7f)
                curveTo(5.9f, 7f, 5f, 6.1f, 5f, 5f)
                horizontalLineTo(3f)
                curveTo(3f, 6.9f, 4.3f, 8.4f, 6f, 8.9f)
                moveTo(12f, 1f)
                lineTo(8.2f, 6f)
                horizontalLineTo(15.7f)
                lineTo(12f, 1f)
                close()
            }
        }.build()

        return _TempleBuddhist!!
    }

@Suppress("ObjectPropertyName")
private var _TempleBuddhist: ImageVector? = null
